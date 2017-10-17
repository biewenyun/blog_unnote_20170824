<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/static/editorMD/css/style.css"/>
    <link rel="stylesheet" href="/static/editorMD/css/editormd.css"/>
</head>

<body>
<h2>hello 大家好，这里是后台管理！</h2>

<div id="my-editormd">
    <header>
        <%--主题选择--%>
        <p>
        <span>Themes</span>
        <select id="editormd-theme-select">
            <option selected="selected" value="">select Editor.md themes</option>
        </select>
        <select id="editor-area-theme-select">
            <option selected="selected" value="">select editor area themes</option>
        </select>
        <select id="preview-area-theme-select">
            <option selected="selected" value="">select preview area themes</option>
        </select>
        </p>
    </header>
    <%--<textarea id="my-editormd-markdown-doc" name="my-editormd-markdown-doc" style="display:none;"></textarea>--%>
    <%--<textarea id="my-editormd-html-code" name="my-editormd-html-code" style="display:none;"></textarea>--%>
</div>
<div id="test-editormd"></div>


<div class="btns">
    <button id="show-toolbar-btn">Show toolbar</button>
    <button id="close-toolbar-btn">Hide toolbar</button>
    <button id="get-md-btn">Get Markdown</button>
    <button id="get-html-btn">Get HTML</button>
    <%--<button id="goto-line-btn">Goto line 90</button>--%>
    <%--<button id="show-btn">Show editor</button>--%>
    <%--<button id="hide-btn">Hide editor</button>--%>
    <%--<button id="watch-btn">Watch</button>--%>
    <%--<button id="unwatch-btn">Unwatch</button>--%>
    <%--<button id="toc-menu-btn">ToC Dropdown menu</button>--%>
    <%--<button id="toc-default-btn">ToC default</button>--%>
    <%--<button id="preview-btn">Preview HTML (Press Shift + ESC cancel)</button>--%>
    <%--<button id="fullscreen-btn">Fullscreen (Press ESC cancel)</button>--%>
</div>

<%--JS--%>
<script src="/static/editorMD/js/jquery.min.js"></script>
<script src="/static/editorMD/editormd.js"></script>
<script type="text/javascript">
    var testEditor;
    $(function () {
        $.get('/static/editorMD/test.md', function (md) {
            testEditor = editormd("test-editormd", {
                toolbarAutoFixed: true,          // 工具栏固定
                width: "90%",
                height: 740,
                path: '/static/editorMD/lib/',
//                    theme : "dark",
//                    previewTheme : "dark",
//                    editorTheme : "pastel-on-dark",
                theme: (localStorage.theme) ? localStorage.theme : "dark",
                previewTheme: (localStorage.previewTheme) ? localStorage.previewTheme : "dark",
                editorTheme: (localStorage.editorTheme) ? localStorage.editorTheme : "pastel-on-dark",
                markdown: md,
                codeFold: true,
                //syncScrolling : false,
                saveHTMLToTextarea: true,    // 保存 HTML 到 Textarea
                searchReplace: true,
                //watch : false,                // 关闭实时预览
                htmlDecode: "style,script,iframe|on*",            // 开启 HTML 标签解析，为了安全性，默认不开启
                //toolbar  : false,             //关闭工具栏
                //previewCodeHighlight : false, // 关闭预览 HTML 的代码块高亮，默认开启
                emoji: true,
                taskList: true,
                tocm: true,         // Using [TOCM]
//                    tex : true,                   // 开启科学公式TeX语言支持，默认关闭
                flowChart: true,             // 开启流程图支持，默认关闭
                sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
                //dialogLockScreen : false,   // 设置弹出层对话框不锁屏，全局通用，默认为true
                //dialogShowMask : false,     // 设置弹出层对话框显示透明遮罩层，全局通用，默认为true
                //dialogDraggable : false,    // 设置弹出层对话框不可拖动，全局通用，默认为true
                //dialogMaskOpacity : 0.4,    // 设置透明遮罩层的透明度，全局通用，默认值为0.1
                //dialogMaskBgColor : "#000", // 设置透明遮罩层的背景颜色，全局通用，默认为#fff
                imageUpload: true,
                imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
                imageUploadURL: "./php/upload.php",
                onload: function () {
                    console.log('onload', this);
                    //this.fullscreen();
                    //this.unwatch();
                    //this.watch().fullscreen();

                    //this.setMarkdown("#PHP");
                    //this.width("100%");
                    //this.height(480);
                    //this.resize("100%", 640);
                }

            });
            // 主题
            themeSelect("editormd-theme-select", editormd.themes, "theme", function ($this, theme) {
                testEditor.setTheme(theme);
            });
            themeSelect("editor-area-theme-select", editormd.editorThemes, "editorTheme", function ($this, theme) {
                testEditor.setCodeMirrorTheme(theme);// or testEditor.setEditorTheme(theme);
            });
            themeSelect("preview-area-theme-select", editormd.previewThemes, "previewTheme", function ($this, theme) {
                testEditor.setPreviewTheme(theme);
            });

        });

        function themeSelect(id, themes, lsKey, callback) {
            var select = $("#" + id);
            for (var i = 0, len = themes.length; i < len; i++) {
                var theme = themes[i];
                var selected = (localStorage[lsKey] == theme) ? " selected=\"selected\"" : "";
                select.append("<option value=\"" + theme + "\"" + selected + ">" + theme + "</option>");
            }
            select.bind("change", function () {
                var theme = $(this).val();
                if (theme === "") {
                    alert("theme == \"\"");
                    return false;
                }
                console.log("lsKey =>", lsKey, theme);
                localStorage[lsKey] = theme;
                callback(select, theme);
            });
            return select;
        }

        $("#get-md-btn").bind('click', function () {
            alert(testEditor.getMarkdown());
        });

        $("#get-html-btn").bind('click', function () {
            alert(testEditor.getHTML());
        });
        $("#show-toolbar-btn").bind('click', function () {
            testEditor.showToolbar();
        });

        $("#close-toolbar-btn").bind('click', function () {
            testEditor.hideToolbar();
        });

//        $("#goto-line-btn").bind("click", function () {
//            testEditor.gotoLine(90);
//        });
//        $("#show-btn").bind('click', function () {
//            testEditor.show();
//        });
//
//        $("#hide-btn").bind('click', function () {
//            testEditor.hide();
//        });
//        $("#watch-btn").bind('click', function () {
//            testEditor.watch();
//        });
//
//        $("#unwatch-btn").bind('click', function () {
//            testEditor.unwatch();
//        });
//
//        $("#preview-btn").bind('click', function () {
//            testEditor.previewing();
//        });
//
//        $("#fullscreen-btn").bind('click', function () {
//            testEditor.fullscreen();
//        });
//        $("#toc-menu-btn").click(function () {
//            testEditor.config({
//                tocDropdown: true,
//                tocTitle: "目录 Table of Contents",
//            });
//        });
//
//        $("#toc-default-btn").click(function () {
//            testEditor.config("tocDropdown", false);
//        });

    });
</script>
</body>
</html>
