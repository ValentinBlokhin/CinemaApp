define(['./module', 'angular', '../app', 'angular-route'], function (controllers, angular, app) {
    'use strict';

    app.register.controller('Bash', ['$scope', 'BashParse', function ($scope, BashParse, $stateParams) {

        $scope.parserModel = {
            text: [],
            pageNumber: '',
            id: ''
        };

        $scope.getOneQuoter = function () {
            BashParse.getQuoter($scope.parserModel.pageNumber)
                .then(function (data) {
                    $scope.parserModel.text.id = data.ids;
                    $scope.parserModel.text.value = data.quotes;
                });
        };

        $scope.getNew = function () {
            BashParse.getNew()
                .then(function (data) {
                    $scope.parserModel.text = [];
                    angular.forEach(data, function (data) {
                        console.log(data);
                        $scope.parserModel.text.push({
                            id: data.ids,
                            value: data.quotes
                        });
                    })
                })
        };

        $scope.getId = function () {
            $scope.parserModel.id = $stateParams.number;
            $scope.parserModel = angular.copy($scope.$parent.parserModel);
        }
    }])

});