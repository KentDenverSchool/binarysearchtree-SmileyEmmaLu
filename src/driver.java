public class driver {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> b= new BinarySearchTree<>();
        b.put(5,"h");
        System.out.println(b.size()); // should be 1
        b.put(2, "a");
        b.put(3, "b");
        System.out.println(b.size()); // should be 3

        System.out.println(b.remove(2)); // should print "a"
        System.out.println(b.contains(2));// should be false

        System.out.println(b.isEmpty()); // true false;


        System.out.println(b.max());
        System.out.println(b.min());
    }

}
