package hw;
/*
 * Topic: 試撰寫一個程式，可由鍵盤讀入一個 4 位數的整數，代表西洋的年份，然後判別這個年份是否為閏年
 * （每四年一閏，每百年不閏，每四百年一閏，例如西元 1900 雖為 4 的倍數，但可被 100 整除，所以不是閏年，
 * 同理， 2000 年是閏年，因可被 400 整數，而 2004 當然也是閏年，因可以被 4 整除）。
 * Date: 2016/09/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入西洋年份(將判別是否為閏年): ");
		int Y = scn.nextInt();
		if(Y%400==0){
			System.out.println("是閏年");
		}else{
			if(Y%4==0&&Y%100!=0){
				System.out.println("是閏年");
			}else{
				System.out.println("不是閏年");
			}
		}
	}

}
