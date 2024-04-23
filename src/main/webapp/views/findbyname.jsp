<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MovFlix - Search by Movie Name</title>
  </head>
  <body>
    <h1>Search by Movie Name</h1>
    <form action="/findByMovieName" method="post">
      <label for="movieName">Enter the Movie Name:</label>
      <input type="text" id="movieName" name="movieName" required />
      <button type="submit">Search</button>
    </form>
  </body>
</html>
