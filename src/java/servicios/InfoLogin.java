package servicios;

/**
 *
 * @author Kevin
 */

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet
public class InfoLogin extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println();
        Enumeration<String> e = request.getParameterNames();
        int n = 0;
        while (e.hasMoreElements()) {
            n++;
            String p = e.nextElement();
            System.out.print(String.format("\"%s\": [", p));

            String[] v = request.getParameterValues(p);
            for (int i = 0; i < v.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(String.format("\"%s\"", v[i]));
            }

            System.out.println("]");
        }
        System.out.println();

        response.sendRedirect("login.jsp");
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
}
