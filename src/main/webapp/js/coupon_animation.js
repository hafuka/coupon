(function (lib, img, cjs) {

var p; // shortcut to reference prototypes

// stage content:
(lib.slot_animation = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		this.main.gotoAndPlay("move");
		
		// 当たり判定（★表示）
		exportRoot.starDisplay = starDisplay;
		
		// SLOT判別用にレアリティを格納
		// 1:N, 2:R, 3:SR
		exportRoot.couponRarity = couponRarity;
		
		// 確変フラグ
		exportRoot.changeFlg = changeFlg;
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(1));

	// tapArea
	this.tapObj = new lib.tapObj();
	this.tapObj.setTransform(160,208.5,1,1,0,0,0,160,208.5);
	this.tapObj.alpha = 0.012;

	this.timeline.addTween(cjs.Tween.get(this.tapObj).wait(1));

	// マスク (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	mask.graphics.p("EgY/AgkMAAAhBIMAx/AAAMAAABBIg");
	mask.setTransform(160,208.5);

	// main
	this.main = new lib.main();
	this.main.setTransform(160,208.5,1,1,0,0,0,160,208.5);

	this.main.mask = mask;

	this.timeline.addTween(cjs.Tween.get(this.main).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(160,208.5,320,417);


// symbols:
(lib.bg = function() {
	this.initialize(img.bg);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,832);


(lib.changeImg = function() {
	this.initialize(img.changeImg);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,440,100);


(lib.changeImgShade = function() {
	this.initialize(img.changeImgShade);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,440,100);


(lib.coupon_bg_sr = function() {
	this.initialize(img.coupon_bg_sr);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,630,440);


(lib.jackpot = function() {
	this.initialize(img.jackpot);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,460);


(lib.light = function() {
	this.initialize(img.light);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,960);


(lib.medal_sr = function() {
	this.initialize(img.medal_sr);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,100,100);


(lib.reachImg = function() {
	this.initialize(img.reachImg);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,440,100);


(lib.reachImgShade = function() {
	this.initialize(img.reachImgShade);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,440,100);


(lib.ribbon = function() {
	this.initialize(img.ribbon);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,620,120);


(lib.star_large = function() {
	this.initialize(img.star_large);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,162,162);


(lib.star_small = function() {
	this.initialize(img.star_small);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,125,125);


(lib.win_flg = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.ribbon();
	this.instance.setTransform(0,0,0.5,0.5);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,310,60);


(lib.tapObj = function() {
	this.initialize();

	// レイヤー 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#0033FF").s().p("EgY/AgkMAAAhBIMAx/AAAMAAABBIg");
	this.shape.setTransform(160,208.5);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,320,417);


(lib.str_inner = function() {
	this.initialize();

	// レイヤー 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f().s("#FF6600").ss(4,1,1).p("AFxDkIkYhMIipDpIgNkhIkThbIEPhkIABkhICzDiIEThYIieDxg");
	this.shape.setTransform(36.9,38.5);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFF00").s().p("AhdBgIkThbIEPhkIABkhICzDiIEThYIieDxICpDpIkYhMIipDpg");
	this.shape_1.setTransform(36.9,38.5);

	this.addChild(this.shape_1,this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-2,-2,77.9,81.1);


(lib.star_light_small_inner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.star_small();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,125,125);


(lib.star_light_big_inner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.star_large();
	this.instance.setTransform(0,59.6,0.519,0.519,-45.2);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,118.8,118.8);


(lib.noticeInner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.reachImgShade();
	this.instance.setTransform(0,0,0.5,0.5);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,220,50);


(lib.medal = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.medal_sr();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,100,100);


(lib.coupon_bg = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.coupon_bg_sr();
	this.instance.setTransform(0,0,0.397,0.397);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,250,174.6);


(lib.changeLightInner = function() {
	this.initialize();

	// レイヤー 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFCCFF").s().p("EgZeAhSMAAAhCjMAy8AAAMAAABCjg");
	this.shape.setTransform(163.1,213.1);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,326.2,426.2);


(lib.changeInner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.changeImgShade();
	this.instance.setTransform(0,0,0.5,0.5);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,220,50);


(lib.beam_inner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.light();
	this.instance.setTransform(0,64.2,0.622,0.622,-9.3);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,489.4,653.7);


(lib.starArea3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{start:0});

	// timeline functions:
	this.frame_20 = function() {
		this.stop();
		this.parent.gotoAndStop('final');
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(20).call(this.frame_20).wait(5));

	// star1
	this.winStar1 = new lib.str_inner();
	this.winStar1.setTransform(68,60,1,1,0,0,0,36.9,38.5);
	this.winStar1.alpha = 0.602;

	this.timeline.addTween(cjs.Tween.get(this.winStar1).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.012},0).wait(5));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(29.1,19.5,77.9,81.1);


(lib.starArea2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{"start":0});

	// timeline functions:
	this.frame_20 = function() {
		this.stop();
		this.parent.gotoAndStop('final');
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(20).call(this.frame_20).wait(5));

	// star3
	this.winStar3 = new lib.str_inner();
	this.winStar3.setTransform(216,60,1,1,0,0,0,36.9,38.5);
	this.winStar3.alpha = 0.602;

	this.timeline.addTween(cjs.Tween.get(this.winStar3).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.012},0).wait(5));

	// star1
	this.winStar1 = new lib.str_inner();
	this.winStar1.setTransform(68,60,1,1,0,0,0,36.9,38.5);
	this.winStar1.alpha = 0.602;

	this.timeline.addTween(cjs.Tween.get(this.winStar1).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.012},0).wait(5));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(29.1,19.5,225.8,81.1);


(lib.starArea = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{"start":0});

	// timeline functions:
	this.frame_20 = function() {
		this.stop();
		this.parent.gotoAndStop('final');
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(20).call(this.frame_20).wait(5));

	// star3
	this.winStar3 = new lib.str_inner();
	this.winStar3.setTransform(216,60,1,1,0,0,0,36.9,38.5);
	this.winStar3.alpha = 0.602;

	this.timeline.addTween(cjs.Tween.get(this.winStar3).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.012},0).wait(5));

	// star2
	this.winStar2 = new lib.str_inner();
	this.winStar2.setTransform(142,60,1,1,0,0,0,36.9,38.5);
	this.winStar2.alpha = 0.602;

	this.timeline.addTween(cjs.Tween.get(this.winStar2).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.012},0).wait(5));

	// star1
	this.winStar1 = new lib.str_inner();
	this.winStar1.setTransform(68,60,1,1,0,0,0,36.9,38.5);
	this.winStar1.alpha = 0.602;

	this.timeline.addTween(cjs.Tween.get(this.winStar1).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.012},0).wait(5));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(29.1,19.5,225.8,81.1);


(lib.star_light_small = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// レイヤー 1
	this.star_light_small = new lib.star_light_small_inner();
	this.star_light_small.setTransform(61.3,62.2,1,1,0,0,0,62.5,62.5);
	this.star_light_small.alpha = 0.301;

	this.timeline.addTween(cjs.Tween.get(this.star_light_small).to({x:62.5,y:62.5,alpha:1},10).to({alpha:0.301},10).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-1.2,-0.3,125,125);


(lib.star_light_big = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// レイヤー 1
	this.star_light_big_inner = new lib.star_light_big_inner();
	this.star_light_big_inner.setTransform(59.4,59.4,1,1,0,0,0,59.4,59.4);

	this.timeline.addTween(cjs.Tween.get(this.star_light_big_inner).to({alpha:0.301},10).to({alpha:1},10).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,118.8,118.8);


(lib.notice = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_19 = function() {
		this.stop();
		if(exportRoot.changeFlg == 1){
		    this.parent.gotoAndPlay('changeLight');
		}
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(19).call(this.frame_19).wait(1));

	// noticenormal
	this.instance = new lib.reachImg();
	this.instance.setTransform(271,-2,0.5,0.5);
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(5).to({_off:false},0).to({_off:true},10).wait(5));

	// noticeShade
	this.noticeInner = new lib.noticeInner();
	this.noticeInner.setTransform(110,25,1,1,0,0,0,110,25);

	this.timeline.addTween(cjs.Tween.get(this.noticeInner).to({x:381},4).wait(1).to({alpha:0.012},0).wait(10).to({alpha:1},0).to({x:651},4).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,220,50);


(lib.light_beam = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// レイヤー 1
	this.beam_inner = new lib.beam_inner();
	this.beam_inner.setTransform(175.1,262.5,1,1,0,0,0,244.7,326.9);
	this.beam_inner.alpha = 0.102;

	this.timeline.addTween(cjs.Tween.get(this.beam_inner).to({rotation:9.1,x:175,alpha:1},15).to({regX:244.6,rotation:19.5,alpha:0.102},16).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-69.6,-64.4,489.4,653.7);


(lib.coupon = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(4));

	// description
	this.text = new cjs.Text(storeCouponName, "20px 'Osaka'", "#FF0000");
	this.text.textAlign = "center";
	this.text.lineHeight = 22;
	this.text.lineWidth = 228;
	this.text.setTransform(124,105);

	this.timeline.addTween(cjs.Tween.get(this.text).wait(4));

	// store_txt
	this.text_1 = new cjs.Text(storeName, "18px 'Osaka'", "#333333");
	this.text_1.textAlign = "center";
	this.text_1.lineHeight = 20;
	this.text_1.lineWidth = 229;
	this.text_1.setTransform(123.5,67.5);

	this.timeline.addTween(cjs.Tween.get(this.text_1).wait(4));

	// coupon
	this.coupon_bg = new lib.coupon_bg();
	this.coupon_bg.setTransform(125,87.2,1,1,0,0,0,125,87.2);

	this.timeline.addTween(cjs.Tween.get(this.coupon_bg).wait(4));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,250,174.6);


(lib.changeLight = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// changeLight
	this.changeLightInner = new lib.changeLightInner();
	this.changeLightInner.setTransform(160.6,210.6,1,1,0,0,0,163.1,213.1);
	this.changeLightInner.alpha = 0.5;

	this.timeline.addTween(cjs.Tween.get(this.changeLightInner).wait(1).to({alpha:0.102},0).wait(4));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-2.5,-2.5,326.2,426.2);


(lib.change = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_19 = function() {
		this.stop();
		this.parent.gotoAndPlay('changeLight');
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(19).call(this.frame_19).wait(1));

	// noticenormal
	this.instance = new lib.changeImg();
	this.instance.setTransform(271,-1,0.5,0.5);
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(5).to({_off:false},0).to({_off:true},10).wait(5));

	// noticeShade
	this.changeInner = new lib.changeInner();
	this.changeInner.setTransform(110,25,1,1,0,0,0,110,25);

	this.timeline.addTween(cjs.Tween.get(this.changeInner).to({x:381},4).wait(1).to({alpha:0.012},0).wait(10).to({alpha:1},0).to({x:651},4).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,220,50);


(lib.couponArea = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_14 = function() {
		this.stop();
		exportRoot.tapObj.addEventListener('click', function(){
			location.href = nextUrl;
		})
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(14).call(this.frame_14).wait(1));

	// star_light_big
	this.instance = new lib.star_light_big();
	this.instance.setTransform(52,39.4,0.811,0.811,0,0,0,59.4,59.4);

	this.instance_1 = new lib.star_light_big();
	this.instance_1.setTransform(235,139.4,0.811,0.811,0,0,0,59.4,59.4);

	this.instance_2 = new lib.star_light_big();
	this.instance_2.setTransform(37.6,-93.1,1,1,0,0,0,59.4,59.4);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance_2},{t:this.instance_1},{t:this.instance}]}).wait(15));

	// star_light
	this.instance_3 = new lib.star_light_small();
	this.instance_3.setTransform(247.5,189.3,1,1,-175.3,0,0,62.5,62.6);

	this.instance_4 = new lib.star_light_small();
	this.instance_4.setTransform(148.7,-96.9,1,1,-71.5,0,0,62.5,62.6);

	this.instance_5 = new lib.star_light_small();
	this.instance_5.setTransform(69.9,105.3,1,1,166.3,0,0,62.6,62.6);

	this.instance_6 = new lib.star_light_small();
	this.instance_6.setTransform(233.5,25.5,1,1,0,0,0,62.5,62.5);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance_6},{t:this.instance_5},{t:this.instance_4},{t:this.instance_3}]}).wait(15));

	// medal
	this.medal = new lib.medal();
	this.medal.setTransform(267.9,-94.3,0.378,0.378,131.7,0,0,50,50);
	this.medal._off = true;

	this.timeline.addTween(cjs.Tween.get(this.medal).wait(6).to({_off:false},0).to({regX:50.1,regY:49.8,scaleX:0.71,scaleY:0.71,rotation:-17.1,x:268,y:-98.9},3).to({scaleX:0.71,scaleY:0.71,rotation:-16.8,y:-99.1},2).to({regX:50.2,scaleX:0.8,scaleY:0.79,rotation:-16.6,x:268.1,y:-99.2},1).to({regX:50.1,regY:50,scaleX:0.7,scaleY:0.7,rotation:-16.5,x:268,y:-99.3},2).wait(1));

	// win_flg
	this.win_flg = new lib.win_flg();
	this.win_flg.setTransform(149.8,-83.7,0.194,0.194,0,0,0,155.6,30.4);

	this.timeline.addTween(cjs.Tween.get(this.win_flg).to({scaleX:0.87,scaleY:0.87,x:150.8},6).wait(9));

	// coupon
	this.couponMC = new lib.coupon();
	this.couponMC.setTransform(148,67,0.192,0.192,0,0,0,125,87.3);

	this.timeline.addTween(cjs.Tween.get(this.couponMC).to({regY:87.2,scaleX:1,scaleY:1},6).wait(9));

	// beam
	this.light_beam = new lib.light_beam();
	this.light_beam.setTransform(146,67.5,1,1,0,0,0,175,262.5);

	this.timeline.addTween(cjs.Tween.get(this.light_beam).wait(15));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-98.6,-259.4,489.4,653.7);


