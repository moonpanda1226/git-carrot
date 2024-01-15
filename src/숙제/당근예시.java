package 숙제;

import java.util.Random;
import java.util.Scanner;



public class 당근예시 {

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

            if (num >= 5 || num <= 0) {
                handleInvalidInput();
                continue;
            }

            handleUserChoice(num, carrotHp);

            System.out.println("당근쿠니의 체력은 " + carrotHp);
            currentTurn++;

            if (currentTurn < maxTurns) {
                handleNextTurn();
                handleRandomEvent();
            }
        }
        handleGameEnd();
    }

    private static void printMenu() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│1. 물주기\t2. 운동시키기\t3. 영양제 먹기\t4. 해보기(산책)\t5. 종료 │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
    }

    private static void handleInvalidInput() {
        System.out.println("아니야!!! 1부터 4까지 숫자 중 하나만 선택해죠!!!!");
    }

    private static void handleUserChoice(int num, int carrotHp) {
        switch (num) {
            case 1:
                increaseCarrotHp(carrotHp, 10, "물 주기");
                break;
            case 2:
                increaseCarrotHp(carrotHp, 30, "운동 시키기");
                break;
            case 3:
                increaseCarrotHp(carrotHp, 50, "영양제 먹기");
                break;
            case 4:
                increaseCarrotHp(carrotHp, 40, "산책하기");
                break;
            default:
                handleInvalidInput();
                break;
        }
    }

    private static void increaseCarrotHp(int carrotHp, int increaseAmount, String action) {
        carrotHp += increaseAmount;
        System.out.println(action + "! 당근쿠니의 체력이 " + increaseAmount + " 증가했습니다.");
    }

    private static void handleNextTurn() {
        System.out.println("체력을 더 높여볼까??");
    }

    private static void handleRandomEvent() {
        Random random = new Random();
        int eventChance = random.nextInt(4);

        if (eventChance < 3) {
            System.out.println("랜덤 이벤트 발생! 당근쿠니가 특별한 보상을 획득했습니다.");
        } else if (eventChance < 2) {
            System.out.println("랜덤 이벤트 발생! 당근쿠니가 운이 좋지 않아 체력이 감소했습니다.");
        }
    }

    private static void handleGameEnd() {
        System.out.println("턴이 종료되었습니다. 선택을 종료하겠습니다.");
    }
}

