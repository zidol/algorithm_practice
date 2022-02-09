package easy.ch4.graph;

public class UndirectedGraph{
    private int count;// 노드 개수
    private int[][] vertexMatrix;

    public UndirectedGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){
        //undirect일때 사용 가능
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getMatrix(){
        return vertexMatrix;
    }
}

