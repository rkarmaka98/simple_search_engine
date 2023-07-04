import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class crawler {
    //URL of the targeted website to crawl from
    public static String url="https://en.wikipedia.org/wiki/Java_(programming_language)";

    public static void main(String[] args) throws IOException {
        /*
        Setup HTTP connection with the web-server.
        Use get() method to download the HTML and parse it to DOM tree
        */
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();
        /*
         Select the document tree and search for an element matching ID.
         The select method traverses the tree and return all the children
         nodes matching Query.
         */
        Element content=doc.getElementById("mw-content-text");
        Elements paragraphs=content.select("p");
    }
}
