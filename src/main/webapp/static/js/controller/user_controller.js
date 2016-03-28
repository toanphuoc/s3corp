'use strict';

App.controller('UserController', ['$scope', 'UserService', function($scope, UserService){
	var self = this;
	self.user={id:null,name:'',age:'',salary:''};
    self.users=[];
	self.fetchAllUsers = function(){
		UserService.fetchAllUsers().then(
			function(d){
				console.log(d);
				self.users = d;
			},function(errResponse){
                console.error('Error while fetching Currencies');
            }
		)
	};
	
	self.fetchAllUsers();
}])