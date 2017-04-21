package com.creational.prototype;

import java.util.logging.Logger;

public class Main {
    public static void main(String ... args){
        Logger log = Logger.getLogger(Main.class.getName());
        WebPageScraper pageScraper1 = new WebPageScraper("http://www.google.com");
        pageScraper1.pringPageData();
        log.info(pageScraper1.toString());

        WebPageScraper pageScraper2 = null;
        try{
            pageScraper2 = (WebPageScraper)pageScraper1.clone();
            pageScraper2.pringPageData();
            log.info(pageScraper2.toString());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        Boolean areScrapersTheSameObject = pageScraper1.equals(pageScraper2);
        log.info(areScrapersTheSameObject.toString());
    }
}
