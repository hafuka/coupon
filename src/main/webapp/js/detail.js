$(function(){
	
    // お気に削除ボタン
    var deleteFavoriteBtn = $('#js_deleteFavoriteBtn');
    // お気に登録ボタン
    var addFavoriteBtn = $('#js_addFavoriteBtn');
    
    // お気に登録ボタン押したらajax通信を開始
    addFavoriteBtn.on('click', function(){
    	ajaxAddFavorite();
    });
    
    // お気に追加ajax通信
    function ajaxAddFavorite() {
    	var shopId = $('#hdn_shopId').val();
        var url = urlPath + "/favorite/regist";
        var formData = "shopId=" + shopId;
        ajaxJsonGlobal(url, formData, addSuccess);
    }
    
    // お気に追加ajax成功
    function addSuccess(data){
        if (data.result) {
        	//$('#js_addFavoriteBtn').addClass('none');
        	//$('#js_deleteFavoriteBtn').addClass('block');
        }
    }
    
    // お気に削除ボタン押したらajax通信を開始
    deleteFavoriteBtn.on('click', function(){
    	ajaxDeleteFavorite();
    });
    
    // お気に削除ajax通信
    function ajaxDeleteFavorite() {
    	var shopId = $('#hdn_shopId').val();
        var url = urlPath + "/favorite/delete";
        var formData = "shopId=" + shopId;
        ajaxJsonGlobal(url, formData, deleteSuccess);
    }
    
    // お気に削除ajax成功
    function deleteSuccess(data){
        if (data.result) {
        	//$('#js_addFavoriteBtn').addClass('block');
        	//$('#js_deleteFavoriteBtn').addClass('none');
        }
    }
});