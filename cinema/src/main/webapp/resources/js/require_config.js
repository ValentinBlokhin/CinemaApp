//console.time("application loading");

requirejs.config({
        paths: {
            "angular": 'bower_components/angular/angular',
            "ui.bootstrap": 'bower_components/angular-bootstrap/ui-bootstrap-tpls',
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
            'jquery': {
                exports: '$'
            },
            'class': {
                exports: 'Class'
            }

        },

        deps: ['./bootstrap-main']


});