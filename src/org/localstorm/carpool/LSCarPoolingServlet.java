package org.localstorm.carpool;

import java.io.IOException;

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
			
		} finally{
			pm.close();
		}
	}
}
