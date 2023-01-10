import java.util.ArrayList;

public class DFS {
    static class Edge{
        int src;
        int dest;
        int wt;
        public  Edge(int s, int d, int w){
            this.src =s;
            this.dest =d;
            this.wt =w;
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, int src , int dest, boolean[] vis){
        if(src == dest) return true;
        //marke true curr node
        vis[src] = true;
        //explore curr's neighbors
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest => neighbors
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //create graph
        int v = 5;
        ArrayList<Edge>[]graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        //0-vertex
        graph[0].add(new Edge(0,1,5));
        //1-vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        //2-vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));
        //3-vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        //4-vertex
        graph[4].add(new Edge(4,2,2));

//        dfs(graph,0,new boolean[v]);

        // problem: Has Path?
        System.out.println(hasPath(graph,0,4,new boolean[v]));
    }
}
