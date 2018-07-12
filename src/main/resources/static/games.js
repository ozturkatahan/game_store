var  myApp = angular.module('GameStoreApplication',[]).controller('GamesController',function ($scope,$http) {


    $scope.games = {};
    $scope.gamesList = [];
    $scope.category = {};
    $scope.categoryList = [];

    $scope.pageOpen = function () {

       // $scope.listCategories();
        $scope.findGames();


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
            $scope.category = response.data;
        });

    };


    $scope.saveCategories = function ()
    {
        var h = $http.post("api/categories/saveCategories", $scope.category);
        h.then(function (response)
        {
            alert(response.data);
            $scope.findGames();
        })
    }
    $scope.listCategories = function () {

        var res = $http.get('api/categories/listCategories');
        res.then(function (response) {

            $scope.categoryList = response.data;

        })

    }



    //Save games
    $scope.saveGames = function ()
    {
        var h = $http.post("api/games/saveGames", $scope.games);
        h.then(function (response)
        {
            alert(response.data);
            $scope.findGames();
        })
    }


    //Update games
    $scope.selectGame = function (games)
    {
        $scope.games = games;

    }

    $scope.deleteGame = function (game)
    {
        $scope.games=game;
        var games = $http.post("/api/games/deleteGames",$scope.games)
        games.then(function (data)
        {
            $scope.games = {};
            $scope.findGames()
        })
    }

});