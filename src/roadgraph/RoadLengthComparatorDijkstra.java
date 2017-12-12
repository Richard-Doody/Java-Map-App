package roadgraph;

import java.util.Comparator;


public class RoadLengthComparatorDijkstra implements Comparator<MapNode> {

	@Override
	public int compare(MapNode x, MapNode y) {
		if(x.getCurrentDistance() <y.getCurrentDistance())
		{
			return -1;
		}
		if(x.getCurrentDistance() >y.getCurrentDistance())
		{
			return 1;
		}
		return 0;
	}

}