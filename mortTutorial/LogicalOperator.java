public class LogicalOperator {

    public static void main (String[] args){
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature <30; //&& 'and' operator
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        // || 'or' operator
        // to be eligible, one must not have criminal record
        // !hasCriminalRecord == 'NOT' hasCriminalRecord
        System.out.println(isEligible);



    }
}
