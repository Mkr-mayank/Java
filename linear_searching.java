import java.util.*;
public class linear_searching {
    public static int linear_Search(String ar[],String ele){
        for(int i=0;i<ar.length;i++){
            if(ar[i].equals(ele)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String ele;
        int pos;
        String menu[]={"Idly","Dosa","Samosa","Chole Bhature","Vada Pao","Momo","Paratha","Sambhar Vada","Dahi Vada"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the searching item: ");
        ele=sc.nextLine();
        pos=linear_Search(menu, ele);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+pos);
        }
        sc.close();
    }
}
