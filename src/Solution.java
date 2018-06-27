public class Solution {
    public static void main(String[] args) {

        int i = 1;
        int k = 1;

        while (i <= 10){
            while (k < 10){
                System.out.print(i * k + " ");
                k++;
            }
            System.out.println(i * k);
            i++;
            k=1;
        }

        //напишите тут ваш код

    }
}
