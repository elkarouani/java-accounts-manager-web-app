package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.User;
import dao.UserDAO;

/**
 * Servlet implementation class GererUser
 */
@WebServlet("/GererUser")
public class GererUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GererUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User u = new User();
		u.setCin(request.getParameter("cin"));
		u.setNom(request.getParameter("nom"));
		u.setPrenom(request.getParameter("prenom"));
		u.setAdresse(request.getParameter("adresse"));
		if (UserDAO.addUser(u) == 1) {
//			response.sendRedirect("welcome.jsp");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			response.sendRedirect("index.jsp");
		}
	}

}
