import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class crawler {
    public static String url="https://en.wikipedia.org/wiki/Java_(programming_language)";

    public static void main(String[] args) throws IOException {
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();
        Element content=doc.getElementById("mw-content-text");
        Elements paragraphs=content.select("p");
    }
}
