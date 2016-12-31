<%@ page import="sample.Foo" %>
<html>
<body>
<%
     Foo foo = new Foo();
%>
<h2><%=foo.message()%></h2>
</body>
</html>
