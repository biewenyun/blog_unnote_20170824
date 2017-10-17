package site.zkd.unnote.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zkd.unnote.model.mybatis.bean.CategoryBean;
import site.zkd.unnote.model.mybatis.bean.CategoryBeanExample;
import site.zkd.unnote.model.mybatis.dao.CategoryBeanMapper;
import site.zkd.unnote.model.service.ICategoryService;

import java.util.List;
@Service("ICategoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryBeanMapper categoryBeanMapper;

    @Override
    public List<CategoryBean> getCategoryBeanList(Long userId) {
        List<CategoryBean>CategoryBeanList;
        CategoryBeanExample categoryBeanExample =new CategoryBeanExample();
        categoryBeanExample.or().andUserIdEqualTo(userId);
        CategoryBeanList=categoryBeanMapper.selectByExample(categoryBeanExample);
        return CategoryBeanList;
    }
}
