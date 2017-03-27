
package flyweightbrowser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class FlyweightImage {    
    HashMap<String,InputStream>  image = new HashMap();    
    public  void addImage(String url) throws MalformedURLException{
        InputStream image = null;                    
        if(!this.image.containsKey(url)) {           
            try {
                image = new URL(url).openStream();
            String imageName = url.substring(url.lastIndexOf("/"));
            if(imageName.length() > 50 ){
                return;
            }
            OutputStream os = new FileOutputStream("c:\\images\\"+imageName);
            byte[] buf = new byte[1024];
            int len;
            while ((len = image.read(buf)) > 0) {
                os.write(buf, 0, len);
            }
            os.close();            
            } catch (IOException ex) {
                Logger.getLogger(FlyweightImage.class.getName()).log(Level.SEVERE, null, ex);
            }
           this.image.put(url, image);
        }                
    }
    
    public InputStream  getImage(String url){                
        return this.image.get(url);
    }
    
}
