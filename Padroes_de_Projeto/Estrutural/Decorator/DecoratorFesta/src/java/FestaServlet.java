

import festa.dominio.Festa;
import festa.dominio.FestaAdolescente;
import festa.dominio.FestaCrianca;
import festa.dominio.adicionais.AguadeCoco;
import festa.dominio.adicionais.Cerveja;
import festa.dominio.adicionais.Flores;
import festa.dominio.adicionais.Refrigerante;
import festa.dominio.adicionais.Vinho;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FestaServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            Festa festa = null;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Festa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Festa!</h1>");

            String tipo_festa = request.getParameter("tipo_festa");
            if (tipo_festa.equalsIgnoreCase("Crianca")) {
                festa = new FestaCrianca();
            } else if (tipo_festa.equalsIgnoreCase("Adolescente")) {
                festa = new FestaAdolescente();
            }

            if (request.getParameterMap() != null) {
                if (request.getParameterMap().containsKey("Flores")) {
                    festa = new Flores(festa);                  
                }
                if (request.getParameterMap().containsKey("Cerveja")) {
                    festa = new Cerveja(festa);
                }
                if (request.getParameterMap().containsKey("Vinho")) {
                    festa = new Vinho(festa);                    
                }
                if (request.getParameterMap().containsKey("Refrigerante")) {
                    festa = new Refrigerante(festa);
                }
                if (request.getParameterMap().containsKey("aguadecoco")) {
                    festa = new AguadeCoco(festa);
                }
            }

            out.println("Custo Total " + festa.cost());
            out.println("</body>");
            out.println("</html>");

            /* TODO output your page here. You may use following sample code.
            
            Festa festa = new FestaCrianca();
            System.out.println(festa.getDescription()
                    + " $ " + festa.cost()
            );

            Festa cappuccino = new FestaCrianca();  // custo 
            cappuccino = new Creme(cappuccino);
            cappuccino = new Creme(cappuccino);
            cappuccino = new Chocolate(cappuccino);

            System.out.println(cappuccino.getDescription() + " $ " + cappuccino.cost());
             */
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Festa Servlet";
    }

}
