define([
   './module',
    'angular'
], function(app) {
    app.filter('reverseIt', function() {
        return function(text) {
            var a = text.split(/(\w+:)/gim);
            var joinedString = a.join(" ");
            return joinedString;
        }
    });
});