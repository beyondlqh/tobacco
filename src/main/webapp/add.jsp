<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Product</title>
</head>
<body>
	<center>
		<div id="header_index">
			<h1>
				<a href="index.html" title="烟草防伪与追溯系统">烟草防伪与追溯系统</a>
			</h1>
		</div>
		<form action=Add method="post">
			<table border="0">
				<tr>
					<td align="right">产品编号</td>
					<td align="left"><input type="text" name="PID"></td>
				</tr>
				<tr>
					<td align="right">产品名称</td>
					<td align="left"><input type="text" name="Name"></td>
				</tr>
				<tr>
					<td align="right">生产厂家</td>
					<td align="left"><input type="text" name="Factory"></td>
				</tr>
				<tr>
					<td align="right">生产日期</td>
					<td align="left"><input type="text" name="Date"></td>
				</tr>
				<tr>
					<td align="right">产品批号</td>
					<td align="left"><input type="text" name="Batch"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="radio"
						name="CryptoFlag" checked="checked" value="DES">DES <input
						type="radio" name="CryptoFlag" value="DESede">3DE<input
						type="radio" name="CryptoFlag" value="SM4">SM4</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="保存"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>