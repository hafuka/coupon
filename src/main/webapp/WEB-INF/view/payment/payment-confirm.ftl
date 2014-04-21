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
                <h1 class="textCenter">スロット券購入の確認</h1>
                <div class="p5">
                    スロット券：<span class="fcOrange">${coin.coin!?html}枚</span>
                </div>
                <div class="p5">
                    購入金額：<span class="fcOrange">${coin.yen!?html}円</span>
                </div>
                <form method="post" action="${urlPath!?html}/payment/card" name="frm">
                    <input type="hidden" name="coinId" value="${coin.id!?html}">
                    <div class="textCenter mv10">
                           <a id="js_confirmBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">購入する</a>
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

                var registBtn = ci.qs('#js_confirmBtn');

                ci.bind(registBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
    </body>
</html>