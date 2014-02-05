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
            <div class="bgWhite borderBottomGreen">
                <div>
                    <div class="bgWhite relative">
                        <div>
                            <img src="${imagePath}/images/storeThumnail.jpg" width="100%" height="150px;" class="vBottom">
                        </div>
                        <ul class="mb10">
                            <li class="couponDetailList srCouponBg">
                                <div class="table">
                                    <div class="cell pl5 pr10">
                                        <img src="${imagePath}/images/coupon/srCouponImg.png" width="45" height="50" class="vMiddle">
                                    </div>
                                    <div class="cell vMiddle fcRed">
                                        50%OFF!!!
                                    </div>
                                </div>
                            </li>
                            <li class="couponDetailList rCouponBg">
                                <div class="table">
                                    <div class="cell pl5 pr10">
                                        <img src="${imagePath}/images/coupon/srCouponImg.png" width="45" height="50">
                                    </div>
                                    <div class="cell vMiddle fcOrange">
                                        ドリンク1杯無料
                                    </div>
                                </div>
                            </li>
                            <li class="couponDetailList nCouponBg">
                                <div class="table">
                                    <div class="cell pl5 pr10">
                                        <img src="${imagePath}/images/coupon/srCouponImg.png" width="45" height="50">
                                    </div>
                                    <div class="cell vMiddle">
                                        おつまみ1品無料
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="mt10 mb15 table autoMargin">
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

                    <div class="storeDetailText borderBox w95per m10 autoMargin">
                        <h2 class="bgGray borderBottomGray fs15 p5">こだわり</h2>
                        <p class="fs13 p5">なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！</p>
                    </div>

                    <table class="fs12 textLeft borderBox w95per m10 autoMargin">
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
                        <a href="" class="btn btnNormal jsTouchActive autoMargin">使っちゃお♪</a>
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
                    <a href="${urlPath}/coupon" class="btn btnPrimary jsTouchActive autoMargin">今日ドコ行く？</a>
                </div>
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