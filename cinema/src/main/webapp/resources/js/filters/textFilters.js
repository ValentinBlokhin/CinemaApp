define([
   './module',
    'angular'
], function(app) {
    app.filter('reverseIt', function() {
        return function(text) {
            return text.split("").reverse().join("");
        }
    })
});