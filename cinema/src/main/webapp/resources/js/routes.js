define([
        './app',
        'ui.router']
    , function (app, router) {
        'use strict';
        return app.config(function ($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('state1');

            $stateProvider
                .state('state1', {
                    url: '/home',
                    templateUrl: '/app',
                    controller: 'Home'
                })
                .state('state2', {
                    url: '/second',
                    templateUrl: 'second',
                    controller: 'Home'
                })

        });
    });