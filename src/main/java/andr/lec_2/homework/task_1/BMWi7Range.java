package andr.lec_2.homework.task_1;

public class BMWi7Range {
    public static void main(String[] args) {
        double newBatteryDist = 672;
        double oneYearDecrease = newBatteryDist;
        double totalBatteryDecrease = newBatteryDist - oneYearDecrease;
        for (double years = 1; years < 6; years++) {
            totalBatteryDecrease = totalBatteryDecrease - newBatteryDist / 10;
            double capacityLeft = (newBatteryDist - totalBatteryDecrease);
            double batteryDecrease = totalBatteryDecrease;
    System.out.println( "Capacity loss year by year in case of 5 years of usage: " + capacityLeft);
    System.out.println(batteryDecrease);
        }
    }
}
