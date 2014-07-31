define([
    'require',
    'angular',
    'app',
    'routes',
    'ui.router'
], function (require, ng) {
    'use strict';

    require(['domReady!'], function (document) {
        ng.bootstrap(document, ['app']);
        console.timeEnd("application loading")
    });

});