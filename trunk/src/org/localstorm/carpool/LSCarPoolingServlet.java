package org.localstorm.carpool;

import java.io.IOException;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LSCarPoolingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();	

		pm = PMF.get().getPersistenceManager();	
		
		try{
			
			User user = new User("sapirboaz@gmail.com", "Boaz", "Sapir", "0541111111");
			pm.makePersistent(user);
//			RideRequest rideRequest = new RideRequest(0.0,0.0,"northPole", 20.0, 20.0, "Jerusalem",user.getId(), new Date(), 10L);
//			pm.makePersistent(rideRequest);			
//			RideOffer rideOffer = new RideOffer(0.0,0.0,"northPole", 20.01, 20.01, "TelAviv",user.getId(), new Date(), 10L);
//			pm.makePersistent(rideRequest);			
		} finally{
			pm.close();
		}
	}
}
