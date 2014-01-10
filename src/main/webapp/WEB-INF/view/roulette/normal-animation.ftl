<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline mypageContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">

        <section>
        	${coupon.mShop.shopName!?html}<br>
        	${coupon.mShopCoupon.couponName!?html}<br>
        	GETしました！
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/rouletteResult?token=${token!?html}" class="btn btnNormal jsTouchActive autoMargin">結果へ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>