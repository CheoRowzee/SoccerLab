<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>

<h1>Member's List</h1>
<table border="1">

			<c:forEach var="member" items="${test}">
				<tr>
					<td>${member.membername}</td>
					<td>${member.memberrole}</td>
				</tr>

			</c:forEach>
		</table>


</body>
</html>