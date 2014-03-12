(function(){
    $(function(){
        
        // 使うボタン
        var $useBtn = $('#js_useBtn');
        // 使うボタンエリア
        var $useBtnArea = $('#js_useBtnArea');
        // 残り時間
        var $remainTime = $('#js_remainTime');
        // 注意テキスト（使うボタン押す前）
        var $timeNoticeText = $('#js_timeNoticeText');
        // 注意テキスト（使うボタン押した後）
        var $usableTicketText = $('#js_usableTicketText');
        // 使えるアイコン
        var $usableIcon = $('#js_usableIcon');
        // 有効期限テキスト
        var $termText = $('#js_termText');
        
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
                console.log(data);
                $remainTime.html(data.remainTime);
                $useBtnArea.addClass('none');
                $timeNoticeText.addClass('none');
                $usableTicketText.removeClass('none');
                $usableTicketText.addClass('block');
                $usableIcon.removeClass('none');
                $usableIcon.addClass('block');
                $termText.text('使用期限：');
            }
        }
    });
})();