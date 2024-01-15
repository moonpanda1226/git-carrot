package 숙제;

import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보를 고르세요. (1.가위, 2.바위, 3. 보)");
		
		int user = sc.nextInt();
		int com =(int)( Math.random()*3)+1;
		
		System.out.println("컴퓨터는" + com);
		
		if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
			System.out.println("졌습니다");
		}else if(com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1) {
			System.out.println("이겼습니다");
		}else if(com == user) {
			System.out.println("비겼습니다");
		}
		
	}

}
