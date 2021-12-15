package subway.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {
    private String name;
    private List<Station> stations = new ArrayList<>();

    public Line(String name, Station start, Station end) {
        this.name = name;
        this.stations.add(start);
        this.stations.add(end);
    }

    public String getName() {
        return name;
    }
}
