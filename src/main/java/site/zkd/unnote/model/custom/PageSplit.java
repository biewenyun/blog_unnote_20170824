package site.zkd.unnote.model.custom;

public class PageSplit {
    /**
     * 第几页
     */
    private int pageNum;
    /**
     * 每页显示多少
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPageNum;
    /**
     * 总计文章多少
     */
    private int totalArticleNum;
    /**
     * 文章列表中的文章状态
     */
    private String statues;
    /**
     * 登录的用户
     */
    private Long userid;
    /**
     * 文章列表按排序方式
     */
    private String orderBy;

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

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public int getTotalArticleNum() {
        return totalArticleNum;
    }

    public void setTotalArticleNum(int totalArticleNum) {
        this.totalArticleNum = totalArticleNum;
    }

    public String getStatues() {
        return statues;
    }

    public void setStatues(String statues) {
        this.statues = statues;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        return "PageSplit{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalPageNum=" + totalPageNum +
                ", totalArticleNum=" + totalArticleNum +
                ", statues='" + statues + '\'' +
                ", userid=" + userid +
                ", orderBy='" + orderBy + '\'' +
                '}';
    }
}