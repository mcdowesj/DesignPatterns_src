package com.creational.prototype;

import com.sun.javafx.Logging;

import javax.xml.ws.WebServiceClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

/**
 * The PrototypeDemo in the {@link com.creational._pluralsightSource SourceMaterial} package is very good and probably
 * better than this. Pay close attention to the Registry class.
 *
 * Java already pretty much handles shallow copies on the Object class. However, it is recommended that you implement
 * the Cloneable interface to alert readers that you plan on implementing some additional cloning capabilities i.e.
 * providing a full deep copy, or a deep copy but only to a certain level.
 */
public class WebPageScraper implements Cloneable {
    private static Logger log = Logger.getLogger(WebPageScraper.class.getName());
    private String title;
    private int headerTagCount;
    private String firstHeaderTagContents;
    private String fullPageContents;

    public WebPageScraper(String urlString) {
        try {

            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            StringBuilder contents = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                contents.append(line);
            }
            scrape(contents.toString());
        } catch (IOException e) {
            log.severe(e.getMessage());
        }
    }

    private void scrape(String page) {
        title = "Some fake title";
        headerTagCount = 3;
        firstHeaderTagContents = "Some more fake data";
        fullPageContents = page;//use this to see exactly what's coming back if you want.
    }

    public void pringPageData() {
        String pageData = "Title: " + title +
                "Header Count: " + headerTagCount +
                "First Header: " + firstHeaderTagContents;

        log.info(pageData);

    }

    /**
     * This is pretty much it for a shallow copy.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
