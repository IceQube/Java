import java.util.Scanner; 
public class EmpoyeeDatabase {
    public static void main(String[] args) {

        Employee[] employees = {new Employee("David Beckham", 41, "President", 230000.0), new Employee("Helen Pinterest", 41, "Chief Executive", 230000.0), new Employee("Ada Lovelace", 41, "Vice President", 230000.0), new Employee("Edward Bananahead", 41, "President",230000.0)};

        boolean stillRunning = true;
        int choice;
        //choice = menuChoice();


        while (stillRunning == true) {

            choice = menuChoice();

            switch (choice) {
                case 1:
                    printAllEmployees(employees);
                    break;
                case 2:
                    printEmployee(employees);
                    break;
         case 3:
            SalIncrease(employees);
                    break;
         case 4:
            AvAge(employees);
                    break;
         case 5:
            printDes(employees);
                    break;
               case 6:
                printDup(employees);
                break;
            case 7;
                printRetAge(employees);
                break;
            case 8;
                lowSalEmp(employees);
                break;
            case 9;
                highSalEmp(employees);
            break;
                case 10:
                    stillRunning = false;
                    break;
                default:
                    System.out.println("This number is invalid");
            }


        }
          
        quitProgram();

    }
