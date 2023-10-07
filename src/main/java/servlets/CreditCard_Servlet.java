package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clientCC.CreditCardConvertor;

/**
 * Servlet implementation class CreditCard_Servlet
 */
@WebServlet("/CreditCard_Servlet")
public class CreditCard_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditCard_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreditCardConvertor client = new CreditCardConvertor();
		
		String creditCardNumber = request.getParameter("value");
		
		String verdict = client.checkCreditCardType(creditCardNumber);
		
		
		
		PrintWriter writer = response.getWriter();
		
		writer.println(verdict);
			
		writer.flush();
		writer.close();
		
	}

}
