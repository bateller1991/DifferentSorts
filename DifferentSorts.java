import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class DifferentSorts {
    Scanner input;
    int ui, ps;
    int[] a;

    public DifferentSorts(){
        ui = 0;
        while(ui != -1) {
            printMenu();
            input = new Scanner(System.in);
            System.out.print("\tSelection: ");
            ui = input.nextInt();
            switch(ui){
                case(-1):
                    System.out.println("\n\nExiting upon request ui = -1...");
                    System.exit(0);
                    break;
                case(1):
                    this.createArray();
                    break;
                case(2):
                    try {
                        int[] b = copyArr();
                        BubbleSorter bubble = new BubbleSorter(b, ps);
                    } catch(NullPointerException e){
                        System.out.println("\n\nMust Create Array First.");
                        this.createArray();
                    }
                    break;
                case(3):
                    try {
                        int[] m = copyArr();
                        MergeSorter merge = new MergeSorter(m, ps);
                    } catch(NullPointerException e){
                        System.out.println("\n\nMust Create Array First.");
                        this.createArray();
                    }
                    break;
                default:
                    System.out.println("\n\tRestarting due to receiving  non-accepted input from menu selection.\n");
                    DifferentSorts d = new DifferentSorts();
            }
        }
    }

    private void createArray(){
        System.out.println("\n\n\tCreating Array:\n");
        a = new int[0];
        int min, max;
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        try{
            a = new int[size];
        } catch(NegativeArraySizeException e){
            System.out.println("Array invalid Size...");
            System.exit(0);
        }


        min = 0;
        do {
            System.out.print("\n\nEnter Max Value of the Array's Range: ");
            max = input.nextInt();
        } while(min >= max);
        System.out.print("\nEnter Print Size: ");
        ps = input.nextInt();
        int i = 0;
        while(i < size){
            a[i++] = (int)(Math.random()*max) - (int)(Math.random()*min);
        }
    }

    private int[] copyArr(){
        int[] r = new int[a.length];
        for(int i = 0; i < a.length; i++){
            r[i] = a[i];
        }
        return r;
    }

    private void printMenu(){
        System.out.println("\n\tMain Menu:");
        System.out.println("(-1). Exit.");
        System.out.println("(1). Create an Array to Sort.");
        System.out.println("(2). BUBBLE SORT.");
        System.out.println("(3). MERGE SORT.");
        System.out.println("");

    }

    public static void main(String[] args) {
        System.out.println("\n\n\tComparing Sorting Algorithms Program: ");
        DifferentSorts d = new DifferentSorts();
    }
}
