public class array_updation {
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        int indexpos=2;
        int element =300;
        arr[indexpos]=element;
        for(int e:arr){
            System.out.println(e);
        }
    }
}