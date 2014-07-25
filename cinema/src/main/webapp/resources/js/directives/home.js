define([
    './module',
    'angular'
], function(app) {
    'use strict';
    app.directive('enter', function() {
        return function ($scope, element) {
            element.bind('mouseenter', function() {
                console.log('im here');
            })
        }
    })
});