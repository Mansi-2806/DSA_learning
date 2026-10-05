public class array_bubblesort {
    public static void main(String[] args) {

        int[] arr={10,2,78,100};
        boolean swapped =false;
        for(int i=1;i<arr.length;i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }



            for (int e : arr) {
                System.out.println(e);
            }
        }

    }

