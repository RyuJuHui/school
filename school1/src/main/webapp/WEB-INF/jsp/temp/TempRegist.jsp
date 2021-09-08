<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://egovframework.gov/ctl/ui" prefix="ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기~ </title>
</head>
<body>
   * 등록용
<form action="/temp/tempSelect.do" method="post" name="frm">
	<label for="tempVal">값 정보 : </label>
	<!-- label, input 연결 시킬 수 있어서 같이 씀 -->
	<input type="text" id="tempVal" name="tempVal">
	<br/>
	<button type="submit">등록</button>
</form>
</body>
</html>