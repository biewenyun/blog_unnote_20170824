<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/9/28
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Unnote Blog HomePage</title>
</head>
<body>
<div id="uerList">
    <script id="uerListTemplate" type="text/x-dot-template">
        {{~ it: value : index }}
        <a href="<c:url value="/homepaging/{{=value.ID }}"/>">
            <div>
                {{=value.NAME }}
            </div>
        </a>
        {{~}}
    </script>
</div>

<script type="text/javascript" src="<c:url value="/static/js/jquery.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/doT.min.js"/>"></script>
<script type="application/javascript" src="<c:url value="/static/js/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript">
    var userJsonStr = JSON.stringify(${userJson});
    var userJsonobj = JSON.parse(userJsonStr);
    if (userJsonobj.code == 1) {
        var innerHTML = doT.template($("#uerListTemplate").html());
        $("#uerList").empty();
        $("#uerList").html(innerHTML(userJsonobj.data));
        console.log("读取数组数据：" + innerHTML(userJsonobj.data));
    }
</script>

</body>
</html>
