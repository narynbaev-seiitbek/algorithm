package grokkingAlgorithm;

public class Main {

    public static void main(String[] args) {

        int[] list = new int[] {1,2,5,8,9,14,55};
        System.out.println(binarySort(list,5));

    }
    private static Integer binarySort(int[] list,int item) {
        int low = 0;
        int high = list.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            int guess = list[mid];
            if (guess==item) {
                return guess;
            }
            if (guess>item) {
                high = mid-1;
            }else {
                low = mid+1;
            }
            }
        return null;
    }
}

