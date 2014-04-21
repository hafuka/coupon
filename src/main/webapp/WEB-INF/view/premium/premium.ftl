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
            <h1 class="headline headlineNormal mt15">プレミアム♪ドコ行く？</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">地域と業種を選んでね。<br>何が当たるかな？</span></p>
                    </div>
                </div>
            </div>
        </section>

        <#-- 検索エリア -->
        <section>
            <div class="selectArea table mb10 autoMargin">
                <div class="cell">
                    <div class="pv5">
                        <p class="fcWhite fs14 textShadow inlineBlock w60">地域：</p>
                        <p class="selectBox inlineBlock vMiddle">
                            <select name="area">
                                <option value="">地域を選択してください</option>
                                <#list areaList as area>
                                    <option value="${area.value!?html}">${area.label!?html}</option>
                                </#list>
                            </select>
                        </p>
                    </div>
                    <div class="pv5">
                        <p class="fcWhite fs14 textShadow inlineBlock w60">エリア：</p>
                        <p class="selectBox inlineBlock vMiddle">
                            <select name="areaDetail">
                                <option value="">ｴﾘｱを選択してください</option>
                                <#list areaDetailList as areaDetail>
                                    <option value="${areaDetail.value!?html}">${areaDetail.label!?html}</option>
                                </#list>
                            </select>
                        </p>
                    </div>
                    <div class="pv5">
                        <p class="fcWhite fs14 textShadow inlineBlock w60">業種：</p>
                        <p class="selectBox inlineBlock vMiddle">
                            <select name="business">
                                <option value="">業種を選択してください</option>
                                <#list businessList as business>
                                <option value="${business.value!?html}">${business.label!?html}</option>
                                </#list>
                            </select>
                        </p>
                    </div>
                </div>
                <div class="cell vMiddle">
                    <a class="btnCircle" onclick="ajaxTest();">検索</a>
                </div>
            </div>

            <p class="underballoonLight fs12 fcRed m0auto">
                「プレミアム♪ドコ行く？」だと、検索した地域の中から１つだけ必ず目玉クーポンがGETできるよ♪<br>
                お店をタップした後に、「このお店でプレミアム♪ドコ行く？」をすると、そのお店のクーポンのどれか１つがGETできるよ♪
            </p>
            <div class="textCenter mv10">
                <a href="${urlPath}/rouletteAnimation?token=${token!?html}" class="btn btnSpecial getActive jsTouchActive autoMargin">プレミアム♪ドコ行く？</a>
            </div>
            <div class="coinArea fs13 textCenter mv10 m0auto">
                1回：<span class="fcOrange">1枚</span><br>
                所持スロット券：<span class="fcOrange">0枚</span>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <ul class="couponList borderTopGreen mt10">

                <#if shopList!?has_content>

                    <#list shopList as shop>
                        <li>
                            <a href="${urlPath}/detail">
                                <div class="table">
                                    <div class="cell pr10">
                                        <img src="${imagePath}/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
                                    </div>
                                    <div class="cell vTop pr20">
                                        <p class="fcBlue underline">${shop.shopName!?html}</p>
                                        <p class="fs13">業種：飲食店</p>
                                        <p class="fs13">地域：${shop.station!?html}</p>
                                        <p class="fcRed textCenter fs13">↓目玉クーポン↓</p>
                                        <p class="bgRound">お会計：50%OFF!!</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                    </#list>

                </#if>

            </ul>
        </section>

        <div class="textCenter mv10">
            <a href="${urlPath}/rouletteAnimation?token=${token!?html}" class="btn btnSpecial getActive jsTouchActive autoMargin">プレミアム♪ドコ行く？</a>
        </div>
        <div class="coinArea fs13 textCenter mv10 m0auto">
            1回：<span class="fcOrange">1枚</span><br>
            所持スロット券：<span class="fcOrange">0枚</span>
        </div>

        <#-- リンクナビ -->
        <nav>
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