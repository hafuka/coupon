(function (lib, img, cjs) {

var p; // shortcut to reference prototypes

// stage content:
(lib.login_animation = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // timeline functions:
    this.frame_0 = function() {
        this.main.gotoAndPlay("move");
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(1));

    // tapArea
    this.tapObj = new lib.tapObj();
    this.tapObj.setTransform(155.7,217.1,1,1,0,0,0,191.4,234.2);
    this.tapObj.alpha = 0.012;

    this.timeline.addTween(cjs.Tween.get(this.tapObj).wait(1));

    // レイヤー 3 (mask)
    var mask = new cjs.Shape();
    mask._off = true;
    mask.graphics.p("EgY/AgkMAAAhBIMAx/AAAMAAABBIg");
    mask.setTransform(160,208.5);

    // レイヤー 1
    this.main = new lib.main();
    this.main.setTransform(160.1,208.6,0.5,0.5,0,0,0,320.1,417.1);

    this.main.mask = mask;

    this.timeline.addTween(cjs.Tween.get(this.main).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(124.3,191.4,382.8,468.5);


// symbols:
(lib.bakudan = function() {
    this.initialize(img.bakudan);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,270,270);


(lib.comment = function() {
    this.initialize(img.comment);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,560,166);


(lib.light_l = function() {
    this.initialize(img.light_l);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,500,620);


(lib.light_r = function() {
    this.initialize(img.light_r);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,500,620);


(lib.star = function() {
    this.initialize(img.star);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,40,60);


(lib.title_txt_01 = function() {
    this.initialize(img.title_txt_01);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,70,80);


(lib.title_txt_02 = function() {
    this.initialize(img.title_txt_02);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,74,80);


(lib.title_txt_03 = function() {
    this.initialize(img.title_txt_03);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,68,80);


(lib.title_txt_04 = function() {
    this.initialize(img.title_txt_04);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,68,80);


(lib.title_txt_05 = function() {
    this.initialize(img.title_txt_05);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,76,80);


(lib.title_txt_06 = function() {
    this.initialize(img.title_txt_06);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,68,80);


(lib.title_txt_07 = function() {
    this.initialize(img.title_txt_07);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,70,80);


(lib.title_txt_08 = function() {
    this.initialize(img.title_txt_08);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,70,80);


(lib.transparent = function() {
    this.initialize(img.transparent);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,100,100);


(lib.tween5 = function() {
    this.initialize();

    // レイヤー 1
    this.text = new cjs.Text(bonusPoint, "90px 'Helvetica'", "#FFFFFF");
    this.text.textAlign = "center";
    this.text.lineHeight = 92;
    this.text.lineWidth = 220;
    this.text.setTransform(-2,-57.1);

    this.addChild(this.text);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-111.9,-57.1,224,114.4);


(lib.tween4 = function() {
    this.initialize();

    // レイヤー 1
    this.text = new cjs.Text(bonusPoint, "90px 'Helvetica'", "#FFFFFF");
    this.text.textAlign = "center";
    this.text.lineHeight = 92;
    this.text.lineWidth = 220;
    this.text.setTransform(-2,-57.1);

    this.addChild(this.text);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-111.9,-57.1,224,114.4);


(lib.tween3 = function() {
    this.initialize();

    // レイヤー 1
    this.shape = new cjs.Shape();
    this.shape.graphics.f("#CC6600").s().p("Egx/AOEIAA8HMBj+AAAIAAcHg");

    this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-320,-90,640,180);


(lib.tween2 = function() {
    this.initialize();

    // レイヤー 1
    this.shape = new cjs.Shape();
    this.shape.graphics.f("#CC6600").s().p("Egx/AOEIAA8HMBj+AAAIAAcHg");

    this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-320,-90,640,180);


(lib.tween1 = function() {
    this.initialize();

    // レイヤー 1
    this.shape = new cjs.Shape();
    this.shape.graphics.f("#CC6600").s().p("Egx/AOEIAA8HMBj+AAAIAAcHg");

    this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-320,-90,640,180);


(lib.text8 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_08();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,70,80);


(lib.text7 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_07();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,70,80);


(lib.text6 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_06();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,68,80);


(lib.text5 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_05();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,76,80);


(lib.text4 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_04();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,68,80);


(lib.text3 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_03();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,68,80);


(lib.text2 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_02();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,74,80);


(lib.text1 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.title_txt_01();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,70,80);


(lib.tapObj = function() {
    this.initialize();

    // レイヤー 1
    this.shape = new cjs.Shape();
    this.shape.graphics.f("#FFFFFF").s().p("Egd5AkmMAAAhJLMA7yAAAMAAABJLg");
    this.shape.setTransform(191.4,234.3);

    this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,382.8,468.5);


(lib.star_2 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.star();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,40,60);


(lib.star_1 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.star();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,40,60);


(lib.pointBakudanInner = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.bakudan();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,270,270);


(lib.light5 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.light_r();
    this.instance.setTransform(-250,-310);

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-250,-310,500,620);


(lib.light4 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.light_r();
    this.instance.setTransform(-250,-310);

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-250,-310,500,620);


(lib.light2 = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.light_l();
    this.instance.setTransform(-250,-310);

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-250,-310,500,620);


(lib.commentImageInner = function() {
    this.initialize();

    // レイヤー 1
    this.instance = new lib.comment();

    this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,560,166);


(lib.star2 = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // レイヤー 1
    this.star_2 = new lib.star_2();
    this.star_2.setTransform(20,30,1,1,0,0,0,20,30);

    this.timeline.addTween(cjs.Tween.get(this.star_2).to({alpha:0},9).to({alpha:1},9).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,40,60);


(lib.star_3 = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // レイヤー 1
    this.star_1 = new lib.star_1();
    this.star_1.setTransform(20,30,1,1,0,0,0,20,30);
    this.star_1.alpha = 0;

    this.timeline.addTween(cjs.Tween.get(this.star_1).to({alpha:1},12).to({alpha:0},12).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,40,60);


(lib.pointBakudan = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // timeline functions:
    this.frame_4 = function() {
        this.stop();
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).wait(4).call(this.frame_4).wait(1));

    // point
    this.instance = new lib.tween4("synched",0);
    this.instance.setTransform(127.9,136.7,0.108,0.108);

    this.instance_1 = new lib.tween5("synched",0);
    this.instance_1.setTransform(127.9,136.7);

    this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance}]}).to({state:[{t:this.instance_1}]},4).wait(1));
    this.timeline.addTween(cjs.Tween.get(this.instance).to({_off:true,scaleX:1,scaleY:1},4).wait(1));

    // bakudan
    this.pointBakudanInner = new lib.pointBakudanInner();
    this.pointBakudanInner.setTransform(135,135,0.097,0.097,0,0,0,135,135);

    this.timeline.addTween(cjs.Tween.get(this.pointBakudanInner).to({scaleX:1,scaleY:1},4).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(40.9,92.3,174,88.9);


(lib.light_r_1 = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // timeline functions:
    this.frame_39 = function() {
        this.stop();
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).wait(39).call(this.frame_39).wait(1));

    // レイヤー 1
    this.instance = new lib.light4("synched",0);
    this.instance.setTransform(499.9,0.1,1,1,0,0,0,249.9,-309.9);

    this.instance_1 = new lib.light5("synched",0);
    this.instance_1.setTransform(501.9,0.1,1,1,0,0,0,251.9,-309.9);

    this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance}]}).to({state:[{t:this.instance}]},9).to({state:[{t:this.instance}]},10).to({state:[{t:this.instance}]},10).to({state:[{t:this.instance_1}]},10).wait(1));
    this.timeline.addTween(cjs.Tween.get(this.instance).to({regX:250,rotation:-19,x:500.5},9).to({regX:249.9,rotation:0,x:500.9},10).to({regX:250,rotation:11.4,x:501.5,y:0.2},10).to({_off:true,regX:251.9,rotation:0,x:501.9,y:0.1},10).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,679.4,737.3);


(lib.light_l_1 = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // timeline functions:
    this.frame_39 = function() {
        this.stop();
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).wait(39).call(this.frame_39).wait(1));

    // レイヤー 1
    this.instance = new lib.light2("synched",0);
    this.instance.setTransform(-1.9,0.1,1,1,0,0,0,-251.9,-309.9);

    this.timeline.addTween(cjs.Tween.get(this.instance).to({regX:-251.8,rotation:16.2,x:-1.8,y:0.2},9).to({regX:-251.9,rotation:0,x:-1.9,y:0.1},10).to({rotation:-11.5},10).to({rotation:0},10).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-153.1,0,653.1,724.2);


(lib.commentImage = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{});

    // timeline functions:
    this.frame_4 = function() {
        this.stop();
        exportRoot.tapObj.addEventListener('click', function(){
            location.href = nextUrl;
        })
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).wait(4).call(this.frame_4).wait(1));

    // text
    this.loginText = new cjs.Text(bonusPoint + "獲得したよ♪\n明日もログインしてね♪", "30px 'Osaka'", "#333333");
    this.loginText.name = "loginText";
    this.loginText.lineHeight = 32;
    this.loginText.lineWidth = 382;
    this.loginText.setTransform(201.9,65.6);
    this.loginText._off = true;

    this.timeline.addTween(cjs.Tween.get(this.loginText).wait(4).to({_off:false},0).wait(1));

    // レイヤー 1
    this.commentImageInner = new lib.commentImageInner();
    this.commentImageInner.setTransform(280,103,1,0.096,0,0,0,280,83);

    this.timeline.addTween(cjs.Tween.get(this.commentImageInner).to({scaleY:1},4).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,95,560,16);


(lib.titleArea = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{commentImage:37});

    // timeline functions:
    this.frame_36 = function() {
        this.stop();
        this.gotoAndPlay("commentImage");
    }
    this.frame_39 = function() {
        this.stop();
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).wait(36).call(this.frame_36).wait(3).call(this.frame_39).wait(1));

    // star2
    this.star2 = new lib.star2();
    this.star2.setTransform(1140.7,120.9,1,1,0,0,0,20,30);

    this.star2_1 = new lib.star2();
    this.star2_1.setTransform(860.7,40.9,1,1,0,0,0,20,30);

    this.timeline.addTween(cjs.Tween.get({}).to({state:[]}).to({state:[{t:this.star2_1},{t:this.star2}]},37).wait(3));

    // star
    this.star = new lib.star_3();
    this.star.setTransform(1192.7,24.9,1,1,0,0,0,20,30);

    this.star_1 = new lib.star_3();
    this.star_1.setTransform(1080.7,50.9,1,1,0,0,0,20,30);

    this.star_2 = new lib.star_3();
    this.star_2.setTransform(824.7,116.9,1,1,0,0,0,20,30);

    this.star_3 = new lib.star_3();
    this.star_3.setTransform(753.7,30,1,1,0,0,0,20,30);

    this.timeline.addTween(cjs.Tween.get({}).to({state:[]}).to({state:[{t:this.star_3},{t:this.star_2},{t:this.star_1},{t:this.star}]},37).wait(3));

    // point
    this.instance = new lib.pointBakudan();
    this.instance.setTransform(963.7,243.9,1,1,0,0,0,135,135);
    this.instance._off = true;

    this.timeline.addTween(cjs.Tween.get(this.instance).wait(37).to({_off:false},0).wait(3));

    // commentImage
    this.commentImage = new lib.commentImage();
    this.commentImage.setTransform(965.8,446.9,1,1,0,0,0,280,83);
    this.commentImage._off = true;

    this.timeline.addTween(cjs.Tween.get(this.commentImage).wait(37).to({_off:false},0).wait(3));

    // text8
    this.instance_1 = new lib.text8();
    this.instance_1.setTransform(574.8,76,1,1,0,0,0,35,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(28).to({x:1188.8},4).to({scaleX:1.14,scaleY:1.14,x:1220.1},2).to({scaleX:1,scaleY:1,x:1188.8},2).wait(4));

    // text7
    this.instance_2 = new lib.text7();
    this.instance_2.setTransform(512.8,76,1,1,0,0,0,35,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(24).to({x:1126.8},4).wait(4).to({scaleX:1.14,scaleY:1.14,x:1149.6},2).to({scaleX:1,scaleY:1,x:1126.8},2).wait(4));

    // text6
    this.instance_3 = new lib.text6();
    this.instance_3.setTransform(447.8,76,1,1,0,0,0,34,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(20).to({x:1059.8},4).wait(8).to({scaleX:1.14,scaleY:1.14,x:1073.5},2).to({scaleX:1,scaleY:1,x:1059.8},2).wait(4));

    // text5
    this.instance_4 = new lib.text5();
    this.instance_4.setTransform(383.8,76,1,1,0,0,0,38,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(16).to({x:993.8},4).wait(12).to({scaleX:1.14,scaleY:1.14,x:998.6},2).to({scaleX:1,scaleY:1,x:993.8},2).wait(4));

    // text4
    this.instance_5 = new lib.text4();
    this.instance_5.setTransform(315.8,76,1,1,0,0,0,34,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_5).wait(12).to({x:923.8},4).wait(16).to({scaleX:1.14,scaleY:1.14,x:919.1},2).to({scaleX:1,scaleY:1,x:923.8},2).wait(4));

    // text3
    this.instance_6 = new lib.text3();
    this.instance_6.setTransform(255.8,76,1,1,0,0,0,34,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_6).wait(8).to({x:861.8},4).wait(20).to({scaleX:1.14,scaleY:1.14,x:848.6},2).to({scaleX:1,scaleY:1,x:861.8},2).wait(4));

    // text2
    this.instance_7 = new lib.text2();
    this.instance_7.setTransform(194.8,76,1,1,0,0,0,37,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_7).wait(4).to({x:798.8},4).wait(24).to({scaleX:1.14,scaleY:1.14,x:777.1},2).to({scaleX:1,scaleY:1,x:798.8},2).wait(4));

    // text1
    this.instance_8 = new lib.text1();
    this.instance_8.setTransform(126.8,76,1,1,0,0,0,35,40);

    this.timeline.addTween(cjs.Tween.get(this.instance_8).to({x:728.8},4).wait(28).to({scaleX:1.14,scaleY:1.14,x:697.6},2).to({scaleX:1,scaleY:1,x:728.8},2).wait(4));

    // titleBg
    this.shape = new cjs.Shape();
    this.shape.graphics.f("#CC6600").s().p("Egx/AOEIAA8HMBj+AAAIAAcHg");
    this.shape.setTransform(320,90);

    this.instance_9 = new lib.tween1("synched",0);
    this.instance_9.setTransform(320,90);
    this.instance_9._off = true;

    this.instance_10 = new lib.tween2("synched",0);
    this.instance_10.setTransform(320,90);
    this.instance_10._off = true;

    this.instance_11 = new lib.tween3("synched",0);
    this.instance_11.setTransform(320,90);

    this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape}]}).to({state:[{t:this.instance_9}]},32).to({state:[{t:this.instance_10}]},2).to({state:[{t:this.instance_11}]},2).wait(4));
    this.timeline.addTween(cjs.Tween.get(this.instance_9).wait(32).to({_off:false},0).to({_off:true},2).wait(6));
    this.timeline.addTween(cjs.Tween.get(this.instance_10).wait(32).to({_off:false},2).to({_off:true},2).wait(4));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,640,180);


(lib.main = function(mode,startPosition,loop) {
    this.initialize(mode,startPosition,loop,{stop:0,move:4,image:9});

    // timeline functions:
    this.frame_4 = function() {
        this.stop();
    }

    // actions tween:
    this.timeline.addTween(cjs.Tween.get(this).wait(4).call(this.frame_4).wait(11));

    // text
    this.titleArea = new lib.titleArea();
    this.titleArea.setTransform(-320,248,1,1,0,0,0,320,90);

    this.timeline.addTween(cjs.Tween.get(this.titleArea).wait(4).to({regX:0,regY:0,x:-640,y:158},0).wait(5).to({regX:320,regY:90,x:-320,y:248},0).wait(6));

    // light_r
    this.instance = new lib.light_r_1();
    this.instance.setTransform(411.9,283.9,1,1,0,0,0,250,310);

    this.timeline.addTween(cjs.Tween.get(this.instance).wait(15));

    // light_l
    this.instance_1 = new lib.light_l_1();
    this.instance_1.setTransform(237.1,282,1,1,0,0,0,249.1,310);

    this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(15));

    // bg
    this.shape = new cjs.Shape();
    this.shape.graphics.f("#000000").s().p("Egx/BBKMAAAiCTMBj+AAAMAAACCTg");
    this.shape.setTransform(320,417);

    this.timeline.addTween(cjs.Tween.get(this.shape).wait(15));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-640,-28,1301.9,862.1);

})(lib = lib||{}, images = images||{}, createjs = createjs||{});
var lib, images, createjs;