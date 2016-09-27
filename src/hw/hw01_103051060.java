package hw;
/*
 * Topic: 假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
 * 而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子， 1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。
 * (先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，且a1*15+ a2*20+ a3*30小於或等於N。
 * 列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請依序輸入媽媽給小明多少錢，及幾顆蘋果(15元)、幾顆柳丁(20元)和幾顆桃子(30元): ");
		int N=scn.nextInt();
		int a1=scn.nextInt();
		int a2=scn.nextInt();
		int a3=scn.nextInt();
		int T = a1*15+ a2*20+ a3*30;
		int M=0;
		int v1=0;
		int v2=0;
		int v3=0;
		if(T>N){
			System.out.println("0 (錢不夠買水果)");
		}else{
			if(T<=N){
				M=N-T;
				v1=M/50;
				v2=(M-v1*50)/5;
				v3=M-(v1*50+v2*5);
				System.out.println("老闆要找"+v1+"個50元，"+v2+"個5元，"+v3+"個1元");
			}
		}
	}

}
