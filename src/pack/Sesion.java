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
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true); //En caso de que no exista la sesion, la crea.
		session.setMaxInactiveInterval(60); //El valor es en segundos.
		response.setContentType("text/html");
		
		
		String nom=request.getParameter("nombre");
		String ape=request.getParameter("apellidos");
		String ema=request.getParameter("useremail");
		String tel=request.getParameter("telefono");
		String cod=request.getParameter("codpost");
		Usuario user = new Usuario(nom, ape, ema, tel, cod);
		
		Usuario usuario = (Usuario)session.getAttribute("usuario");
		String url ="";
		
		if (usuario == null) {
			url = "/registro.html";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
		else {
			String nombre = user.getNombre();
			String apellido = user.getApellidos();
			String email = user.getEmail();
			String telefono = user.getTelefono();
			String codigo = user.getCp();
			Usuario usuarioreg = new Usuario(nombre, apellido, email, telefono, codigo);
			session.setAttribute("usuario", usuarioreg);
			url = "/registro.jsp";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
