(function() {
  'use strict';
  angular.module('giflerApp', ['ngCookies', 'ngResource', 'ngSanitize', 'ngRoute']).config(function($routeProvider) {
    return $routeProvider.when('/', {
      templateUrl: 'views/main.html',
      controller: 'MainCtrl'
    }).otherwise({
      redirectTo: '/'
    });
  });

}).call(this);

(function() {
  'use strict';
  angular.module('giflerApp').controller('MainCtrl', function($scope) {
    $scope.awesomeThings = ['HTML5 Boilerplate', 'AngularJS', 'Karma'];
    return console.log("hihihihi");
  });

}).call(this);
