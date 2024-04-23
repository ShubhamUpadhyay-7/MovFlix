<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MovFlix - Movie Details</title>
  </head>
  <body>
    <h1>Movie Details</h1>
    <c:if test="${empty movie}">
      <p>Sorry, no match found for this search criteria.</p>
      <a href="/home">Home</a>
    </c:if>
    <c:if test="${not empty movie}">
      <table border="1">
        <tr>
          <th>Movie ID:</th>
          <th>Movie Name:</th>
          <th>Movie Collection</th>
        </tr>
        <tr>
          <td>${movie.movieId}</td>
          <td>${movie.movieName}</td>
          <td>${movie.collection}</td>
        </tr>
      </table>
    </c:if>
  </body>
</html>
