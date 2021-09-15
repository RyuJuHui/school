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
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
   결과 값 : ${result.tempVal}
<div class="box-btn">
	<c:url var="uptUrl" value="/temp/tempRegist.do">
		<c:param name="tempId" value="${result.tempId}"/>	
	</c:url>
	<a href="${uptUrl}">수정</a>
	
	<c:url var="delUrl" value="/temp/delete.do">
		<c:param name="tempId" value="${result.tempId}"/>
	</c:url>
	<a href="${delUrl}">삭제</a>
	
	<a href="/temp/tempList.do">목록</a>
</div>
<script>
$(document).ready(function(){
	$(".btn.del").click(function(){
		if(!confirm("삭제하시겠습니까?")){
			return else;
		}
	});
});
</script>
</body>
</html>