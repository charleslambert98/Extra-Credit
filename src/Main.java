import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){

        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, String> hm = new HashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();

        hashSetOps hsOp = new hashSetOps(hs);
        hashMapOps hmOp = new hashMapOps(hm);
        treeMapOps tmOp = new treeMapOps(tm);

        hsOp.add();
        hsOp.printHS();
    }
}
