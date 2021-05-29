public class Logical_Operator {
    /* public static void main(String[] args) {
        int tempature = 22;
        boolean isWarm = tempature > 20 && tempature <30;
        System.out.println(isWarm);
    } */
    public static void main(String[] args) {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligibilr = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }
}
