<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
    <link href="<c:url value="/resources/css/bootstrap.css"/>">
    <script data-main="<c:url value="/resources/js/require_config.js" />" src="<c:url value="/resources/js/require.js"/> "></script>
    <%--<script type="application/javascript">--%>
        <%--var require = {--%>
            <%--baseUrl: '<spring:url value="/resources/js/"/>'--%>
        <%--};--%>
    <%--</script>--%>
</head>
<body>
<div class="container" ng-controller="Home as home">
    <input type="text" ng-model="home" ng-init="home = 'hello'">
    <h1>{{home}}</h1>
    <h1>{{home|reverseIt}}</h1>
</div>
stub
</body>
</html>
