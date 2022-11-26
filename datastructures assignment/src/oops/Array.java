package oops;

public class Array {
    public static void main(String[] args){
            int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
            int elt=26;

            int eltidx=LinearSearch(arr,elt);

            if(eltidx!=-1){
                System.out.println("Element "+elt+" Found at "+eltidx+" index");
            }else{
                System.out.println("Element " +elt+ " Not found");
            }
    }
    public static int LinearSearch(int[] arr,int elm){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(elm==arr[i]){
                idx=i;
                break;
            }
        }return idx;

    }
}
