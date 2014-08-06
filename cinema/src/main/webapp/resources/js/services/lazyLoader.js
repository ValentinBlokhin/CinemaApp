define([
    './module',
    'require',
    'angular'
], function (lazyLoader, require, ng) {
    "use strict";

    lazyLoader.service(['$q', '$rootScope', function ($q, $rootScope) {

        this.setFileName =  function(name) {
            var deffered = $q.defer();

            require([name], function () {
                $rootScope.$apply(function () {
                    deffered.resolve();
                })
            });
            return deffered.promise();
        }
        }]);
});