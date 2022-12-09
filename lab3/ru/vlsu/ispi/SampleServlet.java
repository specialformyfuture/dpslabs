
package ru.vlsu.ispi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author ProGa
 */
public class SampleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Get parameters from request: */

	    int month = Integer.parseInt(request.getParameter("name"));
	    String sign = null;

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SampleServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SampleServlet at " + request.getContextPath() + "</h1>");
            
	    switch(month){
		case (3):
			sign = "Aries";
			break;
		case (4):
			sign = "Taurus";
			break;
		case (5):
			sign = "Gemini";
			break;
		case (6):
			sign = "Cancer";
			break;
		case (7):
			sign = "Leo";
			break;
		case (8):
			sign = "Virgo";
			break;
		case (9):
			sign = "Libra";
			break;
		case (10):
			sign = "Scorpio";
			break;
		case (11):
			sign = "Sagittarius";
			break;
		case (12):
			sign = "Capricorn";
			break;
		case (1):
			sign = "Aquarius";
			break;
		case (2):
			sign = "Pisces";
			break;
		default:
			sign = "TYPE A NORMAL MONTH BETWEEN 1 AND 12 U DUMB-ASS";
	    }
            out.println("<h2>Hello! Glad to see you! I think you're a " + sign + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
