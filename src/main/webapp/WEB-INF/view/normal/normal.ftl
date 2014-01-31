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
            <div class="autoMargin mv10 table">
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

            <div class="mb20">
                <div class="textCenter mv10">
                    <p class="callText fcRed fs14">1日1回無料でクーポンGETできるよ♪</p>
                    <#if rouletteFlg>
                        <a href="${urlPath}/rouletteAnimation?token=${token!?html}" class="btn btnSpecial getActive jsTouchActive autoMargin">ドコ行く？</a>
                    <#else>
                        <p class="btn btnNoActive autoMargin">また明日きてね♪</p>
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
                
            </ul>
        </section>
        
        <div class="mb20">
            <div class="textCenter mv10">
                <p class="callText fcRed fs14">1日1回無料でクーポンGETできるよ♪</p>
                <#if rouletteFlg>
                    <a href="${urlPath}/rouletteAnimation?token=${token!?html}" class="btn btnSpecial getActive jsTouchActive autoMargin">ドコ行く？</a>
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