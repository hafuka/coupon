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
            <div id="map_canvas" class="autoMargin mt10" style="width:95%; height:400px ; border:solid 5px #fff;"></div>
        </section>
        

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
        <script src="/coupon/js/map.js"></script>
        <script>
            //グローバルで使う変数を定義
            var place = '${address!?html}'
        </script>
        
    </body>

</html>