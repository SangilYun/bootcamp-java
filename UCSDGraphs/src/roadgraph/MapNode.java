package roadgraph;

import java.util.LinkedList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode {
	
	private GeographicPoint pos;
	private List<MapEdge> mapEdge;
	
	public MapNode(GeographicPoint pos, LinkedList<MapEdge> mapEdge) {
		this.pos=pos;
		this.mapEdge= mapEdge;
	}

	public GeographicPoint getPos() {
		return pos;
	}

	public List<MapEdge> getMapEdge() {
		return mapEdge;
	}
}