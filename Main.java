import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        HashMap<String,ArrayList<String>> std = new HashMap<String,ArrayList<String>>();
        boolean flag = true;
        System.out.println("Welcome to Student Management System:");
        while(flag){
            student obj = new student();
            System.out.println("Select any 1 option from the following:");
            System.out.println("1. Add Student details");
            System.out.println("2. Print Student ID and student name");
            System.out.println("3. Check student details by student ID");
            System.out.println("4. Display the student details");
            System.out.println("5. To pay the fees");
            System.out.println("6. To exit");
            int k = sc.nextInt();

            switch(k){
                case 1:
                   std = obj.addStudent();
                    break;
                case 2:
                    obj.printIdName(std);
                    break;
                case 3:
                    obj.printInd(std);
                    break;
                case 4:
                    obj.print(std);
                    break;
                case 5:
                    obj.printbalance(std);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Sorry wrong input");            
            }
        }
    }
}