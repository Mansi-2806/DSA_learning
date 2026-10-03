public class array_insertion {

        public static void main(String[] args){
            int[] arr={10,20,30,40,50};
            int indexpos=2;
            int element=100;
            int[] newarr=new int[arr.length+1];
            for(int i=0;i<indexpos;i++){
                newarr[i]=arr[i];
            }
            newarr[indexpos]=element;
            for(int i=indexpos;i<arr.length;i++){
                newarr[i+1]=arr[i];
            }
            for(int e:newarr){
                System.out.println(e);
            }
            System.out.println(" ");
            for(int e1:arr){
                System.out.println(e1);
            }
        }
    }

