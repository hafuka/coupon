(function(){
    $(function(){
        // 検索ボタン
        var $searchBtn = $('#js_searchBtn');
        // 検索リスト表示エリア
        var $searchList = $('#js_searchList');
        // リスト上テキスト
        var $couponListText = $('#js_couponListText');
        // 検索オプション
        var areaId,
            areaDetailId,
            businessId;
        // ルーレットボタン
        var $activeRouletteBtn = $('.js_activeRouletteBtn');
        
        // 検索ボタンを押したらajax通信を開始
        $searchBtn.on('click', function(){
            ajaxGetSearchList();
        });
        
        // ajax通信
        function ajaxGetSearchList() {
            areaId = $('select[name=area]').val();
            areaDetailId = $('select[name="areaDetail"]').val();
            businessId = $('select[name="business"]').val();
            
            var url = urlPath + "/search/search";
            var formData = "areaId=" + areaId + "&areaDetailId=" + areaDetailId + "&businessId=" + businessId;
            ajaxJsonGlobal(url, formData, searchSuccess);
            /*
            if(areaId == 0){
                alert('地域を選択してね♪');
            }else if(areaDetailId == 0){
                alert('エリアを選択してね♪');
            }else if(businessId == 0){
                alert('業種を選択してね♪');
            }else{
                var url = urlPath + "/search/search";
                var formData = "areaId=" + areaId + "&areaDetailId=" + areaDetailId + "&businessId=" + businessId;
                ajaxJsonGlobal(url, formData, searchSuccess);
            }
            */
        }
        
        // ajax成功
        function searchSuccess(data){
            if (data != '') {
                // リストをJS-RENDERのテンプレートでDOMに追加
                $searchList.html(
                    $("#searchlist_template").render(returnSearchList(data))
                );
                
                if (freeRouletteFlg == 1) {
                    // ポイントでルーレットを回す場合のボタン表示
                    $activeRouletteBtn.html(
                        '<a href="' + urlPath + '/rouletteAnimation?token=' + token + '&areaId=' + areaId + '&areaDetailId=' + areaDetailId + '&businessId=' + businessId + '" class="btn btnSpecial jsTouchActive autoMargin">無料で♪スロットを回す</a>'
                    );
                } else {
                    // 無料でルーレットを回す場合のボタン表示
                    $activeRouletteBtn.html(
                        '<a href="' + urlPath + '/rouletteAnimation?token=' + token + '&areaId=' + areaId + '&areaDetailId=' + areaDetailId + '&businessId=' + businessId + '" class="btn btnSpecial jsTouchActive autoMargin">ポイントで♪スロットを回す</a>'
                    );
                }
                /*
                $couponListText.html(
                    '下のリストのどれか１つが当たるよ♪<br><span class="fs12 fcBlack">※クーポンは1店舗あたり3種類あるよ</span>'
                );
                */
            } else {
                $searchList.html('<li class="noList">対象のお店がありませんm(_ _)m</li>');
                $activeRouletteBtn.html(
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
        
        // 地域セレクト
        var $areaSelect = $('#js_areaChange');
        var $areaSearchList = $('#js_searchAreaDetailList');
        
        
        // 地域が変更されたらajax通信を開始
        $areaSelect.on('change', function(){
            ajaxGetAreaDetailList();
        });
        
        // ajax通信
        function ajaxGetAreaDetailList() {
            areaId = $('select[name=area]').val();
            var url = urlPath + "/search/changeArea";
            var formData = "areaId=" + areaId;
            ajaxJsonGlobal(url, formData, searchAreaDetailSuccess);
        }
        
        // ajax成功
        function searchAreaDetailSuccess(data){
            if (data != '') {
                // リストをJS-RENDERのテンプレートでDOMに追加
                $areaSearchList.html(
                    $("#searchAreaDetailList_template").render(returnSearchAreaDetailList(data))
                );
            } else {
                // リストをJS-RENDERのテンプレートでDOMに追加
                $areaSearchList.html(
                    $("#searchAreaDetailList_template").render(returnSearchAreaDefault())
                );
            }
        }
        
        // ajax成功時にリストを取得
        function returnSearchAreaDetailList(data){
            var areaDetailList = [];
            targetList = {
                "areaValue": 0,
                "areaName": "ｴﾘｱを選択してください",
            };
            areaDetailList.push(targetList);
            
            var targetList;
            var len = data.length;
            
            for( var i = 0; i < len; i++ ){
                var dataList = data[i];
                targetList = {
                    "areaValue": dataList.value,
                    "areaName": dataList.label,
                };
                areaDetailList.push(targetList);
            }
            return areaDetailList;
        }
        
        // ajax成功時にリストを取得
        function returnSearchAreaDefault(){
            var areaDetailList = [];
            targetList = {
                "areaValue": 0,
                "areaName": "ｴﾘｱを選択してください",
            };
            areaDetailList.push(targetList);
            return areaDetailList;
        }
        
    });
})();