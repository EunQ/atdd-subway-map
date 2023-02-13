package subway.line;

import java.util.ArrayList;
import java.util.List;

public class LineRemoveResponse {

    private Long id;

    private String lineName;

    private Long upStationId;
    private Long downStationId;
    private Long distance;

    private List<Long> stations = new ArrayList<>();

    public LineRemoveResponse(Long id, String lineName, Long upStationId, Long downStationId, Long distance, List<Long> stations) {
        this.id = id;
        this.lineName = lineName;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
        this.stations = stations;
    }

    public Long getId() {
        return id;
    }

    public String getLineName() {
        return lineName;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public Long getDistance() {
        return distance;
    }

    public List<Long> getStations() {
        return stations;
    }

    public static LineRemoveResponse fromLine(Line line) {
        LineRemoveResponse res = new LineRemoveResponse(line.getId(), line.getName(), line.getUpStationId(), line.getDownStationId(), line.getTotalDistance(), line.getStations());

        return res;
    }
}