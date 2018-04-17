
package flyweightbrowser;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.htmlparser.*;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.htmlparser.util.SimpleNodeIterator;


/*
 * @author felipe

 */
public class Browser {

    FlyweightImage flyWeightImage = new FlyweightImage();
    
    public void getAllImagesFrom(String url ) throws ParserException, MalformedURLException, IOException{                 
        Parser parser = new Parser(url);
        NodeList list = parser.parse(new TagNameFilter("IMG"));

        for ( SimpleNodeIterator iterator = list.elements(); iterator.hasMoreNodes(); ) {
            Tag tag = (Tag) iterator.nextNode();
            flyWeightImage.addImage(tag.getAttribute("src"));                        
        }                
    }
    
    public InputStream getImage(String urlImage){
        return flyWeightImage.getImage(urlImage);
    }
    
}
