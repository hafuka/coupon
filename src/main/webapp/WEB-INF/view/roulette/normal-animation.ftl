<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>coupon_animation_kai</title>
<#-- 共通headのインクルード -->
<#include "/common/htmlHead.ftl">
<script src="http://code.createjs.com/easeljs-0.7.0.min.js"></script>
<script src="http://code.createjs.com/tweenjs-0.5.0.min.js"></script>
<script src="http://code.createjs.com/movieclip-0.7.0.min.js"></script>
<script src="http://code.createjs.com/preloadjs-0.4.0.min.js"></script>
<#-- 共通JavaScriptのインクルード -->
<#include "/common/htmlFoot.ftl">
<script src="/coupon/js/coupon_animation.js"></script>

<script>
var canvas, stage, exportRoot;

var storeName = '${coupon.mShop.shopName!?html}';
var storeCouponName = '${coupon.mShopCoupon.couponName!?html}';
var nextUrl = '/coupon/rouletteResult?token=${token}';

window.addEventListener('DOMContentLoaded', function() {
    canvas = document.getElementById("canvas");
    canvas.style.top = (window.innerHeight > 417) ? (window.innerHeight - 417) / 2 + 'px' : '0px';
    canvas.style.left = (window.innerWidth > 320) ? (window.innerWidth - 320) / 2 + 'px' : '0px';
    images = images||{};

    var manifest = [
        {src:"/coupon/images/animation/roulette/bg.jpg", id:"bg"},
        {src:"/coupon/images/animation/roulette/big.png", id:"big"},
        {src:"/coupon/images/animation/roulette/changeImg.png", id:"changeImg"},
        {src:"/coupon/images/animation/roulette/changeImgShade.png", id:"changeImgShade"},
        {src:"/coupon/images/animation/roulette/coupon_sr.png", id:"coupon_sr"},
        {src:"/coupon/images/animation/roulette/jackpot.png", id:"jackpot"},
        {src:"/coupon/images/animation/roulette/light.png", id:"light"},
        {src:"/coupon/images/animation/roulette/onepx.png", id:"onepx"},
        {src:"/coupon/images/animation/roulette/reachImg.png", id:"reachImg"},
        {src:"/coupon/images/animation/roulette/reachImgShade.png", id:"reachImgShade"},
        {src:"/coupon/images/animation/roulette/ribbon.png", id:"ribbon"},
        {src:"/coupon/images/animation/roulette/star_1.png", id:"star_1"},
        {src:"/coupon/images/animation/roulette/star_2.png", id:"star_2"},
        {src:"/coupon/images/animation/roulette/star_large.png", id:"star_large"},
        {src:"/coupon/images/animation/roulette/star_small.png", id:"star_small"},
        {src:"/coupon/images/animation/roulette/white_bg.png", id:"white_bg"}
    ];

    var loader = new createjs.LoadQueue(false);
    loader.addEventListener("fileload", handleFileLoad);
    loader.addEventListener("complete", handleComplete);
    loader.loadManifest(lib.properties.manifest);
});

function handleFileLoad(evt) {
    if (evt.item.type == "image") { images[evt.item.id] = evt.result; }
}

function handleComplete() {
    exportRoot = new lib.coupon_animation_kai();

    stage = new createjs.Stage(canvas);
    stage.addChild(exportRoot);
    stage.update();

    createjs.Ticker.setFPS(lib.properties.fps);
    createjs.Ticker.addEventListener("tick", stage);
}
</script>
        <style type="text/css">
            body {
                background-color: #000;
            }
            #canvas {
                position: absolute;
                //background-color: #000;
                //background-image: url("${imagePath}/images/common/loading.gif");
                //background-repeat: no-repeat;
                //background-position: center;
                //background-size: 70px 72px;
            }
        </style>
</head>

<body>
    <canvas id="canvas" width="320" height="480"></canvas>
</body>
</html>