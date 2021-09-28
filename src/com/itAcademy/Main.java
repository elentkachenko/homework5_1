package com.itAcademy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String s = "\"configGlossary:installationAt\": \"Philadelphia, PA\",\n" +
                "\"configGlossary:adminEmail\": \"ksm@pobox.com\",\n" +
                "\"configGlossary:poweredBy\": \"Cofax\",\n" +
                "\"configGlossary:poweredByIcon\": \"/images/cofax.gif\",\n" +
                "\"configGlossary:staticPath\": \"/content/static\",\n" +
                "\"templateProcessorClass\": \"org.cofax.WysiwygTemplate\",\n" +
                "\"templateLoaderClass\": \"org.cofax.FilesTemplateLoader\",\n" +
                "\"templatePath\": \"templates\",\n" +
                "\"templateOverridePath\": \"\",\n" +
                "\"defaultListTemplate\": \"listTemplate.htm\",\n" +
                "\"defaultFileTemplate\": \"articleTemplate.htm\",\n" +
                "\"useJSP\": false,\n" +
                "\"jspListTemplate\": \"listTemplate.jsp\",\n" +
                "\"jspFileTemplate\": \"articleTemplate.jsp\",\n" +
                "\"cachePackageTagsTrack\": 200,\n" +
                "\"cachePackageTagsStore\": 200,\n" +
                "\"cachePackageTagsRefresh\": 60,\n" +
                "\"cacheTemplatesTrack\": 100,\n" +
                "\"cacheTemplatesStore\": 50,\n" +
                "\"cacheTemplatesRefresh\": 15,\n" +
                "\"cachePagesTrack\": 200,\n" +
                "\"cachePagesStore\": 100,\n" +
                "\"cachePagesRefresh\": 10,\n" +
                "\"cachePagesDirtyRead\": 10,\n" +
                "\"searchEngineListTemplate\": \"forSearchEnginesList.htm\",\n" +
                "\"searchEngineFileTemplate\": \"forSearchEngines.htm\",\n" +
                "\"searchEngineRobotsDb\": \"WEB-INF/robots.db\",\n" +
                "\"useDataStore\": true,\n" +
                "\"dataStoreClass\": \"org.cofax.SqlDataStore\",\n" +
                "\"redirectionClass\": \"org.cofax.SqlRedirection\",\n" +
                "\"dataStoreName\": \"cofax\",\n" +
                "\"dataStoreDriver\": \"com.microsoft.jdbc.sqlserver.SQLServerDriver\",\n" +
                "\"dataStoreUrl\": \"jdbc:microsoft:sqlserver://LOCALHOST:1433;DatabaseName=goon\",\n" +
                "\"dataStoreUser\": \"sa\",\n" +
                "\"dataStorePassword\": \"dataStoreTestQuery\",\n" +
                "\"dataStoreTestQuery\": \"SET NOCOUNT ON;select test='test';\",\n" +
                "\"dataStoreLogFile\": \"/usr/local/tomcat/logs/datastore.log\",\n" +
                "\"dataStoreInitConns\": 10,";

        Pattern pattern = Pattern.compile("\\w+@[\\w.]+\\.\\w+");
        Matcher matcher = pattern.matcher(s);
        String result;
        while (matcher.find()) {
            result = matcher.group();
            System.out.println(result);

        }
    }
}
