public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> newList = new DoubleLinkedList<Integer>();
        newList.add(6);
        newList.add(6);
        newList.add(5);
        newList.add(6);
        newList.add(8);
        //newList.add("привет");
        System.out.println(newList.toString());
        newList.insert(2, 2);
        System.out.println(newList.toString());
        newList.insert(0, 0);
        System.out.println(newList.toString());
        newList.insert(10, 3);
        System.out.println(newList.toString());
        newList.insert(7, 10);
        System.out.println(newList.toString());
        //newList.add(6);
        //System.out.println(newList.toString());
        newList.delete(6);
        System.out.println(newList.toString());
        newList.add(6);
        System.out.println(newList.toString());
        newList.sort();
        System.out.println(newList.toString());
        newList.add(20);
        System.out.println(newList.toString());
        newList.insert(17, 4);
        System.out.println(newList.toString());
        newList.insert(11, 0);
        System.out.println(newList.toString());
        newList.sort();
        System.out.println(newList.toString());
        System.out.println(newList.find(2));
        System.out.println(newList.find(11));
        System.out.println(newList.find(27));
        newList.insert(11, 2);
        System.out.println(newList.toString());
        System.out.println(newList.find(11));
    }
}
