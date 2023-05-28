package Question4;

import java.util.ArrayList;
import java.util.List;
public class GraphNode {
    private String name; // Düğümün adı
    private List<WeightedEdge> neighbors; // Düğümün komşu düğümleri ve ağırlıkları

    public GraphNode(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<WeightedEdge> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(GraphNode neighborName, int weight) {
        WeightedEdge edge = new WeightedEdge(neighborName, weight);
        neighbors.add(edge);
    }

    public void removeEdge(GraphNode neighborName) {
        for (int i = 0; i < neighbors.size(); i++) {
            if (neighbors.get(i).getNeighbor() == neighborName) {
                neighbors.remove(i);
                return;
            }
        }
    }

}
