<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths">
<head>
    <title>阿程，雨下一整夜</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Cache-Control" content="no-transform">
    <meta http-equiv="Cache-Control" content="no-siteapp">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="keywords" content="Vtrois,Tencent,QCloud,Kratos,Developer,Web,Html5,Css3,Java,JavaScript,PHP,C#">
    <!--md-->
    <link rel="stylesheet" href="/static/editorMD/css/style.css"/>
    <link rel="stylesheet" href="/static/editorMD/css/editormd.preview.css"/>
    <style>
        body {
            padding: 0;
        }

        .article-content-nav {
            width: 100%;
            height: 50px;
            position: fixed;
            top: 0;
            background-color: #ffffff;
            min-height: 50px;
            z-index: 1;
            border: 1px solid #e7e7e7;

        }

        #sidebar {
            width: 20%;
            min-width: 270px;
            height: 100%;
            position: fixed;
            top: 50px;
            right: 0;
            overflow: hidden;
            background: #fff;
            z-index: 100;
            padding: 18px;
            border: 1px solid #ddd;
            border-top: none;
            border-bottom: none;
        }

        #sidebar:hover {
            overflow: auto;
        }

        #sidebar h1 {
            font-size: 16px;
        }

        #custom-toc-container {
            padding-left: 0;
        }

        #test-editormd-view, #test-editormd-view2 {
            padding-left: 0;
            padding-right: 430px;
            margin: 0;
        }

        #layout {
            padding-left: 5%;
            padding-right: 1%;
            margin-top: 50px;
        }
    </style>
</head>
<body>
<nav class="article-content-nav">
    <a href="#">返回</a>
    <button>写文章</button>
</nav>


<%--MD start--%>
<div id="layout">
    <!--文章列表-->
    <div id="main">
    </div>
    <div id="sidebar">
        <h1>Table of Contents</h1>
        <div class="markdown-body editormd-preview-container" id="custom-toc-container">
            #custom-toc-container
        </div>
    </div>


    <div id="test-editormd-view">
        <textarea style="display:none;" name="test-editormd-markdown-doc">###Hello world!</textarea>
    </div>
    <div id="test-editormd-view2">
                <textarea id="append-test" style="display:none;">

###科学公式 TeX(KaTeX)

$$E=mc^2$$

行内的公式$$E=mc^2$$行内的公式，行内的$$E=mc^2$$公式。

$$\(\sqrt{3x-1}+(1+x)^2\)$$

$$\sin(\alpha)^{\theta}=\sum_{i=0}^{n}(x^i + \cos(f))$$

$$X^2 > Y$$

#####上标和下标

上标：X&lt;sup&gt;2&lt;/sup&gt;

下标：O&lt;sub&gt;2&lt;/sub&gt;

##### 代码块里包含的过滤标签及属性不会被过滤

```html
&lt;style type="text/style"&gt;
body{background:red;}
&lt;/style&gt;

&lt;script type="text/javscript"&gt;
alert("script");
&lt;/script&gt;

&lt;iframe height=498 width=510 src="http://player.youku.com/embed/XMzA0MzIwMDgw" frameborder=0 allowfullscreen&gt;&lt;/iframe&gt;
```

#####Style

&lt;style&gt;
body{background:red;}
&lt;/style&gt;

&lt;style type="text/style"&gt;
body{background:red;}
&lt;/style&gt;

#####Script

&lt;script&gt;
alert("script");
&lt;/script&gt;

&lt;script type="text/javscript"&gt;
alert("script");
&lt;/script&gt;</textarea>
    </div>
</div>
<%--MD end--%>

<!--MD-->
<!-- <script src="js/zepto.min.js"></script>
        <script>
            var jQuery = Zepto;  // 为了避免修改flowChart.js和sequence-diagram.js的源码，所以使用Zepto.js时想支持flowChart/sequenceDiagram就得加上这一句
        </script> -->
<script src="/static/editorMD/js/jquery.min.js"></script>
<script src="/static/editorMD/lib/marked.min.js"></script>
<script src="/static/editorMD/lib/prettify.min.js"></script>
<script src="/static/editorMD/lib/raphael.min.js"></script>
<script src="/static/editorMD/lib/underscore.min.js"></script>
<script src="/static/editorMD/lib/sequence-diagram.min.js"></script>
<script src="/static/editorMD/lib/flowchart.min.js"></script>
<script src="/static/editorMD/lib/jquery.flowchart.min.js"></script>
<script src="/static/editorMD/editormd.js"></script>
<script type="text/javascript">
//    if ($("#main").height() > $("#sidebar").height()) {
//        var footerHeight = 0;
//        if ($('#page-footer').length > 0) {
//            footerHeight = $('#page-footer').outerHeight(true);
//        }
//        $('#sidebar').affix({
//            offset: {
//                top: $('#sidebar').offset().top - 30,
//                bottom: $('#footer').outerHeight(true) + footerHeight + 6
//            }
//        });
//    }

    <%--var framJsonStr = JSON.stringify(${framJson});--%>
    <%--var framJsonObj = JSON.parse(framJsonStr);--%>
    <%--var authorDes = "<p class=\"text-center\">" + framJsonObj.data.author[0].meta_value + "<br/>" + framJsonObj.data.author[1].meta_value + "</p>";--%>
    <%--document.getElementById("authorDescription").innerHTML = authorDes;--%>
    var postJsonStr = JSON.stringify(${postJson});
    var postJsonObj = JSON.parse(postJsonStr);
    var postData = postJsonObj.data.article_content;

    document.getElementById("main").innerHTML = postData;


    $(function () {
        var main, testEditormdView, testEditormdView2;

        main = editormd.markdownToHTML("main", {
            htmlDecode: "style,script,iframe",  // you can filter tags decode
            emoji: true,
            taskList: true,
            tex: true,  // 默认不解析
            flowChart: true,  // 默认不解析
            sequenceDiagram: true,  // 默认不解析
        });

        $.get("/static/editorMD/test.md", function (markdown) {
            testEditormdView = editormd.markdownToHTML("test-editormd-view", {
                markdown: markdown,//+ "\r\n" + $("#append-test").text(),
                //htmlDecode      : true,       // 开启 HTML 标签解析，为了安全性，默认不开启
                htmlDecode: "style,script,iframe",  // you can filter tags decode
                //toc             : false,
                tocm: true,    // Using [TOCM]
                tocContainer: "#custom-toc-container", // 自定义 ToC 容器层
                //gfm             : false,
                //tocDropdown     : true,
                // markdownSourceCode : true, // 是否保留 Markdown 源码，即是否删除保存源码的 Textarea 标签
//                emoji: false,
                taskList: true,
                tex: false,  // 科学公式 TeX(KaTeX)
                flowChart: true,  // 默认不解析
                sequenceDiagram: true,  // 默认不解析

            });
            //console.log("返回一个 jQuery 实例 =>", testEditormdView);
            // 获取Markdown源码
            //console.log(testEditormdView.getMarkdown());
            //alert(testEditormdView.getMarkdown());
        });

//        testEditormdView2 = editormd.markdownToHTML("test-editormd-view2", {
//            htmlDecode: "style,script,iframe",  // you can filter tags decode
//            emoji: true,
//            taskList: true,
//            tex: true,  // 默认不解析
//            flowChart: true,  // 默认不解析
//            sequenceDiagram: true,  // 默认不解析
//        });
    });


</script>
</body>
</html>
