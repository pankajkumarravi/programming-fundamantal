package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/11/21 10:10 PM
 */
public class PerfectNumber {
    int isPerfect(int N) {
        // code here
        {
// code here
            int tsum,fsum=0;
            int t,rNum=N;
            while(N>0){
                t=N%10;
                tsum=1;
                while(t>0){
                    tsum*=t;
                    t--;
                }
                fsum+=tsum;
                N=N/10;
            }
            if(fsum==rNum) return 1;
            else return 0;
        }
            /* int digit, sum = 0;
        // find digit
        //find  !
        // store in sum
        // remove last digit
        while (N > 0) {
            digit = N % 10;
            sum = sum+ factorial(digit);
            N = N / 10;
        } if (N == sum)
        return 1;
        else
            return 0;
    }
    public static int factorial(int n){
        int i=1,sum=1;
        while (i<= n){
            sum=sum*i;
            i++;
        }
        return sum;*/
    }

    public static void main(String[] args) {
        System.out.println(new PerfectNumber().isPerfect(23));
        System.out.println(new PerfectNumber().isPerfect(145));
    }
}