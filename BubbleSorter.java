public class BubbleSorter extends Sorter{

    public BubbleSorter(int[] a ,int ps){
        s = System.nanoTime();
        this.a = a;
        System.out.print("\n\tBefore Sorting:");
        print(ps);
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[i]){
                    swap(i,j);
                }
            }
        }
        e = System.nanoTime();
        total = (e - s) / Math.pow(10, 9);
        print(ps);
        printTime();
    }
    private void swap(int i, int j){
        int t = 0;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
