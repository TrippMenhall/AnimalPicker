import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = false;

        do{
            
            System.out.print("Enter animal: ");
            String animal = sc.nextLine();

            if(animal.equalsIgnoreCase("dog")){
                System.out.println("DOG ASCII ART HERE"); // Debug
                valid = true;
            }else if(animal.equalsIgnoreCase("cat")){
                System.out.println("CAT ASCII ART HERE"); // Debug
                valid = true;
            }else{
                System.out.println("ERROR: enter valid animal\n"); // Prints out error if not dog or cat
            }
            
        }while(!valid);   

        sc.close();
    }
}