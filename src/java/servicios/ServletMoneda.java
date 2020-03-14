package servicios;

/**
 *
 * @author Kevin
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import banco.modelo.dao.ServicioBanco;
import javax.servlet.RequestDispatcher;

@WebServlet(
        name = "ServletMoneda",
        urlPatterns = {"/ServletMoneda", "/registro-moneda"}
)
public class ServletMoneda extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        if (nombre != null) {
            // request.setAttribute("registroEstudiante", null);
            servicio.obtenerMoneda(nombre)
                    .ifPresent(e -> request.setAttribute("registroMoneda", e));
        }
        // response.sendRedirect("...");
        RequestDispatcher dispatcher = request.getRequestDispatcher(
                "/WEB-INF/registros/vista/registro-moneda.jsp");
        dispatcher.forward(request, response);
    }

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println();
        System.out.println("Solicitud via GET..");
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println();
        System.out.println("Solicitud via POST..");
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servicio de ejemplo (información del formulario)";
    }
     private final ServicioBanco servicio = new ServicioBanco();
}
