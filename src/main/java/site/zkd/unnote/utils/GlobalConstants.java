package site.zkd.unnote.utils;

public class GlobalConstants {
    public static class ARTICLE{
        /**
         * 文章状态
         */
        public static class Status{
            public static final String PUBLISH ="publish";
            public static final String DRAFT ="draft";
            public static final String RECYCLED ="recycled";
            public static final int VISBLE =1;
            public static final int UNVISBLE =0;
        }

        /**
         * 文章排序列名
         */
        public static class OrderBy{
            public static final String CREATETIME ="article_create_time";
            public static final String MODIFIEDTIME ="article_lastmodified_time";
        }

        /**
         * 根据什么查找文章
         */
        public static class SearchBy{
            public static final String ALL ="all";
            public static final String LABEL ="label";
            public static final String CATEGORY ="category";
            public static final String ABSTRACT ="abstract";
            public static final String TITLE ="title";
        }
    }

    public static class Response {
        public final static int OK = 1;
        public final static int FAILED = 0  ;
        public final static int EMPTY = -1 ;
        public final static String OK_STR = "success";
        public final static String FAILED_STR = "failed";
        public final static String EMPTY_STR = "empty";

    }

}
