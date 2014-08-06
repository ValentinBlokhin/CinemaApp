<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-lg-12">

    ojdfiogjdfiogjdoifgjdiofjgiodfjgoifdgfdgdfgdfgdf
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
                    <td><a ui-sref=".state2({number: {{$index + 1}}})">{{model.id}}</a></td>
                </tr>
                </tbody>
            </table>
        </div>

        <div ui-view="test2"></div>
    </div>
</div>
