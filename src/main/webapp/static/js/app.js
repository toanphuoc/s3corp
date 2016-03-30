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
	when('/items/about', {
		templateUrl : 'items/about',
		controller: 'AboutController'
	}).
	when('/items/blog', {
		templateUrl : 'items/blog',
		controller: 'BlogController'
	}).
	when('/items/contact', {
		templateUrl : 'items/contact',
		controller: 'ContactController'
	}).
	otherwise({
	    redirectTo: '/items/home'
	});
}]);

console.log('ssss');