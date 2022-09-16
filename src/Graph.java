public class Graph {

    private final int GRAPH_SIZE;
    private final int AREA_SIZE;
    private char[][] graph;

    public Graph(int size) {
        AREA_SIZE = size;
        GRAPH_SIZE = size * 2 + 1; // Setting matrix size (4 areas)
        graph = new char[GRAPH_SIZE][GRAPH_SIZE];
        clearGraph(); // Initializing the graph
    }

    private void clearGraph() {
        int i, j;
        for (i = 0; i < GRAPH_SIZE; i++) {
            for (j = 0; j < GRAPH_SIZE; j++) {
                graph[i][j] = ' ';
            }
        }
    }

    public void writeGraph(int x, int y) {
        try {
            graph[y][x] = '*';
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }


    public String printGraph() {
        String res = "";
        int i, j;

        for (i = 0; i < GRAPH_SIZE / 2; i++) {
            res += "  ";
        }
        res += "^\n";

        for (i = 0; i < GRAPH_SIZE / 2; i++) {

            for (j = 0; j < GRAPH_SIZE / 2; j++) {
                res += graph[i][j] + " ";
            }

            if (graph[i][GRAPH_SIZE / 2] == ' ') res += "| ";
            else res += "* ";

            for (j = GRAPH_SIZE / 2 + 1; j < GRAPH_SIZE; j++) {
                res += graph[i][j] + " ";
            }

            res += "\n";
        }

        /*

         *******|*******
         *******|*******

         */

        for (i = 0; i < GRAPH_SIZE; i++) {
            if (graph[GRAPH_SIZE / 2][i] == ' ') res += "--";
            else res += "* ";
        }

        res += ">\n";

        /*

        ----*---*---------

         */

        for (i = GRAPH_SIZE / 2 + 1; i < GRAPH_SIZE; i++) {

            for (j = 0; j < GRAPH_SIZE / 2; j++) {
                res += graph[i][j] + " ";
            }

            if (graph[i][GRAPH_SIZE / 2] == ' ') res += "| ";
            else res += "* ";

            for (j = GRAPH_SIZE / 2 + 1; j < GRAPH_SIZE; j++) {
                res += graph[i][j] + " ";
            }

            res += "\n";
        }

        /*

         *******|*******
         *******|*******

         */
        return res;
    }

    public int getGRAPH_SIZE() {
        return GRAPH_SIZE;
    }

    public int getAREA_SIZE() {
        return AREA_SIZE;
    }

}
