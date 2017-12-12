package roadgraph;

import java.util.Comparator;


public class RoadLengthComparator implements Comparator<MapNode> {

	@Override
	public int compare(MapNode x, MapNode y) {
		if(x.getCombinedDistance() <y.getCombinedDistance())
		{
			return -1;
		}
		if(x.getCombinedDistance() >y.getCombinedDistance())
		{
			return 1;
		}
		return 0;
	}

}
