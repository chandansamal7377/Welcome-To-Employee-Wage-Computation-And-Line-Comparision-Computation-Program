class No1Uc2
{
    public static void main(String arg[])
    {
        final int FUll_Time = 1;
        final int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        if (empType == FUll_Time)
        {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * Wage_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);
    }
}