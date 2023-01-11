import java.util.ArrayList;

public class CycleDetection {
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

    public static boolean cycleDetection(ArrayList<Edge>[]graph){
        //this function is used for if there is multiple connected components
        boolean []vis = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(cycleDetectionUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean cycleDetectionUtil(ArrayList<Edge>[]graph, boolean[] vis, int curr, int par){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest] && cycleDetectionUtil(graph,vis,e.dest,curr)){
                return true;
            }else if(vis[e.dest] && e.dest != par){
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

        System.out.println(cycleDetection(graph));

    }
}
