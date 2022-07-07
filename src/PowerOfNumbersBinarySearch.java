public class PowerOfNumbersBinarySearch {
    static long mod = (long)1e9*7;
    public static long powerOfNumbersBinarySearch(int n, int a){
        if(n==1){
            return a;
        }
        long storage = powerOfNumbersBinarySearch(n/2, a);
        if(n%2 ==1){
            return ((storage*storage)%mod* a)%mod;
        }else{
            return (storage*storage)%mod;
        }

    }



    public static void main(String[] args) {

    }
}
