package goatBots.gettingPlice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GettingPlace {



	public static void main( String[] args ) throws IOException
    {
    	//price_value price_centered

    	String url = "https://www.goatbots.com/card/karn-scion-of-urza";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("h3");
        for (Element element : elements) {
            System.out.println(element.text());
        }
    }

}
