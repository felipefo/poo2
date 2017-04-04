import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExemploGet extends HttpServlet {

    HashMap usuarios  = new HashMap();
    
    public ExemploGet(){
     
        super();
        usuarios.put("001", "Felipe");
        usuarios.put("002", "Joao");
        usuarios.put("003", "Andre");
        
    }
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String id = (String) request.getParameter("id");
            System.out.println("id:" + id);
            System.out.println("mapa  = " +  usuarios.get(id));
            String nome = (String) usuarios.get(id);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Minha Primeira Página</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Id:" + id + " </h1");
            out.println("<h1>Usuario:" + nome + " </h1");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("DO GET");
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("DO POST");
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
