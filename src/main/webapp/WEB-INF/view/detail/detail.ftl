<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents">
		<input type="hidden" id="hdn_shopId" value="${shop.shopId}">
		
        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">

        <#-- 店舗詳細 -->
        <section>
            <h1 class="headline headlineNormal mt20">${shop.shopName!?html}</h1>
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
                                        <img src="${imagePath}/images/btn_txt_tel.png" width="100" height="22" alt="${shop.tell!?html}">
                                    </a>
                                </div>
                                <div class="pv20 pr10">
                                    <a href="" class="btn btnPrimary autoMargin w140">
                                        <img src="${imagePath}/images/btn_txt_map.png" width="100" height="22" alt="${shop.mapUrl!?html}">
                                    </a>
                                </div>
                                <div class="pv20 pr10">
                            		<a id="js_deleteFavoriteBtn" class="btn btnPrimary autoMargin w140">
                                        お気に削除
                                    </a>
                                	<a id="js_addFavoriteBtn" class="btn btnPrimary autoMargin w140">
                                        お気に登録
                                    </a>
                                </div>
                            </div>
                        </div>
                        <ul class="mb10">
                        	<#list couponList as coupon>
                        		<li class="couponDetailList srCouponBg">
	                                <div class="table">
	                                    <div class="cell pl5 pr10">
											<#switch coupon.rarity>
											<#case 1>
												<#-- N -->
												<img src="${imagePath}/images/coupon/nCouponImg.png" width="45" height="50" class="vMiddle">
												<#break>
											<#case 2>
												<#-- R -->
												<img src="${imagePath}/images/coupon/rCouponImg.png" width="45" height="50" class="vMiddle">
												<#break>
											<#case 3>
												<#-- SR -->
												<img src="${imagePath}/images/coupon/srCouponImg.png" width="45" height="50" class="vMiddle">
												<#break>
											<#default>
												<#break>
											</#switch> 
	                                    </div>
	                                    <div class="cell vMiddle fcRed">
	                                        ${coupon.couponName!?html}
	                                    </div>
	                                </div>
	                            </li>
                        	</#list>
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
                        <p class="fs13 p5">${shop.description!?html}</p>
                    </div>

                    <table class="fs12 textLeft borderBox w95per m10 autoMargin">
                        <tr>
                            <th>住所：</th>
                            <td>${shop.address!?html}</td>
                        </tr>
                        <tr>
                            <th>ホームページ：</th>
                            <td><a href="${shop.url!?html}" class="fcBlue underline" target="_blank">${shop.url!?html}</a></td>
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
                        所持コイン：<span class="fcOrange">${coin!?html}コイン</span>
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
        <script src="/coupon/js/detail.js"></script>
		<script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
            var token = '${token}';
        </script>
        <script type="text/javascript" charset="utf-8">
        	var isFavorite = ${shop.isFavorite!?string};
            if (isFavorite == "true") {
            } else {
            }
        </script
    </body>

</html>