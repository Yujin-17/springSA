package model2;

public class Bus extends Transportation{

    int maxPass = 30; // 최대 승객 수
    int currentPass = 0;  // 현재 승객수
    int cost = 1000;

    public Bus(){
        this.num = (int)(Math.random() * 100 + 1);
        System.out.println("버스 번호: " + num);
    }

    void boardingPassengers(int num){
        if(maxPass < currentPass + num){
            System.out.println("최대 승객 수 초과");
        }else{
            currentPass += num;
            maxPass -= currentPass;
            System.out.println("탑승 승객 수: " + currentPass);
            System.out.println("잔여 승객 수: " + maxPass);
            System.out.println("요금 확인: " + 1000 * num);
        }
    }

    // 주유량
    int refuel(int gas){
        currentGas += gas;
        if(!gasLeft()){
            status = "차고지행";
        }
        return currentGas;
    }

    // 버스 상태 변경
    boolean busStatus(boolean change) {
        if(change == true)
            status = "운행중";
        else {
            status = "차고지행";
            currentPass = 0;
            maxPass = 30;
        }
        return change;
    }



}
