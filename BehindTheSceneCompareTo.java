public class BehindTheSceneCompareTo {
    public static void main(String[] args) {
        String[] name = { "ale", "Alfia", "zara", "Minakshi", "zoi" };
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = 0; j < name.length - 1; j++) {
                if (name[j].length() > name[j + 1].length()) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                } else if ((name[j].length() == name[j + 1].length()) && name[j].compareTo(name[j + 1]) > 0) {

                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
            System.out.println("sorted by name length");
            for (String names : name) {
                System.out.println(names);

            }
        }

    }

}
