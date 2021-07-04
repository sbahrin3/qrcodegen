/**
 * 
 */
package qrgen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shamsul Bahrin bin Abd Mutalib
 *
 */
public class QRCodeServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException    {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		doService(req, res);
	}

	public void doService(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String value = req.getParameter("value");
		QRCodeGenerator.create(value, res.getOutputStream());
	}

}
