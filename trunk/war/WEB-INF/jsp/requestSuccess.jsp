<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="org.localstorm.carpool.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Request Success -></title>
</head>
<body>
<%
List<RideOffer> rideOffers =(List<RideOffer>)request.getAttribute("offersList");
RideRequest rideRequest = (RideRequest)request.getAttribute("request");
%>
<p>Request: User <%=rideRequest.getUserId() %> Date <%=rideRequest.getDate() %> From <%=rideRequest.getFromName() %> To <%=rideRequest.getToName() %> </p>
<p>Successfully Created</p>
<p>Here are the available offers that match this request:</p>

<table>

<%
for (RideOffer rideOffer: rideOffers){
%>	
<tr>	
	<td>User Id: <%=rideOffer.getUserId()%></td>
	</tr>
	<tr>
	
	<td>Date: <%=rideOffer.getDate() %></td>
	</tr>
	<tr>
	
	<td>From: <%=rideOffer.getFromName() %></td>
	</tr>
	<tr>
	
	<td>To: <%=rideOffer.getToName() %></td>
	</tr>
	<tr>
	<td>------------------------------------</td>
	
</tr>
<%	
}
%>
</tr>
</table>

 	</body>
</html>