<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_animation</title>

<script src="http://code.createjs.com/easeljs-0.7.0.min.js"></script>
<script src="http://code.createjs.com/tweenjs-0.5.0.min.js"></script>
<script src="http://code.createjs.com/movieclip-0.7.0.min.js"></script>
<script src="http://code.createjs.com/preloadjs-0.4.0.min.js"></script>
<#-- 共通JavaScriptのインクルード -->
<#include "/common/htmlFoot.ftl">
<script src="/coupon/js/login_animation.js"></script>

<script>
var canvas, stage, exportRoot;

var bonusPoint = '${loginBonus.point!?html}';
var nextUrl = '/coupon/mypage';

window.addEventListener('DOMContentLoaded', function() {
    canvas = document.getElementById("canvas");
    canvas.style.top = (window.innerHeight > 417) ? (window.innerHeight - 417) / 2 + 'px' : '0px';
    canvas.style.left = (window.innerWidth > 320) ? (window.innerWidth - 320) / 2 + 'px' : '0px';
    images = images||{};

    var manifest = [
        {src:"/coupon/images/bakudan.png", id:"bakudan"},
        {src:"/coupon/images/comment.png", id:"comment"},
        {src:"/coupon/images/light_l.png", id:"light_l"},
        {src:"/coupon/images/light_r.png", id:"light_r"},
        {src:"/coupon/images/star.png", id:"star"},
        {src:"/coupon/images/title_txt_01.png", id:"title_txt_01"},
        {src:"/coupon/images/title_txt_02.png", id:"title_txt_02"},
        {src:"/coupon/images/title_txt_03.png", id:"title_txt_03"},
        {src:"/coupon/images/title_txt_04.png", id:"title_txt_04"},
        {src:"/coupon/images/title_txt_05.png", id:"title_txt_05"},
        {src:"/coupon/images/title_txt_06.png", id:"title_txt_06"},
        {src:"/coupon/images/title_txt_07.png", id:"title_txt_07"},
        {src:"/coupon/images/title_txt_08.png", id:"title_txt_08"},
        {src:"/coupon/images/transparent.png", id:"transparent"}
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
    exportRoot = new lib.login_animation();

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