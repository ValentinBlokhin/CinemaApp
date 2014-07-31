define([
    './module',
    'angular'
], function(app) {
    app.filter('randomNumber', function() {
        return function(text) {

            return Math.floor((Math.random() * 10) + 1);
        }
    });
});