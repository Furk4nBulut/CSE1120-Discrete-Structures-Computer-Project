package Question4;

public class WeightedEdge {
    private GraphNode neighbor;
    private int weight;
    public WeightedEdge(GraphNode neighbor, int weight) {
        this.neighbor = neighbor;
        this.weight = weight;
    }

    public GraphNode getNeighbor() {
        return neighbor;
    }

    public int getWeight() {
        return weight;
    }
}
