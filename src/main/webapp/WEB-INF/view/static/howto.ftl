<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">

        <section>

            <h1 class="textCenter mv10">
                <img src="${imagePath}/images/howto/howtoplay_title.png" width="245" height="45">
            </h1>

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
                <p class="lheight20 fs14 pv5">
                    ①地域・エリア・業種を選んで検索。<br>
                    ②<span class="fcRed">[スロットを回す♪]ボタン</span>でスロットを回そう♪<br>
                    ③検索した地域の中で<span class="fcRed">どこか１つのお店</span>のクーポンが当たるよ♪
                </p>
                <p class="fcOrange textCenter pb5">
                    どこが当たるかはお楽しみ♪
                </p>
                <div class="textCenter">
                    <img src="${imagePath}/images/howto/point_1_image_2.png" width="268" height="120">
                </div>
                <p class="lheight20 fs14 pv5 textCenter">
                    <span class="fcOrange">★ポイントでもスロットが回せるよ★</span>
                </p>
                <p class="lheight16 fs14 pv5">
                    ※ポイントは毎日のログインボーナスでためられるよ
                </p>
            </div>

            <#-- ポイント２ -->
            <div class="bgWhite autoMargin mh10 mb10 mt20 ph5 pb10 pt20 relative">
                <h2 class="absolute" style="top:-10px; left:-10px;">
                    <img src="${imagePath}/images/howto/point_2.png" width="120" height="28">
                </h2>
                <h3 class="textCenter">
                    <img src="${imagePath}/images/howto/point_2_title.png" width="245" height="45">
                </h3>
                <div class="textCenter">
                    <img src="${imagePath}/images/howto/point_2_image_1.png" width="250" height="150">
                </div>
                <p class="lheight20 fs14 pv5">
                    ①お店のリストからお店の詳細ページへ。<br>
                    ②<span class="fcRed">ポイント</span>をためて<span class="fcRed">[プレミアムスロット]</span>を回そう！！<br>
                    ③そのお店のクーポンの中からどれか１つが当たるよ♪
                </p>
                <p class="lheight16 fs14 pv5 fcOrange">
                    ※ポイントは毎日のログインボーナスでためられるよ
                </p>
            </div>

            <#-- ポイント３ -->
            <div class="bgWhite autoMargin mh10 mv20 ph5 pb10 pt20 relative">
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
                    <div class="cell vMiddle">
                    <p class="lheight20 fs14 pv5">
                        クーポンBOXで[このクーポンを使う♪]ボタンを押してクーポンを使おう！
                    </p>
                    </div>
                </div>
                <p class="fs12">※[使う♪]ボタンを押して、お店の方にページを見せるとクーポンが使えます。</p>
                <p class="fs12">※有効期限はボタンを押してから24時間です。</p>
            </div>

        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mb20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">スロットページへ</a>
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