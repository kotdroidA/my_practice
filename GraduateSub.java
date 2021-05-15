import java.util.Scanner;

public class GraduateSub
{
	public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("please enter your year: ");
            int year=sc.nextInt();
            sc.nextLine();
        
        
            System.out.print("please enter your branch: ");
            String branch=sc.nextLine();
            System.out.print("Your subjects are: ");
    
            switch(year){
                case 1:
                    System.out.println("English, Maths, Science");
                    break;
                case 2:
                    switch(branch){
                        case "C":
                            System.out.println("Operating System, Java, Data Structure");
                            break;
                        case "M":
                            System.out.println("Drawing, Manufacturing Machines");
                            break;
                       case "E":
                            System.out.println("Micro processors, Logic switching theory");
                            break;
                    }
                    break;
                case 3:
                    switch(branch){
                        case "C":
                            System.out.println("Computer Organization, MultiMedia");
                            break;
                        case "M":
                            System.out.println("Internal Combustion Engines, Mechanical Vibration");
                            break;
                       case "E":
                            System.out.println("Fundamentals of Logic Design, Microelectronics");
                            break;
                    }
                    break;
                case 4:
                    switch(branch){
                        case "C":
                            System.out.println("Data Communication and Networks, MultiMedia");
                            break;
                        case "M":
                            System.out.println("Production Technology, Thermal Engineering");
                            break;
                       case "E":
                            System.out.println("Embedded System, Image Processing");
                            break;
                        }
                    break;
    
            }

	}
}