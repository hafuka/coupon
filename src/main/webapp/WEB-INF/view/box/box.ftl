<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">
        
        <#-- ふきだしナビ -->
        <section>
            <h1 class="headline headlineNormal mt15">クーポンBOX</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <#if couponList?has_content>
                            <p><span class="fcOrange">${couponList?size}枚</span>のクーポン券があるよ♪</p>
                        <#else>
                            <p>クーポン券をゲットしよう♪</p>
                        </#if>
                    </div>
                </div>
            </div>
        </section>
        
        <#-- 検索エリア -->
        <section>
            <div class="selectArea mb10 autoMargin">
                <div class="pv3 textCenter">
                    <p class="fcWhite fs14 textShadow inlineBlock w60">レア度：</p>
                    <p class="selectBox inlineBlock vMiddle">
                        <select name="rarity" id="js_rarityChange" class="w180">
                            <option value="0">レア度を選択してください</option>
                            <#list rarityList as rarity>
                                <option value="${rarity.value!?html}">${rarity.label!?html}</option>
                            </#list>
                        </select>
                    </p>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <h1 class="headline headlineNormal">クーポン一覧</h1>
            <ul id="js_searchList" class="couponList">
            
                <#if couponList?has_content>
                
                    <#list couponList as coupon>
                    
                        <#-- レアリティによって画像と背景を変更 -->
                        <#switch coupon.mShopCoupon.rarity>
                            <#case 1>
                                <#-- N -->
                                <#assign ftl_rarityBgStyle = 'normalList'>
                                <#assign ftl_rarityImage = 'nCouponImg'>
                                <#break>
                            <#case 2>
                                <#-- R -->
                                <#assign ftl_rarityBgStyle = 'rareList'>
                                <#assign ftl_rarityImage = 'rCouponImg'>
                                <#break>
                            <#case 3>
                                <#-- SR -->
                                <#assign ftl_rarityBgStyle = 'sRareList'>
                                <#assign ftl_rarityImage = 'srCouponImg'>
                                <#break>
                            <#default>
                                <#assign ftl_rarityBg = ''>
                                <#assign ftl_rarityImage = ''>
                                <#break>
                        </#switch> 
                    
                        <li class="relative ${ftl_rarityBgStyle}">
                            <a href="${urlPath}/coupon?userCouponId=${coupon.userCoupon.userCouponId!?html}">
                                <div class="table">
                                    <div class="cell pr10">
                                        <img src="${imagePath}/images/${coupon.shopBean.imgPath!?html}" width="85" height="85" class="borderGray">
                                    </div>
                                    <div class="cell vTop pr20">
                                        <p class="fcBlue underline">${coupon.shopBean.shopName!?html}</p>
                                        <p class="fs13">業種：${coupon.shopBean.businessName!?html}</p>
                                        <p class="fs13">最寄駅：${coupon.shopBean.station!?html}</p>
                                        <p class="bgRound">${coupon.mShopCoupon.couponName!?html}</p>
                                        <p class="fcRed fs13">有効期限：<br>${coupon.userCoupon.limitDatetime!?html}</p>
                                        <#if coupon.userCoupon.status == 1>
                                            <p class="fcRed fs13">使用中</p>
                                        </#if>
                                    </div>
                                </div>
                                <div class="absolute" style="bottom: 0; left: 5px;">
                                    <img src="${imagePath}/images/coupon/${ftl_rarityImage}.png" width="40">
                                </div>
                            </a>
                        </li>
                        
                    </#list>
                    
                <#else>
                
                    <li class="noList">
                        クーポンがないよ。<br>
                        スロットを回してクーポンをGETしよう♪
                    </li>
                    
                </#if>
            </ul>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mb20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？スロットページへ</a>
                </div>
            </div>
            <div class="mb20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
		<script src="/coupon/js/box.js"></script>
        <script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
        </script>
        <#-- JsRenderテンプレート：検索リスト用 -->
        <script id="searchlist_template" type="text/x-jsrender">
            <li class="relative {{:rarityStyle}}">
                <a href="${urlPath}/coupon?userCouponId={{:userCouponId}}">
                    <div class="table">
                        <div class="cell pr10">
                            <img src="${imagePath}/images/{{:shopImgPath}}" width="85" height="85" class="borderGray">
                        </div>
                        <div class="cell vTop pr20">
                            <p class="fcBlue underline">{{:shopName}}</p>
                            <p class="fs13">業種：{{:business}}</p>
                            <p class="fs13">最寄駅：{{:station}}</p>
                            <p class="bgRound">{{:couponName}}</p>
                            <p class="fcRed fs13">有効期限：<br>{{:limitDate}}</p>
                            {{:status}}
                        </div>
                    </div>
                    <div class="absolute" style="bottom: 0; left: 5px;">
                        <img src="${imagePath}/images/coupon/{{:rarityImage}}.png" width="40">
                    </div>
                </a>
            </li>
        </script>
    </body>

</html>