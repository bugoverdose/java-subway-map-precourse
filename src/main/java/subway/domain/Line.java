package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String name;
    private List<Station> sections = new ArrayList<>();

    public Line(String name, Station start, Station end) {
        this.name = name;
        this.sections.add(start);
        this.sections.add(end);
    }

    public String getName() {
        return name;
    }

    public List<Station> getSections() {
        return this.sections;
    }
}
