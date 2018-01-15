<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<!--[if IE 6]><script type="text/javascript">document.execCommand("BackgroundImageCache", false, true);</script><![endif]-->  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Dear -_-404-_-</title>  
<style type="text/css">  
html{background:url(/static/images/paper.jpg)!important;}  
a,fieldset,img{border:0;}  
a{color:#221919;text-decoration:none;outline:none;}  
a:hover{color:#3366cc;text-decoration:underline;}  
body{font-size:24px;color:#B7AEB4;}  
body a.link,body h1,body p{-webkit-transition:opacity 0.5s ease-in-out;-moz-transition:opacity 0.5s ease-in-out;transition:opacity 0.5s ease-in-out;}  
#wrapper{text-align:center;margin:100px auto;width:594px;}  
a.link{text-shadow:0px 1px 2px white;font-weight:600;color:#3366cc;opacity:0;}  
h1{text-shadow:0px 1px 2px white;font-size:24px;opacity:0;}  
img{-webkit-transition:opacity 1s ease-in-out;-moz-transition:opacity 1s ease-in-out;transition:opacity 1s ease-in-out;height:202px;width:199px;opacity:0;}  
p{text-shadow:0px 1px 2px white;font-weight:normal;font-weight:200;opacity:0;}  
.fade{opacity:1;}  
@media only screen and (min-device-width:320px) and (max-device-width:480px){  
    #wrapper{margin:40px auto;text-align:center;width:280px;}  
}  
</style>  
</head>  
<body>  
<div id="wrapper">  
   		<img class="fade" src="${ctx }/static/images/aaa.jpg">  
        <div>  
            <h1 class="fade">温馨提示：您访问的地址不存在！</h1>  
            <p class="fade">你正在寻找的页面无法找到。  
            <a style="opacity: 1;" class="link" href="index.jsp" onclick="history.go(-1)">返回?</a></p>  
              
        </div>  
    </div>  
</body>  
</html>  