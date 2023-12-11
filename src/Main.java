public class Main {
    public static void main(String[] args) {

        GBLinkedList<Integer> integers = new GBLinkedList<>();

        integers.add(1);
        integers.add(12);
        integers.add(123);
        integers.add(1234);
        integers.add(3, 12345);
        integers.addFirst(0);
        integers.addLast(6);

        System.out.println(integers);
        System.out.println(integers);
        integers.removeFirst();
        System.out.println(integers);
        integers.removeLast();
        System.out.println(integers);

        integers.update(0, 10);
        System.out.println(integers);


        for (Integer el : integers) System.out.println(el);
    }
}