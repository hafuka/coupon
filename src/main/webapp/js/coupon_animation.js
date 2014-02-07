(function (lib, img, cjs) {

var p; // shortcut to reference prototypes

// stage content:
(lib.coupon_animation_kai = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		this.main.gotoAndPlay("move");
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(1));

	// マスク (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	mask.graphics.p("EgY/AlfMAAAhK+MAx/AAAMAAABK+g");
	mask.setTransform(160,240);

	// main
	this.main = new lib._default();
	this.main.setTransform(160,240,1,1,0,0,0,160,240);

	this.main.mask = mask;

	this.timeline.addTween(cjs.Tween.get(this.main).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(160,240,320,480);


// symbols:
(lib.bg = function() {
	this.initialize(img.bg);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,960);


(lib.big = function() {
	this.initialize(img.big);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,120,120);


(lib.changeImg = function() {
	this.initialize(img.changeImg);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,440,100);


(lib.changeImgShade = function() {
	this.initialize(img.changeImgShade);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,440,100);


(lib.coupon_sr = function() {
	this.initialize(img.coupon_sr);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,470,520);


(lib.jackpot = function() {
	this.initialize(img.jackpot);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,380);


(lib.light = function() {
	this.initialize(img.light);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,960);


(lib.onepx = function() {
	this.initialize(img.onepx);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,1,1);


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
p.nominalBounds = new cjs.Rectangle(0,0,480,150);


(lib.star_1 = function() {
	this.initialize(img.star_1);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,960);


(lib.star_2 = function() {
	this.initialize(img.star_2);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,480,440);


(lib.star_large = function() {
	this.initialize(img.star_large);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,162,162);


(lib.star_small = function() {
	this.initialize(img.star_small);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,125,125);


(lib.white_bg = function() {
	this.initialize(img.white_bg);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,640,420);


(lib.シンボル1 = function() {
	this.initialize();

	// レイヤー 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("rgba(0,0,153,0.098)").s().p("Aq7FIQkhiIgBjAQABi/EhiJQEjiIGYAAQGZAAEjCIQEhCJABC/QgBDAkhCIQkjCJmZAAQmYAAkjiJg");

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-99,-46.5,198,93);


(lib.whiteLight = function() {
	this.initialize();

	// レイヤー 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("EgY5AlfMAAAhK9MAxzAAAMAAABK9g");
	this.shape.setTransform(159.5,240);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,319,480);


(lib.tween3 = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.star_large();
	this.instance.setTransform(-57.8,5.3,0.507,0.507,-50.2);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-57.8,-57.8,115.7,115.7);


(lib.tween2 = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.star_large();
	this.instance.setTransform(-57.8,5.3,0.507,0.507,-50.2);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-57.8,-57.8,115.7,115.7);


(lib.tween1 = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.star_large();
	this.instance.setTransform(-57.8,5.3,0.507,0.507,-50.2);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-57.8,-57.8,115.7,115.7);


(lib.textTween2 = function() {
	this.initialize();

	// レイヤー 1
	this.text = new cjs.Text(storeName, "20px 'Osaka'", "#000066");
	this.text.textAlign = "center";
	this.text.lineHeight = 21;
	this.text.lineWidth = 100;
	this.text.setTransform(-2,-12.4);

	this.addChild(this.text);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-52,-12.4,104,25);


(lib.textTween1 = function() {
	this.initialize();

	// レイヤー 1
	this.text = new cjs.Text(storeName, "20px 'Osaka'", "#000066");
	this.text.textAlign = "center";
	this.text.lineHeight = 21;
	this.text.lineWidth = 100;
	this.text.setTransform(-2,-12.4);

	this.addChild(this.text);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-52,-12.4,104,25);


(lib.tapTxtInner = function() {
	this.initialize();

	// レイヤー 1
	this.text = new cjs.Text("TAP", "40px 'Helvetica'", "#333333");
	this.text.textAlign = "center";
	this.text.lineHeight = 42;
	this.text.lineWidth = 96;
	this.text.setTransform(48,0);

	this.addChild(this.text);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,100,53.4);


(lib.successStar1 = function() {
	this.initialize();

	// レイヤー 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f().s("#FF3333").ss(3,1,1).p("AHyEKIl5hPIjOFDIgpl+IlzhiIFeibIgVmAIEAEdIFmiLIi/FNg");
	this.shape.setTransform(49.9,51.1);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFF33").s().p("Ah9B/Il0hhIFeicIgVl/IEAEdIFmiLIi/FNIDzEoIl5hPIjOFDg");
	this.shape_1.setTransform(49.9,51.1);

	this.addChild(this.shape_1,this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-1.5,-1.5,102.7,105.1);


(lib.starSmallInner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.star_small();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,125,125);


(lib.ribbon_1 = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.ribbon();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,480,150);


(lib.reachImg_1 = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.reachImgShade();
	this.instance.setTransform(0,0,0.5,0.5);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,220,50);


(lib.medalInner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.coupon_sr();
	this.instance.setTransform(0,0,0.096,0.096);

	// storeText
	this.storeText = new cjs.Text(storeName, "1px 'Osaka'", "#000066");
	this.storeText.name = "storeText";
	this.storeText.textAlign = "center";
	this.storeText.lineHeight = 0;
	this.storeText.lineWidth = 19;
	this.storeText.setTransform(19.4,22.2);

	this.addChild(this.storeText,this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,45.2,50);


(lib.lightWideInner = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.light();
	this.instance.setTransform(0,0,0.5,0.5);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,320,480);


(lib.big_1 = function() {
	this.initialize();

	// レイヤー 1
	this.instance = new lib.big();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,120,120);


(lib.tapTxt = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_9 = function() {
		this.stop();
		setTimeout(function(){
			location.href = nextUrl;
		}, 2000);
		//this.movieClip_1.addEventListener("click", fl_ClickToGoToWebPage_4);

		// function fl_ClickToGoToWebPage_4() {
		// 	window.open("http://www.adobe.com", "_blank");
		// }
		// var a = this.movieClip_1;
		// console.log('いまここ');
		// a.onPress = function() {
		// 	a.onPress = null;
		// 	console.log('ここまできた！');
		// 	location.href = 'http://www.adobe.com';
		// };
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(9).call(this.frame_9).wait(1));

	// レイヤー 2
	this.movieClip_1 = new lib.シンボル1();
	this.movieClip_1.setTransform(53.3,24.6);

	this.timeline.addTween(cjs.Tween.get(this.movieClip_1).wait(10));

	// レイヤー 1
	this.tapTxt = new lib.tapTxtInner();
	this.tapTxt.setTransform(50,26.7,1,1,0,0,0,50,26.7);
	this.tapTxt.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.tapTxt).to({alpha:1},8).wait(2));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-45.7,-21.9,198,93);


(lib.starSmall = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// レイヤー 1
	this.instance = new lib.starSmallInner();
	this.instance.setTransform(52.5,62.5,1,1,0,0,0,62.5,62.5);
	this.instance.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance).to({alpha:1},15).to({alpha:0},15).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-10,0,125,125);


(lib.starBig = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// レイヤー 1
	this.instance = new lib.tween1("synched",0);
	this.instance.setTransform(57.8,57.8);

	this.instance_1 = new lib.tween2("synched",0);
	this.instance_1.setTransform(57.8,57.8);
	this.instance_1.alpha = 0.301;
	this.instance_1._off = true;

	this.instance_2 = new lib.tween3("synched",0);
	this.instance_2.setTransform(57.8,57.8);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance}]}).to({state:[{t:this.instance_1}]},15).to({state:[{t:this.instance_2}]},15).wait(1));
	this.timeline.addTween(cjs.Tween.get(this.instance).to({_off:true,alpha:0.301},15).wait(16));
	this.timeline.addTween(cjs.Tween.get(this.instance_1).to({_off:false},15).to({_off:true,alpha:1},15).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,115.7,115.7);


(lib.lightWide = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// starBig
	this.instance = new lib.starBig();
	this.instance.setTransform(64.3,205.4,1,1,0,0,0,58.8,59.8);

	this.instance_1 = new lib.starBig();
	this.instance_1.setTransform(-74.7,131.7,0.775,0.775,0,0,0,57.8,57.8);

	this.instance_2 = new lib.starBig();
	this.instance_2.setTransform(106.1,-134.5,0.728,0.728,88.2,0,0,57.9,57.8);

	this.instance_3 = new lib.starBig();
	this.instance_3.setTransform(-183.8,-251.8);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance_3},{t:this.instance_2},{t:this.instance_1},{t:this.instance}]}).wait(40));

	// starSmall
	this.instance_4 = new lib.starSmall();
	this.instance_4.setTransform(87.5,149.4,1,1,0,0,0,62.5,62.5);

	this.instance_5 = new lib.starSmall();
	this.instance_5.setTransform(-21,-170,1,1,90,0,0,62.5,62.5);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance_5},{t:this.instance_4}]}).wait(40));

	// wideLight
	this.instance_6 = new lib.lightWideInner();
	this.instance_6.setTransform(0,0,1,1,0,0,0,160,240);
	this.instance_6.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance_6).to({rotation:3.3,alpha:0.801},20).to({regX:160.1,rotation:7.2,x:0.1,alpha:0},19).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-183.8,-251.8,343.8,513.1);


(lib.couponMedal = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{start:0});

	// timeline functions:
	this.frame_20 = function() {
		this.stop();
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(20).call(this.frame_20).wait(1));

	// TAP
	this.tapTxt = new lib.tapTxt();
	this.tapTxt.setTransform(22,166.3,1,1,0,0,0,50,26.7);
	this.tapTxt._off = true;

	this.timeline.addTween(cjs.Tween.get(this.tapTxt).wait(20).to({_off:false},0).wait(1));

	// white
	this.instance = new lib.whiteLight();
	this.instance.setTransform(21.9,19.8,1,1,0,0,0,159.5,240);
	this.instance.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance).to({alpha:0.699},4).to({alpha:0},4).wait(13));

	// big
	this.instance_1 = new lib.big_1();
	this.instance_1.setTransform(-55,-160,0.2,0.2,-90,0,0,60,60);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(11).to({_off:false},0).to({regX:60.1,regY:60.1,scaleX:0.67,scaleY:0.67,rotation:0,x:-62.9,y:-168.9},5).to({regX:60,regY:60,scaleX:0.38,scaleY:0.38,x:-63,y:-169},2).to({scaleX:0.53,scaleY:0.53},2).wait(1));

	// ribbon
	this.instance_2 = new lib.ribbon_1();
	this.instance_2.setTransform(23,-149,0.092,0.092,0,0,0,240.1,75.2);

	this.timeline.addTween(cjs.Tween.get(this.instance_2).to({regX:240,regY:75,scaleX:0.45,scaleY:0.45},7).wait(14));

	// storeText
	this.instance_3 = new lib.textTween1("synched",0);
	this.instance_3.setTransform(22,18.6);
	this.instance_3.alpha = 0;
	this.instance_3._off = true;

	this.instance_4 = new lib.textTween2("synched",0);
	this.instance_4.setTransform(22,18.6);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[]}).to({state:[{t:this.instance_3}]},1).to({state:[{t:this.instance_4}]},9).wait(11));
	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(1).to({_off:false},0).to({_off:true,alpha:1},9).wait(11));

	// レイヤー 1
	this.instance_5 = new lib.medalInner();
	this.instance_5.setTransform(22.6,25,1,1,0,0,0,22.6,25);

	this.timeline.addTween(cjs.Tween.get(this.instance_5).to({scaleX:5.8,scaleY:5.8,x:23.6,y:7},8).to({scaleX:5.52,scaleY:5.52,y:7.1},1).to({scaleX:5.24,scaleY:5.24,y:8},1).to({scaleX:5.44,scaleY:5.44,y:7},2).wait(9));

	// light
	this.instance_6 = new lib.lightWide("synched",0);
	this.instance_6.setTransform(23,20.1,0.139,0.139);

	this.timeline.addTween(cjs.Tween.get(this.instance_6).to({scaleX:1,scaleY:1,mode:"independent"},8).wait(13));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-141,-220.2,322.3,480);


