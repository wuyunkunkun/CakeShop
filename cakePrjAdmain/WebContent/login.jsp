<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>catCakeAdminLogin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->

        <link rel="stylesheet" href="${ctx }/assets/css/reset.css">
        <link rel="stylesheet" href="${ctx }/assets/css/supersized.css">
        <link rel="stylesheet" href="${ctx }/assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <h1>Login</h1>
           <form action="${ctx }/admin/logina">
                <input type="text" name="adminName" class="username" placeholder="AdminName">
                <input type="password" name="password" class="password" placeholder="password">
                <button type="submit">Sign  in</button>
                <div class="error"><span>+</span></div>
            </form>
            <div class="connect">
                <p>Or connect with:</p>
                <p>
                    <a class="facebook" href="http://www.lianpula.net/"></a>
                    <a class="twitter" href="http://www.twitterios.com/"></a>
                </p>
            </div>
        </div>
       

        <!-- Javascript -->
        <script src="${ctx }/assets/js/jquery-1.8.2.min.js"></script>
        <script src="${ctx }/assets/js/supersized.3.2.7.min.js"></script>
        <script src="${ctx }/assets/js/supersized-init.js"></script>
        <script src="${ctx }/assets/js/scripts.js"></script>

    </body>

</html>

