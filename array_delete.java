public class array_delete {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};
        int indexpos = 2;

        int[] newarr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++){
            if(i==indexpos){
                continue;
            }
            newarr[j]=arr[i];
            j++;

        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);

        }

    }
}