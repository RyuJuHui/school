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
<%--    결과 값 : ${result.tempVal} --%>
   <table>
   	<thead>
   	<th>
   		<tr>TEMP_ID</tr>
   		<tr>TEMP_VAL</tr>
   	</th>
   	</thead>
   	<tbody>
   		<c:forEach var="item" items="${list}">
   		<tr>
   			<td>${item.tempId}</td>
   			<td>${item.tempVal}</td>
   		</c:forEach>
   		</tr>
   	</tbody>
   </table>
</body>
</html>