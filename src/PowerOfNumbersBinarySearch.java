public class PowerOfNumbersBinarySearch {
    static long mod = (long)1e9+7;
    public static long powerOfNumbersBinarySearch(int n, int a){

        // if n gets 1 then just return the value of integer as anything to power 1 is number itself
        if(n==1){
            return a;
        }
        //store all the possibilities until n/2 in every iteration
        long storage = powerOfNumbersBinarySearch(n/2, a);
        // if its odd number then please multiply the number itself too to manage the pwers
        if(n%2 ==1){
            return ((storage*storage)%mod* a)%mod;
            //else simply the multiples of storage
        }else{
            return (storage*storage)%mod;
        }

    }



    public static void main(String[] args) {

    }
}
