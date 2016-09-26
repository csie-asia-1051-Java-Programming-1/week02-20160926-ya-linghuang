package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入進場幾時幾分(24hr制): ");
		int Hin=scn.nextInt();
		int Min=scn.nextInt();
		System.out.println("請輸入離場幾時幾分(24hr制): ");
		int Hout=scn.nextInt();
		int Mout=scn.nextInt();
		int time = ((Hout-(Hin+1))*60+(60-Min)+Mout)/30;//總半小時
		int money=0;
		if(time<=4){
			money=time*30;
		}else{
			if(time>4&&time<=8){
				money=(time-4)*40+120;
			}else{
				if(time>8){
					money=(time-8)*60+120+160;
				}
			}
		}
		System.out.println("停車費為: "+money+"元");
	}

}
