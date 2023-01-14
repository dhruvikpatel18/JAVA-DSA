import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstrasAlgo {
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
    public static class Pair implements Comparable<Pair> {
        int n;
        int path;
        Pair(int n ,int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }

    }
    public static void dijkstras(ArrayList<Edge>[]graph,int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            //make all nodes dist as infinity
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                //explore neighbors
                for(int i=0; i<graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        //print all source to vertices shortest dis
        for(int i=0; i< dist.length; i++){
            System.out.print(dist[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
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

        dijkstras(graph,0);
    }
}
