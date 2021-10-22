import java.util.*;
import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("Error Found !! ");
    }
}

public class BankInheritance{

    static void ageCheck(int input){
        if(input < 18){
            throw new ArithmeticException("Error");
        }else{
            System.out.println("Elogible FOr vote !!! ");
        }
    }
    
    public static void main(String[] args) throws IOException{
        try{
            ageCheck(14);
        }catch(ArithmeticException e){
            System.out.println("Exception Found !! ");
        }
        System.out.println("Last Block");
    }
}


/*         Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0 ; i < size ; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++){
            System.out.print(array[i]+" ");
        } */