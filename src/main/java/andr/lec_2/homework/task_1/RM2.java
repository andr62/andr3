package andr.lec_2.homework.task_1;

public class RM2 {
    public static void main(String[] args) {
        double firstDayDist = 10;
        double everyDayDist = firstDayDist;
        double totalDays = 7;
        double totalTrackDist = everyDayDist + firstDayDist;
        for (double days = 1; days <= totalDays; days++) {
            everyDayDist = (double) (firstDayDist + firstDayDist * 0.1);
            totalTrackDist = totalTrackDist + everyDayDist;
        }
        System.out.println(totalTrackDist);
    }
}
