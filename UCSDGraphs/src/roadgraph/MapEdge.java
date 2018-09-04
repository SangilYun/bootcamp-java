package roadgraph;

public class MapEdge {

	private String start;
	private String end;
	private String streetName;
	private String distance;
	private String streetType;
	
	public MapEdge(String start, String end, String streetName, String streetType) {
		this.start=start;
		this.start=end;
		this.streetName=streetName;
		this.streetType=streetType;
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getDistance() {
		return distance;
	}

	public String getStreetType() {
		return streetType;
	}
}
