<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Item</title>
</head>
<body>
<h1>Welcome to Register</h1>
<form action="insertItem" method="post">
<pre>
Item Name : <input type="text" name="itemName"/>
Item Cost : <input type="text" name="itemCost"/>
Margin Value: <input type="text" name="marginValue"/>
<input type="submit" value="Save Item"/>
</pre>
</form>
${msg}
</body>
</html>