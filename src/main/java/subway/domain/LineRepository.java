package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static subway.view.InputView.*;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static Line findByName(String name) {
        for (Line line : lines) {
            if (!line.getName().equals(name)) continue;
            return line;
        }
        throw new IllegalArgumentException();
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static boolean deleteSectionByLineNameAndStationName(String lineName, String stationName) {
        Line line = findByName(lineName);
        return line.getSections().removeIf(section -> Objects.equals(section.getName(),stationName));
    }

    public static void initDatabase() {
        Line line2 = new Line("2호선", StationRepository.findByName("교대역"), StationRepository.findByName("강남역"));
        line2.addSection(3, StationRepository.findByName("역삼역"));
        addLine(line2);

        Line line3 = new Line("3호선", StationRepository.findByName("교대역"), StationRepository.findByName("남부터미널역"));
        line3.addSection(3, StationRepository.findByName("양재역"));
        line3.addSection(4, StationRepository.findByName("매봉역"));
        addLine(line3);

        Line lineNew = new Line("신분당선", StationRepository.findByName("강남역"), StationRepository.findByName("양재역"));
        lineNew.addSection(3, StationRepository.findByName("양재시민의숲역"));
        addLine(lineNew);
    }
}
