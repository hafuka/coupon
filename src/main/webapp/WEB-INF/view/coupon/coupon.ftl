<!DOCTYPE html>
<html lang="ja" data-ng-app>
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents relative">

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
                            <p class="textCenter fcOrange fs14"><span id="js_termText">有効期限：</span><span id="js_limitDatetime">${userCoupon.limitDatetime!?html}</span></p>
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

                <#if userCoupon.description!?has_content>
                    <div class="storeDetailText borderBox w95per mv10 autoMargin p5 textCenter">
                        <p class="fcRed">※${userCoupon.description!?html}</p>
                    </div>
                </#if>

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
                        <#if firstRouletteFlg>
                            <a id="js_firstPopup" class="btn btnSpecial jsTouchActive autoMargin">このクーポンを使う♪</a>
                        <#else>
                            <a id="js_useBtn" class="btn btnSpecial jsTouchActive autoMargin">このクーポンを使う♪</a>
                        </#if>
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
                <div class="textCenter mb20">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">スロットページへ</a>
                </div>
                <div class="textCenter mb20">
                    <a href="${urlPath}/box" class="btn btnPrimary jsTouchActive autoMargin">クーポン一覧へ</a>
                </div>
                <div class="textCenter mb20">
                    <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
                </div>
            </div>
        </nav>

        <#if firstRouletteFlg>
            <div id="firstUsePopup" class="popup dropShadow" data-ng-controller="mainCtrl">
                <h1 class="textCenter">最初だけちょっと<br>アンケート</h1>
                <div class="p5">
                    <p class="surveyName fcWhite fs14 p3 mv5">【生まれた年】</p>
                    <div class="popupSelectBox relative">
                        <select name="year" data-ng-model="angYear" required>
                            <option value="0">生まれた年を選択して下さい</option>
                            <#list yearList as year>
                                <option value="${year.value!?html}">${year.label!?html}</option>
                            </#list>
                        </select>
                    </div>
                    <p class="surveyName fcWhite fs14 p3 mv5">【性別】</p>
                    <div class="popupSelectBox relative">
                        <select name="sex" data-ng-model="angSex" required>
                            <option value="0">性別を選択して下さい</option>
                            <#list sexList as sex>
                                <option value="${sex.value!?html}">${sex.label!?html}</option>
                            </#list>
                        </select>
                    </div>
                    <p class="textCenter fs14 fcGray">ご協力ありがとうございます！</p>
                    <p class="textCenter">{{okMessage}}</p>

                    <a id="js_noRegistBtn" class="topbtn btnGray autoMargin mv10 textCenter">このクーポンを使う♪</a>

                    <a id="js_registBtn" class="topbtn btnPink jsTouchActive autoMargin mv10 textCenter none">このクーポンを使う♪</a>

                </div>
            </div>
        </#if>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        <script src="/coupon/js/angular.min.js"></script>
        <script src="/coupon/js/ang_coupon.js"></script>
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