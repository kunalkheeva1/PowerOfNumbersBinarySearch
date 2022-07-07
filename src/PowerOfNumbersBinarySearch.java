public class PowerOfNumbersBinarySearch {

    public static long powerOfNumbersBinarySearch(int n, int a){
        if(n==1){
            return a;
        }
        long storage = powerOfNumbersBinarySearch(n/2, a);
        if(n%2 ==1){
            return storage*storage* a;
        }else{
            return storage*storage;
        }

    }



    public static void main(String[] args) {

    }
}
