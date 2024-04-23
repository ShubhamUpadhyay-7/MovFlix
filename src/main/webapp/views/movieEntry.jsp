<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MovFlix - Add New Movie</title>
  </head>
  <body>
    <h1>Add New Movie</h1>
    <form action="/save" method="post">
      <label for="movieId">Enter Movie ID:</label>
      <input type="text" id="movieId" name="movieId" required /><br />

      <label for="movieName">Enter Movie Name:</label>
      <input type="text" id="movieName" name="movieName" required /><br />

      <label for="collection">Enter Movie Collection:</label>
      <input type="number" id="collection" name="collection" required /><br />

      <input type="submit" value="Save" />
    </form>
  </body>
</html>
