<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline topContents">

        <section>
            <div class="mt10 headMarqueeArea relative">
                <img src="${imagePath}/images/top/airship.png" width="230" height="47" class="marqueeImage">
            </div>

            <div class="textCenter mt5">
                <img src="${imagePath}/images/top/top_main.png" width="250" height="250">
            </div>
        </section>

        <nav>
            <div>
                <div class="textCenter mb10">
                    <a href="${urlPath}/register" class="topbtn btnGreen jsTouchActive autoMargin">COUPON ISLANDをはじめる</a>
                </div>
                <div class="textCenter mb10">
                    <a href="${urlPath}/facebookLogin" class="topbtn btnBlue jsTouchActive autoMargin">
                        <img src="${imagePath}/images/facebook/fb_logo.png" width="20" height="20" class="vBottom">
                        Facebookでログイン
                    </a>
	            </div>
                <div class="textCenter mb20">
                    <a href="${urlPath}/login" class="topbtn btnOrange jsTouchActive autoMargin">ログイン</a>
                </div>
            </div>
        </nav>


        <section class="bgWhite pt10">

            <#--<h1 class="textCenter pv10 bgGray fs18 mb20">
                遊び方:使い方
            </h1>-->

            <#-- ポイント１ -->
            <div class="bgWhite autoMargin m10 ph5 pb10 pt20 relative">
                <h2 class="absolute" style="top:-10px; left:-10px;">
                    <img src="${imagePath}/images/howto/point_1.png" width="120" height="28">
                </h2>
                <h3 class="textCenter">
                    <img src="${imagePath}/images/howto/point_1_title.png" width="215" height="45">
                </h3>
                <div class="textCenter">
                    <img src="${imagePath}/images/howto/point_1_image_1.png" width="235" height="110">
                </div>
                <p class="lheight15 fs14 pv5">
                    ①地域・エリア・業種を選んで検索。<br>
                    ②<span class="fcRed">[ドコ行く？スロットを回す♪]ボタン</span>でスロットを回そう♪<br>
                    ③検索した地域の中で<span class="fcRed">どこか１つのお店</span>のクーポンが当たるよ♪
                </p>
                <p class="fcOrange textCenter pb5">
                    どこが当たるかはお楽しみ♪
                </p>
                <div class="textCenter">
                    <img src="${imagePath}/images/howto/point_1_image_2.png" width="268" height="120">
                </div>
            </div>

            <#-- ポイント２ -->
            <div class="bgGray">
                <div class="bgGray autoMargin mh10 mt20 ph5 pb20 pt20 relative">
                    <h2 class="absolute" style="top:-10px; left:-10px;">
                        <img src="${imagePath}/images/howto/point_2.png" width="120" height="28">
                    </h2>
                    <h3 class="textCenter">
                        <img src="${imagePath}/images/howto/point_2_title.png" width="245" height="45">
                    </h3>
                    <div class="textCenter">
                        <img src="${imagePath}/images/howto/point_2_image_1.png" width="250" height="157">
                    </div>
                    <p class="lheight15 fs14 pv5">
                        ①お店のリストからお店の詳細ページへ。<br>
                        ②<span class="fcRed">1回スロット券1枚</span>で<span class="fcRed">[プレミアムスロット]</span>を回そう！！<br>
                        ③そのお店のクーポンの中からどれか１つが当たるよ♪<br>
                        <span class="fs12">
                            ※スロット券は1枚あたり:108円で購入できます。<br>
                            ※スロット券の有効期限は6ヶ月です。
                        </span>
                    </p>
                </div>
            </div>

            <#-- ポイント３ -->
            <div class="bgWhite autoMargin mh10 mb20 ph5 pb10 pt20 relative">
                <h2 class="absolute" style="top:-10px; left:-10px;">
                    <img src="${imagePath}/images/howto/point_3.png" width="120" height="28">
                </h2>
                <h3 class="textCenter">
                    <img src="${imagePath}/images/howto/point_3_title.png" width="185" height="25">
                </h3>
                <div class="table">
                    <div class="cell">
                        <img src="${imagePath}/images/howto/point_3_image_1.png" width="122" height="97">
                    </div>
                    <div class="cell vTop">
                    <p class="lheight15 fs14 pv5">
                        クーポンBOXで[使う♪]ボタンを押してクーポンを使おう！<br>
                        ボタンを押してから24時間以内に使ってね♪
                    </p>
                    </div>
                </div>
            </div>

            <div class="textCenter pb40">
                <a href="${urlPath}/static/?page=terms" class="link2">利用規約</a>
            </div>
            
        </section>
        
        
        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>
</html>