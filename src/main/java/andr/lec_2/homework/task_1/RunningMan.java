package andr.lec_2.homework.task_1;

public class RunningMan {
    public static void main(String[] args) {
        double zeroDay = 10;
        double everyDay = zeroDay;
        double totalTrack = everyDay + zeroDay;
        for (double days = 1; days < 8; days++) {
            everyDay = zeroDay + zeroDay / 10;
            totalTrack = totalTrack + everyDay;
        }
System.out.println("OverallDist: " + totalTrack + " km");

    }
}