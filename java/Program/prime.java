public class prime{
    public static void main(String[] args) {
        int value = 99;
        boolean isPrime = true;
        for (int i = 2 ; i < value ; i++){
            if (i%2 == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){

            System.out.println(i + "is a prime Number")
        }
        else
        System.out.println("Not a prime Number")   
    }
}