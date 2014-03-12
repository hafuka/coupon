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
                    <img src="${imagePath}/images/common/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">このクーポンがあたったよ♪</span></p>
                    </div>
                </div>
            </div>
        </section>

        <section>
        
            <div class="bgWhite borderTopGreen borderBottomGreen pv5 relative">
                
                <div class="autoMargin couponInfoArea_${coupon.mShopCoupon.rarity}">
                    <h2 class="textCenter underline fs18" style="padding-top: 90px;">${coupon.shopBean.shopName!?html}</h2>
                    <div class="pt10">
                        <p class="bgWhite textCenter fcRed fs18 w260 autoMargin p3">${coupon.mShopCoupon.couponName!?html}</p>
                    </div>
                </div>
                
                <div class="borderTopOrange pt5 mt5 relative">
                    <div class="table m0auto relative">
                        <div class="cell pr10">
                            <img src="${coupon.shopBean.imgPath!?html}" width="100" height="100" class="borderGray">
                        </div>
                        <div class="cell vMiddle">
                            <div class="pv5 ph10">
                                <p class="textCenter fs18 pv5">${coupon.shopBean.shopName!?html}</p>
                                <p class="textCenter fs14 pv5">
                                    <a href="${coupon.shopBean.url}" class="link1">お店の詳細はこちら&gt;&gt;</a>
                                </p>
                            </div>
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