package eclipseserver;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;


public class SummaryEclipseServer {
		
	public static void main(String[] args) throws Exception {				
		Server server = new Server(8846);
		Context root = new Context(server,"/",Context.SESSIONS);
		root.addServlet(new ServletHolder(new  SummaryEclipseServlet()), "/*");	 
		server.start();
	}	
}
