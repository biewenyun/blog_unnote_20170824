<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/9/28
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%--响应式布局--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Title</title>

    <link rel="stylesheet" href="/static/plugins/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/static/plugins/zTree_v3/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link href="/static/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
            font-size: 14px;
            line-height: 1.5;
            color: #24292e;
            background-color: #fff;
            word-wrap: break-word;
        }

        .homepage-container {
            width: 1024px;
            margin-right: auto;
            margin-left: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        /*左侧*/
        .homepage-left {
            width: 730px;
            padding-left: 10px;
            padding-right: 40px;
            float: left;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            position: relative;
        }

        /*右侧*/
        .homepage-right {
            width: 265px;
            float: left;
            /*border-left: 1px #e1e4e8 solid;*/
            height: 100%;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        /*文章列表*/
        .articleList {
            /*position: relative;*/
            /*padding-top: 30px;*/
            /*padding-bottom: 30px;*/
            /*list-style: none;*/
            width: 716px;
        }

        .articleList .listItemWrapper {
            width: 716px;
            text-align: left;
            margin-right: 8px;
            padding-top: 15px;
            padding-bottom: 15px;
            border-top: 1px #e1e4e8 solid;
        }

        .articleList .listItemWrapper .left {
            width: 500px;
            float: left;
        }

        .articleList .listItemWrapper .right {
            width: 200px;
            height: 94px;
            float: right;
            overflow: hidden;
        }

        .articleList .listItemWrapper .left .title a {
            font-size: 20px;
            font-weight: 600;
            color: #0366d6;

        }

        .articleList .listItemWrapper .left .abstract {
            padding-right: 24px;
            margin-bottom: 8px;
            color: #586069;
        }

        .articleList .listItemWrapper .left .createTime {
            font-size: 12px;
            margin-top: 8px;
            color: #586069;
        }

        /*listitem tag style*/
        .tag {
            font-size: 12px;
            /*color: #0366d6;*/
            /*background-color: #f1f8ff;*/
            border: 1px solid #EFF3F6;
            border-radius: 2px;
            margin: 0 0.5em 0.5em 0.5em;
            padding: 0.3em 0.9em;
            float: left;
        }

        .tag li {
            margin: 0px 4px 0px 0px;
            color: #808080;
        }

        /* right1类别表 zTree 样式*/
        .ztree * {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
            color: #586069;
            font-size: 12px;
        }

        .ztree li a:hover {
            text-decoration: none;
            background-color: #E7E7E7;
        }

        /*节点选中后的颜色*/
        .ztree li a.curSelectedNode {
            padding-top: 0px;
            background-color: #f1f8ff;
            color: #fff;
            height: 16px;
            border: 1px #fff solid;
            opacity: 0.8;
        }

        .ztree li span.button {
            background-image: url("/static/images/left_menuForOutLook.png");
            *background-image: url("/static/images/left_menuForOutLook.gif")
        }

        .ztree li span.button.noline_open {
            background-position: 0 0;
        }

        .ztree li span.button.noline_close {
            background-position: -18px 0;
        }

        .category-container {
            position: relative;
            margin: 20px 0px -2.5em 40px;
            padding-bottom: 2.5em;
            width: 216px;
            border: 1px #e1e4e8 solid;
            border-top-left-radius: 3px;
            border-top-right-radius: 3px;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            max-height: 380px;
        }

        .categoryName {
            padding-left: 10px;
            padding-top: 5px;
            height: 1.5em;
            font-weight: 600;
            font-size: 14px;
            position: absolute;
            width: 180px;
        }

        .categoryList {
            padding: 0px 4px 0px 4px;
            color: #24292e;
            background-color: #fff;
            width: 212px;
            max-height: 350px;
            overflow: hidden;
            position: relative;
            top: 2em;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        .bottom {
            position: absolute;
            bottom: 0;
            clear: both; /*主要使用这个属性来清除浮动*/
            height: 0px;
            line-height: 0;
            font-size: 0;
        }

        .categoryList:hover {
            overflow: auto;
        }

        ::-webkit-scrollbar {
            width: 5px;
            height: 10px;
            background-color: #F5F5F5;
        }

        .categoryList a {
            color: #0366d6;
            background-color: transparent;
            text-decoration: none;
        }

        .categoryList a:hover {
            text-decoration: underline;
        }

        /*right2标签表样式*/
        .label-container {
            position: relative;
            margin: 0px 0px 0px 40px;
            width: 216px;
            border: 1px #e1e4e8 solid;
            border-top-left-radius: 3px;
            border-top-right-radius: 3px;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            /*max-height: 380px;*/
        }

        .label-container .labelName {
            padding-left: 10px;
            margin-top: 5px;
            margin-bottom: 8px;
            height: 1.5em;
            font-weight: 600;
            font-size: 14px;
            width: 180px;
        }

        /*清除浮动*/
        .clear {
            clear: both; /*主要使用这个属性来清除浮动*/
            height: 0;
            line-height: 0;
            font-size: 0;
        }

        /*上下页*/
        .paging {
            height: 40px;
        }

        .paging ul {
            height: 100%;
            list-style-type: none;
        }

        .paging ul li {
            /*line-height: 40px !important;*/
            float: left;

        }

        .paging .page_li .page_btn {
            width: 35px;
            height: 35px;
            padding: 7px 12px;
            font-size: 11px;
            border-radius: 3px;
            border: 1px solid #EFF3F6;
            background: #fff;
            text-align: center;
            vertical-align: middle;
            color: #586069;
            /*outline: none； 清除btn点击后的边框*/
            outline: 0;
        }

        .paging .page_li .page_btn:hover {
            border: 1px solid #EFF3F6;
            background-color: #EFF3F6;
            cursor: pointer;
        }

        /*回到顶部*/
        #gotoTop {
            position: fixed;
            bottom: 10%;
            right: 10%;
            height: 30px;
            width: 30px;
            display: block;
            cursor: pointer;
            text-align: center;
            border: 1px solid #e0e0e0;
            background: #fff;
            outline: 0;
        }

        /*鼠标进入的反馈效果*/
        #gotoTop.hover {
            background: #EFF3F6;
            color: #3B3B3B;
            text-decoration: none;
        }

        .nav-wrapper {
            border-bottom: 1px #e1e4e8 solid;
            margin-bottom: 24px;
        }

        .nav {
            min-width: 768px;
            max-width: 1440px;
            margin: 0px auto;
            padding-top: 8px;
            padding-bottom: 8px;
            color: #24292e;
            background-color: #fff;
            z-index: 1;
        }

        .nav .nav-name {
            width: 15%;
            height: 30px;
            float: left;
        }

        .nav .nav-container {
            width: 80%;
            height: 30px;
            float: right;
        }

        .nav .nav-container .left {
            width: 28%;
            height: 30px;
            min-width: 240px;
            float: left;
        }

        .nav .nav-container .right {
            float: right;
            /*width: 70%;*/
            height: 30px;
        }

        .nav .nav-container .right ul {
            float: right;
            margin: 0px;
            list-style-type: none;
        }

        .nav .nav-container .right ul li {
            line-height: 30px;
            height: 30px;
            float: right;
            margin: 0px 7px;
        }

        .nav .nav-container a {
            color: #24292e;
            text-decoration: none;

        }

        .nav .nav-container a :hover {
            text-decoration: underline;
        }

        /*排序*/
        .homepage-left .sort {
            height: 25px;
            width: 730px;
            margin-bottom: 16px;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        .homepage-left .sort .total {
            float: left;
        }

        .homepage-left .sort .sortby {
            float: right;
        }

    </style>
</head>

<body>
<div class="nav-wrapper">
    <div class="nav">
        <div class="nav-name" style="font-weight: 400;font-size: 16px;">
            <span>biewenyun</span>
        </div>
        <div class="nav-container">
            <div class="left">
                <%--搜索--%>
                <div class="input-group input-group-sm">
                    <%--下拉--%>
                    <div class="input-group-btn">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">&nbsp;&nbsp;全部&nbsp;&nbsp;<span class="caret"></span></button>
                        <ul class="dropdown-menu" style="font-size: 12px;min-width: 0px;">
                            <li><a href="#">全部</a></li>
                            <li role="separator" class="divider" style="margin: 1px 0px;"></li>
                            <li><a href="#">标签</a></li>
                            <li><a href="#">分类</a></li>
                            <li><a href="#">标题</a></li>
                            <li><a href="#">摘要</a></li>
                        </ul>
                    </div>
                    <%--输入--%>
                    <input type="text" class="form-control" placeholder="Search for...">
                    <%--搜索--%>
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button"><li class="fa fa-search"></li></button>
                    </span>
                </div>
            </div>
            <div class="right">
                <ul>
                    <li>
                        <a href="#"><i class="fa fa-cog fa-fw" style="padding:0px 4px;"></i>设置</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-pencil fa-fw" style="padding:0px 4px;"></i>写文章</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-user fa-fw" style="padding:0px 4px;"></i>登录</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-home fa-fw" style="padding:0px 4px;"></i>首页</a>
                    </li>
                </ul>

            </div>
        </div>
        <div class="clear"></div>
    </div>

</div>
<div class="homepage-container">

    <div class="homepage-left">
        <%--排序--%>
        <div class="sort">
            <div class="total" style="font-size: 20px;height: 25px">
                156 results
            </div>
            <div class="sortby" style="width: 130px">
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false" style="font-size: 12px;padding: 3px 12px;">
                        <i>Sort:</i>&nbsp;发布时间<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" style="font-size: 12px;min-width: 0px;">
                        <li><a href="#">&nbsp;&nbsp;&nbsp;发布时间&nbsp;&nbsp;&nbsp;</a></li>
                        <li role="separator" class="divider" style="margin: 1px 0px;"></li>
                        <li><a href="#">&nbsp;&nbsp;&nbsp;修改时间&nbsp;&nbsp;&nbsp;</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <%--文章列表--%>
        <div id="userhomepage-articleList" class="articleList">
            <script id="userhomepage-articleList-Template" type="text/x-dot-template">
                {{ for(var i=0; i < it.length ; i++){ }}
                <div class="listItemWrapper">
                    <div class="left">
                        <div class="title">
                            <a href="<c:url value="/homepaging/artilcleDetail/{{=it[i].articleId}}"/>">
                                {{=it[i].articleTitle}}
                            </a>
                        </div>
                        <div class="abstract">
                            <p>{{=it[i].articleTitle}}</p>
                        </div>
                        <div class="createTime">
                            <p>{{=it[i].articleCreateTime}}</p>
                        </div>
                    </div>
                    <div class="right">
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag1
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag2s
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag3asf
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag3asdasdfa
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag3asfadsgadgsags
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag3asfadsgadgsags
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag3asfadsgadgsags
                        </div>
                        <div class="tag">
                            <li class="fa fa-tag"></li>
                            tag3asfadsgadgsags
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
                {{ } }}
            </script>
        </div>
        <%--上下页--%>
        <div class="paging">
            <ul>
                <li class="page_li">
                    <button class="page_btn" style="width:80px" id="prePage">上一页</button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn1">1</button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="preOmit" disabled="disabled">...</button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn2"></button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn3"></button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn4"
                            style="background-color:#4f90fb;border:1px solid;color:#fff"></button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn5"></button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn6"></button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="sufOmit" disabled="disabled">...</button>
                </li>
                <li class="page_li">
                    <button class="page_btn" id="page_btn7"></button>
                </li>
                <li class="page_li">
                    <button class="page_btn" style="width:80px" id="sufPage">下一页</button>
                </li>
            </ul>
        </div>
    </div>

    <div class="homepage-right">
        <%--标签列表--%>
        <div class="label-container">
            <div class="labelName">
                标签
            </div>
            <div id="label-List" class="labelList">
                <script id="labelList-Template" type="text/x-dot-template">
                    {{ for(var i=0; i < it.length ; i++){ }}
                    <div class="tag">
                        <li class="fa fa-tag"></li>
                        {{=it[i].labelName}}
                    </div>
                    {{ } }}
                </script>
            </div>
            <div class="clear"></div>
        </div>
        <%--类别列表--%>
        <div class="category-container">
            <div class="categoryName">
                分类
            </div>
            <div id="userhomepage-categoryList" class="categoryList">
                <ul id="userhomepage-categoryList-tree" class="ztree"></ul>
                <div class="bottom"></div>
            </div>
        </div>
    </div>

    <div class="clear"></div>

</div>
<div class="side-tool">
    <span id="gotoTop"><i class="fa fa-angle-up fa-2x" aria-hidden="true"></i></span>
</div>
<div class="clear"></div>

<script type="text/javascript" src="<c:url value="/static/js/jquery-3.1.1.min.js"/>"></script>
<%--<script type="text/javascript" src="<c:url value="/static/plugins/zTree_v3/js/jquery-1.4.4.min.js"/>"></script>--%>
<script type="text/javascript" src="<c:url value="/static/plugins/zTree_v3/js/jquery.ztree.core.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/doT.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/plugins/bootstrap-3.3.7-dist/js/bootstrap.js"/>"></script>
<script type="text/javascript">

    var articlesJsonStr = JSON.stringify(${articlesJson});
    var categorysJsonStr = JSON.stringify(${categorysJson});
    var labelsJsonStr = JSON.stringify(${labelsJson});

    var articlesJsonobj = JSON.parse(articlesJsonStr);
    var categorysJsonobj = JSON.parse(categorysJsonStr);
    var labelsJsonobj = JSON.parse(labelsJsonStr);

    loadArticle();
    loadPaging();

    loadCategory();
    loadLabel();

    loadGotoTop();

    //left 加载文章列表
    function loadArticle() {
        if (articlesJsonobj.code == 1) {
            var innerHTML = doT.template($("#userhomepage-articleList-Template").html());
            $("#userhomepage-articleList").empty();
            $("#userhomepage-articleList").html(innerHTML(articlesJsonobj.data));
        }
    };

    //left 加载页码
    function loadPaging() {
        var currentPage = Number(2);
        var pageNum = Number(7);
        $("#page_btn2").text(currentPage - 2);
        $("#page_btn3").text(currentPage - 1);
        $("#page_btn4").text(currentPage);
        $("#page_btn5").text(currentPage + 1);
        $("#page_btn6").text(currentPage + 2);
        $("#page_btn7").text(pageNum);
        //处理左侧页码
        switch (currentPage - 1) {
            case 0:
                $("#page_btn1").hide();
                $("#page_btn2").hide();
                $("#page_btn3").hide();
                $("#preOmit").hide();
                break;
            case 1:
                $("#page_btn1").hide();
                $("#page_btn2").hide();
                $("#preOmit").hide();
                break;
            case 2:
                $("#page_btn1").hide();
                $("#preOmit").hide();
                break;
            case 3:
                $("#preOmit").hide();
                break;
        }
        //处理右侧页码
        switch (pageNum - currentPage) {
            case 0:
                $("#page_btn5").hide();
                $("#page_btn6").hide();
                $("#page_btn7").hide();
                $("#sufOmit").hide();
                break;
            case 1:
                $("#page_btn6").hide();
                $("#page_btn7").hide();
                $("#sufOmit").hide();
                break;
            case 2:
                $("#page_btn6").hide();
                $("#sufOmit").hide();
                break;
            case 3:
                $("#sufOmit").hide();
                break;
        }
    };

    //right 加载标签
    function loadLabel() {
        if(labelsJsonobj.code==1){
            var innerHTML = doT.template($("#labelList-Template").html());
            $("#label-List").empty();
            $("#label-List").html(innerHTML(labelsJsonobj.data));
        }
    }

    //right 加载类别列表
    function loadCategory() {
        var categorysNodes = categorysJsonobj.data;
        var categorysSetting = {
            view: {
                showIcon: false,
                showLine: false,
                expandSpeed: "fast",
                dblClickExpand: false //取消默认双击展开父节点的功能
            },
            data: {
                key: {
                    name: "categoryName"
                },
                simpleData: {
                    enable: true,
                    idKey: "categoryId",
                    pIdKey: "categoryParentId",
                    rootPId: 0
                }
            }
        };
        if (articlesJsonobj.code == 1) {
            $(document).ready(function () {
                $.fn.zTree.init($("#userhomepage-categoryList-tree"), categorysSetting, categorysNodes);
            });
        }
    };

    //回到顶部
    function loadGotoTop(min_height) {
        //获取页面的最小高度，无传入值则默认为450像素
        min_height ? min_height = min_height : min_height = 450;

        //为窗口的scroll事件绑定处理函数
        $(document).ready(function () {
            //首先隐藏
            $("#gotoTop").hide();
            $(window).scroll(function () {
                //获取窗口的滚动条的垂直位置
                var s = $(window).scrollTop();
                //当窗口的滚动条的垂直位置大于页面的最小高度时，让返回顶部元素渐现，否则渐隐
                if (s > min_height) {
                    $("#gotoTop").fadeIn(100);
                } else {
                    $("#gotoTop").fadeOut(200);
                }
                ;
            });
        });

        //定义返回顶部点击向上滚动的动画
        $("#gotoTop").click(
            function () {
//                $(selector).animate(styles,speed,easing,callback)
//                $(selector).animate(styles,options)
                $('html,body').animate({scrollTop: 0}, 700);
            }).hover(
            function () {
                $(this).addClass("hover");
            },
            function () {
                $(this).removeClass("hover");
            });

    };

</script>
</body>

</html>
