package unitTesting;

import java.util.Scanner;

public class UnitTesting {
    Scanner inScanner = new Scanner(System.in);
    public double max(double a, double b){
        if(a > b){
            return a;
        }
        else if(a == b){
            return a;
        }
        else {
            return b;
        }
    }
    public double multi(double a, double b){
        return a*b;
    }
    public int existInArray(int[] arr, int a){
        for(int i = 0; i < arr.length; i++){
            if(a == arr[i]){
                return a;
            }
        }
        return -1;
    }
    public int areArrayEqual(int[] arr, int[] a){
        for(int i = 0; i < arr.length; i++){
            if(a[i] == arr[i]){
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        UnitTesting unitTesting = new UnitTesting();

        System.out.printf(String.valueOf(unitTesting.max(2,4))+"\n");
        System.out.printf(String.valueOf(unitTesting.multi(2,5)));
        int[] ar = {1,5,1,5,1,3,5,54,2,1,3};
        int[] ar1 = {1,2,3,4,5,6,7,8,9};
        int[] ar2 = {1,2,3,4,5,6,7,8,10};

        System.out.printf("\n Exist method "+String.valueOf(unitTesting.existInArray(ar,99)));
        System.out.printf("\n Array Equal method "+String.valueOf(unitTesting.areArrayEqual(ar1,ar2)));
    }
}
