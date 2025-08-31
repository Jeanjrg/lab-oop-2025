import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},
                        {4,5,6},
                        {7,8,9}}; 
        Scanner x = new Scanner(System.in); 
        try {
            int num = x.nextInt();
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[i].length;j++){
                    if(num==nums[i][j]){
                        System.out.printf("Found %d at [%d][%d]%n",num,i,j);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Yang dimasukkan itu angka pintar");
        }
        
    }
}
