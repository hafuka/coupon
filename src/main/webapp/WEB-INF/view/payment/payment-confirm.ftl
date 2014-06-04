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
                <#--
                <form method="post" action="${urlPath!?html}/payment/card" name="frm">
                    <input type="hidden" name="coinId" value="${coin.id!?html}">
                    <div class="textCenter mv10">
                           <a id="js_confirmBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">購入する</a>
                    </div>
                </form>
                -->
                <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
					<input type="hidden" name="cmd" value="_s-xclick">
					<input type="hidden" name="hosted_button_id" value="${coin.paypalItemId!?html}">
					<input type="image" src="https://www.paypalobjects.com/ja_JP/JP/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal - オンラインでより安全・簡単にお支払い">
					<img alt="" border="0" src="https://www.paypalobjects.com/ja_JP/i/scr/pixel.gif" width="1" height="1">
				</form>
            </div>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mb20">
                    <a href="${urlPath}/payment" class="btn btnPrimary jsTouchActive autoMargin">戻る</a>
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