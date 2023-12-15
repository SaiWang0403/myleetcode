import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class solution {
    int longestDirectedPath(int start, Map<Integer, List<Integer>> g) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        int res = -1;
        while (!q.isEmpty()) {
            res++;
            for (int i = q.size(); i > 0; i--) {
                int t = q.poll();
                for (int ne : g.get(t)) {
                    q.offer(ne);
                }
            }
        }

        return res;
    }
}

class Vertex {
    long id;
}

class Edge {
    int from;
    int to;
}