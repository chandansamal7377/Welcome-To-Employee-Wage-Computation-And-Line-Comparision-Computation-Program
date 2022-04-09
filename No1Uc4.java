class No1Uc4
{
    public static void main(String arg[])
    {
        final int Part_Time = 1;
        final int Full_Time = 2;
        final int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours =0;
        switch (empType)
        {
            case Full_Time:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case Part_Time:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");    
        }
        int wage = workingHours * Wage_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);
    }
}