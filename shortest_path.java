import java.util.*;
public class shortest_path{
    public static boolean ShortestPath(String dir){
        int x=0,y=0;
        double path;
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='N'){
                y++;
            }
            else if(dir.charAt(i)=='S'){
                y--;
            }
            else if(dir.charAt(i)=='E'){
                x++;
            }
            else if(dir.charAt(i)=='W'){
                x--;
            }
            else{
                System.out.println("An invalid direction is found");
                return false;
            }
        }
        path=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
        System.out.println("Shortest path is: "+path);
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String dir;
        System.out.print("Enter the all the directions from starting point to your destination: ");
        dir=sc.next();
        ShortestPath(dir);
        sc.close();
    }
}