class No1Uc5
{
    public static void main(String arg[])
    {
        final int Part_Time = 1;
        final int Full_Time = 2;
        final int Wage_Per_Hr = 20;
        final int Working_Days = 20;
    
        int totalWage = 0;
        for (int day = 1; day <= Working_Days; day++)
        {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (empType)
            {
                case Full_Time:
                    workingHours = 8;
                    break;
                case Part_Time:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours * Wage_Per_Hr;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);        
    }
}