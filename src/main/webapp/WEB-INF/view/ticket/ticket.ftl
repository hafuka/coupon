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
            <h1 class="headline headlineNormal mt15">スロット券一覧</h1>
            <div class="autoMargin mv15 table">
                <div class="cell">
                    <img src="${imagePath}/images/common/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <#if couponList?has_content>
                            <p><span class="fcOrange">${ticketList?size}枚</span>のスロット券があるよ♪</p>
                        </#if>
                    </div>
                </div>
            </div>
        </section>

        <#-- スロット券リスト -->
        <section>
            <h1 class="headline headlineSecond">スロット券一覧</h1>
            <ul id="js_searchList" class="couponList">
                <#if ticketList?has_content>
                    <#list ticketList as ticket>
                        <li class="relative">
                            <div>
                            	<p class="fcRed pt5 fs15">スロット券：${ticket.coin!?html}枚</p>
								<p class="fcRed pt5 fs15">使用期限：${ticket.limitDatetime!?html}</p>
                            </div>
                        </li>
                    </#list>
                <#else>
	                <li class="noList">
	                    スロット券がないよ。<br>
	                    スロット券を購入しよう♪
	                </li>
                </#if>
            </ul>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mb20">
                    <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
                </div>
            </div>
        </nav>

        <div class="noticeArea mb20 mh10">
            <h1>ご注意ください</h1>
            <p class="fs12">
				・スロット券は使用期限が短いものから消費されます。
            </p>
        </div>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
    </body>

</html>