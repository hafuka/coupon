(function(window){
    //ポップアップ用
    var windowX, windowY;

    //ポップアップ関数
    var popupWindow = function($targetPopup) {

        this.show = function() {
            windowY = ( ($(window).width() / 2) - ($targetPopup.width() / 2) ) + "px";
            windowX = ( $(document).scrollTop() + ($(window).height() / 2) - ($targetPopup.height() / 2) ) + "px";
            
            $('.outline').addClass('grayscale');

            $targetPopup
                .css({top: windowX, left: windowY})
                .fadeIn(500);
        };
        this.hide = function() {
            $('.outline').removeClass('grayscale');
            $targetPopup
                .fadeOut(500);
        };
    };
    
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
        
        
        //初回のみアンケートのポップアップを出す
        var targetPopup = new popupWindow( $('#firstUsePopup') );
        
        $('#js_firstPopup').on('click', function(){
            targetPopup.show();
        });
        
      //使うボタン押したらajax通信を開始
        $('#js_registBtn').on('click', function(){
            ajaxUseCouponFirst();
        });

        //使うajax通信
        function ajaxUseCouponFirst() {
            var url = urlPath + "/coupon/use";
            var formData = "userCouponId=" + couponDetail.userCouponId + "year=" + $('select[name=year]').val() + "sex=" + $('select[name=sex]').val();
            ajaxJsonGlobal(url, formData, useSuccessFirst);
            console.log('success');
            console.log($('select[name=year]').val());
            console.log($('select[name=sex]').val());
        }

        // 使うajax成功
        function useSuccessFirst(data){
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
                targetPopup.hide();
            }
        }

    });
})(window);