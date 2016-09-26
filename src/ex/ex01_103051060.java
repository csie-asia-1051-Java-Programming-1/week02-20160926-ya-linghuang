package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入單月使用分鐘: ");
		int x =scn.nextInt();
		float y=0.5f;
		if(x<600){
			System.out.println("電話費為: "+ x*y + "元");
		}else{
			if(x>=600&&x<1200){
				System.out.println("電話費為: "+ x*y*0.9 + "元");
			}else{
				if(x>=1200){
					System.out.println("電話費為: "+ x*y*0.79 + "元");
				}
			}
		}
	}

}
