package pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

/**
 * Servlet implementation class Sesion
 */
@WebServlet("/Sesion")
public class Sesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true); //En caso de que no exista la sesion, la crea.
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Pruebesita");
		
		
		String nom=request.getParameter("nombre");
		String ape=request.getParameter("apellidos");
		String ema=request.getParameter("useremail");
		String tel=request.getParameter("telefono");
		String cod=request.getParameter("codpost");
		String [] plainuser = {nom, ape, ema, tel, cod};
		request.setAttribute("plainuser", plainuser);
		
		String url = "/registro.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
		session.setMaxInactiveInterval(60); //El valor es en segundos.
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
