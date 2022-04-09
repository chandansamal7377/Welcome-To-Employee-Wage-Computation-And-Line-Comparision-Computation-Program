class No1Uc6
{
    public static void main(String arg[])
    {
        final int Part_Time = 1;
        final int Full_Time = 2;
        final int Wage_Per_Hr = 20;
        final int MAX_Working_Days = 20;
        final int MAX_Working_Hrs = 100;

        int totalWage = 0;
        int workingHrs = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_Working_Days
                && totalWorkingHrs < MAX_Working_Hrs; day++, totalWorkingHrs += workingHrs)
        {

            int empType = (int) (Math.random() * 100) % 3;
            switch (empType)
            {
            case Full_Time:
                workingHrs = 8;
                break;
            case Part_Time:
                workingHrs = 4;
                break;
            default:
                workingHrs = 0;
                break;
            }
            int wage = workingHrs * Wage_Per_Hr;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}