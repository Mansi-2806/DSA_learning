public class array_searching {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int element = 20;
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                System.out.println("the element is found at postion" + " " + i);

                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }

    }

}