public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String val = '';
        for (int i = 0 ; i <= value.length ; i ++){
            val = value.charAt(i)+val;
        }
        System.out.println(val);
    }
}