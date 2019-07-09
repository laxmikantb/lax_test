import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDeepCopy {
 class GraphNode {
	 int label;
	 ArrayList<GraphNode> neighbors;
	 GraphNode(int x) {
		 label = x;
		 neighbors = new ArrayList<GraphNode>();
	 }
 }
 
 public GraphNode deepCopy(GraphNode root)
 {
	 Queue<GraphNode> q = new LinkedList<GraphNode>();
	 GraphNode newHead = new GraphNode(root.label);
	 q.add(root);
	 // maintain hashmap
	 HashMap<GraphNode, GraphNode> map = new HashMap<GraphNode, GraphNode>();
	 map.put(root, newHead);
	 while (!q.isEmpty()) {
		 GraphNode curr = q.poll();
		 ArrayList<GraphNode> currNeigbours = curr.neighbors;
		 for (GraphNode aNeigbor : currNeigbours) {
			 if (!map.containsKey(aNeigbor)) {
				 GraphNode copy = new GraphNode(aNeigbor.label);
				 map.put(aNeigbor, copy);
				 map.get(curr).neighbors.add(copy);
				 q.add(aNeigbor);
			 } else {
				 map.get(curr).neighbors.add(map.get(aNeigbor));
			 }
		 }
	 }
	 return newHead;
 }
 
 public void bfs(GraphNode s) {
	 Queue<GraphNode> q = new LinkedList<GraphNode>();
	 q.add(s);
	 HashMap<GraphNode, Boolean> visited = new HashMap<GraphNode, Boolean>();
	 visited.put(s, true);
	 while(!q.isEmpty()) {
		 GraphNode curr = q.poll();
		 System.out.println("Label :" + curr.label);
		 System.out.println("Address " + curr);
		 if (curr.neighbors != null) {
			 ArrayList<GraphNode> list = curr.neighbors;
			 for (GraphNode g : list) {
				 if (visited.get(g) == null)
				 {
					 q.add(g);
					 visited.put(g, true);
				 }
			 }
		 }
	 }
	 System.out.println();
 }
 
 public GraphNode buildGraph() {
	 GraphNode g1 = new GraphNode(1);
	 GraphNode g2 = new GraphNode(2);
	 GraphNode g3 = new GraphNode(3);
	 GraphNode g4 = new GraphNode(4);
	 GraphNode g5 = new GraphNode(5);
	 ArrayList<GraphNode> list1 = new ArrayList<GraphNode>();
	 list1.add(g3);
	 list1.add(g4);
	 g1.neighbors = list1;
	 
	 ArrayList<GraphNode> list2 = new ArrayList<GraphNode>();
	 list1.add(g1);
	 list1.add(g2);
	 g2.neighbors = list2;
	 
	 return g1;
 }
 
 public static void main(String[] args) {
	 GraphDeepCopy s = new GraphDeepCopy();
	 GraphNode g = s.buildGraph();
	 System.out.println("Before clone");
	 s.bfs(g);
	 
	 GraphNode g2 = s.deepCopy(g);
	 System.out.println("After clone");
	 s.bfs(g2);
	 
	 
 }
}
