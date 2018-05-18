import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){

        HashSet<Integer> hs = new HashSet<>(100); //Set so that values up to 100 can be added (16 is default)
        HashMap<Integer, String> hm = new HashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();

        hashSetOps hsOp = new hashSetOps(hs);
        hashMapOps hmOp = new hashMapOps(hm);
        treeMapOps tmOp = new treeMapOps(tm);

        System.out.println("Now Working With A HashSet!");
        System.out.println("===========================");
        hsOp.add();
        hsOp.printHS();
        hsOp.clearHS();
        hsOp.printHS();
        System.out.println("===========================");

        System.out.println("Now Working With A HashMap!");
        System.out.println("===========================");
        hmOp.add();
        hmOp.unlock();
        System.out.println("===========================");

        System.out.println("Now Working With A TreeMap!");
        System.out.println("===========================");
        tmOp.add();
        tmOp.printTM();
        System.out.println("===========================");
    }
}
