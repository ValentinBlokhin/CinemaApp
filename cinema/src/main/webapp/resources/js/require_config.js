console.time('application loading');

requirejs.config({
       baseUrl: "/resources/js",
        paths: {
            "angular": 'bower_components/angular/angular',
            "ui.bootstrap": 'bower_components/angular-bootstrap/ui-bootstrap-tpls',
            'angular-route' : 'bower_components/angular-route/angular-route',
            "ui.router": 'bower_components/angular-ui-router/release/angular-ui-router',
            "underscore": 'bower_components/underscore/underscore',
            "restangular": 'bower_components/restangular/dist/restangular',
            "domReady": 'bower_components/domReady/domReady',
            "jquery": 'bower_components/jquery/dist/jquery',
            "class": 'classes/class',
            "angular-resources": 'bower_components/angular-resource/angular-resource'
        },

        shim: {
            "angular": {
                exports: 'angular'
            },
            'angular-resources': {
                deps: ["angular"]
            },
            'ui.bootstrap': {
                deps: ["angular"]
            },
            'angular-route': {
                deps: ["angular"]
            },

            'ui.router': {
                deps: ["angular"]
            },
            'underscore': {
                exports: '_'
            },

            'restangular': {
                deps: ["underscore", "angular"]
            },

            'jquery': {
                exports: '$'
            },
            'class': {
                exports: 'Class'
            }

        }

});