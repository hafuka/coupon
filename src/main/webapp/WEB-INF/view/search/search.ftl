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
            <h1 class="headline headlineNormal mt10">1日1回無料スロット♪</h1>
            <div class="autoMargin mv15 table">
                <div class="cell">
                    <img src="${imagePath}/images/common/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p>
                            <span class="fcOrange">地域や業種</span>を選んで<span class="fcOrange">検索ボタン</span>を押そう！<br><span class="fcOrange">スロットが回せるよ♪</span>
                        </p>
                    </div>
                </div>
            </div>
            <#if rouletteFlg>
                <#-- 非表示 -->
            <#elseif execPointFlg>
                <p class="callText fs13 textCenter mb10">
                    <span class="fcRed">1回${needPoint}pt</span>でスロットが回せるよ♪
                </p>
            <#else>
                <p class="callText fs13 textCenter mb10">
                    <span class="fcRed">ポイント</span>を使ってもスロットが回せるよ♪<br><span class="fcRed">1回あたり${needPoint}pt♪</span>
                </p>
            </#if>
        </section>

        <#-- 検索エリア -->
        <section>
            <div class="selectArea table mb10 autoMargin">
                <div class="cell">
                    <div class="pv3">
                        <p class="fcWhite fs14 textShadow inlineBlock w60">地域：</p>
                        <p class="selectBox inlineBlock vMiddle">
                            <select name="area" id="js_areaChange">
                                <option value="0">地域を選択してください</option>
                                <#list areaList as area>
                                    <option value="${area.value!?html}">${area.label!?html}</option>
                                </#list>
                            </select>
                        </p>
                    </div>
                    <div class="pv3">
                        <p class="fcWhite fs14 textShadow inlineBlock w60">エリア：</p>
                        <p class="selectBox inlineBlock vMiddle">
                            <select id="js_searchAreaDetailList" name="areaDetail">
                                <option value="0">ｴﾘｱを選択してください</option>
                            </select>
                        </p>
                    </div>
                    <div class="pv3">
                        <p class="fcWhite fs14 textShadow inlineBlock w60">業種：</p>
                        <p class="selectBox inlineBlock vMiddle">
                            <select name="business">
                                <option value="0">業種を選択してください</option>
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
                    <#if rouletteFlg>
                        <#-- 1日1回無料スロット -->
                        <#-- <p class="callText fcRed fs14 mb10">1日1回無料でクーポンGETできるよ♪</p> -->
                        <div class="js_activeRouletteBtn">
                            <p class="btn btnNoActive autoMargin">無料で♪スロットを回す</p>
                        </div>
                    <#elseif execPointFlg>
                        <#-- ポイントでスロット -->
                        <p class="callText fcRed fs14 mb10">${needPoint}ポイントで1回スロットを回せるよ♪</p>
                        <div class="js_activeRouletteBtn">
                            <p class="btn btnNoActive autoMargin">ポイントで♪スロットを回す</p>
                        </div>
                        <div class="coinArea fs13 textCenter mv10 m0auto">
                            1回：<span class="fcOrange">${needPoint}ポイント</span><br>
                            所持ポイント：<span class="fcOrange">${userPoint}ポイント</span>
                        </div>
                    <#else>
                        <p class="callText fcRed fs14 mb10">お店ごとのプレミアムスロットも<br>ポイントで回せるよ♪</p>
                        <p class="btn btnNoActive autoMargin">また明日きてね♪</p>
                    </#if>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            
            <h1 id="js_couponListText" class="underballoonLight fs13 fcRed textCenter m0auto">
                ↓どこかのお店のクーポンが当たるよ♪↓
            </h1>
            

            <ul id="js_searchList" class="couponList borderTopGreen mv15">

                <#if shopList!?has_content>

                    <#list shopList as shop>
                        <li>
                            <a href="${urlPath}/detail?shopId=${shop.shopId}">
                                <div class="table">
                                    <div class="cell pr10">
                                        <#if shop.imgPath!?has_content>
                                            <img src="${shop.imgPath!?html}"width="85" height="85">
                                        <#else>
                                            <img src="${imagePath}/images/common/no_image.png" width="85" height="85">
                                        </#if>
                                    </div>
                                    <div class="cell vMiddle pr20">
                                        <p class="fcBlue underline fs16">${shop.shopName!?html}</p>
                                        <p class="fs14">業種：${shop.businessName!?html}</p>
                                        <p class="fs14">最寄駅：${shop.station!?html}</p>
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
                <#if rouletteFlg>
                    <#-- 1日1回無料スロット -->
                    <#-- <p class="callText fcRed fs14 mb10">1日1回無料でクーポンGETできるよ♪</p> -->
                    <div class="js_activeRouletteBtn">
                        <p class="btn btnNoActive autoMargin">無料で♪スロットを回す</p>
                    </div>
                <#elseif execPointFlg>
                    <#-- ポイントでスロット -->
                    <p class="callText fcRed fs14 mb10">${needPoint}ポイントで1回スロットを回せるよ♪</p>
                    <div class="js_activeRouletteBtn">
                        <p class="btn btnNoActive autoMargin">ポイントで♪スロットを回す</p>
                    </div>
                    <div class="coinArea fs13 textCenter mv10 m0auto">
                        1回：<span class="fcOrange">${needPoint}ポイント</span><br>
                        所持ポイント：<span class="fcOrange">${userPoint}ポイント</span>
                    </div>
                <#else>
                    <p class="callText fcRed fs14 mb10">お店ごとのプレミアムスロットも<br>ポイントで回せるよ♪</p>
                    <p class="btn btnNoActive autoMargin">また明日きてね♪</p>
                </#if>
            </div>
        </div>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mb20">
                    <a href="${urlPath}/shopSearch" class="btn btnPrimary jsTouchActive autoMargin">お店検索ページへ</a>
                </div>
                <div class="textCenter mb20">
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
            var token = '${token!?html}';
            
            // 無料でルーレットをひくフラグ
            var freeRouletteFlg;
            <#if rouletteFlg>
                freeRouletteFlg = 1;
            <#else>
                freeRouletteFlg = 0;
            </#if>
        </script>
        <#-- JsRenderテンプレート：検索リスト用 -->
        <script id="searchlist_template" type="text/x-jsrender">
            <li>
                <a href="${urlPath}/detail?shopId={{:shopId}}">
                    <div class="table">
                        <div class="cell pr10">
                            <img src="{{:imgPath}}" width="85" height="85">
                        </div>
                        <div class="cell vMiddle pr20">
                            <p class="fcBlue underline fs16">{{:shopName}}</p>
                            <p class="fs14">業種：{{:businessName}}</p>
                            <p class="fs14">最寄駅：{{:station}}</p>
                            <p class="fcRed textCenter fs13">↓目玉クーポン↓</p>
                            <p class="bgRound">{{:featuredCoupon}}</p>
                        </div>
                    </div>
                </a>
            </li>
        </script>

        <#-- JsRenderテンプレート：エリア検索リスト用 -->
        <script id="searchAreaDetailList_template" type="text/x-jsrender">
            <option value="{{:areaValue}}">{{:areaName}}</option>
        </script>

    </body>

</html>