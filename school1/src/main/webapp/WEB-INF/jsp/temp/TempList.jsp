<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://egovframework.gov/ctl/ui" prefix="ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 목록~ </title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
	<div>
		게시물 총 수 : <c:out value="${paginationInfo.totalRecordCount}"/>건
	   <table border="1">
	    <caption>이 표는 TEMP_ID와 TEMP_VAL로 구성되어 있는 표</caption>
	   	<thead>
		   	<tr>
		   		<th>TEMP_ID</th>
		   		<th>TEMP_VAL</th>
		   	</tr>
	   	</thead>
	   	<tbody>
	   		<c:forEach var="item" items="${list}">
	   			<tr>
		   			<td><c:out value="${item.tempId}"/></td>
		   			<%-- 
		   				간단하게 쓸 때는 변수명만 쓰는 경우가 있는데
		   				해킹 등 위험이 있어서 <c:out>태그 사용함
		   			 --%>
		   			<td>
		   				<!-- 변수들이 여러개일땐 <a>태그 계속 사용하기 힘들어서? -->
		   				<!-- value에 적어준 PK값 읽어서 파라미터로 보내줌 -->
		   				<c:url var="viewUrl" value="/temp/select.do">
		   					<c:param name="tempId" value="${item.tempId}"/>
		   				</c:url>
		   				<a href="${viewUrl}"><c:out value="${item.tempVal}"/></a>
		   			</td>
		   			<td>
		   				<c:url var="delUrl" value="/temp/delete.do">
		   					<c:param name="tempId" value="${item.tempId}"/>
		   				</c:url>
		   				<a href="${delUrl}" class="btn-del">삭제</a>
		   			</td>
		   		</tr>
	   		</c:forEach>
	   	</tbody>
	   	<tfoot>
	   		<!-- 이 table에 관한 결과를 나타낼 때 사용
	   			결과값을 중요하게 보는 곳은 tfoot을 tbody 앞에 사용하기도 함
	   			사용자가 보는 화면에서는 하단에 그대로 적용됨
	   		 -->
	   	</tfoot>
	   </table>
	
<%--    <div id="paging_div">
	<ul class="paging_align">
   		<c:url var="pageUrl" value="/temp/tempList.do"/>
   		<c:set var="pagingParam"><c:out value="${pageUrl}"/></c:set>
   		<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="${pagingParam}" />
   	</ul>
   </div> --%>
   </div>
   <button type="button" id="btn-reg" data-href="/temp/tempRegist.do">
   		등록하기
   </button>
   
   <script>
   $(document).ready(function(){
	   $("#btn-reg").click(function(){
		  location.href = $(this).data("href"); 
	   });
	   
	   $(".btn-del").click(function(){
		  if(!confirm("삭제하시겠습니까?")){
			  return false;
		  } 
	   });
   });
   </script>
</body>
</html>