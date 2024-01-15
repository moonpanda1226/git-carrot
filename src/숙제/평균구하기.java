package 숙제;

public class 평균구하기 {
	public static void main(String[] args) {
		// 각 과일의 하루 생산량
		int apple = 5;
		int pear = 7;
		int orange = 5;

		// 하루 총 생산된 과일의 수
		int total = apple + pear + orange;

		// 하루 기준으로 시간당 각 과일의 개수 계산
		int hoursInADay = 24;
		double applePerHour = (double) apple / hoursInADay;
		double pearPerHour = (double) pear / hoursInADay;
		double orangePerHour = (double) orange / hoursInADay;

		// 결과 출력
		System.out.println("하루 총 생산된 과일의 수: " + total + "개");
		System.out.println("시간당 과일 생산량:");
		System.out.println("사과: " + applePerHour + "개");
		System.out.println("배: " + pearPerHour + "개");
		System.out.println("오렌지: " + orangePerHour + "개");
	}
}
