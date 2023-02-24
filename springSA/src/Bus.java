public class Bus extends Model{

    int busNum;
    int maxPassenger = 30;
    int nowPassenger;
    int fee = 1000;
    String busSituation = "운행";

    public Bus(int busNum){
        this.busNum = busNum;
    }

    void busSituation(){
        if(refueling == 0){
            busSituation = "차고지행";
        }
        if(refueling < 10){
            System.out.println("주유가 필요하다");
        }
    }
    void passengerBoarding(int numPassengers){
        nowPassenger += numPassengers;

        if (maxPassenger >= nowPassenger && busSituation == "운행") {
            maxPassenger -= numPassengers;
            fee = 1000 * numPassengers;
            System.out.println("탑승 승객 수 = " + nowPassenger);
            System.out.println("잔여 승객 수 = " + maxPassenger);
            System.out.println("요금 확인 = " + fee);
        }else if(maxPassenger < nowPassenger){
            System.out.println("최대 승객 수 초과");
            nowPassenger -= numPassengers;
        }

    }
    void changeSpeed(int speedChange){
        if(refueling >= 10){
            System.out.println("운행가능");
            speed += speedChange;
        }else{
            System.out.println("주유량을 확인해 주세요.");
        }
    }
}
