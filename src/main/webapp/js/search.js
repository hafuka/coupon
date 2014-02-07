$(function(){
    // 検索ボタン
    var searchBtn = $('#js_searchBtn');
    // 検索リスト表示エリア
    var searchList = $('#js_searchList');
    // 検索オプション
    var areaId,
        areaDetailId,
        businessId;
    // ルーレットボタン
    var activeRouletteBtn = $('.js_activeRouletteBtn');
    
    // 検索ボタンを押したらajax通信を開始
    searchBtn.on('click', function(){
        ajaxGetSearchList();
    });
    
    // ajax通信
    function ajaxGetSearchList() {
    	
        areaId = $('select[name=area]').val();
        areaDetailId = $('select[name="areaDetail"]').val();
        businessId = $('select[name="business"]').val();
        
        console.log(areaId);
        var url = urlPath + "/search/search";
        var formData = "areaId=" + areaId + "&areaDetailId=" + areaDetailId + "&businessId=" + businessId;
        console.log(formData);
        ajaxJsonGlobal(url, formData, searchSuccess);
    }
    
    // ajax成功
    function searchSuccess(data){
        if (data != '') {
            // リストをJS-RENDERのテンプレートでDOMに追加
            searchList.html(
                $("#searchlist_template").render(returnSearchList(data))
            );
            activeRouletteBtn.html(
                '<a href="' + urlPath + '/rouletteAnimation?token=' + token + '&areaId=' + areaId + '&areaDetailId=' + areaDetailId + '&businessId=' + businessId + '" class="btn btnSpecial getActive jsTouchActive autoMargin">ドコ行く？</a>'
            );
        } else {
            searchList.html('<li class="noList">対象のお店がありませんm(_ _)m</li>');
            activeRouletteBtn.html(
                '<p class="btn btnNoActive autoMargin">対象のお店がないみたい</p>'
            );
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