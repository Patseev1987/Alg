import java.time.LocalTime;
import java.util.Date;

public class Sort {

    public static void bubbleSort(int[] array) {
        Sort sort = new Sort();
        boolean isDone;
        do {
            isDone = false;
            int temp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isDone = true;
                }
            }
        } while (isDone);
    }

    public static void selectSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static int binarySearch(int[] array, int value, int firstIndex, int lastIndex) {
        int midl;
        if (lastIndex < firstIndex) {
            return -1;
        } else {
            midl = (lastIndex - firstIndex) / 2 + firstIndex;
        }
        if (array[midl] < value) {
            return binarySearch(array, value, midl + 1, lastIndex);
        } else if (array[midl] > value) {
            return binarySearch(array, value, firstIndex, midl - 1);
        } else {
            return midl;
        }
    }

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    public static void fastSort(int[] array, int startIndex, int lastIndex) {
        int left = startIndex;
        int right = lastIndex;
        int pivot = array[(startIndex + lastIndex) / 2];
        do {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                left++;
                right--;
            }
        } while (left <= right);
        if (left < lastIndex) {
            fastSort(array, left, lastIndex);
        }
        if (startIndex < right) {
            fastSort(array, startIndex, right);
        }
    }

    public static void fastSort(int[] array) {
        Sort.fastSort(array, 0, array.length - 1);
    }

    public static void heapSort(int[] array) {
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            makeHeap(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            makeHeap(array, i, 0);
        }
    }

    private static void makeHeap(int[] array, int heapSize, int root) {
        int largest = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        if (leftChild < heapSize && array[leftChild] > array[root]) {
            largest = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[root]) {
            largest = rightChild;
        }
        if (largest != root) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;
            makeHeap(array, heapSize, largest);
        }

    }


}

