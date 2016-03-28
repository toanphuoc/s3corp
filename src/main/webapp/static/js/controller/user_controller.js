'use strict';

App.controller('UserController', ['$scope', 'UserService', function($scope, UserService){
	this.fetchAllUsers = function(){
		UserService.fetchAllUsers().then(
			function(d){
				$scope.users = d;
			}
		)
	}
}])