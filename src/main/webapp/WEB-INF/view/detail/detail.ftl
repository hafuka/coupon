<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">

        <#-- 店舗詳細 -->
        <section>
            <h1 class="headline headlineNormal mt20">日比谷Bar 有楽町店</h1>
            <div class="bgWhite borderBottomGreen p10">
                <div class="w300 autoMargin">
                    <div class="table">
                        <div class="cell pr10">
                            <img src="${imagePath}/images/storeThumnail.jpg" width="85" height="85" class="borderGray vTop">
                        </div>

                        <div class="cell vTop relative couponInfoArea pv5 ph10">
                            <h2 class="bgRoundSmall">♪クーポン情報♪</h2>
                            <p class="textCenter fcRed fs18 pv5">お会計50%OFF!!</p>
                        </div>
                    </div>

                    <div class="mv10 table autoMargin">
                        <div class="cell textCenter pr20">
                            <a href="" class="btn btnPrimary autoMargin w140">
                                <img src="${imagePath}/images/btn_txt_tel.png" width="100" height="22" class="pt5">
                            </a>
                        </div>
                        <div class="cell textCenter">
                            <a href="" class="btn btnPrimary autoMargin w140">
                                <img src="${imagePath}/images/btn_txt_map.png" width="100" height="22" class="pt5">
                            </a>
                        </div>
                    </div>

                    <div class="storeDetailText mv10 p5">
                        <h2 class="fs16">こだわり</h2>
                        <p class="fs14">なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！</p>
                    </div>

                    <table class="fs12 textLeft">
                        <tr>
                            <th>住所：</th>
                            <td>東京都中央区銀座１丁目XXX</td>
                        </tr>
                        <tr>
                            <th>ホームページ：</th>
                            <td>google.co.jp</td>
                        </tr>
                    </table>

                    <div class="textCenter mv10">
                        <a href="" class="btn btnNormal autoMargin fcWhite fs22">使っちゃお♪</a>
                    </div>

                    <p class="textRight fcOrange fs13">
                        有効期限：2014年1月31日
                    </p>
                </div>
            </div>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/coupon/coupon" class="btn btnPrimary autoMargin fcWhite fs22">今日ドコ行く？</a>
                </div>
                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage/mypage" class="btn btnNormal autoMargin fcWhite fs22">マイページへ</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>