package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// obtener valores de parámetros de la solicitud
		String name = request.getParameter("name");

		// estos son atributos unicos de la solicitud, reutilizables
		// Para obternerlo ->. getAttribute()
		request.setAttribute("nombre",name);
		request.setAttribute("message","ok");

		request.getRequestDispatcher("/WEB-INF/saludo.jsp").forward(request,response);

	}

}