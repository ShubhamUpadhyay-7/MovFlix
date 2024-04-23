<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MovFlix - Search by Movie Collection</title>
  </head>
  <body>
    <h1>Search by Movie Collection</h1>
    <form action="/searchByCollection" method="get">
      <label for="minCollection">Minimum Collection:</label>
      <input
        type="number"
        id="minCollection"
        name="minCollection"
        required
      /><br />

      <label for="maxCollection">Maximum Collection:</label>
      <input
        type="number"
        id="maxCollection"
        name="maxCollection"
        required
      /><br />

      <input type="submit" value="Search" />
    </form>
    <br />
    <a href="/home">Go to Home</a>
  </body>
</html>
