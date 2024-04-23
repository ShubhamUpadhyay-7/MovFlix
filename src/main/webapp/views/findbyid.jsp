<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MovFlix - Search by Movie ID</title>
  </head>
  <body>
    <h1>Search by Movie ID</h1>
    <form action="/findByMovieId" method="post">
      <label for="movieId">Enter the Movie ID:</label>
      <input type="text" id="movieId" name="movieId" required />
      <button type="submit">Search</button>
    </form>
  </body>
</html>
