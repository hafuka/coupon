(function(){
    $(function(){
        
        // 使うボタン
        var $useBtn = $('#js_useBtn');
        var $remainTime = $('#js_remainTime');
        
        // 使うボタン押したらajax通信を開始
        $useBtn.on('click', function(){
            ajaxUseCoupon();
        });
        
        // 使うajax通信
        function ajaxUseCoupon() {
            var url = urlPath + "/coupon/use";
            var formData = "userCouponId=" + couponDetail.userCouponId;
            ajaxJsonGlobal(url, formData, useSuccess);
            console.log('success');
        }
        
        // 使うajax成功
        function useSuccess(data){
            if (data != '') {
                $remainTime.html(data.remainTime);
            }
        }
    });
})();