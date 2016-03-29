var app = angular.module('myApp', [
    'ngRoute',
  	'appControllers',
  	//'appServices', 
  	'ngSanitize'
]);

app.config(['$routeProvider', function($routeProvider){
	$routeProvider.
	when('/items/home', {
		templateUrl : 'items/home',
		controller: 'HomeController'
	}).
	otherwise({
	    redirectTo: '/items/home'
	});
}]);

console.log('ssss');