import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) throws Exception 
    {
        int count;
        String option;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        
        System.out.println("This program will print out all the ascii characters 33-126");
        System.out.println("using three different types of loops.");
        System.out.println();

        do
        {
            System.out.println("");
            System.out.println("do you want to print with a for, while, do-while loop,");
            System.out.println("or do you want to exit the program?");

            option = myObj.next();  // Read user input

            switch (option) {
                case "exit":
                    System.out.println("exiting program...");
                    System.out.println();
                    // break;
                    System.exit(0);
    
                // CHECK IF 'COUNT' IS A MULTIPLE OF 8 (NUM. OF CHARS PER LINE). IF SO, NEW LINE.
                case "for":
                    // with a for loop:
                    System.out.println("This is a countdown using a for loop.");
                    for (count = 33; count <= 126; count++)
                    {
                        System.out.format("%3d = %-2c", count, (char)(count));
                        if (count % 8 == 0)
                            System.out.println();
                    }
                    System.out.println();
                    System.out.println();
                    break;
    
                case "while":
                    // with a while loop:
                    count = 33;
                    System.out.println("This is a countdown using a while loop.");
                    while (count <= 126)
                    {
                        System.out.format("%3d = %-2c", count, (char)(count));
                        if (count % 8 == 0)
                            System.out.println();
                        count++;
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case "do-while":
                    // with a do-while loop:
                    count = 33;
                    System.out.println("This is a countdown using a do-while loop.");
                    do
                    {
                        System.out.format("%3d = %-2c", count, (char)(count));
                        if (count % 8 == 0)
                            System.out.println();
                        count++;
    
                    } while (count <= 126);
                    System.out.println();
                    System.out.println();
                    break;

                default: 
                    System.out.println("That is not an option");
            }                 
        }
        while (option != "exit");

        myObj.close();
        System.exit(0);
    }
}
