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
            <h1 class="headline headlineNormal mt20">ドコ行く？ - 無料クーポン -</h1>
            <div class="autoMargin mv20 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">業種と地域を選んでね。<br>今日は何が当たるかな？</span></p>
                    </div>
                </div>
            </div>
        </section>

        <#-- 検索エリア -->
        <section>
            <div class="table mb10 autoMargin">
                <div class="cell">
                    <div class="pv5">
                        地域：
                        <SELECT name="area" class="selectZone vTop">
                        	<OPTION value="">地域を選択してください</OPTION>
                        	<#list areaList as area>
                        		<OPTION value="${area.value!?html}">${area.label!?html}</OPTION>
                        	</#list>
                        </SELECT>
                    </div>
                    <div class="pv5">
                        エリア：
                        <SELECT name="areaDetail" class="selectZone vTop">
                        	<OPTION value="">エリアを選択してください</OPTION>
                        	<#list areaDetailList as areaDetail>
                        		<OPTION value="${areaDetail.value!?html}">${areaDetail.label!?html}</OPTION>
                        	</#list>
                        </SELECT>
                    </div>
                    <div class="pv5">
                        業種：
                        <SELECT name="business" class="selectZone vTop">
                        	<OPTION value="">業種を選択してください</OPTION>
                        	<#list businessList as business>
                        		<OPTION value="${business.value!?html}">${business.label!?html}</OPTION>
                        	</#list>
                        </SELECT>
                    </div>
                </div>
                <div class="cell vMiddle pl10">
                    <a class="btnCircle" onclick="ajaxTest();">検索</a>
                </div>
            </div>

            <div class="mv20">
                <div class="textCenter mv10">
                	
                	<#if rouletteFlg>
                		<a href="${urlPath}/rouletteAnimation?token=${token!?html}" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？</a>
                	</#if>
                    
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <ul class="couponList borderTopGreen">
            	
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
	                                <p class="fs13">${shop.station!?html}</p>
	                                <p class="bgRound">お会計：50%OFF!!</p>
	                                <p class="fcRed fs13">有効期限：2014年1月31日</p>
	                            </div>
	                        </div>
	                    </a>
	                </li>
            		</#list>
            	</#if>
            	
            	<!--
                <li>
                    <a href="${urlPath}/detail">
                        <div class="table">
                            <div class="cell pr10">
                                <img src="${imagePath}/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
                            </div>
                            <div class="cell vTop pr20">
                                <p class="fcBlue underline">日比谷Bar 有楽町店</p>
                                <p class="fs13">業種：飲食店</p>
                                <p class="fs13">最寄駅：銀座線銀座駅(東京)</p>
                                <p class="bgRound">お会計：50%OFF!!</p>
                                <p class="fcRed fs13">有効期限：2014年1月31日</p>
                            </div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="${urlPath}/detail">
                        <div class="table">
                            <div class="cell pr10">
                                <img src="${imagePath}/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
                            </div>
                            <div class="cell vTop pr20">
                                <p class="fcBlue underline">日比谷Bar 有楽町店</p>
                                <p class="fs13">業種：飲食店</p>
                                <p class="fs13">最寄駅：銀座線銀座駅(東京)</p>
                                <p class="bgRound">お会計：50%OFF!!</p>
                                <p class="fcRed fs13">有効期限：2014年1月31日</p>
                            </div>
                        </div>
                    </a>
                </li>
                
                -->
            </ul>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？</a>
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
		
		<!-- ↓↓↓↓↓↓↓ ajax呼び出し確認用 マサ後でつくりかえて ↓↓↓↓↓↓ -->
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
		<script type="text/javascript">
			
			// ajax成功時：個人検索	
			function searchSuccess(data){
				if (data != '') {
		        	console.log(data);
		        }
		    }
		    
		    
		    function ajaxTest() {
		    	var url = "${urlPath}/normal/search";
		    	var formData = "areaId=" + 14;
     			ajax(url, formData, searchSuccess);
		    }
			
			
			function ajax(url, data, onSuccess){
				$.ajax({
			        type: "POST",
			        url: url,
			        cache: false,
			        data: data,
			        dataType: 'json',
			        success: function (data, status, xhr) {
			        	onSuccess(data);
			        },
			        error: function(msg){
			        	console.log('通信にエラーが発生しました。しばらくしてから再度お試しください。');
			        }
			    });
			};
		</script>
    </body>

</html>