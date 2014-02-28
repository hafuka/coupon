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

        <#-- クーポンリスト -->
        <section>
            <h1 class="headline headlineNormal">クーポン</h1>
            <ul class="couponList">
            
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
                                        <p class="fcRed fs13">有効期限：${coupon.userCoupon.limitDatetime!?html}</p>
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

    </body>

</html>