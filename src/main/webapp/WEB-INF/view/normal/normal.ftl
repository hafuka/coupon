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
            <h1 class="headline headlineNormal mt15">ドコ行く？ - 無料クーポン -</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">地域と業種を選んでね。<br>今日は何が当たるかな？</span></p>
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
                    <a id="js_searchBtn" class="btnCircle">検索</a>
                </div>
            </div>

            <div class="mb15">
                <div class="textCenter mv10">
                    <p class="callText fcRed fs14">1日1回無料でクーポンGETできるよ♪</p>
                    <#if rouletteFlg>
                        <div class="js_activeRouletteBtn">
                            <p class="btn btnSpecial autoMargin">地域と業種を選んでね♪</p>
                        </div>
                    <#else>
                        <p class="btn btnNoActive autoMargin">また明日きてね♪</p>
                    </#if>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <h1 class="underballoonLight fs13 fcRed textCenter m0auto">
                下のリストのどれか１つが当たるよ♪<br>
                <span class="fs12 fcBlack">※クーポンは1店舗あたり3種類あるよ</span>
            </h1>

            <ul id="js_searchList" class="couponList borderTopGreen mt10">

                <#if shopList!?has_content>

                    <#list shopList as shop>
                        <li>
                            <a href="${urlPath}/detail?shopId=${shop.shopId}">
                                <div class="table">
                                    <div class="cell pr10">
                                        <#if shop.imgPath!?has_content>
		                            		<img src="${shop.imgPath!?html}" width="85" height="85" class="borderGray">
		                            	<#else>
		                            		<img src="${imagePath}/images/common/no_image.png" width="85" height="85" class="borderGray">
		                            	</#if>
                                    </div>
                                    <div class="cell vTop pr20">
                                        <p class="fcBlue underline">${shop.shopName!?html}</p>
                                        <p class="fs13">業種：${shop.businessName!?html}</p>
                                        <p class="fs13">最寄駅：${shop.station!?html}</p>
                                        <p class="fcRed textCenter fs13">↓目玉クーポン↓</p>
                                        <p class="bgRound">${shop.featuredCoupon!?html}</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                    </#list>

                </#if>

            </ul>

        </section>

        <div class="mb20">
            <div class="textCenter mv10">
                <p class="callText fcRed fs14">1日1回無料でクーポンGETできるよ♪</p>
                <#if rouletteFlg>
                    <div class="js_activeRouletteBtn">
                        <p class="btn btnSpecial autoMargin">地域と業種を選んでね♪</p>
                    </div>
                <#else>
                    <p class="btn btnNoActive autoMargin">また明日きてね♪</p>
                </#if>
            </div>
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
        <script src="/coupon/js/search.js"></script>
        <script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
            var token = '${token}';
        </script>
        <#-- JsRenderテンプレート：検索リスト用 -->
        <script id="searchlist_template" type="text/x-jsrender">
            <li>
                <a href="${urlPath}/detail?shopId={{:shopId}}">
                    <div class="table">
                        <div class="cell pr10">
                            <img src="${imagePath}/images/{{:imgPath}}" width="85" height="85" class="borderGray">
                        </div>
                        <div class="cell vTop pr20">
                            <p class="fcBlue underline">{{:shopName}}</p>
                            <p class="fs13">業種：{{:businessName}}</p>
                            <p class="fs13">最寄駅：{{:station}}</p>
                            <p class="fcRed textCenter fs13">↓目玉クーポン↓</p>
                            <p class="bgRound">{{:featuredCoupon}}</p>
                        </div>
                    </div>
                </a>
            </li>
        </script>

    </body>

</html>