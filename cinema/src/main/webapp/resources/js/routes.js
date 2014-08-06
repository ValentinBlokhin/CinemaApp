define([
        './app',
        'angular',
        'ui.router',
        'require',
    'ui.router']
    , function (app) {
        'use strict';
        return app.config(function ($stateProvider, $urlRouterProvider, $controllerProvider) {
//            app.register = {
//                controller: $controllerProvider.register
//            };


            $urlRouterProvider.otherwise('bash');

            $stateProvider
                .state('bash', {
                    views: {
                        'test1': {
                            templateUrl: '/bash',
                            url: "/",
                            resolve: {
                                load: ['$q', '$rootScope', function ($q, $rootScope) {
                                    var deferred = $q.defer();
                                    require(['./controllers/bash'], function () {
                                        $rootScope.$apply(function () {
                                            deferred.resolve();
                                        });
                                    });
                                    return deferred.promise;
                                }]
                            },
                            controller: 'Bash as bash'
                        }
                    }
                })
                .state('bash.state2', {
                    views: {
                        "test2": {
                            url: "/:number",
//                            templateUrl: '/app',
                            resolve: {
                                load: ['$q', '$rootScope', function ($q, $rootScope) {
                                    var deferred = $q.defer();
                                    require(['./controllers/bashText'], function () {
                                        $rootScope.$apply(function () {
                                            deferred.resolve();
                                        });
                                    });

                                    return deferred.promise;
                                }]
                            },
                            controller: "BashText as text"
                        }
                    }
                });
//                .state('state2.comment', {
//                    parent: 'state2',
//                    templateUrl: '/comment'
//                })
//                .state('state2.banan', {
//                    parent: 'state2',
//                    templateUrl: '/banan'
//                })

        });
    });