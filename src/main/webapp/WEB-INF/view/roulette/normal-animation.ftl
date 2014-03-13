<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>slot_animation</title>
<#-- 共通headのインクルード -->
<#include "/common/htmlHead.ftl">
<#-- createJS関連 -->
<script src="/coupon/js/createJs/easeljs-0.7.0.min.js"></script>
<script src="/coupon/js/createJs/tweenjs-0.5.0.min.js"></script>
<script src="/coupon/js/createJs/movieclip-0.7.0.min.js"></script>
<script src="/coupon/js/createJs/preloadjs-0.4.0.min.js"></script>
<#-- 共通JavaScriptのインクルード -->
<#include "/common/htmlFoot.ftl">
<script src="/coupon/js/coupon_animation.js"></script>

<script>
var canvas, stage, exportRoot;
// 当たり店舗名
var storeName = '${coupon.shopBean.shopName!?html}';
// 当たりクーポン名
var storeCouponName = '${coupon.mShopCoupon.couponName!?html}';
// 当たり判定（★表示）
var starDisplay = 0;
// SLOT判別用にレアリティを格納(1:N, 2:R, 3:SR)
var couponRarity = ${coupon.mShopCoupon.rarity};
// レアリティの名前を格納
<#assign rarityName = ''>
<#if coupon.mShopCoupon.rarity == 1>
    <#assign rarityName = 'n'>
<#elseif coupon.mShopCoupon.rarity == 2>
    <#assign rarityName = 'r'>
<#elseif coupon.mShopCoupon.rarity == 3>
    <#assign rarityName = 'sr'>
</#if>
// 確変フラグ
var changeFlg = 0;
<#if coupon.chanceFlg>
    changeFlg = 1;
</#if>
// アニメーション後のURL
var nextUrl = '/coupon/rouletteResult?token=${token}';

window.addEventListener('DOMContentLoaded', function() {
    canvas = document.getElementById("canvas");
    canvas.style.top = (window.innerHeight > 417) ? (window.innerHeight - 417) / 2 + 'px' : '0px';
    canvas.style.left = (window.innerWidth > 320) ? (window.innerWidth - 320) / 2 + 'px' : '0px';
    images = images||{};
    
    var manifest = [
        {src:"/coupon/images/animation/roulette/bg.jpg", id:"bg"},
        {src:"/coupon/images/animation/roulette/changeImg.png", id:"changeImg"},
        {src:"/coupon/images/animation/roulette/changeImgShade.png", id:"changeImgShade"},
        {src:"/coupon/images/animation/roulette/coupon_bg_${rarityName}.png", id:"coupon_bg_sr"},
        {src:"/coupon/images/animation/roulette/jackpot.png", id:"jackpot"},
        {src:"/coupon/images/animation/roulette/light.png", id:"light"},
        {src:"/coupon/images/animation/roulette/medal_${rarityName}.png", id:"medal_sr"},
        {src:"/coupon/images/animation/roulette/reachImg.png", id:"reachImg"},
        {src:"/coupon/images/animation/roulette/reachImgShade.png", id:"reachImgShade"},
        {src:"/coupon/images/animation/roulette/ribbon.png", id:"ribbon"},
        {src:"/coupon/images/animation/roulette/star_large.png", id:"star_large"},
        {src:"/coupon/images/animation/roulette/star_small.png", id:"star_small"}
    ];

    var loader = new createjs.LoadQueue(false);
    loader.addEventListener("fileload", handleFileLoad);
    loader.addEventListener("complete", handleComplete);
    loader.loadManifest(manifest);
});

function handleFileLoad(evt) {
    if (evt.item.type == "image") { images[evt.item.id] = evt.result; }
}

function handleComplete() {
    exportRoot = new lib.slot_animation();

    stage = new createjs.Stage(canvas);
    stage.addChild(exportRoot);
    stage.update();

    createjs.Ticker.setFPS(20);
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
        background-size: 90px 52px;
    }
</style>
</head>

<body>
    <canvas id="canvas" width="320" height="417"></canvas>
</body>
</html>