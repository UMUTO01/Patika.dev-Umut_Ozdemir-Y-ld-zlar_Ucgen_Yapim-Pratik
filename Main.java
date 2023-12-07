import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter line numbers for triangle: ");

        int AntOne = scan.nextInt();

        TrianglePrinter(AntOne);

        System.out.println("Hello world!");
    }

    public static void TrianglePrinter(int Amount){
        int LineUp = (Amount*2)-1;
        int art = Amount-1;
        int LevelCheck = 1;

        for(int arg = 1; arg <= Amount; arg++ ){
            for(int lim = 1 ; lim <= art;lim++){
                System.out.print(" ");
            }
            for (int cratto = 0; cratto < LevelCheck ;cratto++){
                System.out.print("*");
            }
            System.out.print("\n");

            LevelCheck+=2;

            art--;

        }

    }
}