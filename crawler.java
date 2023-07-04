import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class crawler {
    //URL of the targeted website to crawl from
    public static String url="https://en.wikipedia.org/wiki/Java_(programming_language)";

    public static void main(String[] args) throws IOException {
        //Setup HTTP connection with the server and use get() method for GET request to get DOM tree
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();
        //Now parse the document by element id and paras
        Element content=doc.getElementById("mw-content-text");
        Elements paragraphs=content.select("p");
    }
}
