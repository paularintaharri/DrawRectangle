import java.util.Scanner;

public class DrawRectangle  {

    static void drawRectangle(int h, int w, String character){
        //loops the height
        for (int i = 0; i < h; i++){
            System.out.println();
            
            //loop the width
            for (int j = 0; j < w; j++){

                //prints the character if its the outline of the rectangle
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1){
                    System.out.print(character);
                }
                //top of the nested rectangle
                else if (i == 2 && j >= 2 && j <= w - 3 ){
                    System.out.print(character);
                }
                //foot of the nested rectangle
                else if (i == h - 3 && j >= 2 && j <= w - 3 ){
                    System.out.print(character);
                }
                //left edge
                else if (j == 2 && i > 2 && i < h - 3 ){
                    System.out.print(character);
                }
                //right edge
                else if (j == w - 3 && i > 2 && i < h - 3 ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            } 
        }   
    }

    public static void main(String[] args) {
   
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter character: ");
        String character = myScanner.nextLine();

        System.out.println("Enter width1: ");
        int w = myScanner.nextInt();

        System.out.println("Enter height1: ");
        int  h = myScanner.nextInt();

        System.out.println("Size: " + w + " x " + h + ", using " + character);
        drawRectangle(h, w, character);

    }
}