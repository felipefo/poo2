import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExemploGet extends HttpServlet {

    
    private HashMap usuarios = new HashMap();
    
    
    public ExemploGet(){
        
        usuarios.put("001" , "Felipe");
        usuarios.put("002" , "Joao");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Minha Primeira Página</title>");            
            out.println("</head>");
            out.println("<body>");            
            out.println("<h1>Meu Primeiro Servlet");
            out.println("<h1>Id: " + request.getParameter("id") + "</h1>");
            out.println("<h1>Nome: " + usuarios.get(request.getParameter("id")) + "</h1>");

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
