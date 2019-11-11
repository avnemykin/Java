import java.util.Random;
public class Main {

    public static void main(String[] args) {
	int[] arr ;
     arr = new int[20];
     for(int i = 0;i < 20;i++) {
         arr[i] = (int) (1000 - Math.random() * 2000);
         System.out.println(i + " = " + arr[i]);
     }
     System.out.print("Четные числа : ");
     for (int i = 0 ; i < 20 ;i ++)
     
     {
       if (arr[i] % 2 == 0)
              System.out.print( arr[i] + " , ");
     }
     System.out.print("\b" + "\b");
        System.out.println(".");
        System.out.print("Числа оканчивающиеся на 0  : ");
        for (int i = 0 ; i < 20 ;i ++)
        {
            if (arr[i] % 10 == 0)
                    System.out.print(arr[i] + " , ");
         }
        System.out.print("\b" + "\b");
        System.out.println(".");
    }
}
