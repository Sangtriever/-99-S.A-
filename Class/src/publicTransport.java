
public class publicTransport {
    int Num;
    int oil = 100;
    int speed= 30;
    int maxPerson;

    int currentPerson;
    int fare;
    int totalfare;
    String operStatus = "운행";

    public void setChangespeed(int num) {
        speed += num;
        if (num >= 0) {
            System.out.printf("속도를 %d만큼 추가합니다. 현재 속도는 %d입니다.", num, speed);
        } else {
            if (speed < 0) {
                speed = 0;
                System.out.printf("속도를 %d만큼 내립니다. 현재 속도는 %d입니다.", num, speed);
            }
            System.out.printf("속도를 %d만큼 내립니다. 현재 속도는 %d입니다.", num, speed);
        }
    }


    public boolean ready() {
        if (oil < 10) {
            System.out.printf("!!!현재 주유량이 %d로 10보다 작습니다. 운행을 종료합니다.!!!\n",oil);
            System.out.println();
            operStatus = "운행종료";
            currentPerson = 0;
            speed = 0;
            totalfare += fare;
            fare = 0;
            return false;
        }
        if (operStatus.equals("운행종료")) {
            System.out.println("!!!현재 운행중이 아닙니다. startStop을 통해 운행으로 바꾼후 진행해주세요!!!");
            return false;
        }
        return true;
    }



    public void getoil(int num) {
        oil += num;
        if (oil < 0) {
            oil = 0;
        }
        System.out.printf("%d만큼을 주유했습니다. 현재 잔여 주유양은 %d입니다.\n", num, oil);
        System.out.println();
        if(oil < 0){
            System.out.println("차량을 운행 종료합니다.");
            operStatus = "운행종료";
            currentPerson = 0;
            speed = 0;
            totalfare += fare;
            fare = 0;
        }
        System.out.println();
    }

    public void upSpeed(int num){
        if(!ready()){return;}
        speed = speed + num;
        if(num >= 0){
            System.out.printf("속도가 %d만큼 증가했습니다. 현재 속도는 %d입니다.\n", num,speed);
            System.out.println();
        }else{
            if(speed < 0){
                speed = 0;
            }
            System.out.printf("속도가 %d만큼 감소했습니다. 현재 속도는 %d입니다.\n", num,speed);
            System.out.println();
        }
    }
}
