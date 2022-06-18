package pingwit.lec_7.hm.task_4;

import java.util.Locale;

public class IsThereAnything {
    public static void main(String[] args) {
        String text = """
                While major gameplay components are already in place and functioning,
                players help is needed to add some of the smaller features and content.
                Of course polishing the overall experience is important at the same time.
                Game has been extensively tested in closed group, but it is always important to hear fresh suggestions
                from larger crowd that come from various gaming backgrounds.
                add add
                Plan is to make the game as good as possible but without compromising the core idea.""";

                System.out.println(text);
                System.out.println(text.toLowerCase(Locale.ROOT).contains("alert"));
                System.out.println(text.toLowerCase(Locale.ROOT).contains("add"));
                System.out.println(text.toLowerCase(Locale.ROOT).contains("good"));
                System.out.println(text.toLowerCase(Locale.ROOT).contains("plan"));

                int countAdd = 0;
                int countGood = 0;
                int countPlan = 0;
                int countAddAgain = 0;
                
                if (text.toLowerCase(Locale.ROOT).contains("add")) {
                    countAdd++;
                }
                System.out.println(countAdd);

                if (text.toLowerCase(Locale.ROOT).contains("good")) {
                    countGood++;
                }
                System.out.println(countAdd);

                if (text.toLowerCase(Locale.ROOT).contains("plan")) {
                    ++countPlan;
                }
                System.out.println(countPlan);

                for (String word : text.split("text")) {
                    if (word.toLowerCase().contains("add")) {
                        countAddAgain++;
                    }
                }
                System.out.println(countAddAgain);

//                String[] words = {"alert", "add", "good","plan"};
//                String[] howManyTimes = text.split("\\s*(\\s|,|!|,\\.)\\s*");
//
//                for (String howManyTimes : howManyTimes) {
//                    int count = 0;
//                    for (String word : words) {
//                        if (howManyTimes.equals(word)) {
//                            count++;
//                        }
//                    }
//                }
//
//                System.out.println(Arrays.toString(howManyTimes));


    }
}

