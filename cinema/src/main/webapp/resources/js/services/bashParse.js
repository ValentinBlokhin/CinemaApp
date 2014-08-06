define(['./module', 'restangular'], function (services) {
    'use strict';
    services.factory('BashParse', ['Restangular', function (Restangular) {
        return {
            getQuoter: function (number) {
                return Restangular.one("api/quotes", number).get();
            },
            getNew: function () {
                return Restangular.all("api/quotes/new").getList();
            }
//        }.config(function(RestangularProvider) {
//            RestangularProvider.setDefaultHeaders({
//                'Access-Control-Allow-Origin' : "*",
//                'Access-Control-Allow-Headers' : "Content-Type, X-Requested-With",
//                'Access-Control-Allow-Methods' : "'GET, POST"
//            });
//        });
        }
    }]);
});