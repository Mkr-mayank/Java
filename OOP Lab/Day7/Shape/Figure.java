package Shape;
import java.util.*;
public class Figure{
        public void CubeVolume(Scanner sc){
            double s;
            System.out.print("Enter the side of cube: ");
            s=sc.nextDouble();
            System.out.println("Volume of Cube of side "+s+" is "+(s*s*s));
        }
        public void CylinderVolume(Scanner sc){
            double r, h;
            System.out.print("Enter the radius and height of cylinder: ");
            r=sc.nextDouble();
            h=sc.nextDouble();
            System.out.println("Volume of Cylinder of radius and height "+r+" and "+h+ " respectively is "+((22.0/7)*r*r*h));
        }
        public void CubiodVolume(Scanner sc){
            double l,b,h;
            System.out.print("Enter the length, breadth and height of rectangualar box: ");
            l=sc.nextDouble();
            b=sc.nextDouble();
            h=sc.nextDouble();
            System.out.println("Volume of Rectangular box of length, breadth and height "+l+", "+b+" and "+h+" respectively is "+(l*b*h));
        }
}