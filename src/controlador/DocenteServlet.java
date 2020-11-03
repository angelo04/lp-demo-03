package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Docente;
import model.DocenteModel;


@WebServlet("/insertaDocente")
public class DocenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String  nom = request.getParameter("nombre");
				String  ape = request.getParameter("apellido");
				String  sex = request.getParameter("sexo");
				String  fech = request.getParameter("fecha");
				String   dni = request.getParameter("dni");
				
				Docente obj = new Docente();
				
				obj.setNombre(nom);
				obj.setApellido(ape);
				obj.setSexo(sex);
				obj.setFechaNacimiento(fech);
				obj.setDni(dni);
				
				DocenteModel m = new DocenteModel();
				m.insertaDocente(obj);
				
				
				request.getRequestDispatcher("/registraDocente.jsp").forward(request, response);
				
	}

}
