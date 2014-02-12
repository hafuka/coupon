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
                        <div class="table m0auto">
                            <div class="cell p10">
                                <img src="${imagePath}/images/storeThumnail.jpg" width="150" height="150" class="vBottom">
                            </div>
                            <div class="cell vMiddle">
                                <div class="pv10 pr10">
                                    <a href="" class="btn btnPrimary autoMargin w140">
                                        <img src="${imagePath}/images/btn_txt_tel.png" width="100" height="22">
                                    </a>
                                </div>
                                <div class="pv20 pr10">
                                    <a href="" class="btn btnPrimary autoMargin w140">
                                        <img src="${imagePath}/images/btn_txt_map.png" width="100" height="22">
                                    </a>
                                </div>
                            </div>
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
                    
                    <#-- プレミアムボタン -->
                    <p class="underballoonLight fs12 fcOrange textCenter m0auto">
                        このお店のクーポンのどれか１つがGETできるよ♪
                    </p>
                    <div class="textCenter mv10">
                        <a href="${urlPath}/premiumRouletteAnimation?token=${token!?html}&shopId=${shopId}" class="btn btnSpecial getActive jsTouchActive autoMargin">プレミアム♪ドコ行く？</a>
                    </div>
                    <div class="coinArea fs13 textCenter mv10 m0auto">
                        1回：<span class="fcOrange">100コイン</span><br>
                        所持コイン：<span class="fcOrange">${coin!?html}コイン</span>
                    </div>

                    <div class="storeDetailText borderBox w95per m10 autoMargin">
                        <h2 class="bgGray borderBottomGray fs15 p5">お店のこだわり</h2>
                        <p class="fs13 p5">なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！なんて日だ！</p>
                    </div>

                    <table class="fs12 textLeft borderBox w95per m10 autoMargin">
                        <tr>
                            <th>住所：</th>
                            <td>東京都中央区銀座１丁目XXX</td>
                        </tr>
                        <tr>
                            <th>ホームページ：</th>
                            <td><a href="google.co.jp" class="fcBlue underline" target="_blank">google.co.jp</a></td>
                        </tr>
                    </table>

                    <#-- プレミアムボタン -->
                    <p class="underballoonLight fs12 fcOrange textCenter m0auto">
                        このお店のクーポンのどれか１つがGETできるよ♪
                    </p>
                    <div class="textCenter mv10">
                        <a href="${urlPath}/premiumRouletteAnimation?token=${token!?html}&shopId=${shopId}" class="btn btnSpecial getActive jsTouchActive autoMargin">プレミアム♪ドコ行く？</a>
                    </div>
                    <div class="coinArea fs13 textCenter mv10 m0auto">
                        1回：<span class="fcOrange">100コイン</span><br>
                        所持コイン：<span class="fcOrange">0コイン</span>
                    </div>
                    
                </div>
            </div>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？TOPへ</a>
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