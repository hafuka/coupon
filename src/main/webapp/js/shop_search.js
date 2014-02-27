$(function(){
    // 検索ボタン
    var searchBtn = $('#js_searchBtn');
    // 検索リスト表示エリア
    var searchList = $('#js_searchList');
    // 検索オプション
    var searchValue;
    
    // 検索ボタンを押したらajax通信を開始
    searchBtn.on('click', function(){
        ajaxGetSearchList();
    });
    
    // ajax通信
    function ajaxGetSearchList() {
    	searchValue = $('#searchValue').val();
        var url = urlPath + "/shopSearch/search";
        var formData = "searchValue=" + searchValue;
        ajaxJsonGlobal(url, formData, searchSuccess);
    }
    
    // ajax成功
    function searchSuccess(data){
        if (data != '') {
            // リストをJS-RENDERのテンプレートでDOMに追加
            searchList.html(
                $("#searchlist_template").render(returnSearchList(data))
            );
        } else {
            searchList.html('<li class="noList">対象のお店がありませんm(_ _)m</li>');
        }
    }
    
    // ajax成功時にリストを取得
    function returnSearchList(data){
        var storeList = [];
        var targetList;
        var len = data.length;
        for( var i = 0; i < len; i++ ){
            var dataList = data[i];
            targetList = {
                "shopId": dataList.shopId,
                "shopName": dataList.shopName,
                "businessName": dataList.businessName,
                "imgPath": dataList.imgPath,
                "station": dataList.station,
                "featuredCoupon": dataList.featuredCoupon
            };
            storeList.push(targetList);
        }
        return storeList;
    }
});