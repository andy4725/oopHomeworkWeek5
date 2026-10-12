package Exercise_1_Page_17;

import java.util.Arrays;
import java.util.List;

public class RSSSource {
    // Part of ex1 and ex4 on page 49
    private String name;
    private String url;
    private String language;

    public RSSSource(String name, String url, String language) {
        this.name = name;
        this.url = url;
        this.language = language;
    }

    public String getName() { return name; }
    public String getURL() { return url; } 
    public String getLanguage() { return language; } 

    public List<String> getData() {
        return Arrays.asList("RSS item 1", "RSS item 2");
    }
}
