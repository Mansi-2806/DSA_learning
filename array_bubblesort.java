public class array_bubblesort {
    public static void main(String[] args) {
        int[] arr={10,2,78,2,1,100};
        for(int i=1;i<arr.length;i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            for (int e : arr) {
                System.out.println(e);
            }

    }
}
