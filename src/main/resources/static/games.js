var  myApp = angular.module('GameStoreApplication',[]).controller('GamesController',function ($scope,$http) {


    $scope.games = {}
    $scope.gamesList = [];
    $scope.categoryModel = {};
    $scope.categoryList = [];

    $scope.pageOpen = function () {

        $scope.listCategories();


    };

    $scope.findGames = function () {

        var res = $http.get('api/games/listGames');
        res.then(function (response) {

            $scope.gamesList = response.data;
            
        })
        
    }

    $scope.showDetails = function () {

        var res = $http.get('api/categories/listCategoriesWithId/',$scope.games);
        res.then(function (response) {
            $scope.categoryModel = response.data;
        })

    }

    $scope.listCategories = function () {

        var res = $http.get('api/categories/listCategories');
        res.then(function (response) {

            $scope.categoryList = response.data;

        })

    }

});