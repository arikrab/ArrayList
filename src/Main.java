public class Main {

    public static void main(String[] args) {

        int[] arr2;
        ArrayList arr = new ArrayList();


        arr.add(5);
        arr.printArray();
        arr.add(4);
        arr.printArray();
        arr.add(3);
        arr.add(2);
        arr.printArray();
        arr.remove(3);
        arr.printArray();
        arr.add(7,2);
        arr.printArray();

        arr2=arr.toArray();
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
        arr.clear();
        arr.printArray();



    }

}
