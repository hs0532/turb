package ecTestWeb01.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *  
 * @author to
 *
 */
public class TestServlet extends HttpServlet {
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = arg0.getParameter("name");
		String password = arg0.getParameter("pass");
		if("123".equals(name)&&"123".equals(password)){
			arg0.setAttribute("name", name);
			arg0.getRequestDispatcher("index.jsp").forward(arg0, arg1);
		}else {
			arg0.getRequestDispatcher("error.jsp").forward(arg0, arg1);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
