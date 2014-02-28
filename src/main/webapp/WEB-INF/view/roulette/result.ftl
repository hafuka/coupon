<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline mypageContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">
        
        <#-- ふきだしナビ -->
        <section>
            <h1 class="headline headlineNormal mt15">ドコ行く？スロット結果！</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">このクーポンがあたったよ♪</span></p>
                    </div>
                </div>
            </div>
        </section>

        <section>
        
            <div class="couponResult">
            
                <#-- レアリティによって名前と画像を変更 -->
                <#switch coupon.mShopCoupon.rarity>
                    <#case 1>
                        <#-- N -->
                        <#assign ftl_rarityName = 'ノーマル'>
                        <#assign ftl_rarityImage = 'nCouponImg'>
                        <#break>
                    <#case 2>
                        <#-- R -->
                        <#assign ftl_rarityBg = 'レア'>
                        <#assign ftl_rarityImage = 'rCouponImg'>
                        <#break>
                    <#case 3>
                        <#-- SR -->
                        <#assign ftl_rarityBg = 'SR'>
                        <#assign ftl_rarityImage = 'srCouponImg'>
                        <#break>
                    <#default>
                        <#assign ftl_rarityBg = ''>
                        <#assign ftl_rarityImage = ''>
                        <#break>
                </#switch>
                
                <h1 class="headline headlinePriority">${coupon.shopBean.shopName!?html}</h1>
                <div class="bgWhite borderBottomOrange p5 relative">
                    <div class="table m0auto relative">
                        <div class="cell pr10">
                            <img src="${imagePath}/images/${coupon.shopBean.imgPath!?html}" width="100" height="100" class="borderGray">
                        </div>
                        <div class="cell couponInfoArea vTop">
                            <div class="pv5 ph10">
                                <h2 class="bgRoundSmall">${ftl_rarityName}クーポン</h2>
                                <p class="textCenter fcRed fs18 pv5">${coupon.mShopCoupon.couponName!?html}</p>
                                <p class="textRight fs14 pv5"><a href="${coupon.shopBean.url}" class="link1">お店の詳細はこちら&gt;&gt;</a></p>
                            </div>
                        </div>
                        <div class="absolute" style="top: -10px; right: 2px;">
                            <img src="${imagePath}/images/coupon/${ftl_rarityImage}.png" width="50">
                        </div>
                    </div>
                </div>
            </div>
            
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv10">
                <a href="${urlPath}/box" class="btn btnPrimary jsTouchActive autoMargin">今すぐクーポンを使いにいく♪</a>
            </div>
            <div class="textCenter mv20">
                <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>