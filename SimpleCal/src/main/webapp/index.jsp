<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#cal_table{
		width: 400px;
		height: 400px;
		text-align: center;
	}
	#inputText1{
		width: 100%;
		height: 100%;
		font-size: xx-large;
	}
	.btnNum{
		width: 100%;
		height: 100%;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<h1>계산기</h1>
	<input id="inputText2" readonly="readonly" />
	
	<table id="cal_table" border="1">
		<tr>
			<td colspan="4">
				<input id="inputText1" type="text" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td><input type="button" class="btnNum" id="C" value="C" onClick="add('C')" /></td>
			<td><input type="button" class="btnNum" id="1" value="1" onClick="add('')" /></td>
			<td><input type="button" class="btnNum" id="1" value="1" onClick="add('')" /></td>
			<td><input type="button" class="btnNum" id="div" value="/" onClick="calc('/')" /></td>
		</tr>
		<tr>
			<td><input type="button" class="btnNum" id="7" value="7" onClick="add('7')" /></td>
			<td><input type="button" class="btnNum" id="8" value="8" onClick="add('8')" /></td>
			<td><input type="button" class="btnNum" id="9" value="9" onClick="add('9')" /></td>
			<td><input type="button" class="btnNum" id="mul" value="X" onClick="calc('x')" /></td>
		</tr>
		<tr>
			<td><input type="button" class="btnNum" id="4" value="4" onClick="add('4')" /></td>
			<td><input type="button" class="btnNum" id="5" value="5" onClick="add('5')" /></td>
			<td><input type="button" class="btnNum" id="6" value="6" onClick="add('6')" /></td>
			<td><input type="button" class="btnNum" id="sub" value="-" onClick="calc('-')" /></td>
		</tr>
		<tr>
			<td><input type="button" class="btnNum" id="1" value="1" onClick="add('1')" /></td>
			<td><input type="button" class="btnNum" id="2" value="2" onClick="add('2')" /></td>
			<td><input type="button" class="btnNum" id="3" value="3" onClick="add('3')" /></td>
			<td><input type="button" class="btnNum" id="plus" value="+" onClick="calc('+')" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" class="btnNum" id="0" value="0" onClick="add('0')" /></td>
			<td><input type="button" class="btnNum" id="dot" value="." onClick="add('.')" /></td>
			<td><input type="button" class="btnNum" id="result" value="=" onClick="calc('=')" /></td>
		</tr>
	</table>
<script type="text/javascript">
	
	var btn_one = document.querySelector("#btn_one");
	var txt1 = document.querySelector("#inputText1");
	var txt2 = document.querySelector("#inputText2");
	var num1 = 0;
	var num2 = 0;
	
	function add(str){
		
		txt1.value += str;
	}
	
	function calc(str){
		
		if(str == '+' || str == '-' || str == '*' || str == '/' || str == '='){
			
			if(str == '+'){
				
				num1 += Number(txt1.value);
				txt2.value = num1;
				txt1.value = "";
			}
			
			if(str == '='){
				
				num2 = txt1.value;
			
				var result = num1 + num2;
				
				txt1.value = result;
			}
		}
	}
	
</script>
</body>
</html>