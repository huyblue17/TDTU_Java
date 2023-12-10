public class Ex5 {
    public static int decimalTobinary(int dec) {
        if (dec == 0) {
            return 0;
        } 
        else {
            return dec % 2 + 10 * decimalTobinary(dec / 2);
        }
    }
    
    public static void main(String[] args) {
        int dec = 8;
        System.out.print("Dec to bin: " + decimalTobinary(dec));
    }
}
