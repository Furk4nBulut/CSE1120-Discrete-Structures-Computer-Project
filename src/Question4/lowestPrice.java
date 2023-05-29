package Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class lowestPrice {
    /*
                   Price          San Francisco | Detroit | New York | Denver | Los Angeles
                  San Francisco         0       |    329  |   359    |   179 |     69
                  Detroit             329       |     0   |   189    |   229 |    349
                  New York            359       |   189   |     0    |   279 |    379
                  Denver              179       |   229   |   279    |     0 |    209
                  Los Angeles          69       |   209   |   379    |   209 |      0


                   boolean        San Francisco | Detroit | New York | Denver | Los Angeles
                  San Francisco         0       |    1    |   1      |   1    |    1
                  Detroit               1       |    0    |   1      |   1    |    1
                  New York              1       |    1    |   0      |   1    |    1
                  Denver                1       |    1    |   1      |   0    |    1
                  Los Angeles           1       |    1    |   1      |   1    |    0

*/
    public static void main(String[] args) {
        GraphNode sanfrancisco = new GraphNode("San Francisco");
        GraphNode losangeles = new GraphNode("Los Angeles");
        GraphNode detroit = new GraphNode("Detroit");
        GraphNode newyork = new GraphNode("New York");
        GraphNode denver = new GraphNode("Denver");

        sanfrancisco.addNeighbor(losangeles, 69);
        sanfrancisco.addNeighbor(detroit, 329);
        sanfrancisco.addNeighbor(newyork, 359);
        sanfrancisco.addNeighbor(denver, 179);

        losangeles.addNeighbor(detroit, 349);
        losangeles.addNeighbor(newyork, 379);
        losangeles.addNeighbor(denver, 209);
        losangeles.addNeighbor(sanfrancisco, 69);

        newyork.addNeighbor(denver, 279);
        newyork.addNeighbor(detroit, 189);
        newyork.addNeighbor(sanfrancisco, 359);
        newyork.addNeighbor(losangeles, 379);

        denver.addNeighbor(detroit, 229);
        denver.addNeighbor(newyork, 279);
        denver.addNeighbor(sanfrancisco, 179);
        denver.addNeighbor(losangeles, 209);

        detroit.addNeighbor(newyork, 189);
        detroit.addNeighbor(losangeles, 349);
        detroit.addNeighbor(sanfrancisco, 329);
        detroit.addNeighbor(denver, 229);
        int totalCost = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the city you want to start: (Los Angeles, San Francisco, New York, Denver, Detroit))");
        String city = scanner.nextLine();
        GraphNode current = null;
        switch (city) {
            case "San Francisco":
                current = sanfrancisco;
                break;
            case "Los Angeles":
                current = losangeles;
                break;
            case "New York":
                current = newyork;
                break;
            case "Denver":
                current = denver;
                break;
            case "Detroit":
                current = detroit;
                break;
            default:
                System.out.println("Please enter a valid city name!");
                break;
        }
        ArrayList<GraphNode> visitedCities = new ArrayList<>();
        while (current.getNeighbors().size() > 0) {
            GraphNode minNode = null;
            int minCost = Integer.MAX_VALUE;
            for (WeightedEdge edge : current.getNeighbors()) {
                if (edge.getWeight() < minCost && !visitedCities.contains(edge.getNeighbor())) {
                    minCost = edge.getWeight();
                    minNode = edge.getNeighbor();} }
            if (minNode == null) { break;}
            current.removeEdge(minNode);
            minNode.removeEdge(current);
            visitedCities.add(current);
            System.out.println("--------------------------------------------------");
            System.out.println("Your current location is " + current.getName());
            System.out.println("Going to " + minNode.getName() + " with cost " + minCost + "$");
            totalCost += minCost;
            current = minNode;}
        System.out.println("--------------------------------------------------");
        System.out.println("You have been visited in order: ");
        for (GraphNode cityNode : visitedCities) {
            System.out.print(cityNode.getName()+" -> " );}
        System.out.println(current.getName());
        System.out.println("Total cost: " + totalCost+ "$");
    }
}
