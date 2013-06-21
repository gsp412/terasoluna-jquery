<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="/struts-html" prefix="html" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-logic" prefix="logic" %>
<%@ taglib uri="/terasoluna-struts" prefix="ts" %>
<%@ taglib uri="/terasoluna" prefix="t" %>
<%@ taglib uri="/terasoluna-library" prefix="tl" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=shift_jis">
<!-- ************* CSSを読み込む ************* -->
<link rel="stylesheet" type="text/css" href="../css/list.css" />
<!-- ************* jQueryを読み込む ************* -->
<script type="text/javascript" src="../javascript/jquery-1.10.1.min.js"></script>
<!-- ************* Javascriptを読み込む ************* -->
<script type="text/javascript" src="../javascript/list.js"></script>
<title>一覧表示画面</title>
</head>

<body>
<table border="0" style="width:100%;">
    <tr>
        <td align="center">
            <html:img module="/" page="/image/terasoluna_logo.gif" />
        </td>
    </tr>
    <tr>
        <td align="center">
            <h2>
                一覧表示画面(jQuery版)
            </h2>
        </td>
    </tr>
</table>

<html:messages id="message" message="true">
    <bean:write name="message"/>
</html:messages>

<p align="center">
名前：<input type="text" id="paraName" />
<input type="submit" id="kensaku" value="検索" />
</p>

<!-- ************************  ******************************** -->
<div align="center">
<h2>XMLによる通信</h2>
<table class="tableHead">
	<tr>
		<td class="col_id">ID</td>
		<td class="col_name">NAME</td>
		<td class="col_age">AGE</td>
		<td class="col_birth">BIRTH</td>
	</tr>
</table>
<div id="list01div">
<table class="tableData">
	<col class="col_id"></col>
	<col class="col_name"></col>
	<col class="col_age"></col>
	<col class="col_birth"></col>
	<tbody id="tableData">

	</tbody>
</table>
</div>
</div>
<hr>

<!-- ************************  ******************************** -->
<!-- ************************  ******************************** -->

<div align="center">
<h2>JSONによる通信</h2>
<table class="tableHead">
	<tr>
		<td class="col_id">ID</td>
		<td class="col_name">NAME</td>
		<td class="col_age">AGE</td>
		<td class="col_birth">BIRTH</td>
	</tr>
</table>
<div id="list01div2">
<table class="tableData">
	<col class="col_id"></col>
	<col class="col_name"></col>
	<col class="col_age"></col>
	<col class="col_birth"></col>
	<tbody id="tableData2">

	</tbody>
</table>
</div>
</div>
<hr>
<!-- ************************  ******************************** -->

<ts:link page="/logon/menuSCR.do">メニュー</ts:link>

</body>
</html:html>