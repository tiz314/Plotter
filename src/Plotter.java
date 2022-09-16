import java.util.Scanner;

public class Plotter {

    public static void main(String[] args) {
        Boolean check = true;
        Scanner scanner = new Scanner(System.in);

        int size = 10; // Default graph size

        while (check) {

            System.out.println(menu());

            int userInput;
            try {
                userInput = scanner.nextInt();

                switch (userInput) {

                    case 1: { // Plotting function
                        System.out.println("Choose function type: ");
                        System.out.println("1- Line equation");
                        try {
                            userInput = scanner.nextInt();
                            switch (userInput) {
                                case 1: {
                                    System.out.println("You chose Line equation");
                                    try {
                                        System.out.println("Enter m: ");
                                        Double m = scanner.nextDouble();
                                        System.out.println("Enter q: ");
                                        Double q = scanner.nextDouble();
                                        Function f = new Function("antani", size);
                                        System.out.println(f.getLineEquation(m, q));
                                    } catch (Exception e) {
                                        //e.printStackTrace();
                                        System.out.println("Error");
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Invalid option");
                                }
                            }
                        } catch (Exception e) {
                            //e.printStackTrace();
                            System.out.println("Invalid option");
                        }
                        break;
                    }

                    case 2: { // Setting the graph size
                        System.out.println("Current size: " + size);
                        System.out.println("Enter the new size: ");
                        try {
                            do {
                                userInput = scanner.nextInt();
                                size = userInput;
                            } while (userInput <= 0);
                        } catch (Exception e) {
                            //e.printStackTrace();
                            System.out.println("Invalid value");
                        }
                        break;
                    }

                    case 3: { // Exiting the program
                        check = false;
                        System.out.println("Exiting");
                        break;
                    }

                    default: {
                        System.out.println("Invalid option");
                    }
                }

            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Invalid option");
                check = false;
            }
        }
    }

    public static String menu() {
        String res = "\n\n----------------\nPlotter v0.1\n----------------\n\n";
        res += "Choose an option:\n 1- Plot a function\n 2- Set graph size\n 3- Exit";
        return res;
    }

}