public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        //sinh vien code tai day
        int s = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
            {
                s = s + a[i];
            }
        }
        return s;
    }

    
    public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 'a' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'i' || arr[i] == 'e')
            {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return String.valueOf(arr);

    }
	
	public static int findMinNegativeElement(int a[]){
        //sinh vien code tai day
        int min = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
            {
                min = i;
                break;
            }
        }
        int mini = min;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0 && a[i] < a[min])
            {
                mini = i;
            }
        }
        return mini;
    }
	
	public static String getName(String str){
        //sinh vien code tai day
        return str.substring(8);
    }

    public static int findFirstMod3Element(int[] a){
        //sinh vien code tai day
        int mod = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 3 != 0)
            {
                return i;
            }
        }
        return -1;
    }

    //public static int countString(String str, String k){
        //sinh vien code tai day
    //}
    
    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
        System.out.println(sumNegativeElements(a));
        System.out.println(findMinNegativeElement(a));
        System.out.println(findFirstMod3Element(a));
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
        System.out.println(uppercaseFirstVowels(s));
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
        System.out.println(getName(s1));
		//sinh vien code tai day
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
		//sinh vien code tai day
    }

}