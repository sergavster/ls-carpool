package org.localstorm.carpool;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class RidesServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/plain");
		
		String userEmail = req.getParameter("email");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();	

		pm = PMF.get().getPersistenceManager();	
		String query = "select from " + User.class.getName() + " where email ==" + userEmail;
	    List<User> users = (List<User>)pm.newQuery(query).execute();
	    if (users.isEmpty()){
			resp.getWriter().println("User with email " + userEmail + " not found");	    	
	    }
	    User user = users.get(0);
	    
	    
	    
	    
		
		resp.getWriter().println("Hello, world");
	}
}
