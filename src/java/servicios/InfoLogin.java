package servicios;

/**
 *
 * @author Kevin
 */

import banco.modelo.dao.ServicioBanco;
import java.io.IOException;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "InfoLogin",
        urlPatterns = {"/InfoLogin", "/registro-login"}
)
public class InfoLogin extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        if (id!= null) {
            // request.setAttribute("registroEstudiante", null);
            servicio.obtenerCuenta(this.checkId(id))
                    .ifPresent(e -> request.setAttribute("registroLogin", e));
        }
        // response.sendRedirect("...");
        RequestDispatcher dispatcher = request.getRequestDispatcher(
                "/WEB-INF/registros/vista/registro-login.jsp");
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
    private String checkId(String txt) {
        String r = txt;

        Pattern pat = Pattern.compile("([1-9,A])-?([0-9]{4})-?([0-9]{4})");
        Matcher m = pat.matcher(txt);
        if (m.find()) {
            r = String.format("%s%s%s", m.group(1), m.group(2), m.group(3));
        }

        return r;
    }
     private final ServicioBanco servicio = new ServicioBanco();
}
