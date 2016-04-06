var app = angular.module('myApp', [
    'ngRoute',
  	'appControllers',
  	//'appServices', 
  	'ngSanitize'
]);

app.config(['$routeProvider', function($routeProvider){
	$routeProvider.
	when('/', {
		templateUrl : 'items/home',
		controller: 'HomeController'
	}).
	when('/about', {
		templateUrl : 'items/about',
		controller: 'AboutController'
	}).
	when('/blog', {
		templateUrl : 'items/blog',
		controller: 'BlogController'
	}).
	when('/contact', {
		templateUrl : 'items/contact',
		controller: 'ContactController'
	}).
	otherwise({
	    redirectTo: '/'
	});
}]);

console.log('ssss');