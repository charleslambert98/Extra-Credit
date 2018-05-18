import java.util.HashSet;

public class hashSetOps {

    HashSet<Integer> hs;

    public hashSetOps(HashSet<Integer> hs) {
        this.hs = hs;
    }

    public void setHS(HashSet<Integer> hs) {
        this.hs = hs;
    }

    public HashSet<Integer> getHS() {

        return hs;
    }

    public void add(){
        //Demonstrates HashSets ability to sort through duplicates
        
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(4);
        hs.add(4);
        hs.add(5);
        hs.add(5);
        hs.add(5);
        hs.add(5);
        hs.add(5);
    }

    public void printHS(){
        System.out.println(hs);
    }
}
