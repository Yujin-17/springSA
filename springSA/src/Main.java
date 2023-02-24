public class Main {
    public static void main(String[] args){

        // Bus 2대 생성
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);

        // 각 Bus 번호 다른지 확인
        System.out.println(bus1.busNum + "번 버스 객체 만들어짐!");
        System.out.println(bus2.busNum + "번 버스 객체 만들어짐!");

        // 승객 2명 추가, 출력 탑승 승객 수, 잔여 승객 수, 요금 확인
        bus1.passengerBoarding(2);

        // 주유량 -50, 주유량 출력
        bus1.refueling = bus1.refueling - 50;
        System.out.println("주유량: " + bus1.refueling);

        // Bus 상태 차고지행 변경
        bus1.busSituation = "차고지행";

        // 주유량 +10
        bus1.refueling = bus1.refueling + 10;

        // 출력 Bus 상태, 주유량
        System.out.println("상태: " + bus1.busSituation);
        System.out.println("주유량: " + bus1.refueling);

        // 버스 상태 변경 (운행중)
        bus1.busSituation = "운행";

        // bus 승객 +45
        bus1.passengerBoarding(45);

        // bus 승객 +5
        bus1.passengerBoarding(5);

        // 주유량 -55
        bus1.refueling = bus1.refueling - 55;

        // 출력
        System.out.println("주유량: " + bus1.refueling);
        bus1.busSituation();

        System.out.println(bus1.busSituation);


        Taxi taxi1 = new Taxi(1);
        Taxi taxi2 = new Taxi(2);





    }
}