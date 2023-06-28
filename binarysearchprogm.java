public class binarysearchprogm {
    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length - 1;

        while(start<=end){
            int mid = (start+end)/2;

            if (num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,7,10,13,17,21};
        int key = 10;

        System.out.println("The Element" + binarySearch(num, key));
        
    }
    
}
