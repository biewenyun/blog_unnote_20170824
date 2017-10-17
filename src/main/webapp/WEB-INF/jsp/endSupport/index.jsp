<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后端支持</title>
    <jsp:include page="/user/endSupport/backManagement"/>
</head>
<body>
登录成功，你的session的id是${pageContext.session.id}
</body>
</html>
