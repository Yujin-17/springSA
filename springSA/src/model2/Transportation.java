package model2;

public class Transportation {

    int num;
    static int currentGas = 100;
    int currentSpeed = 0;
    int acceleration;
    int maxPas;
    String status = "";

    // 주유 확인
    static boolean gasLeft(){
        // 주유량 10 이상 운행
        return currentGas >= 10;
    }
}
