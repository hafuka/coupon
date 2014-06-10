
function mainCtrl($scope){
    //年齢
    $scope.angYear = $('select[name=year]').val();
    $scope.yearSuccess = false;
    
    //年齢が選択されていればメッセージを出す
    $scope.$watch('angYear', function(newValue, oldValue){
        if($scope.angYear != 0){
            $scope.yearSuccess = true;
        }else{
            $scope.yearSuccess = false;
        }
    });
    
    //性別
    $scope.angSex = $('select[name=sex]').val();
    $scope.sexSuccess = false;
    
    //年齢が選択されていればメッセージを出す
    $scope.$watch('angSex', function(newValue, oldValue){
        if($scope.angSex != 0){
            $scope.sexSuccess = true;
        }else{
            $scope.sexSuccess = false;
        }
    });
    
    var allRegistFlg = false;

    $scope.successInfo = function(){
        if( ($scope.yearSuccess == true) && ($scope.sexSuccess == true) ) {
            
            allRegistFlg = true;
            
        }
        return  allRegistFlg;
    }
    
    //すべて入力OKだったら登録ボタン！
    $scope.$watch('successInfo()', function(newValue, oldValue){
        if($scope.successInfo() == true){
            $('#js_noRegistBtn').addClass('none');
            $('#js_registBtn').removeClass('none');
        }else{
            $('#js_noRegistBtn').removeClass('none');
            $('#js_registBtn').addClass('none');
        }
    });

}