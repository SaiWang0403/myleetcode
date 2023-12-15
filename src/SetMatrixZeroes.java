//import org.junit.Test;
//
//import java.util.*;
////int[] 是比地址
////arraylist是比值
//
//public class SetMatrixZeroes {
//    public void setZeroes(int[][] g) {
//        Set<Node> set = new HashSet<>();
//        int m = g.length, n = g[0].length;
//        for (int i = 0; i < m; i++)
//            for (int j = 0; j < n; j++)
//                if (g[i][j] == 0) set.add(new Node(i, j));
//
//        for (int i = 0; i < m; i++)
//            for (int j = 0; j < n; j++)
//                if (g[i][j] == 0 && contains(set, i, j))
//                    change(g, i, j);
//
//    }
//
//    void change(int[][] g, int i, int j) {
//        for (int k = 0; k < g[0].length; k++)
//            g[i][k] = 0;
//        for (int k = 0; k < g.length; k++)
//            g[k][j] = 0;
//    }
//
//    boolean contains(Set<Node> set, int i, int j) {
//        Node x = new Node(i, j);
//        return set.contains(x);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

//class Node {
//    int x, y;
//
//    public Node(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Node node = (Node) o;
//        return x == node.x && y == node.y;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }

//
//}

