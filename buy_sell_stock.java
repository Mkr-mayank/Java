public class buy_sell_stock {
    public static int Stock(int prices[]){
        int n=prices.length,i,maxprofit=0,profit;
        int bp=Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            bp=Math.min(prices[i],bp);
            if(bp<prices[i]){ //profit
                profit=prices[i]-bp; //today's profit
                maxprofit=Math.max(profit,maxprofit); 
            }
            else{ //no profit
                bp=prices[i];
            } 
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={9,5,6,7,20,18};
        System.out.println("Maximum profit can be made = "+Stock(prices));
    }
    
}
