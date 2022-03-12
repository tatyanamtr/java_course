package src;

import static java.lang.Integer.*;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(division(-8.6,3.2));
//        System.out.println(division2(18,4));
//        System.out.println(division3(23,4));
//        System.out.println(fibonacci(10));
//        System.out.println(fizzbuzz(11));
//        System.out.println(isPalindrome(121));
//        System.out.println(mySqrt(2147395600));
    }

    public static double division(double a, double b) {
        return a*Math.pow(b, -1);
    }
    public static int division2(int a, int b){
        int i = 0;
        while (a>=b) {
            a-=b;
            i++;
        }
        return i;
    }

    public static int division3(int a, int b){
        int i = 1;
        int c = b;
        while(b < a) {
            b= c*i;
            i++;
        }
        return i-1;
    }
    public static int fibonacci(int n) {
        int result;
        if (n<=1) {
            result = 0;
        } else if (n==2) {
            result = 1;
        } else {
            result=fibonacci(n-1)+fibonacci(n-2);
        }
        return result;
    }
    public static String fizzbuzz(int n) {
        if (n%3 ==0 && n%5 == 0) {
            return "fizzbuzz";
        } else if (n%3 == 0) {
            return "fizz";
        } else if (n%5==0) {
            return "buzz";
        }
        else return "zzubzzif";
    }

    public static boolean isPalindrome(int x) {
        if (x<=10) {
            return false;
        } else {
            String s = ""+x;
            String[] arr = s.split("");
            for (int i=0; i<arr.length/2; i++){
                if (valueOf(arr[i]) != valueOf(arr[arr.length-1-i])) {
                    return false;
                }
            }

        }
        return true;

    }


    public int mySqrt(int x) {
        long y = (long)x;
        long i = 1l;
        if ( x == 1) {
            return 1;
        } else if (x < 1) {
            return 0;
        }
        else {
            while (i*i <= y) {
                i++;
            }
            return (int)i-1;
        }
    }



        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length; j++){
                    if (nums[i]+nums[j]==target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }

        public int lengthOfLastWord(String s) {
            String[] words = s.split(" ");
            return words[words.length-1].length();
        }





}
