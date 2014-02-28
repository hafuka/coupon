(function(){
    $(function(){
        
    	// お気にエリア
    	var $favoriteJudgeArea = $('#js_favoriteJudgeArea');
        // お気に削除ボタン
        var $deleteFavoriteBtn = $('#js_deleteFavoriteBtn');
        // お気に登録ボタン
        var $addFavoriteBtn = $('#js_addFavoriteBtn');
        
        // お気に登録ボタン押したらajax通信を開始
        $addFavoriteBtn.on('click', function(){
            ajaxAddFavorite();
        });
        
        // お気に追加ajax通信
        function ajaxAddFavorite() {
            var shopId = shopDetail.shopId;
            var url = urlPath + "/favorite/regist";
            var formData = "shopId=" + shopId;
            ajaxJsonGlobal(url, formData, addSuccess);
        }
        
        // お気に追加ajax成功
        function addSuccess(data){
            if (data.result) {
                $favoriteJudgeArea.html('<span class="fcRed">お気に入りに<br>登録したよ♪</span>');
            }
        }
        
        // お気に削除ボタン押したらajax通信を開始
        $deleteFavoriteBtn.on('click', function(){
            ajaxDeleteFavorite();
        });
        
        // お気に削除ajax通信
        function ajaxDeleteFavorite() {
            var shopId = shopDetail.shopId;
            var url = urlPath + "/favorite/delete";
            var formData = "shopId=" + shopId;
            ajaxJsonGlobal(url, formData, deleteSuccess);
        }
        
        // お気に削除ajax成功
        function deleteSuccess(data){
            if (data.result) {
                $favoriteJudgeArea.html('<span class="fcRed">お気に入りを<br>削除したよ(ToT)</span>');
            }
        }
    });
})();