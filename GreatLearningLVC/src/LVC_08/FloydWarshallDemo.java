package LVC_08;


public class FloydWarshallDemo {
  public static void main(String[] args) {
      int V = 4;
      int[][] matrix = new int[V][V];

      for (int i = 0; i < V; i++) {
          for (int j = 0; j < V; j++) {
              matrix[i][j] = -1;
          }
      }

      matrix[0][1] = 2;
      matrix[1][0] = 1;
      matrix[1][2] = 3;
      matrix[3][0] = 3;
      matrix[3][1] = 5;
      matrix[3][2] = 4;

     FloydWarshall  obj = new FloydWarshall();
      obj.shortest_distance(matrix);

      for (int i = 0; i < V; i++) {
          for (int j = 0; j < V; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println("");
      }
  }
} 