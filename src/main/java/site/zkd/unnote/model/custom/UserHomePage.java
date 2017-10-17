package site.zkd.unnote.model.custom;

import site.zkd.unnote.model.mybatis.bean.ArticleBean;

import java.util.List;

public class UserHomePage {
    private int code;
    private String msg;
    private HomePageArticlesInfo homePageArticlesInfo;
    private HomePageAuthorInfo homePageAuthorInfo;
    private HomePageLabelInfo homePageLabelInfo;
    private HomePageCategoryInfo homePageCategoryInfo;
    private HomePageBGInfo homePageBGInfo;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HomePageArticlesInfo getHomePageArticlesInfo() {
        return homePageArticlesInfo;
    }

    public void setHomePageArticlesInfo(HomePageArticlesInfo homePageArticlesInfo) {
        this.homePageArticlesInfo = homePageArticlesInfo;
    }

    public HomePageAuthorInfo getHomePageAuthorInfo() {
        return homePageAuthorInfo;
    }

    public void setHomePageAuthorInfo(HomePageAuthorInfo homePageAuthorInfo) {
        this.homePageAuthorInfo = homePageAuthorInfo;
    }

    public HomePageLabelInfo getHomePageLabelInfo() {
        return homePageLabelInfo;
    }

    public void setHomePageLabelInfo(HomePageLabelInfo homePageLabelInfo) {
        this.homePageLabelInfo = homePageLabelInfo;
    }

    public HomePageCategoryInfo getHomePageCategoryInfo() {
        return homePageCategoryInfo;
    }

    public void setHomePageCategoryInfo(HomePageCategoryInfo homePageCategoryInfo) {
        this.homePageCategoryInfo = homePageCategoryInfo;
    }

    public HomePageBGInfo getHomePageBGInfo() {
        return homePageBGInfo;
    }

    public void setHomePageBGInfo(HomePageBGInfo homePageBGInfo) {
        this.homePageBGInfo = homePageBGInfo;
    }

    /**
     * 首页文章信息
     */
    private class HomePageArticlesInfo{
        /**
         * 首页文章list
         */
        private List<ArticleBean> articleBeanList;
        /**
         * 总页数
         */
        private int totalNum;
        /**
         * 当前页码
         */
        private int pageNum;
        /**
         * 每页条数
         */
        private int pageSize;

        public List<ArticleBean> getArticleBeanList() {
            return articleBeanList;
        }

        public void setArticleBeanList(List<ArticleBean> articleBeanList) {
            this.articleBeanList = articleBeanList;
        }

        public int getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

    /**
     * 首页blog作者信息
     */
    private class HomePageAuthorInfo{

    }

    /**
     * 首页标签信息
     */
    private class HomePageLabelInfo{


    }

    /**
     * 首页类别信息
     */
    private class HomePageCategoryInfo{


    }

    /**
     * 首页BG信息
     */
    private class HomePageBGInfo{


    }
}
