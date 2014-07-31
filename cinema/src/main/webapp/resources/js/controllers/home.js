define(['./module', 'angular', 'angular-route'], function (controllers, angular) {
    'use strict';

    controllers.controller('Home', ['$scope', 'BashParse', function ($scope, BashParse) {

        $scope.parserModel = {
            text: 'text',
            pageNumber: ''
        };

        $scope.getOneQuoter = function () {
            BashParse.getQuoter($scope.parserModel.pageNumber)
                .then(function (data) {
                    console.log(data);
                    $scope.parserModel.text = data;
                });
        };
//        bashParse.getQuoter();
        console.log('goooooo');
//        console.log($routeParams.message);
//        $scope.model = {
//            message: $routeParams.message
//        }
    }])

});