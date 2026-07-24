import java.io.*;

class EmployeeDetails
{
    public static void main(String args[]) throws IOException
    {
       
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

      
        System.out.print("Enter Employee Number: ");
        int eno = Integer.parseInt(br.readLine());

       
        System.out.print("Enter Employee Name: ");
        String ename = br.readLine();

    
        System.out.print("Enter Gender (M/F): ");
        String gender = br.readLine();

    
        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(br.readLine());


        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name   : " + ename);
        System.out.println("Gender          : " + gender);
        System.out.println("Salary          : " + salary);
    }
}