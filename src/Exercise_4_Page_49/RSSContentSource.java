package Exercise_4_Page_49;

import java.util.List;
import java.util.ArrayList;
import Exercise_2_Page_30.News;

public class RSSContentSource {
    private final String url;

    public RSSContentSource(String url) {
        this.url = url;
    }

    public List<News> load() {
        return new ArrayList<News>();
    }
}
