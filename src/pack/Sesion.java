package pack;

import java.io.IOException;
//import java.util.ArrayList;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class Sesion
 */
@WebServlet("/Sesion")
public class Sesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String nom = null;
	private String ape = null;
	private String ema = null;
	private String tel = null;
	private String cod = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true); //En caso de que no exista la sesion, la crea.
		session.setMaxInactiveInterval(60); //El valor es en segundos.
		response.setContentType("text/html");
		
		
		nom=request.getParameter("nombre");
		ape=request.getParameter("apellidos");
		ema=request.getParameter("useremail");
		tel=request.getParameter("telefono");
		cod=request.getParameter("codpost");
		
		Usuario usuario = (Usuario)session.getAttribute("usuario");
		String url ="";
		
		if (usuario == null) {
			if(nom == null && ape == null && ema == null && tel == null && cod == null) {
				url = "/registro.html";
				getServletContext().getRequestDispatcher(url).forward(request, response);
			}
			else {
				
				Usuario user = new Usuario(nom, ape, ema, tel, cod);
				request.setAttribute("usuario", user);
				session.setAttribute("usuario", user);
				url = "/registro.jsp";
				getServletContext().getRequestDispatcher(url).forward(request, response);
			}
		}
		else {
			url = "/registro.jsp";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
	}
}
