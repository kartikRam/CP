package Arrays;

public class BuyandSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {1,2,4};
		int buy=prices[0];
		int max_profit=0;
		for(int i=1;i<prices.length;i++) {
			if(buy>prices[i]) {
				buy=prices[i];
			}else if(prices[i]-buy>max_profit) {
				max_profit=prices[i]-buy;
			}
		}
	 System.out.println(max_profit);
	}

}
