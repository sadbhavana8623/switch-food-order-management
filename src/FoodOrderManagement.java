import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FoodOrderManagement {
    public static Scanner scanner = new Scanner(System.in);  // static scanner

    public static void main(String[] args) {

        System.out.println("Welcome to Food Order Management");
        int Option = 0;
        do {
            System.out.println("Please enter an option:");

            Option = Integer.parseInt(scanner.nextLine());
            switch (Option) {
                case 1:
                    // create customer
                    System.out.println("Create customer called");
                    break;
            }
        }while (Option != 0) ;
    }
}