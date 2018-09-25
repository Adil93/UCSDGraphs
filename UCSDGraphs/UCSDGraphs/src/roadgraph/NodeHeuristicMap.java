package roadgraph;

/**
 * 
 * @author adilmuthukoya
 * Object which has a extra cost factor the heuristic estimated cost
 *
 */
public class NodeHeuristicMap extends NodeCostMap implements Comparable<Object> {

	private Double heuristicCost;

	/**
	 * 
	 * @param mapNode
	 */
	public NodeHeuristicMap(MapNode mapNode) {
		super(mapNode);
		this.heuristicCost = Double.POSITIVE_INFINITY;
	}
/**
 * 
 * @param mapNode
 * @param costSoFar
 * @param heuristicCost
 */
	public NodeHeuristicMap(MapNode mapNode, Double costSoFar, Double heuristicCost) {

		super(mapNode, costSoFar);
		this.heuristicCost = heuristicCost;

	}
	/**
	 * 
	 * @return
	 */
	public Double getHeuristicCost() {
		return heuristicCost;
	}
	/**
	 * 
	 * @param heuristicCost
	 */
	public void setHeuristicCost(Double heuristicCost) {
		this.heuristicCost = heuristicCost;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof NodeHeuristicMap) {
			NodeHeuristicMap nodeHeuristicMap = (NodeHeuristicMap) o;
			Double totalCost = this.costSoFar + this.heuristicCost;
			Double totalCostOther = nodeHeuristicMap.costSoFar + nodeHeuristicMap.heuristicCost;
			return totalCost.compareTo(totalCostOther);
		}
		
		return 0;
	}
	
}
