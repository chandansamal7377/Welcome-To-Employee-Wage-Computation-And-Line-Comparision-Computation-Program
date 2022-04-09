class No1Uc3 
{
    public static void main(String arg[])
    {
        final int Part_Time = 1;
        final int Full_Time = 2;
        final int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        if (empType == Full_Time)
        {
            System.out.println("Employee is Present Full time");
            workingHours = 8;
        } else if (empType == Part_Time)
        {
            System.out.println("Employee is Present Part time");
            workingHours = 4;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * Wage_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);
    }
}