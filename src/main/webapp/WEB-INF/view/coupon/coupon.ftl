<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents">
    
        <#assign aDateTime = .now>
        <#assign aDate = aDateTime?date>
        <#assign aTime = aDateTime?time>
        
        <#-- 使うボタンを押されたら表示 -->
        <#if userCoupon.status == 1>
            <#assign ftl_usableTextDisplay = 'block'>
        <#else>
            <#assign ftl_usableTextDisplay = 'none'>
        </#if>
        
        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">

        <#-- クーポン詳細 -->
        <section>
            <h1 class="headline headlineNormal mt20">クーポン</h1>
            <div class="bgWhite borderBottomGreen pv5 relative">
                <div class="couponInfoArea_${userCoupon.rarity!?html} autoMargin relative">
                    <h2 class="textCenter underline fs18" style="padding-top: 75px;">${shopBean.shopName!?html}</h2>
                    <div class="pv5">
                        <p class="bgWhite textCenter fcRed fs18 w260 autoMargin p3">${userCoupon.name!?html}</p>
                    </div>
                    <div class="pv5">
                        <#if userCoupon.status == 1>
                            <p class="textCenter fcOrange fs14">使用期限：${userCoupon.limitDatetime!?html}</p>
                        <#else>
                            <p class="textCenter fcOrange fs14"><span id="js_termText">有効期限：</span>${userCoupon.limitDatetime!?html}</p>
                        </#if>
                    </div>
                    <#-- 使うボタンが押されてたら表示 -->
                    <div id="js_usableIcon" class="absolute ${ftl_usableTextDisplay}" style="top: 10px; right: 10px;">
                        <img src="${imagePath}/images/common/useful_flg.png" width="60">
                    </div>
                </div>
                
                <div class="storeDetailText borderBox w95per mv10 autoMargin p5 textCenter">
                    残り期間：<span id="js_remainTime" class="fcRed">${remainTime!?html}</span>
                </div>
                
                <#-- 使うボタンを押してない時に表示 -->
                <div id="js_timeNoticeText">
                    <#if userCoupon.status != 1>
                        <p class="textCenter fs12">
                            ※「使う」ボタンを押してから有効期限は24時間です。
                        </p>
                    </#if>
                </div>
            </div>
            
            
            <#-- 使うボタン -->
            <#if userCoupon.status != 1>
                <div id="js_useBtnArea">
                    <div class="underballoonLight fs13 fcOrange textCenter autoMargin mt10">
                        「使う」ボタンを押すとクーポンが使えるよ♪<br>
                        そしたら、お店の人にこのページを見せてね♪
                    </div>
                    <div class="textCenter mv10">
                        <a id="js_useBtn" class="btn btnSpecial jsTouchActive autoMargin">このクーポンを使う♪</a>
                    </div>
                </div>
            </#if>
            
            
            <div id="js_usableTicketText" class="${ftl_usableTextDisplay}">
                <div class="normalBalloon fcOrange textCenter autoMargin mt10 fs14">
                    この画面をお店の人に見せてね♪<br>クーポンが使えるよ♪
                </div>
            </div>
            
            
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？TOPへ</a>
                </div>
                <div class="textCenter mv10">
                    <a href="${urlPath}/box" class="btn btnPrimary jsTouchActive autoMargin">クーポン一覧へ</a>
                </div>
                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        <script src="/coupon/js/coupon.js"></script>
        <script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
            var token = '${token!?html}';
            
            //ftlで取得した変数を格納
            var couponDetail = window.couponDetail || {};
            
            couponDetail = {
                userCouponId : '${userCoupon.userCouponId!?html}'
            }
        </script>
    </body>

</html>