define(['./module', 'angular', '../app', 'angular-route'], function (controllers, angular, app) {
    'use strict';

    app.register.controller('BashText', ['$scope', '$stateParams', function ($scope, $stateParams) {

        $scope.getId = function () {
            $scope.parserModel.id = $stateParams.number;
        }
    }])});