<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
    <link href="<c:url value="/resources/css/bootstrap.css"/>">
    <script src="<c:url value="/resources/js/require.js"/> "></script>
    <script type="application/javascript">
        <%@include file="/resources/js/require_config.js"%>
        require(['require'], function(require) {
            require(["./bootstrap-main"]);
        });
    </script>
</head>
<body>
<div class="container" ng-controller="Home as home">

    <div class="col-lg-12">
        <button class="btn btn-primary" ng-click="parserModel.pageNumber | randomNumber; getOneQuoter(parserModel.pageNumber)">Get random</button>
        <input type="number" ng-model="parserModel.pageNumber">
        <button class="btn btn-primary" ng-click="getOneQuoter(parserModel.pageNumber)">Next</button>
    </div>

        <pre>{{parserModel.text | reverseIt}}</pre>

</div>
</body>
</html>
