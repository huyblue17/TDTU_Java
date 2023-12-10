public class Test {

    public static void main(String[] args) {
        MyLinkedList<Fraction> listFraction = new MyLinkedList<>();
        MyLinkedList<Integer> listInteger = new MyLinkedList<>();

        //test add fraction
        for(int i = 1; i < 5; i++){
            listFraction.addLast(new Fraction(i, i+1));
        }
        listFraction.print();

        // Test interger EX3
        for(int i = 3; i <= 10; i += 1){
            listInteger.addLast(i);
        }
        listInteger.print();
        
        System.out.println("even number in LL: " + listInteger.countEven());
        System.out.println("prime number in LL: " + listInteger.countPrime());

        listInteger.addBeforeFEven(5);
        System.out.print("after add before first even: ");
        
        listInteger.print();
        System.out.println("max of linked list: " + listInteger.findMax());
        System.out.println("reverse list: " + listInteger.reverse());
    }
}