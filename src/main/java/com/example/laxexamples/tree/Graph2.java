import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Graph2 {

    private int numVertex;
    private int numEdges;
    private boolean[][] adj;

    public Graph2(int numVertex, int numEdges) {
        this.numVertex = numVertex;
        this.numEdges = numEdges;
        this.adj = new boolean[numVertex][numVertex];
    }

    public void addEdge(int start, int end){
        adj[start-1][end-1] = true;
        adj[end-1][start-1] = true;
    }

    List<Integer> visited = new ArrayList<Integer>();

    /*
     * BFS
     * 1.Step 1: Push the root node in the Queue.
       2.Step 2: Loop until the queue is empty.
       3.Step 3: Remove the node from the Queue.
       4.Step 4: If the removed node has unvisited child nodes, mark them as visited and insert the unvisited children in the queue. 

     */
    /*
     * 1.Step 1: Push the root node in the Stack.  
       2.Step 2: Loop until stack is empty. 
       3.Step 3: Peek the node of the stack.  
       4.Step 4: If the node has unvisited child nodes, get the unvisited child node, mark it as traversed and push it on stack.   
       5.Step 5: If the node does not have any unvisited child nodes, pop the node from the stack

     */
    public Integer DFS(Graph2 G, int startVertex){
        int i=0;

        if(pilha.isEmpty())
            pilha.push(startVertex);

        for(i=1; i<G.numVertex; i++){
            pilha.push(i);
            if(G.adj[i-1][startVertex-1] != false){
                G.adj[i-1][startVertex-1] = false;
                G.adj[startVertex-1][i-1] = false;
                DFS(G,i);
                break;
            }else{
                visited.add(pilha.pop());
            }
            System.out.println("Stack: " + pilha);
        }
        return -1;
    }

    Stack<Integer> pilha = new Stack();

    public static void main(String[] args) {

        Graph2 g = new Graph2(6, 9);

        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(6, 4);

        g.DFS(g, 1);  
        g.DFS(g, 4);

    }
}