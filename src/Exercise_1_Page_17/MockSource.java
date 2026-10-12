package Exercise_1_Page_17;

import java.util.Arrays;
import java.util.List;

public class MockSource implements Source {
    public List<String> getData() {
        return Arrays.asList("Mock item 1", "Mock item 2");
    }
}
