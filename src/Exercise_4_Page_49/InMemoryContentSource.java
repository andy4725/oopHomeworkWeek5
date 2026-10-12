package Exercise_4_Page_49;

import java.util.ArrayList;
import java.util.List;
import Exercise_2_Page_30.News;

public class InMemoryContentSource {
    private final List<News> news;

    public InMemoryContentSource(List<News> news) {
        this.news = new ArrayList<News>(news);
    }

    public List<News> load() {
        return new ArrayList<News>(news);
    }
}
