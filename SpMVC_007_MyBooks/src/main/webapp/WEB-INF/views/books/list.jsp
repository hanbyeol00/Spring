<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class="book">도서정보</h1>
	<table class="book">
		<thead>
			<tr>
				<th>ISBN</th>
				<th>도서명</th>
				<th>저자</th>
				<th>출판사</th>
				<th>가격</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${BOOKS}" var="BOOK">
				<tr>
					<td>${BOOK.isbn}</td>
					<td>${BOOK.title}</td>
					<td>${BOOK.author}</td>
					<td>${BOOK.publisher}</td>
					<td>${BOOK.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>