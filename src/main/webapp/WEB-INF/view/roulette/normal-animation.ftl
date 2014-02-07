<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>coupon_animation_kai</title>

<script src="http://code.createjs.com/easeljs-0.7.0.min.js"></script>
<script src="http://code.createjs.com/tweenjs-0.5.0.min.js"></script>
<script src="http://code.createjs.com/movieclip-0.7.0.min.js"></script>
<script src="http://code.createjs.com/preloadjs-0.4.0.min.js"></script>
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
        {src:"images/bg.jpg", id:"bg"},
        {src:"images/big.png", id:"big"},
        {src:"images/changeImg.png", id:"changeImg"},
        {src:"images/changeImgShade.png", id:"changeImgShade"},
        {src:"images/coupon_sr.png", id:"coupon_sr"},
        {src:"images/jackpot.png", id:"jackpot"},
        {src:"images/light.png", id:"light"},
        {src:"images/onepx.png", id:"onepx"},
        {src:"images/reachImg.png", id:"reachImg"},
        {src:"images/reachImgShade.png", id:"reachImgShade"},
        {src:"images/ribbon.png", id:"ribbon"},
        {src:"images/star_1.png", id:"star_1"},
        {src:"images/star_2.png", id:"star_2"},
        {src:"images/star_large.png", id:"star_large"},
        {src:"images/star_small.png", id:"star_small"},
        {src:"images/white_bg.png", id:"white_bg"}
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
                background-color: #000;
                background-image: url("${imagePath}/images/common/loading.gif");
                background-repeat: no-repeat;
                background-position: center;
                background-size: 70px 72px;
            }
        </style>
</head>

<body>
    <canvas id="canvas" width="320" height="480"></canvas>
</body>
</html>