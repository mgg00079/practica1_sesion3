package pack;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Servlet implementation class ListaUsuarios
 */
@WebServlet("/ListaUsuarios")
public class ListaUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("name");
		String password = request.getParameter("pass");
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario> ();
		Usuario user1 = new Usuario ("Manuel","Casquel Orzaes", "maco0007@ujaen.es", "123456789", "23005");
		Usuario user2 = new Usuario ("Marta","Gonzalez Gonzalez","mgg00079@ujaen.es", "789456123", "23006");
		usuarios.add(user1);
		usuarios.add(user2);
		request.setAttribute("usuarios", usuarios);
		
		if (login.equals("servicios") && password.equals("servicios")) {
			String url="/listausuarios.jsp";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
		else {
			String url="/registro.html";
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
		
	}

}
