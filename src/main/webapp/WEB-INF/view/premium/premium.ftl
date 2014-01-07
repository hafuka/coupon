<!DOCTYPE html>
<html lang="ja">
    <head>
        <title>COUPON ISLAND - 今日、ドコ行く？ -</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <link rel="stylesheet" href="/coupon/css/main.css">
    </head>

    <body class="secondOutline">

        <!-- ヘッダーメニュー -->
        <header>
            <ul class="clear">
                <li class="menuList floatLeft textCenter">
                    <a href="mypage.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_mypage.png" width="67" height="36" class="vTop">
                        </div>
                        <div class="textCenter lheight0">
                            <img src="/coupon/images/nav/menu_mypage_title.png" width="67" height="15" class="vTop">
                        </div>
                    </a>
                </li>
                <li class="menuList floatLeft textCenter">
                    <a href="coupon.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_doko.png" width="67" height="36" class="vTop">
                        </div>
                        <div class="textCenter lheight0">
                            <img src="/coupon/images/nav/menu_doko_title.png" width="67" height="15" class="vTop">
                        </div>
                    </a>
                </li>
                <li class="menuList floatLeft textCenter active">
                    <a href="premium.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_premium.png" width="67" height="36" class="vTop">
                        </div>
                        <div class="textCenter lheight0">
                            <img src="/coupon/images/nav/menu_premium_title.png" width="67" height="15" class="vTop">
                        </div>
                    </a>
                </li>
                <li class="menuList floatLeft textCenter">
                    <a href="box.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_box.png" width="67" height="36" class="vTop">
                        </div>
                        <div class="textCenter lheight0">
                            <img src="/coupon/images/nav/menu_box_title.png" width="67" height="15" class="vTop">
                        </div>
                    </a>
                </li>
            </ul>
        </header>

        <!-- ふきだし -->
        <section>
            <h1 class="headline headlineNormal mt20">プレミアム ドコ行く？</h1>
            <div class="autoMargin mv20 table">
                <div class="cell">
                    <img src="/coupon/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">業種と地域を選んでね。<br>今日は何が当たるかな？</span></p>
                    </div>
                </div>
            </div>
        </section>

        <!-- 検索エリア -->
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
        </section>

        <div class="mv20">
            <div class="textCenter mv10">
                <a href="" class="btn btnPrimary autoMargin fcWhite fs22">プレミアム ドコ行く？</a>
            </div>
        </div>

        <!-- クーポンリスト -->
        <section>
            <ul class="couponList borderTopGreen">
                <li>
                    <a href="detail.html">
                        <div class="table">
                            <div class="cell pr10">
                                <img src="/coupon/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
                            </div>
                            <div class="cell vTop">
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
                    <a href="detail.html">
                        <div class="table">
                            <div class="cell pr10">
                                <img src="/coupon/images/storeThumnail.jpg" width="85" height="85" class="borderGray">
                            </div>
                            <div class="cell vTop">
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

        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="" class="btn btnPrimary autoMargin fcWhite fs22">プレミアム ドコ行く？</a>
                </div>
                <div class="textCenter mv10">
                    <a href="mypage.html" class="btn btnNormal autoMargin fcWhite fs22">マイページへ</a>
                </div>
            </div>
        </nav>

        <!-- フッターメニュー -->
        <footer>
            <ul class="clear">
                <li class="menuList floatLeft textCenter">
                    <a href="mypage.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_mypage.png" width="67" height="36" class="vTop">
                        </div>
                    </a>
                </li>
                <li class="menuList floatLeft textCenter">
                    <a href="coupon.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_doko.png" width="67" height="36" class="vTop">
                        </div>
                    </a>
                </li>
                <li class="menuList floatLeft textCenter">
                    <a href="premium.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_premium.png" width="67" height="36" class="vTop">
                        </div>
                    </a>
                </li>
                <li class="menuList floatLeft textCenter">
                    <a href="box.html">
                        <div class="textCenter">
                            <img src="/coupon/images/nav/menu_box.png" width="67" height="36" class="vTop">
                        </div>
                    </a>
                </li>
            </ul>
        </footer>

    </body>
</html>