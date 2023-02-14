import java.util.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class MergeSorter extends Sorter{

    public MergeSorter(int[] a, int ps){
        this.a = a;
        System.out.print("\n\tBefore Sorting:");
        print(ps);
        s = System.nanoTime();
        mergeSort(a);
        e = System.nanoTime();
        total = ((e - s) / Math.pow(10, 9));
        print(ps);
        printTime();
    }

    private void mergeSort(int[] a){
        int l = a.length, m = l/2;
        if(a.length < 2){
            return;
        }
        int[] left = new int[m];
        int[] right = new int[l-m];
        for(int i = 0; i < m; i++){
            left[i] = a[i];
        }
        for(int i = 0; i < right.length; i++){
            right[i] = a[m++];
        }
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
    }

    private void merge(int[] a, int[] left, int[] right){
        int as = a.length, ls = left.length, rs = right.length, i = 0, j = 0, k = 0;
        while(i < ls && j < rs){
            if(left[i] <= right[j]){
                a[k++] = left[i++];
            }
            else{
                a[k++] = right[j++];
            }
        }

        while(i < ls){
            a[k++] = left[i++];
        }
        while(j < rs) {
            a[k++] = right[j++];
        }
    }
}
