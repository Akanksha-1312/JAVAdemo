package sumnum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet{

	public void service(HttpServletResponse res,HttpServletRequest req) throws IOException,ServletException{
		int i=Integer.parseInt(req.getParameter("n1"));
		int j=Integer.parseInt(req.getParameter("n2"));
		int k=i+j;
		System.out.println(k);
		PrintWriter out=res.getWriter();
		out.println("sum="+k);
		
	}
	

}
