<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
<link rel="stylesheet" type="text/css" href="res/css/Home.css" />
<script src="res/js/bon.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
<style>
span {
	margin: 5px;
	color: #000000;
}

#top {
	text-align: right;
	background-color: #BDBDBD;
}

#btn {
	color: #ffffff;
	height: 30px;
	border: 1px solid #000000;
	font-weight: 800;
	background-color: #000000;
	cursor: pointer;
}

#sideMenu {
	background-color: #BDBDBD;
	position: absolute;
	height: 95%;
	width: 18%;
	float: left;
}

#middle {
	color: #000000;
	position: absolute;
	top: 5%;
	left: 20%;
	font-weight: 800;
	font-size: 15pt;
}

#bottom {
	position: absolute;
	top: 96%;
	width: 98.7%;
	height: 30px;
	line-height: 30px;
	background-color: #BDBDBD;
	text-align: right;
	font-weight: 800;
}

h2 {
	font-size: 15pt;
	margin: 20px 0 20px 20px;
}

.menuContainer {
	width: 90%;
	margin: 0 auto;
}

.managements {
	margin-bottom: 13pt;
	background: #fff;
}

.menuTitle {
	padding: 5px;
	color: #fff;
	background: #333;
	cursor: pointer;
	text-align: center;
}

.items {
	padding: 0 20px 3px 20px;
	font-size: 10pt;
	text-align: center;
	}

.container {
   background-color: gray;
   background: rgba(0, 0, 0, 0.4);
   position: absolute;
   width: 100%;
   min-height: 100%;
   left: 0;
   top: 0;
   text-align:center;
}

.mdialog {border :2px solid white;
   border-radius: 25px;
   background-color: #ffffff;
   position: absolute;
   top: 50%;
   left: 50%;
   width: 60%;
   height: 450px;
   transform: translate(-50%,-50%);
}
</style>
</head>
<body onLoad= "closeModal()">
	<div class=circle></div>
	<div class=circle2></div>
	<div class=circle3></div>
	<div class=circle4></div>
	<div class=crcle5></div>
	<div class=circle6></div>

	<div class="logo">
		<div class="zero">
			<br>
			<div class="one"></div>
		</div>
		<div class="hp">
			H E L P
			<div id="plan">Health Plan</div>
		</div>
	</div>

	<div class="underLine"></div>
	<div class="text">
		Do your<br>best work
	</div>

	<div class="somebody">Made by :: SOMEBODY</div>
	<div class="logIn">
		<input class="log" type="button" value="Log In" onClick = "meLogInModal()" />
	</div>
	
	
	<!-- ?????? ??????-->
	<form name = "dynamicFormdata" action = "meLogin" method = "post">
	<div class="container" id="container">
		<div class="mdialog">
			<div class="mcontent">
				<!-- ???????????? -->
				<div class="hp" id = "mheader">
						H E L P
			<div id="plan" class="mtitle">Health Plan</div>
		</div>
				<!-- ?????? ?????? -->
				<div class="mbody" id="mbody">
				<div >ID</div>
				<input type='text' class='id' name = 'meCode' placeholder='???????????? ???????????????'/>
				<div>Password</div>	
				<input type='password' class='pw' name = 'mePw' />
				<input class="login" type="button" value="?????????" onClick = "meLogIn()" />
				<input class="login" type="button" value="????????????????????? ??????" onClick = "ctLogInModal()" />
				</div>
				<!-- ?????? ?????? <div id = "list">${list} </div> -->
				<div class="mfooter">
					<button type="button" class="mbtn" value = "??????????????????" onclick="modPw()">???????????? ??????</button>
					<button type="button" class="mbtn" value = "????????????" onclick="goMeJoinPage()">????????????</button>
					<button type="button" class="mbtn" value = "????????????" onclick="ctJoinForm()">????????????</button>
					${meInfo} 
				</div>
				
			</div>
		</div>
	</div>
	</form>
	
	
		<form name = "dynamicFormdata2" action = "ctLogin" method = "post">
	<div class="containerSF" id="containerSF">
		<div class="mdialog">
			<div class="mcontent">
				<!-- ???????????? -->
				<div class="hp" id = "mheader">
						H E L P
			<div id="plan" class="mtitle">Health Plan</div>
		</div>
				<!-- ?????? ?????? -->
				<div class="mbody" id="mbody">
				<div >Center Business number</div>
				<input type='text' class='id' name = 'sfCtCode' placeholder='?????????????????? ???????????????'/>
				<div >Staff code</div>
				<input type='text' class='id' name = 'sfId' placeholder='????????? ???????????????'/>
				<div>Password</div>	
				<input type='password' class='pw' name = 'sfPw' />
				<input class="login" type="button" value="???????????????" onClick = "ctLogIn()" />
				</div>
				<!-- ?????? ?????? <div id = "list">${list} </div> -->
				<div class="mfooter">
					<button type="button" class="mbtn" value = "??????????????????" onclick="modPw()">???????????? ??????</button>
					<button type="button" class="mbtn" value = "????????????" onclick="goMeJoinPage()">????????????</button>
					<button type="button" class="mbtn" value = "????????????" onclick="ctJoinForm()">????????????</button>
					${sfInfo} 
				</div>
				
			</div>
		</div>
	</div>
	</form>
</body>
</html>