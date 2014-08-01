define([
        './app',
        'ui.router']
    , function (app, router) {
        'use strict';
        return app.config(function ($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('state1');

            $stateProvider
                .state('state2', {
                    url: '/home/:number',
                    templateUrl: '/app',
                    controller: "Home"
                })
                .state('2', {
                    url: '/second/:number',
                    templateUrl: '/app',
                    controller: 'Home'
                })

        });
    });