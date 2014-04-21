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
                                <#if shop.imgPath!?has_content>
                            		<img src="${shop.imgPath!?html}" width="150" height="150" class="vBottom">
                            	<#else>
                            		<img src="${imagePath}/images/common/no_image.png" width="150" height="150" class="vBottom">
                            	</#if>
                            </div>
                            <div class="cell vMiddle">
                                <div class="pv10 pr10">
                                    <a href="tel:${shop.tell!?html}" class="btn btnPrimary autoMargin w140">
                                        <img src="${imagePath}/images/common/btn_txt_tel.png" width="100" height="22">
                                    </a>
                                </div>
                                <div class="pv10 pr10">
                                    <a href="${urlPath}/map?shopId=${shop.shopId!?html}" class="btn btnPrimary autoMargin w140">
                                        <img src="${imagePath}/images/common/btn_txt_map.png" width="100" height="22" alt="${shop.mapUrl!?html}">
                                    </a>
                                </div>
                                <div id="js_favoriteJudgeArea" class="textCenter pv10 pr10">
                                    <#if shop.isFavorite!?string == 'true'>
                                        <a id="js_deleteFavoriteBtn" class="btn btnPrimary autoMargin w140">お気に削除</a>
                                    <#else>
                                        <a id="js_addFavoriteBtn" class="btn btnNormal autoMargin w140">お気に登録</a>
                                    </#if>
                                </div>
                            </div>
                        </div>
                        <ul class="mb10">
                            <#list couponList as coupon>

                                <#-- レアリティによって画像と背景を変更 -->
                                <#switch coupon.rarity>
                                    <#case 1>
                                        <#-- N -->
                                        <#assign ftl_rarityBg = 'nCouponBg'>
                                        <#assign ftl_rarityImage = 'medal_n'>
                                        <#break>
                                    <#case 2>
                                        <#-- R -->
                                        <#assign ftl_rarityBg = 'rCouponBg'>
                                        <#assign ftl_rarityImage = 'medal_r'>
                                        <#break>
                                    <#case 3>
                                        <#-- SR -->
                                        <#assign ftl_rarityBg = 'srCouponBg'>
                                        <#assign ftl_rarityImage = 'medal_sr'>
                                        <#break>
                                    <#default>
                                        <#assign ftl_rarityBg = ''>
                                        <#assign ftl_rarityImage = ''>
                                        <#break>
                                </#switch>

                                <li class="couponDetailList ${ftl_rarityBg}">
                                    <div class="table">
                                        <div class="cell pl5 pr10">
                                            <img src="${imagePath}/images/coupon/${ftl_rarityImage}.png" width="50" height="50" class="vMiddle">
                                        </div>
                                        <div class="cell vMiddle fcRed">
                                            ${coupon.couponName!?html}
                                        </div>
                                    </div>
                                </li>
                            </#list>
                        </ul>
                    </div>

                    <p class="callText borderGray fs13 textCenter mb10">
                        <span class="fcRed">ポイント</span>でもプレミアムスロットが回せるよ♪<br><span class="fcRed">1回：${needPoint}pt</span>、<span class="fcRed">現在：${userPoint}pt♪</span>
                    </p>

                    <#-- プレミアムボタン -->
                    <p class="underballoonLight fs12 fcOrange textCenter m0auto">
                        このお店のクーポンのどれか１つがGETできるよ♪
                        <#if execPointFlg>
                            <br>
                            <span class="fcBlack">※スロット券よりポイントが優先されるよ♪</span>
                        </#if>
                    </p>
                    <div class="textCenter mv10">
                        <a href="${urlPath}/premiumRouletteAnimation?token=${token!?html}&shopId=${shopId}" class="btn btnSpecial jsTouchActive autoMargin">プレミアムスロットを回す♪</a>
                    </div>

                    <div class="textCenter mv10">
                    	<a href="${urlPath}/ticket">スロット券一覧</a>
                    </div>

                    <div class="coinArea fs13 textCenter mt15 mb10 autoMargin">
                        <#if execPointFlg>
                            1回：<span class="fcOrange">${needPoint}ポイント</span><br>
                            所持ポイント：<span class="fcOrange">${userPoint}ポイント</span>
                        <#else>
                            1回：<span class="fcOrange">1枚</span><br>
                            所持スロット券：<span class="fcOrange">${coin}枚</span>
                        </#if>
                    </div>

                    <div class="storeDetailText borderBox w95per m10 autoMargin">
                        <h2 class="bgGray borderBottomGray fs15 p5">お店のこだわり</h2>
                        <p class="fs13 p5">${shop.description!?html}</p>
                    </div>

                    <table class="fs12 textLeft borderBox w95per m10 autoMargin">
                        <tr>
                            <th class="textCenter w50">住所：</th>
                            <td class="p7">${shop.address!?html}</td>
                        </tr>
                        <tr>
                            <th class="textCenter w50">HP：</th>
                            <td class="p7"><a href="${shop.url!?html}" class="fcBlue underline" target="_blank">${shop.url!?html}</a></td>
                        </tr>
                    </table>

                    <#-- プレミアムボタン -->
                    <p class="underballoonLight fs12 fcOrange textCenter m0auto">
                        このお店のクーポンのどれか１つがGETできるよ♪
                        <#if execPointFlg>
                            <br>
                            <span class="fcBlack">※スロット券よりポイントが優先されるよ♪</span>
                        </#if>
                    </p>
                    <div class="textCenter mv10">
                        <a href="${urlPath}/premiumRouletteAnimation?token=${token!?html}&shopId=${shopId}" class="btn btnSpecial jsTouchActive autoMargin">プレミアムスロットを回す♪</a>
                    </div>
                    <div class="coinArea fs13 textCenter mt15 mb10 autoMargin">
                        <#if execPointFlg>
                            1回：<span class="fcOrange">${needPoint}ポイント</span><br>
                            所持ポイント：<span class="fcOrange">${userPoint}ポイント</span>
                        <#else>
                            1回：<span class="fcOrange">1枚</span><br>
                            所持スロット券：<span class="fcOrange">${coin}枚</span>
                        </#if>
                    </div>

                    <#-- 確率表記 -->
                    <div class="probability m10">
                        <div class="probabilityTitle fcWhite textCenter fs14 p5">
                            クーポン出現率
                        </div>
                        <div class="p5 fs13 textCenter">
                            <#list couponList as coupon>
                                <p class="lheight15">
                                    <#if coupon_index == 0>
                                        Sレア：
                                    <#elseif coupon_index == 1>
                                        レア：
                                    <#elseif coupon_index == 2>
                                        ノーマル：
                                    </#if>
                                    ${coupon.probability}%
                                </p>
                            </#list>
                        </div>
                    </div>

                </div>
            </div>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mb20">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？TOPへ</a>
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
        <script src="/coupon/js/detail.js"></script>
        <script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
            var token = '${token!?html}';

            //ftlで取得した変数を格納
            var shopDetail = window.shopDetail || {};

            shopDetail = {
                shopId : '${shop.shopId}'
            }
        </script>
    </body>

</html>