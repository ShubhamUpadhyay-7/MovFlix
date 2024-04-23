<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MovFlix - Search by Collection</title>
  </head>
  <body>
    <h1>Search by Collection</h1>
    <form action="/findByCollection" method="post">
      <label for="collection">Enter the Collection:</label>
      <input
        type="text"
        pattern="[0-9]*"
        id="collection"
        name="collection"
        required
      />
      <button type="submit">Search</button>
    </form>
  </body>
</html>
