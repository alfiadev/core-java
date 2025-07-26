import java.util.Comparator;
import java.util.TreeSet;

public class CustomCompareInteger implements Comparable<CustomCompareInteger> {
    int value;

    public static void main(String[] args) {
        TreeSet<CustomCompareInteger> t = new TreeSet<CustomCompareInteger>();
        t.add(new CustomCompareInteger(124));
        t.add(new CustomCompareInteger(23));
        t.add(new CustomCompareInteger(11));
        t.add(new CustomCompareInteger(1440));
        t.add(new CustomCompareInteger(30));

        for (CustomCompareInteger num : t) {
            System.out.println(num.getValue());
        }

    }

    public int compareTo(CustomCompareInteger i2) {
        CustomCompareInteger i1 = this;
        Integer val = i1.value;
        Integer val2 = i2.value;
        if (val.compareTo(val2) != 0) {
            return val.compareTo(val2) * -1;
        } else {
            return 0;
        }

    }

    public CustomCompareInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class MyCompare1 implements Comparator<CustomCompareInteger> {
    public int compare(CustomCompareInteger i, CustomCompareInteger i2) {
        int  vall = i.getValue();
       int vall2 = i2.getValue();

        int  l1 = toString(vall).length();
         int  l2 = toString(vall2).length();

        if (l1 > l2) {
            int temp;
            temp = l1;
            l1 = l2;
            l2 = temp;

        }

    }
}
