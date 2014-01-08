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
            <div class="autoMargin mv20 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">10枚</span>のクーポン券があるよ♪</p>
                    </div>
                </div>
            </div>
        </section>

        <#-- クーポンリスト -->
        <section>
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
            <h1 class="headline headlineNormal">クーポン</h1>
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