package model2;

public class testBus {
    public static void main(String[] args) {
        // 버스 테스트

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        // 출력 Bus
        bus1.boardingPassengers(2);

        // 주유량 -50
        bus1.refuel(-50);

        // 주유량 출력
        System.out.println(bus1.currentGas);

    }
}
