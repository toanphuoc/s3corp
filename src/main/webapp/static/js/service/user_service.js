var appServices = angular.module('appServices', ['ngResource']);


appServices.factory('UserService', ['$http', function($http){

	var factory = {};
	factory.fetchAllUsers = function(){
		return $http({
			url: 'http://localhost:8080/web/user/getList'
		});
	};

	return factory;
}]);
