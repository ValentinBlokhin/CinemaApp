define([
    './module',
    'angular'
], function (app) {
    'use strict';
    app.directive('superhero',['BashParse'], function (BashParse) {
        return {
            restrict: "E",
            scope: {
                text: '='
            }
        }
    });

    app.directive('strenght', function() {
        return {
            require: "superhero",
            link: function($scope, element, attrs, controllerSup) {
                controllerSup.addStreight();
            }
        }
    });
});