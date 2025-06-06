package Class03;

import java.util.HashMap;
import java.util.TreeMap;

public class Code09_HashMapAndSortedMap {
    public static class Node {
        public int value;

        public Node(int v) {
            value = v;
        }
    }

    public static class Zuo {
        public int value;

        public Zuo(int v) {
            value = v;
        }
    }

    public static void main(String[] args) {
//        HashMap<Integer,Integer>test=new HashMap<>();
//        Integer a=19000000;
//        Integer b=19000000;
//        System.out.println(a==b);
////        System.out.println("=======");
////        test.put(a, "我是3");
////        System.out.println(test.containsKey(b));
////上面的这个操作是不可以进行的
//        System.out.println("=======");
//
//        Zuo z1=new Zuo(1);
//        Zuo z2=new Zuo(1);
//        HashMap<Zuo,String>test2=new HashMap<>();
//        test2.put(z1,"我是z1");
//        System.out.println(test2.containsKey(z2));
//        //两者的内存地址不相同，会打印false
//
//        //UnSortedMap
//        HashMap<Integer,String>map = new HashMap<>();
//        map.put(1000000,"我是1000000");
//        map.put(1,"我是1");
//        map.put(2,"我是2");
//        map.put(3,"我是3");
//        map.put(4,"我是4");
//        map.put(5,"我是5");
//        map.put(6,"我是6");
//        map.put(1000000,"我是1000001");
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsKey(2));
//        System.out.println("=======");
//        System.out.println(map.get(4));
//        System.out.println(map.get(10));
//        System.out.println("=======");
//        map.put(4,"他是4");
//        System.out.println(map.get(4));
//        System.out.println("=======");
//        map.remove(4);
//        System.out.println(map.get(4));
//        System.out.println("=======");
//
//        //key
//        HashSet<String>set = new HashSet<>();
//        set.add("abc");
//        set.contains("abc");
//        set.remove("abc");
//
//        //哈希表的增删改查的时间复杂度都是O(1)
//        System.out.println("=======");
//
//        Integer c=100000;
//        Integer d=100000;
//        System.out.println(c.equals(b));
//
//        Integer e = 127;//-128~127
//        Integer f=127;
//        System.out.println(e==f);
//
        HashMap<Node, String> map2 = new HashMap<>();
        Node node1 = new Node(1);
        Node node2 = node1;
        map2.put(node1, "我是node1");
        map2.put(node2, "我是node1");
        System.out.println(map2.size());
        System.out.println("=======");

        //TreeMap 有序表:接口名
        //红黑树，avl树,sb树，跳表
        //有序表的时间复杂度是O(logN）

        System.out.println("有序表测试开始");
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "我是3");
        treeMap.put(4, "我是4");
        treeMap.put(8, "我是8");
        treeMap.put(5, "我是5");
        treeMap.put(7, "我是7");
        treeMap.put(1, "我是1");
        treeMap.put(2, "我是2");
        System.out.println(treeMap.containsKey(1));
        System.out.println(treeMap.containsKey(10));
        System.out.println(treeMap.get(4));
        System.out.println(treeMap.get(10));
        treeMap.put(4, "他是4");
        System.out.println(treeMap.get(4));

        System.out.println("新鲜：");

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        //<=4
        System.out.println(treeMap.floorKey(4));
        //>=4
        System.out.println(treeMap.ceilingKey(4));


    }
}
