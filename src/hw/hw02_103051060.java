package hw;
/*
 * Topic: 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請依序輸入身高及性別(1代表男性；2代表女性): ");
		float T = scn.nextFloat();
		int G=scn.nextInt();
		if(G==1){
			System.out.println("標準體重為: "+(T-80)*0.7+" 公斤");
		}else{
			if(G==2){
				System.out.println("標準體重為: "+(T-70)*0.6+" 公斤");
			}
		}
	}

}
