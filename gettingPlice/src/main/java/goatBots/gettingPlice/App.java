package goatBots.gettingPlice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
    	//price_value price_centered

    	String url = "https://www.goatbots.com/card/karn-scion-of-urza";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("h3");
        // 0 通常 買取
        // 1 通常 販売
        // 2 foli 買取
        // 3 foil 販売
        for (Element element : elements) {
            System.out.println(element.text());
        }

        // ' -> 削除
        // , -> - (ハイフン
        // 半角スペース -> - (ハイフン

        // , 半角スペース の連続はまとめてハイフン
    }
}
