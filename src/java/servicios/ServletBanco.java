/*package servicios;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import banco.modelo.dao.ServicioBanco;

/**
 *
 * @author Kevin
 */
/*@WebServlet(
        name = "ServletBanco",
        urlPatterns = {"/ServletBanco", "/registro-banco"}
)
public class ServletCuenta extends HttpServlet {

    private void processRequest(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        if (id != null) {
            // request.setAttribute("registroEstudiante", null);
            servicio.obtenerCuenta(checkId(id))
                    .ifPresent(e -> request.setAttribute("registroCuenta", e));
        }
        // response.sendRedirect("...");
        RequestDispatcher dispatcher = request.getRequestDispatcher(
                "/WEB-INF/ejemplo/vista/registro-banco.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
*/