import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author felipe
 */
public class RecebeJSON extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {            
            StringBuffer jb = new StringBuffer();
            String line = null;
                BufferedReader reader = request.getReader();
                while ((line = reader.readLine()) != null) {
                    jb.append(line);
                }        
            JSONObject json;
            json   = (JSONObject) new JSONParser().parse(jb.toString());
         
            Iterator it = json.keySet().iterator(); //gets all the keys
            while (it.hasNext()) {
                String key = (String) it.next(); // get key
                Object valeu = json.get(key); // get value
                System.out.println(key + " : " + valeu); // print the key and value
            }

        } catch (ParseException ex) {
            Logger.getLogger(RecebeJSON.class.getName()).log(Level.SEVERE, null, ex);
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
        return "Servlet Exemplo JSON";
    }// </editor-fold>

}
