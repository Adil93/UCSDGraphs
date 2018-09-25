package roadgraph;

/**
 * 
 * @author adilmuthukoya
 * Object relating a MapNode to cost so far in dijikstra
 *
 */
public class NodeCostMap implements Comparable<Object> {

	protected MapNode mapNode;
	protected Double costSoFar;
	
	/**
	 * 
	 * @param mapNode
	 */
	public NodeCostMap(MapNode mapNode) {
		this.mapNode = mapNode;
		this.costSoFar=Double.POSITIVE_INFINITY;
	}
	/**
	 * 
	 * @param mapNode
	 * @param costSoFar
	 */
	public NodeCostMap(MapNode mapNode, Double costSoFar) {
		this.mapNode = mapNode;
		this.costSoFar = costSoFar;
	}
	/**
	 * 
	 * @return
	 */
	public MapNode getMapNode() {
		return mapNode;
	}
	/**
	 * 
	 * @param mapNode
	 */
	public void setMapNode(MapNode mapNode) {
		this.mapNode = mapNode;
	}
	/**
	 * 
	 * @return
	 */
	public Double getCostSoFar() {
		return costSoFar;
	}
	/**
	 * 
	 * @param costSoFar
	 */
	public void setCostSoFar(Double costSoFar) {
		this.costSoFar = costSoFar;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof NodeCostMap) {
			NodeCostMap NodeCostMap = (NodeCostMap) o;
			return this.costSoFar.compareTo(NodeCostMap.costSoFar);
		}
		
		return 0;
	}
	
}
