public class Main {
    public static void main(String[] args) {

        Bus num1bus = new Bus(1);
        Bus num2bus = new Bus(2);
        num1bus.cheak();
        num2bus.cheak();
        num1bus.boarding(2); // 사람 2명 탑승
        num1bus.cheak(); // 버스 현황 체크
        num1bus.getoil(-50); // 오일 -50만큼 충전
        num1bus.upSpeed(20); // 속도 증가
        num1bus.upSpeed(-55); // 속도 감소
        num1bus.cheak(); // 버스 현황 체크
        num1bus.startStop("운행종료"); // 버스 상태 운행종료
        num1bus.getoil(10); // 기름 10만큼 충전
        num1bus.cheak(); // 버스 현황 체크
        num1bus.startStop("운행"); //  // 버스 상태 운행으로 변경
        num1bus.boarding(45); // 45명 버스 탑승
        num1bus.boarding(5); // 5명 버스 탑승
        num1bus.cheak(); // 버스 현황 체크
        num1bus.getoil(-55); // 기름 -55만큼 충전


        System.out.println("----------------------------------------------------------------------------");
        Taxi num1tax = new Taxi(1850);
        Taxi num2tax = new Taxi(3548);
        num1tax.cheak();
        num2tax.cheak();
        num1tax.boarding("서울역", 2,2);
        num1tax.cheak();
        num1tax.getoil(-80);
        num1tax.arrival();
        num1tax.startStop("운행종료");
        num1tax.cheak();
        num1tax.startStop("운행");
        num1tax.boarding("구로디지털단지역",12,5);
        num1tax.boarding("구로디지털단지역",12,3);
        num1tax.cheak();
        num1tax.getoil(-20);
        num1tax.arrival();
        num1tax.cheak();

    }
}