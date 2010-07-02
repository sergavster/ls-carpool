<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.localstorm.carpool.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.localstorm.carpool.RideOffer"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Offer Success -></title>
</head>
<body>
<%

RideOffer rideOffer = (RideOffer)request.getAttribute("offer");
%>
<p>Offer: User <%=rideOffer.getUserId() %> Date <%=rideOffer.getDate() %> From <%=rideOffer.getFromName() %> To <%=rideOffer.getToName() %> </p>
<BR>
<p>Successfully Created</p>
 	</body>
</html>