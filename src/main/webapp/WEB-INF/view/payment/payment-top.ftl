<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline mypageContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">
        
        
        <section>
            <div class="formArea autoMargin m10">
                <h1 class="textCenter">購入内容の確認</h1>
                <div class="p5">
                    合計：<span class="fcOrange">100コイン</span>
                </div>
                <div class="p5">
                    利用可能コイン：<span class="fcOrange">${userCoin!?html}コイン</span>
                </div>
                <form method="post" action="${urlPath!?html}/payment/confirm" name="frm">
                    <ul class="paymentRadioList">
                        <#list coinList as coin>
                            <li class="p5">
                                <div class="table">
                                    <div class="cell pr10">
                                        <input type="radio" name="coinId" value="${coin.id!?html}" <#if coin_index == 0>checked="checked"</#if>>
                                    </div>
                                    <div class="cell">
                                        <span class="fcRed">${coin.coin!?html}</span>コイン(<span class="fcBlue">${coin.yen!?html}円</span>)
                                    </div>
                                </div>
                            </li>
                        </#list>
                    </ul>
                    <div class="textCenter mv10">
                        <a id="js_confirmBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">内容を確認する</a>
                    </div>
                </form>
            </div>
        </section>
        
        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        
        
        <#-- JS - 新規登録 - -->
        <script>
            (function(){
                
                var confirmBtn = ci.qs('#js_confirmBtn');
                
                ci.bind(confirmBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
    </body>
</html>