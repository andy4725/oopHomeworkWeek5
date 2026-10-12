package Exercise_4_Page_49;

import java.util.List;
import Exercise_2_Page_30.News;

public interface ContentSource {
    List<News> load();
}
