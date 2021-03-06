package site.zkd.unnote.model.service.Impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zkd.unnote.model.mybatis.bean.ArticleBean;
import site.zkd.unnote.model.mybatis.bean.ArticleBeanExample;
import site.zkd.unnote.model.mybatis.dao.ArticleBeanMapper;
import site.zkd.unnote.model.service.IArticleService;
import site.zkd.unnote.utils.GlobalConstants;

import java.util.ArrayList;
import java.util.List;

@Service("IArticleService")
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleBeanMapper articleBeanMapper;


    public ArticleBean selectById(Long userId,Long articleId) {
        return articleBeanMapper.selectByPrimaryKey(articleId,userId);
    }

    public List<ArticleBean> selectByStatus(Long userId, String status){
        if(status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.DRAFT)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.PUBLISH)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.RECYCLED)){
            ArticleBeanExample example =new ArticleBeanExample();
            example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status);
            return articleBeanMapper.selectByExampleWithBLOBs(example);
        }else {
            return new ArrayList<ArticleBean>();
        }
    }

    public List<ArticleBean> selectPagingByStatus(Long userId, String status, int offset, int limit) {
        if(status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.DRAFT)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.PUBLISH)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.RECYCLED)){
            ArticleBeanExample example =new ArticleBeanExample();
            example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status);
            RowBounds rowBounds =new RowBounds(offset,limit);
            return articleBeanMapper.selectByExampleWithBLOBsWithRowbounds(example,rowBounds);
        }else {
            return new ArrayList<ArticleBean>();
        }
    }

    @Override
    public List<ArticleBean> selectPaging(Long userId, String status, String searchBy, String searchByValue, String orderBy, int offset, int limit) {

        if(status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.DRAFT)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.PUBLISH)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.RECYCLED)){

            //条件
            ArticleBeanExample example =new ArticleBeanExample();
            switch (searchBy){
                case GlobalConstants.ARTICLE.SearchBy.LABEL:
                    example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status).andLabelIdAllLike("%"+searchByValue+"%");
                    break;
                case GlobalConstants.ARTICLE.SearchBy.CATEGORY:
                    example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status).andCategoryIdEqualTo(Long.valueOf(searchByValue));
                    break;
                case GlobalConstants.ARTICLE.SearchBy.TITLE:
                    example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status).andArticleTitleLike("%"+searchByValue+"%");
                    break;
                case GlobalConstants.ARTICLE.SearchBy.ABSTRACT:
                    example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status).andArticleAbstractLike("%"+searchByValue+"%");
                    break;
                case GlobalConstants.ARTICLE.SearchBy.ALL:
                    //TODO
                    break;

            }
            //排序
            example.setOrderByClause(orderBy+"DESC");
            //分页
            RowBounds rowBounds =new RowBounds(offset,limit);

            return articleBeanMapper.selectByExampleWithBLOBsWithRowbounds(example,rowBounds);

        }else {
            return new ArrayList<ArticleBean>();
        }
    }

    public int insertArticle(ArticleBean articleBean) {
        return articleBeanMapper.insertSelective(articleBean);
    }

    public int updateById(ArticleBean articleBean) {
        return articleBeanMapper.updateByPrimaryKeyWithBLOBs(articleBean);
    }

    public int deleteById(Long userId,Long articleId) {
        return articleBeanMapper.deleteByPrimaryKey(articleId,userId);
    }

    public int countAllArticleByUserId(Long userId){
        ArticleBeanExample example =new ArticleBeanExample();
        example.or().andUserIdEqualTo(userId);
        return articleBeanMapper.countByExample(example);
    }

    public int countAllArticleByUserId(Long userId,String status){
        if(status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.DRAFT)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.PUBLISH)||
                status.equalsIgnoreCase(GlobalConstants.ARTICLE.Status.RECYCLED)){
            ArticleBeanExample example =new ArticleBeanExample();
            example.or().andUserIdEqualTo(userId).andArticleStatusEqualTo(status);
            return articleBeanMapper.countByExample(example);
        }else {
            return -1;
        }
    }
}
