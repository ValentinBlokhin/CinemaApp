<%--
  Created by IntelliJ IDEA.
  User: vblokhin
  Date: 28.07.14
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 ng-init="getId()">{{parserModel.id}}</h1>

<div ng-repeat="model in parserModel.text">
    <div ng-if="$index == parserModel.id">
        <pre>{{model.value | reverseIt}}</pre>
    </div>
</div>
