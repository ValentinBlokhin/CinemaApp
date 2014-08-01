<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>">
    <script src="<c:url value="/resources/js/require.js"/> "></script>
    <script type="application/javascript">
        <%@include file="/resources/js/require_config.js"%>
        require(['require'], function (require) {
            require(["./bootstrap-main"]);
        });
    </script>
</head>
<body>
<div class="container" ng-controller="Home as home">

    <div class="col-lg-12">
        <button class="btn btn-primary"
                ng-click="parserModel.pageNumber | randomNumber; getOneQuoter(parserModel.pageNumber)">Get random
        </button>
        <input type="number" ng-model="parserModel.pageNumber">
        <button class="btn btn-primary" ng-click="getOneQuoter(parserModel.pageNumber)">Next</button>
        <button class="btn btn-primary" ng-click="getNew()">get new posts</button>

        <div class="row">
            <div class="col-lg-2">
                <table class="table table-bordered table-responsive">
                    <thead>
                    <tr>
                        <td>Post number</td>
                    </tr>
                    </thead>
                    <tbody ng-repeat="model in parserModel.text">
                    <tr>
                        <td><a ui-sref="state2({number: {{$index + 1}}})">{{model.id}}</a></td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div class="col-lg-9">
                <div ui-view></div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