(lib.successStar = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_27 = function() {
		this.stop();
		this.couponMedal.gotoAndPlay("start");
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(27).call(this.frame_27).wait(3));

	// medal
	this.couponMedal = new lib.couponMedal();
	this.couponMedal.setTransform(54,55,1,1,0,0,0,22.6,25);
	this.couponMedal._off = true;

	this.timeline.addTween(cjs.Tween.get(this.couponMedal).wait(27).to({_off:false},0).wait(3));

	// star
	this.instance = new lib.successStar1();
	this.instance.setTransform(50.9,51.1,1,1,0,0,0,49.9,51.1);
	this.instance.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(4).to({alpha:0.602},0).wait(4).to({x:49.9,alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0.199},0).wait(4).to({alpha:0.602},0).wait(4).to({alpha:0},0).wait(6));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-0.5,-1.5,102.7,105.1);


(lib.jackpotMC = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{stop:0,"start":4,reach:10,star:47});

	// timeline functions:
	this.frame_0 = function() {
		this.stop();
	}
	this.frame_4 = function() {
		this.stop();

		var n1 = this.jackTxt1;
		var n2 = this.jackTxt2;
		var n3 = this.jackTxt3;

		var _this = this;

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
			clearInterval(timer2);
			n2.text = '7';
			_this.gotoAndStop("star");
		}, 6000);

		setTimeout(function(){
			clearInterval(timer3);
			n3.text = '7';
			_this.gotoAndPlay("reach");
		}, 3000);
	}
	this.frame_46 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(4).call(this.frame_4).wait(42).call(this.frame_46).wait(9));

	// reach
	this.instance = new lib.reachImg();
	this.instance.setTransform(50,-59,0.5,0.501);
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(23).to({_off:false},0).to({_off:true},15).wait(17));

	// reachShade
	this.instance_1 = new lib.reachImg_1();
	this.instance_1.setTransform(-121,-32,1,1,0,0,0,110,25);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(14).to({_off:false},0).to({x:160},8).to({_off:true},1).wait(15).to({_off:false},0).to({x:440},8).to({_off:true},1).wait(8));

	// success_star
	this.instance_2 = new lib.successStar();
	this.instance_2.setTransform(156.2,98.4,1,1,0,0,0,49.9,51.1);
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(47).to({_off:false},0).wait(8));

	// number
	this.jackTxt3 = new cjs.Text("7", "60px 'Helvetica'", "#FF6600");
	this.jackTxt3.name = "jackTxt3";
	this.jackTxt3.textAlign = "center";
	this.jackTxt3.lineHeight = 62;
	this.jackTxt3.lineWidth = 100;
	this.jackTxt3.setTransform(239.5,67.1);

	this.jackTxt2 = new cjs.Text("7", "60px 'Helvetica'", "#FF6600");
	this.jackTxt2.name = "jackTxt2";
	this.jackTxt2.textAlign = "center";
	this.jackTxt2.lineHeight = 62;
	this.jackTxt2.lineWidth = 100;
	this.jackTxt2.setTransform(160.5,67.1);

	this.jackTxt1 = new cjs.Text("7", "60px 'Helvetica'", "#FF6600");
	this.jackTxt1.name = "jackTxt1";
	this.jackTxt1.textAlign = "center";
	this.jackTxt1.lineHeight = 62;
	this.jackTxt1.lineWidth = 100;
	this.jackTxt1.setTransform(81,67.5);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.jackTxt1},{t:this.jackTxt2},{t:this.jackTxt3}]}).wait(55));

	// main_jackpot
	this.instance_3 = new lib.jackpot();
	this.instance_3.setTransform(0,0,0.5,0.5);

	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(55));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,320,190);


(lib._default = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{"stop":0,move:12});

	// timeline functions:
	this.frame_22 = function() {
		this.stop();
		this.jackpotMC.gotoAndStop("start");
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(22).call(this.frame_22).wait(1));

	// jackpot
	this.jackpotMC = new lib.jackpotMC();
	this.jackpotMC.setTransform(160,-105,1,1,0,0,0,160,95);

	this.timeline.addTween(cjs.Tween.get(this.jackpotMC).wait(12).to({y:239.2},6).to({y:232},2).to({y:238},2).wait(1));

	// jackpotBg
	this.instance = new lib.white_bg();
	this.instance.setTransform(0,133,0.5,0.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(23));

	// bg
	this.instance_1 = new lib.bg();
	this.instance_1.setTransform(0,0,0.5,0.5);

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(23));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,-200,320,680);

})(lib = lib||{}, images = images||{}, createjs = createjs||{});
var lib, images, createjs;