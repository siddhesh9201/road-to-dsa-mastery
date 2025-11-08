package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,7};

        int start=0;
        int end=a.length-1;
        int key=7;
        while(start<=end){

            int mid= start+end/2;

            if(a[mid]==key){
                System.out.println("Element Found At Index :"+mid);
                break;
            }else if(a[mid]>key){
                end=mid-1;
            }else{
                start =mid+1;
            }
        }
    }
}
