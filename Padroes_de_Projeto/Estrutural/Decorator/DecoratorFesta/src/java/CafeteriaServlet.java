

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

public class CafeteriaServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            /*
            Produto cappuccino = new Produto();  // custo 
            cappuccino = new Creme(cappuccino);
            cappuccino = new Creme(cappuccino);
            cappuccino = new Chocolate(cappuccino);

            System.out.println(cappuccino.getDescription() + " $ " + cappuccino.cost());
             */
            
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
