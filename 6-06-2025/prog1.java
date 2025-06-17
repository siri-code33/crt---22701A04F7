import java.util.ArrayList;
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
       graph.addEdge(1,0);
       graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(3,2);
        graph.printGraph();
    }
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    Graph(int vertices){
        this.vertices=vertices;
        this.graph=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
        graph.add(new HashSet<Integer>());
    }
    
}
void addEdge(int src,int dest){
    if(isValid(src,dest)){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    else{
        System.out.println("Invalid source or destination");
    }
}
void removeEdge(int src,int dest){
    if(isValid(src,dest)){
        graph.get(src).remove(dest);
        graph.get(dest).remove(src);
    }
    else{
        System.out.println("Invalid source and destination");
    }
}
public HashSet<Integer>neighbours(int node){
    return graph.get(node);
}
boolean isHavingEdge(int src,int dest){
    if(isValid(src,dest)){
        var arr=graph.get(src);
        for(int i:arr){
            if(i==dest){
                return true;
            }
        }
        return false;
    }
    System.out.println("Invalid source and destination");
    return false;
}
boolean isValid(int src,int dest){
    return src>=0&dest>=0&&src<vertices&&dest<vertices&&src!=dest;

}
void printGraph(){
    for(int i=0;i<vertices;i++){
        System.out.println(i+":"+graph.get(i));
        
    }
}
}
