public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        int n = path.length();
        for(int i=0; i<n; i++){
            if(path.charAt(i) == 'W'){
                x--;
            }else if(path.charAt(i) == 'E'){
                x++;
            }else if(path.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }
        //equation of shortest direction on graph is: (sqrt of (x2-x1)^2 + (y2-y1)^2)
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
