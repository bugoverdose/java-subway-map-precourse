package subway.domain;

public class Station {
    private String name;
    private boolean isSection = false;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getIsSection() {
        return isSection;
    }

    public void setIsSection(boolean isSection) {
        this.isSection = isSection;
    }
}
