<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<!-- Bootstrap -->
    <link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head> 
<body>
	<div class="container">
		<form class="form-signin">
	        <h2 class="form-signin-heading">Please sign in</h2>
	        <input type="text" class="input-block-level" placeholder="Email address">
	        <input type="password" class="input-block-level" placeholder="Password">
	        <label class="checkbox">
	          <input type="checkbox" value="remember-me"> Remember me
	        </label>
	        <button class="btn btn-large btn-primary" type="submit">Sign in</button>
	     </form>
     </div>
</body>
</html>