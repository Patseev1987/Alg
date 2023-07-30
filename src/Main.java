import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {9,6,8,2,3,4,52,1,6,7,88,99,55,4,5,38,74,5,654,695,65,65,
                695,65,3,26,6,5,6,989,8,564,6,63,68,32,35,6556568,65,352,35,65,
                32,25,56,532,3,56,0,46848,8,8,34,53,45,34,534,5,4576,4537,56,7,45678,6754,8,54768,5674,8,5678,567,85,678,657,865,78,6578,65,78,6578,657,8,657,8,45,6,345,23,523,46,24578,456,8567,98,356,134,5,2457,568,567,8,3567,425,612,5,257,5,8,56779,6,7,245,23,675,368,4678,4,67,45,63,5687,467,878,9,789,567,3546,2456,34,567,45678,4768,467,8,46,7,356,245,6,3567};
    //    Sort.bubbleSort(array);
//        Sort.selectSort(array);
//        System.out.println(Arrays.toString(array));
//int x = Sort.binarySearch(array,3,0,array.length-1);
//        System.out.println(x);
//
//        int b = Sort.binarySearch(array,7);
//        System.out.println(b);
      //  long start = System.nanoTime();
    //    Sort.fastSort(array);
     //   Sort.selectSort(array);
     //   long finish = System.nanoTime();
        Sort.heapSort(array);
        System.out.println(Arrays.toString(array));
     //   System.out.println((finish-start)/1000);
    }
}