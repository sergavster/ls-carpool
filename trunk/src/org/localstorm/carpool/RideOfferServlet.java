package org.localstorm.carpool;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class RideOfferServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		handleRequest(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws IOException {

		handleRequest(req, resp);
	}
	
	
	private void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		
		resp.setContentType("text/plain");
		
		double fromX = Double.parseDouble(req.getParameter("fromX"));
		double fromY = Double.parseDouble(req.getParameter("fromY"));
		String fromName = req.getParameter("fromName");
		
		double toX = Double.parseDouble(req.getParameter("toX"));
		double toY = Double.parseDouble(req.getParameter("toY"));
		String toName = req.getParameter("toName");
		String rideDate = req.getParameter("rideDate");
		String flexibility = req.getParameter("flexibility");
		String userEmail = req.getParameter("userEmail");
		
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ROOT);
		Date date = null;
		try{
			date = format.parse(rideDate);
		}
		catch (java.text.ParseException ex){ 
			ex.printStackTrace();

		}
		
	/*g
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			 date = simpleDateFormat.parse(rideDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Long flexibilityNumer = Long.parseLong(flexibility);
		PersistenceManager pm = PMF.get().getPersistenceManager();	

		String query = "select from " + User.class.getName() + " where email ==\"" + userEmail + "\"";
	    List<User> users = (List<User>)pm.newQuery(query).execute();
	    if (users.isEmpty()){
			resp.getWriter().append("User with email " + userEmail + " not found");	 
			return;
	    }
	    User user = users.get(0);
	    
	    try{
		RideOffer rideOffer = new RideOffer(fromX,fromY,fromName, toX, toY, toName,user.getId(), date,flexibilityNumer );
		pm.makePersistent(rideOffer);
	    }finally{
	    	pm.close();
	    }
	    
	    
		

	}
}
