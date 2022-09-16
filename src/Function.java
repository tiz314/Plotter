public class Function {

    private String track;
    private Graph graph;

    public Function(String track, int graphSize) {
        this.track = track;
        graph = new Graph(graphSize);
    }

    public String getLineEquation(double m, double q) {
        int i, x, y;
        for (i = 0; i < graph.getGRAPH_SIZE(); i++) { // x position in array
            x = -graph.getAREA_SIZE() + i; // x position in mathematical graph
            y = (int) Math.round(x * m + q); // y position in mathematical graph

            if(y >= 0){ // y position fixed for array
                y = graph.getAREA_SIZE() - y;
            }else{
                y = Math.abs(y) + graph.getAREA_SIZE();
            }
            System.out.println("y: " + y);

            if (y >= 0 && y < graph.getGRAPH_SIZE()) {
                graph.writeGraph(i, y);
            }else{
                System.out.println("escluso: y: " + y + " i: " + i);
            }
        }
        return graph.printGraph();
    }

    public String getTrack() {
        return track;
    }

}
