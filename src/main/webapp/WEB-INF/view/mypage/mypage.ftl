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
            <h1 class="textCenter relative">
                <img src="${imagePath}/images/mypage/mypage_title.png" width="100%" height="62" class="vTop">
                <p class="islandName">
                    ${loginUserDto.name!?html}アイランド
                </p>
            </h1>
            
            <div class="relative mt10">
                <div class="autoMargin w320">
                    <div class="underballoon mh10">
                        <p>1回プレミアムクーポンがひけるよ♪</p>
                        <p class="pointArea">現在のポイント：${loginUserDto.point!?html}pt</p>
                    </div>
                </div>
                <div class="mtMinus30">
                    <img src="${imagePath}/images/mypage/mypage_field.png" width="100%" class="vTop">
                </div>
                <div class="gullImage">
                    <img src="${imagePath}/images/mypage/mypage_kamome.png" width="65" height="25">
                </div>
            </div>

            <div class="mypageBtnArea mtMinus70 mh10">
                <div class="table autoMargin mv5">
                    <div class="cell pr20">
                        <a href="${urlPath}/normal" class="mypagePremierbtn relative zIndex20 pt25 mv5">
                            今日ドコ行く？
                            <#--<img src="${imagePath}/images/mypage/main_btn_doko.png" width="115" height="80" class="vTop"> -->
                        </a>
                    </div>
                    <div class="cell vTop">
                        <a href="${urlPath}/premium" class="mypagePremierbtn relative zIndex20 pt15 mv5">
                            プレミアム<br>今日ドコ行く？
                            <#-- <img src="${imagePath}/images/mypage/main_btn_premium.png" width="115" height="80" class="vTop"> -->
                        </a>
                    </div>
                </div>
            </div>

        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/" class="btn btnNormal jsTouchActive autoMargin">TOPへ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        
        <script>
            (function(){
                var buttons = ci.qsa('.mypagePremierbtn');
                ci.bind(buttons, 'click', function(){
                    ci.addClass(this, 'btnActive');
                });
                
                var i = 0;
                var interval = setInterval(function(){
                    if(i >= 7){
                        clearInterval(interval); 
                    }else{
                        i++;
                    }
                  }, 250);
            })();
        </script>

    </body>

</html>