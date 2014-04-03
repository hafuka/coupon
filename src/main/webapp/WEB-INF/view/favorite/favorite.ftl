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
            <h1 class="headline headlineNormal mt10">お気に一覧</h1>
            <div class="autoMargin mv15 table">
                <div class="cell">
                    <img src="${imagePath}/images/common/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">お気に入りのお店一覧だよ♪</span></p>
                    </div>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <ul class="couponList borderTopGreen mt10">
                
                <#if shopList!?has_content>
                
                    <#list shopList as shop>
                        <li>
                            <a href="${urlPath}/detail?shopId=${shop.shopId}">
                                <div class="table">
                                    <div class="cell pr10">
                                        <img src="${shop.imgPath!?html}" width="85" height="85">
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
                    
                <#else>
                    
                    <li class="noList">
                        お気に入りのお店が登録されてないよ♪<br>
                        お気に入りのお店を追加するとすぐにお店のページを見ることができるよ♪
                    </li>
                    
                </#if>
                
            </ul>
            
        </section>
        
        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mb20">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？スロットページへ</a>
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
        
    </body>

</html>