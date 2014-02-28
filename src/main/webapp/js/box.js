(function(){
    $(function(){
        
        // レア度セレクト
        var $raritySelect = $('#js_rarityChange');
        var $areaSearchList = $('#js_searchList');
        
        // 検索オプション
        var rarity;
        
        // レア度が変更されたらajax通信を開始
        $raritySelect.on('change', function(){
            ajaxGetList();
        });
        
        // ajax通信
        function ajaxGetList() {
            rarity = $('select[name=rarity]').val();
            var url = urlPath + "/box/changeRarity";
            var formData = "rarity=" + rarity;
            ajaxJsonGlobal(url, formData, searchSuccess);
        }
        
        // ajax成功
        function searchSuccess(data){
            if (data != '') {
                // リストをJS-RENDERのテンプレートでDOMに追加
                $areaSearchList.html(
                    $("#searchlist_template").render(returnSearchList(data))
                );
            } else {
                $searchList.html('<li class="noList">対象のクーポンがありませんm(_ _)m</li>');
            }
        }
        
        // ajax成功時にリストを取得
        function returnSearchList(data){
            var couponList = [];
            var targetList;
            var len = data.length;
            for( var i = 0; i < len; i++ ){
                var dataList = data[i];
                
                var rarityStyle;
                var rarityImage;
                switch (dataList.mShopCoupon.rarity) {
                case 1:
                    rarityStyle = 'normalList';
                    rarityImage = 'nCouponImg';
                    break;
                case 2:
                    rarityStyle = 'rareList';
                    rarityImage = 'rCouponImg';
                    break;
                case 3:
                    rarityStyle = 'sRareList';
                    rarityImage = 'srCouponImg';
                    break;
                default:
                    rarityStyle = '';
                    rarityImage = '';
                    break;
                }
                
                var status = '';
                if (dataList.userCoupon.status == 1) {
                    status = '<p class="fcRed fs13">使用中</p>';
                }
                
                var limitDate = new Date(dataList.userCoupon.limitDatetime);
                var convLimitDate = limitDate.getFullYear() + "/" + slice(limitDate.getMonth()) + "/" + slice(limitDate.getDate()) + " " + slice(limitDate.getHours()) + ":" + slice(limitDate.getMinutes()) + ":" + slice(limitDate.getSeconds());
                
                targetList = {
                    "rarityStyle": rarityStyle,
                    "userCouponId": dataList.userCoupon.userCouponId,
                    "shopImgPath": dataList.shopBean.imgPath,
                    "shopName": dataList.shopBean.shopName,
                    "business": dataList.shopBean.businessName,
                    "station": dataList.shopBean.station,
                    "couponName": dataList.mShopCoupon.couponName,
                    "limitDate": convLimitDate,
                    "status": status,
                    "rarityImage":rarityImage
                };
                couponList.push(targetList);
            }
            return couponList;
        }
        
        
        function slice(value) {
               return ("0"+value).slice(-2);
        }
        
    });
})();