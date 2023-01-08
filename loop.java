public class loop {
    public static void main(String args[]){
        int count;
        for(count=1;count<=10;count++){
            System.out.print(count+" ");
        }
        count=1;
        System.out.println();
        while(count<=10){
            System.out.print(count+" ");
            count++;
        }
        count=1;
        System.out.println();
        do{
            System.out.print(count+" ");
            count++;
        }while(count<=10);
    }
}
