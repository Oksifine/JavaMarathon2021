package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private  Warehouse warehouse;
    private static final int SALARY_FOR_ONE_WORK = 100;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += SALARY_FOR_ONE_WORK;
        warehouse.deliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders()<10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
            salary+=50000;
        isPayed = true;
    }
}
