define([
   './module',
    'angular'
], function(app) {
    app.filter('reverseIt', function() {
        return function(text) {
            var a = text.split("-:-");
            var joinedString = a.join("\n");
            return joinedString;
        }
    });
});