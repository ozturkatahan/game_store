var  myApp = angular.module('GameStoreApplication',[]).controller('CategoriesController',function ($scope,$http) {


    $scope.category = {}
    $scope.categoryList = [];

    $scope.pageOpen = function () {

        $scope.listCategories();


    };

    $scope.findGames = function () {

        var res = $http.get('api/games/findGamesById', +$scope.category.idCategories);
        res.then(function (response) {

            $scope.gamesList = response.data;

        })

    }

    $scope.showDetails = function () {

        var res = $http.get('api/categories/listCategoriesWithId/',$scope.games);
        res.then(function (response) {
            $scope.category = response.data;
        })

    }

    $scope.listCategories = function () {

        var res = $http.get('api/categories/listCategories');
        res.then(function (response) {

            $scope.categoryList = response.data;

        })

    }

});