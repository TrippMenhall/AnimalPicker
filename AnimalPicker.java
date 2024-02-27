import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = false;

        do{
            
            System.out.print("Enter animal: ");
            String animal = sc.nextLine();

            if(animal.equalsIgnoreCase("dog")){
                System.out.println(",-.___,-.\n\\_/_ _\\_/\n  )O_O(\n { (_) }\n  `-^-' "); // Dog
                valid = true;
            }else if(animal.equalsIgnoreCase("cat")){
                System.out.println(" /\\_/\\\n( o.o )\n > ^ <\n"); // Cat
                valid = true;
            }else if(animal.equalsIgnoreCase("fish")){
                System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´"); // Fish
                valid = true;
            }else if(animal.equalsIgnoreCase("fish")){
                    System.out.println("        ,--,\n  _ ___/ /\\|\n ;( )__, )\n; //   \'--;\n  \\     |\n   ^    ^"); // Horse
                    valid = true;
            }else{
                System.out.println("ERROR: enter valid animal\n"); // Prints out error if not dog, cat, fish, or horse
            }
            
        }while(!valid);   

        sc.close();
    }
}