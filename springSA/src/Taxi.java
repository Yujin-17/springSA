public class Taxi extends Model{

    String destination;
    int distance;
    int basicDistance = 1;
    int basicFee = 3000;
    int distanceFee = 1000;
    int maxPassenger = 4;
    int speed = 0;
    String situation = "일반";

    public Taxi(int num){
    }
    public Taxi(int passenger, String station, int destination){

    }

    void distanceFeePlus(){

    }
    void feePayment(){

    }

}
