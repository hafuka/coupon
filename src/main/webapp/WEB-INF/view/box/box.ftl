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
            <h1 class="headline headlineNormal mt15">クーポンBOX</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                    	<#if couponList?has_content>
                    		<p><span class="fcOrange">${couponList?size}枚</span>のクーポン券があるよ♪</p>
                    	<#else>
                    		<p>クーポン券をゲットしよう♪</p>
                    	</#if>
                    </div>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
        	<#--
            <h1 class="headline headlinePriority">プレミアムクーポン</h1>
            <ul class="couponList">
                <li>
                    <a href="${urlPath}/detail">
                        <div class="table">
                            <div class="cell pr10">
                                <img src="${imagePath}/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
                            </div>
                            <div class="cell vTop pr20">
                                <p class="fcBlue underline">日比谷Bar 有楽町店</p>
                                <p class="fs13">業種：飲食店</p>
                                <p class="fs13">最寄駅：銀座線銀座駅スカイツリーラインスカイツリー駅(東京)</p>
                                <p class="bgRound">お会計：50%OFF!!</p>
                                <p class="fcRed fs13">有効期限：2014年1月31日</p>
                            </div>
                        </div>
                    </a>
                </li>
            </ul>
            -->
            <h1 class="headline headlineNormal">クーポン</h1>
            <ul class="couponList">
            	<#if couponList?has_content>
	            	<#list couponList as coupon>
		            	<li>
		                    <a href="${urlPath}/detail">
		                        <div class="table">
		                            <div class="cell pr10">
		                                <img src="${imagePath}/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
		                            </div>
		                            <div class="cell vTop pr20">
		                                <p class="fcBlue underline">${coupon.shopBean.shopName!?html}</p>
		                                <p class="fs13">業種：${coupon.shopBean.businessName!?html}</p>
		                                <p class="fs13">最寄駅：${coupon.shopBean.station!?html}</p>
		                                <p class="bgRound">${coupon.mShopCoupon.couponName!?html}</p>
		                                <p class="fcRed fs13">有効期限：${coupon.userCoupon.limitDatetime!?html}</p>
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
            <div class="mv20">
                <div class="textCenter">
                    <a href="${urlPath}/mypage/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>