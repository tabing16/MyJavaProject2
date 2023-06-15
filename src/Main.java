public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age: " + tim.getAge());
        System.out.println("Pay:" + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1985", "01/01/2020", 35000.00);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","11/01/1989","10/10/2020", 15);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());

    }
}
