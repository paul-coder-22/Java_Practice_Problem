public class Switch {
    public static void main(String[] args) {
        String value = "Bill";
        switch (value) {
            case ("Admin"):
                System.out.println("You're a moderator");
                break;
            case ("Bill"):
                System.out.println("You're are Rich");
                break;
            default:
                System.out.println("You're a guest");
                break;
        }
    }
}