(lib.jackpot_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{stop:0,"start":5,notice:10,change:15,star1:20,star2:25,star3:30,"final":35,changeLight:40});

	// timeline functions:
	this.frame_0 = function() {
		this.stop();
	}
	this.frame_5 = function() {
		this.stop();
		
		var n1 = this.jackTxt1;
		var n2 = this.jackTxt2;
		var n3 = this.jackTxt3;
		
		// 7の数字以外を変数にランダムに渡す
		var numList = [0,1,2,3,4,5,6,8,9];
		var selectNumOneOrigin = Math.floor((Math.random()*10)) % numList.length;
		var selectNumOne = numList[selectNumOneOrigin];
		var selectNumTwoOrigin = Math.floor((Math.random()*10)) % numList.length;
		var selectNumTwo = numList[selectNumTwoOrigin];
		var selectNumThreeOrigin = Math.floor((Math.random()*10)) % numList.length;
		var selectNumThree = numList[selectNumThreeOrigin];
		
		if (selectNumTwo == selectNumOne) {
		    selectNumTwo = 0;
		}
		
		if (selectNumThree == selectNumOne) {
		    selectNumThree = 3;
		}
		
		var _this = this;
		
		
		var couponSlot = {
			start : function(){
				var timer1 = setInterval(function(){
					n1.text = Math.floor(Math.random()*10);
				}, 10);
		
				var timer2 = setInterval(function(){
					n2.text = Math.floor(Math.random()*10);
				}, 10);
		
				var timer3 = setInterval(function(){
					n3.text = Math.floor(Math.random()*10);
				}, 10);
		
				setTimeout(function(){
					clearInterval(timer1);
					n1.text = '7';
					exportRoot.starDisplay = 1;
				}, 2000);
		
				setTimeout(function(){
					clearInterval(timer3);
					if(exportRoot.couponRarity == 1){
						n3.text = selectNumTwo;
					}else{
						n3.text = '7';
						exportRoot.starDisplay = 2;
						_this.gotoAndPlay("notice");
					}
				}, 3000);
		
				setTimeout(function(){
					clearInterval(timer2);
					var timer2Dash = setInterval(function(){
						n2.text = Math.floor(Math.random()*10);
					}, 200);
					setTimeout(function(){
						clearInterval(timer2Dash);
						setTimeout(function(){
							if((exportRoot.couponRarity == 1) || (exportRoot.couponRarity == 2)){
								n2.text = selectNumThree;
							}else{
								n2.text = '7';
								exportRoot.starDisplay = 3;
							}
							
							if(exportRoot.starDisplay == 3){
								_this.gotoAndStop("star1");
							}else if(exportRoot.starDisplay == 2){
								_this.gotoAndStop("star2");
							}else if(exportRoot.starDisplay == 1){
								_this.gotoAndStop("star3");
							}
						}, 500);
					}, 1000);
				}, 5000);
			},
			change : function(){
				var timer1 = setInterval(function(){
					n1.text = Math.floor(Math.random()*10);
				}, 10);
		
				var timer2 = setInterval(function(){
					n2.text = Math.floor(Math.random()*10);
				}, 10);
		
				var timer3 = setInterval(function(){
					n3.text = Math.floor(Math.random()*10);
				}, 10);
		
				setTimeout(function(){
					clearInterval(timer1);
					n1.text = '7';
				}, 2000);
		
				setTimeout(function(){
					clearInterval(timer3);
					n3.text = selectNumTwo;
				}, 3000);
		
				setTimeout(function(){
					clearInterval(timer2);
					var timer2Dash = setInterval(function(){
						n2.text = selectNumThree;
					}, 200);
					setTimeout(function(){
						clearInterval(timer2Dash);
						_this.gotoAndPlay("change");
					}, 1000);
					setTimeout(function(){
						couponSlot.start();
					}, 2000);
				}, 5000);
			}
		};
		
		if(exportRoot.changeFlg == 1){
			couponSlot.change();
		}else{
			couponSlot.start();
		}
	}
	this.frame_10 = function() {
		this.stop();
	}
	this.frame_15 = function() {
		this.stop();
	}
	this.frame_20 = function() {
		this.stop();
		this.starArea1.gotoAndPlay('start');
	}
	this.frame_25 = function() {
		this.stop();
		this.starArea2.gotoAndPlay('start');
	}
	this.frame_30 = function() {
		this.stop();
		this.starArea3.gotoAndPlay('start');
	}
	this.frame_35 = function() {
		this.stop();
	}
	this.frame_40 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(5).call(this.frame_5).wait(5).call(this.frame_10).wait(5).call(this.frame_15).wait(5).call(this.frame_20).wait(5).call(this.frame_25).wait(5).call(this.frame_30).wait(5).call(this.frame_35).wait(5).call(this.frame_40).wait(5));

	// couponArea
	this.couponArea = new lib.couponArea();
	this.couponArea.setTransform(12,59);
	this.couponArea._off = true;

	this.timeline.addTween(cjs.Tween.get(this.couponArea).wait(35).to({_off:false},0).to({_off:true},5).wait(5));

	// starArea3
	this.starArea3 = new lib.starArea3();
	this.starArea3.setTransform(156,136,1,1,0,0,0,142,60);
	this.starArea3._off = true;

	this.timeline.addTween(cjs.Tween.get(this.starArea3).wait(30).to({_off:false},0).to({_off:true},5).wait(10));

	// starArea2
	this.starArea2 = new lib.starArea2();
	this.starArea2.setTransform(156,136,1,1,0,0,0,142,60);
	this.starArea2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.starArea2).wait(25).to({_off:false},0).to({_off:true},5).wait(15));

	// starArea1
	this.starArea1 = new lib.starArea();
	this.starArea1.setTransform(156.5,137,1,1,0,0,0,142.5,61);
	this.starArea1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.starArea1).wait(20).to({_off:false},0).to({_off:true},5).wait(20));

	// change
	this.change = new lib.change();
	this.change.setTransform(-113,64,1,1,0,0,0,110,25);
	this.change._off = true;

	this.timeline.addTween(cjs.Tween.get(this.change).wait(15).to({_off:false},0).to({_off:true},5).wait(25));

	// notice
	this.notice = new lib.notice();
	this.notice.setTransform(-111,65,1,1,0,0,0,110,25);
	this.notice._off = true;

	this.timeline.addTween(cjs.Tween.get(this.notice).wait(10).to({_off:false},0).to({_off:true},5).wait(30));

	// number
	this.jackTxt3 = new cjs.Text("7", "60px 'Helvetica'", "#FF6600");
	this.jackTxt3.name = "jackTxt3";
	this.jackTxt3.textAlign = "center";
	this.jackTxt3.lineHeight = 62;
	this.jackTxt3.lineWidth = 55;
	this.jackTxt3.setTransform(231.5,102);

	this.jackTxt2 = new cjs.Text("7", "60px 'Helvetica'", "#FF6600");
	this.jackTxt2.name = "jackTxt2";
	this.jackTxt2.textAlign = "center";
	this.jackTxt2.lineHeight = 62;
	this.jackTxt2.lineWidth = 55;
	this.jackTxt2.setTransform(157.5,102);

	this.jackTxt1 = new cjs.Text("7", "60px 'Helvetica'", "#FF6600");
	this.jackTxt1.name = "jackTxt1";
	this.jackTxt1.textAlign = "center";
	this.jackTxt1.lineHeight = 62;
	this.jackTxt1.lineWidth = 55;
	this.jackTxt1.setTransform(83.7,102);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.jackTxt1},{t:this.jackTxt2},{t:this.jackTxt3}]}).wait(45));

	// changeLight
	this.changeLight = new lib.changeLight();
	this.changeLight.setTransform(161.9,112.6,1,1,0,0,0,163.1,213.1);
	this.changeLight._off = true;

	this.timeline.addTween(cjs.Tween.get(this.changeLight).wait(40).to({_off:false},0).wait(5));

	// jackpot_bg
	this.instance = new lib.jackpot();
	this.instance.setTransform(0,0,0.5,0.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(45));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,320,230);


(lib.main = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{"stop":0,move:5});

	// timeline functions:
	this.frame_14 = function() {
		this.stop();
		this.jackpot.gotoAndStop("start");
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(14).call(this.frame_14).wait(1));

	// jackpot
	this.jackpot = new lib.jackpot_1();
	this.jackpot.setTransform(160,-117,1,1,0,0,0,160,115);

	this.timeline.addTween(cjs.Tween.get(this.jackpot).wait(5).to({y:214.3},5).to({y:207.7},2).to({y:213},2).wait(1));

	// bg
	this.instance = new lib.bg();
	this.instance.setTransform(0,0,0.5,0.501);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(15));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,-232,320,649);

})(lib = lib||{}, images = images||{}, createjs = createjs||{});
var lib, images, createjs;