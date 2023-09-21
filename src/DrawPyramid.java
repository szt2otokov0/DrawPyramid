import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Runnable drawSpace = () -> System.out.print(' ');
        Runnable drawStar = () -> System.out.print('*');
        Scanner scn = new Scanner(System.in);
        System.out.println("Add meg a magasságot:");
        int length = 1;
        int height = scn.nextInt();

        for(int i = 0; i < height;i++){
            for(int j = 0; j < height-i;j++){
                drawSpace.run();
            }
            for(int j = 0; j < length;j++){
                drawStar.run();
            }
            length += 2;
            System.out.print('\n');
        }
    }
}