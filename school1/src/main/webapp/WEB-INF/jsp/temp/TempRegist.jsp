<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://egovframework.gov/ctl/ui" prefix="ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:choose>
	<c:when test="${not empty searchVO.tempId}">
		<c:set var="actionUrl" value="/temp/update.do" />
	</c:when>
	<c:otherwise>
		<c:set var="actionUrl" value="/temp/insert.do"/>
	</c:otherwise>
</c:choose>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기~ </title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
   * 등록폼
<form action="${actionUrl}" method="post" name="tempVO">
	<input type="hidden" name="tempId" value="${result.tempId}">
	<label for="tempVal">값 정보 : </label>
	<input type="text" id="tempVal" name="tempVal" value="${result.tempVal}">
	<br/>
	<button type="submit">등록</button>
</form>
</body>
</html>