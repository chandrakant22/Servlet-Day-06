

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MyServlet1 extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("owner");
		
		out.print("<br/>hello "+name);
		out.print("<br/>hello "+name);
		out.print("<br/>hello "+name);
		out.print("<br/>hello "+name);
		out.print("<br/>hello "+name);
		out.print("<br/>hello "+name);
		out.print("<br/>hello "+name);
		
		ServletContext context=getServletContext();
		String ceo=context.getInitParameter("ceo");
		
		out.print("<br/>hello "+ceo);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
