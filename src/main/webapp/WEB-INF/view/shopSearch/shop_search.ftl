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
            <h1 class="headline headlineNormal mt15">お店検索</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/common/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">お店の名前で検索ができるよ♪</span></p>
                    </div>
                </div>
            </div>
        </section>

        <#-- 検索エリア -->
        <section>
            <div class="selectArea table mb10 autoMargin">
                <div class="cell vMiddle">
                    <div class="pv5">
                        <p class="w200 vMiddle ml10">
                            <input type="text" id="searchValue" placeholder="お店の名前を入れてね♪">
                        </p>
                    </div>
                </div>
                <div class="cell vMiddle">
                    <a id="js_searchBtn" class="btnCircle">検索</a>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <ul id="js_searchList" class="couponList borderTopGreen mt10">
                
                <#if shopList!?has_content>
                
                    <#list shopList as shop>
                        <li>
                            <a href="${urlPath}/detail?shopId=${shop.shopId}">
                                <div class="table">
                                    <div class="cell pr10">
                                        <img src="${shop.imgPath!?html}" width="85" height="85" class="borderGray">
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
        
        <#-- リンクナビ -->
        <nav>
            <div class="mb20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？スロットページへ</a>
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
        <script src="/coupon/js/shop_search.js"></script>
        <script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
            var token = '${token!?html}';
        </script>
        
        <#-- JsRenderテンプレート：検索リスト用 -->
        <script id="searchlist_template" type="text/x-jsrender">
            <li>
                <a href="${urlPath}/detail?shopId={{:shopId}}">
                    <div class="table">
                        <div class="cell pr10">
                            <img src="{{:imgPath}}" width="85" height="85" class="borderGray">
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