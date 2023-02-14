public class Sorter {
    double s, e, total;
    int[] a;

    public Sorter(){}

    public void print(int s){
        int i = 0, j = 2;
        System.out.print("\n\n\tPrinting Array:\n1.  ");
        while(i < s){
            System.out.print(a[i++] + " ");
            if(i%20 == 0){
                if(i == s){
                    break;
                }
                System.out.print("\n" + j++ + ".  ");
            }
        }
        System.out.println("\n");
    }

    public void printTime(){
        System.out.println(total + " seconds to Sort " + a.length + " values.");
    }
}
