package String;

import java.util.Scanner;

public class pathFinderDirection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter W for west");
        System.out.println("Enter E for East");
        System.out.println("Enter N for North");
        System.out.println("Enter S for South");
        System.out.print("Enter your direction: ");
        String direction = sc.nextLine().toUpperCase();
        pathFinderDirection.Path(direction);
        System.out.println("Distance from origin: " + Path(direction));
        sc.close();
    }
    public static float Path(String direct) {
        int x=0,y=0;
        for(int i=0;i<direct.length();i++) {
            char dir=direct.charAt(i);
            if(dir=='W') {
                x--;
            } else if(dir=='E') {
                x++;
            } else if(dir=='N') {
                y++;
            } else if(dir=='S') {
                y--;
            }
        }
        System.out.println("Final position: (" + x + ", " + y + ")");
        //PPath  Calc
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }
}
