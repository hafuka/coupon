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
                            <OPTION value="ginza">銀座</OPTION>
                            <OPTION value="shibuya">渋谷</OPTION>
                            <OPTION value="shinjyuku">新宿</OPTION>
                            <OPTION value="yokohama">横浜</OPTION>
                        </SELECT>
                    </div>
                    <div class="pv5">
                        業種：
                        <SELECT name="business" class="selectZone vTop">
                            <OPTION value="food">飲食店</OPTION>
                            <OPTION value="hair">美容院</OPTION>
                            <OPTION value="club">キャバクラ</OPTION>
                            <OPTION value="fashion">ファッション系</OPTION>
                        </SELECT>
                    </div>
                </div>
                <div class="cell vMiddle pl10">
                    <a class="btnCircle">検索</a>
                </div>
            </div>

            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="" class="btn btnPrimary autoMargin fcWhite fs22">ドコ行く？</a>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
            <ul class="couponList borderTopGreen">
                <li>
                    <a href="${urlPath}/detail/detail">
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
                    <a href="${urlPath}/detail/detail">
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
            </ul>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="" class="btn btnPrimary autoMargin fcWhite fs22">ドコ行く？</a>
                </div>
                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage/mypage" class="btn btnNormal autoMargin fcWhite fs22">マイページへ</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>