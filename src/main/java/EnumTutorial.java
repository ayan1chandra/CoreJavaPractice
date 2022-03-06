public class EnumTutorial {

    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.Friday;

        if(day == DaysOfTheWeek.Friday)
        {
            System.out.println("Its Party Time");
        }

        for(DaysOfTheWeek prday : DaysOfTheWeek.values()) {
            System.out.println(prday);
        }

        System.out.println("Happiness Index for Monday:"+ DaysOfTheWeekIndex.Monday.happy_index);
    }
}
