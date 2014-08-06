
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 ng-init="getId()">id{{parserModel.id}}id</h1>

{{parserModel.id}}

<div ng-repeat="model in parserModel.text">
    <div ng-if="$index == parserModel.id">
        <pre>{{model.value | reverseIt}}</pre>
    </div>
</div>


banan

<%--<div ui-view="test2"></div>--%>
