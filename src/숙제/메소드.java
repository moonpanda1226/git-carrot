package 숙제;

import java.util.Scanner;

public class 메소드 {

    public static void main(String[] args) {
        playCarrotGame();
    }

    private static void playCarrotGame() {
        int carrotHp = 10;
        int maxTurns = 30;
        int currentTurn = 0;

        System.out.println("당근쿠니의 체력은 " + carrotHp);
        Scanner sc = new Scanner(System.in);

        while (currentTurn < maxTurns) {
            printMenu();
            System.out.println("턴 : " + (currentTurn + 1) + ", 남은 턴 : " + (maxTurns - currentTurn));
            System.out.println("당근쿠니의 체력을 높여보자 :");
            int num = sc.nextInt();

            if (num == 5) {
                handleGameEnd();
                break;
            } else if (num < 1 || num > 4) {
                handleInvalidInput();
                continue;
            }

            handleUserChoice(num, carrotHp, currentTurn);
            currentTurn++;

            if (currentTurn < maxTurns) {
                handleNextTurn();
            }
        }

        if (currentTurn == maxTurns) {
            handleGameEnd();
        }
    }

    private static void printMenu() {
        System.out.println("┌──────────────────────────────────────────────────────────┐");
        System.out.println("│1. 물주기\t2. 운동시키기\t3. 영양제 먹기\t4.  종료   │");
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }

    private static void handleInvalidInput() {
        System.out.println("아니야!!! 1부터 4까지 숫자 중 하나만 선택해죠!!!!");
    }

    private static void handleUserChoice(int num, int carrotHp, int count) {
        switch (num) {
            case 1:
            	int result = rockPaperScissorsGame();
            	if (result == 1) {
                increaseCarrotHp(carrotHp, 10, "물 주기");
                System.out.println();
                System.out.println("물을 먹었더니 싱싱해졌엉 곰마워");
                System.out.println();
            	}else {
            		System.out.println("이런 물은 마실수 없겠는걸?");
            	}
                break;
            case 2:
                int result1 = rockPaperScissorsGame();
                if (result1 == 1) {
                    increaseCarrotHp(carrotHp, 10, "운동 시키기");
                    System.out.println();
                    System.out.println("근육빵빵이가 된거같아 곰마워");
                    System.out.println();
                } else {
                    System.out.println("아쉽지만, 이번에는 운동에 실패했어요.");
                }
                break;
            case 3:
            	int result2  = rockPaperScissorsGame();
            	if (result2 == 1) {
                increaseCarrotHp(carrotHp, 30, "영양제 먹기");
                System.out.println();
                System.out.println("영양제까지 챙겨주다니~ 넘모 천사인걸 곰마워");
                System.out.println();
            	}else {
            		System.out.println("영양제를 먹지 못했어..좀 더 힘내봐!!");
            	}
                break;
            case 4:
                break; // Do nothing for option 4
            default:
                System.out.println();
                handleInvalidInput();
                System.out.println();
                break;
        }
    }

    private static int rockPaperScissorsGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("그 전에 가위바위보 게임을 시작해보지!!!. (1.가위, 2.바위, 3. 보)");

        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("판다는" + com);

        if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
            System.out.println("힝..내가 지다닝..ㅠㅠ");
            return 0; // User lost
        } else if (com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1) {
            System.out.println("오예!!!!! 신난당");
            return 1; // User won
        } else if (com == user) {
            System.out.println("우리 제법 통했눈걸~!!!!!");
            return 0; // User tied
        }

        return 0; // Default to user losing
    }

    private static void increaseCarrotHp(int carrotHp, int increaseAmount, String action) {
        carrotHp += increaseAmount;
        System.out.println(action + "! 당근쿠니의 체력이 " + increaseAmount + " 증가했습니다.");
    }

    private static void handleNextTurn() {
    	
        System.out.println("체력을 더 높여볼까??");
    }

    private static void handleGameEnd() {
    	
        System.out.println("자 이제는 쉬고시펑 :)");
    }
}
