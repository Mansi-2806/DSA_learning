public class array_binary {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int element=50;
        int low=0;
        int high=arr.length-1;

        boolean found=false;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==element){
               found=true;
               System.out.println("the elemet found at" + mid);
               break;
           }
           else if(arr[mid]>element){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       if(!found){
           System.out.println("the elemet not found");
       }
    }
}
