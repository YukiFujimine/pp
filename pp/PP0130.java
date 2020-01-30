import java.util.*;
public class PP0130{
	public static void main(String[] args){
		String[] suits={"♠","♦","♥","♣"};
		String[] nums={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] card=new String[52];
		for(int i=0;i<card.length;i++){
			card[i]=suits[i/(card.length/suits.length)];	
			card[i]+=" ";	
			card[i]+=nums[i%nums.length];
			if(i%nums.length==0){
				System.out.println();
			}
			System.out.print(card[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<card.length;i++){
			int index=new Random().nextInt(card.length-i);
			String temp=card[index];
			card[index]=card[card.length-1-i];
			card[card.length-1-i]=temp;
		}
		int[] ans=new int[5];
		for(int i=0;i<5;i++){
			System.out.print(card[i].substring(2,3)+" ");
			int n=Integer.parseInt(card[i].substring(2,3));
			ans[i]=n;
		}
		System.out.println(Arrays.toString(ans));
	}
}
