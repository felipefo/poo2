

package flyweightbrowser;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        Browser browser = new Browser();
        browser.getAllImagesFrom("http://www.yahoo.com/");
                
        InputStream image = browser.getImage("image_url");
                
        
    }
    
}
