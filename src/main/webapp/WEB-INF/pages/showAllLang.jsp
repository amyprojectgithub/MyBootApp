<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2 style="color: red; text-align: center">:::::All Languages:::::</h2>
<div align="center">
	<c:choose>
		<c:when test="${!empty langList}">
				<c:forEach var="lang" items="${langList }">
					${lang}<br>
				</c:forEach>
		</c:when>
		<c:otherwise>
			<h2 style="color: red">No Language found!!!!</h2>
		</c:otherwise>
	</c:choose>
</div>