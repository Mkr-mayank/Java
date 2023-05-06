public class Tower_of_Hanoi {
    public static void TOH(int n, char src, char help, char dst){
        if(n==1){
            System.out.println("Move Disk "+n+" from "+src+" to "+dst);
            return;
        }
        TOH(n-1,src,dst,help);
        System.out.println("Move Disk "+n+" from "+src+" to "+dst);
        TOH(n-1,help,src,dst);
    }
    public static void main(String args[]){
        TOH(3,'A','B','C');
    }
}
