package org.localstorm.carpool;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import com.google.gson.Gson;


@SuppressWarnings("serial")
public class ShowOffersForUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/plain");
		
		String userEmail = req.getParameter("userEmail");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();	

		String query = "select from " + User.class.getName() + " where email ==\"" + userEmail + "\"";
	    List<User> users = (List<User>)pm.newQuery(query).execute();
	    if (users.isEmpty()){
			resp.getWriter().append("User with email " + userEmail + " not found");	 
			return;
	    }
	    User user = users.get(0);
	    
		query = "select from " + RideRequest.class.getName() + " where userId ==" + user.getId();
	    List<RideRequest> rideRequests = (List<RideRequest>)pm.newQuery(query).execute();
	    
		query = "select from " + RideOffer.class.getName();
	    List<RideOffer> rideOffers = (List<RideOffer>)pm.newQuery(query).execute();
	    
	    String userAgent = req.getHeader("user-agent");
	    PrintWriter out = resp.getWriter();
	    if(!userAgent.contains("iPhone")){
	    	for (RideRequest rideRequest: rideRequests){
	    		Gson gson = new Gson();
	    		out.print(gson.toJson(rideRequest));
	    	}
	    	for (RideOffer rideOffer: rideOffers){
	    		
	    	}
	    	
	    }
	    else{
	    	for (RideRequest rideRequest: rideRequests){
	    	}
	    	for (RideOffer rideOffer: rideOffers){
	    		
	    	}
	    	
	    }
	    
	    
	    return;
	    
		

	}
}
