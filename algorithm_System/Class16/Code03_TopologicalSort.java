package Class16;

import java.util.*;

public class Code03_TopologicalSort {

    //directed  graph and loop
    public static List<Node> sortedTopological(Graph graph) {
        //key 为某个节点 value  为剩余的入度
        HashMap<Node, Integer> inMap = new HashMap<>();
        //只有剩余入度为零的点，才进入这个队列
        Queue<Node> zeroInQueue = new LinkedList<>();
        for (Node node : graph.nodes.values()) {
            inMap.put(node, node.in);
            if (node.in == 0) {
                zeroInQueue.add(node);
            }
        }
        List<Node> result = new ArrayList<>();
        while (!zeroInQueue.isEmpty()) {
            Node cur = zeroInQueue.poll();
            result.add(cur);
            for (Node next : cur.nexts) {
                inMap.put(next, inMap.get(next) - 1);
                if (inMap.get(next) == 0) {
                    zeroInQueue.add(next);
                }
            }
        }
        return result;
    }
}
