class Taxi extends publicTransport{

    String destination = "";
    int distance;
    int basicdistance = 1;
    int basicfare = 3000;
    int disface = 1000;

    Taxi(int Num){
        this.Num = Num;
        this.oil = oil;
        this.speed = 0;
        this.maxPerson = 4;
        this.operStatus = "일반";

    }
    public void cheak(){
        System.out.println("현재 택시 번호 : " + Num);
        System.out.println("탑승 승객 수 : " + currentPerson + "명");
        System.out.println("잔여 승객 수 : " + (maxPerson-currentPerson) + "명");
        System.out.println("기본 요금 확인 : " + basicfare+"원");
        System.out.println("목적지 : " +destination);
        System.out.println("목적지 까지의 거리 : " +distance+"km");
        System.out.println("지불할 요금 : " + fare+"원");
        System.out.println("누적 요금 : " + totalfare+"원");
        System.out.println("잔여 주유량 : "+ oil + "L");
        System.out.println("현재 속도 : " + speed + "km/h");
        if(oil < 10){
            operStatus = "운행불가";
        }
        System.out.println("상태 : " + operStatus);
        System.out.println();

    }
    public void boarding(String str,int receivedistance, int person){
        if(!ready()){return;}
        if(!operStatus.equals("일반")){
            System.out.println("운행중이 아닙니다. 탑승할 수 없습니다.");
            return;
        }
        distance = receivedistance;
        destination = str;
        currentPerson +=person;
        if(currentPerson > maxPerson){
            System.out.println("최대 승객 수를 초과했습니다. 탑승 불가능합니다.");
            System.out.println();
            currentPerson = currentPerson-person;
        }else{
            fare += basicfare+(disface*(distance-basicdistance));
            operStatus = "운행";
            System.out.printf("총 %d명이 탑승했습니다. 현재 총 탑승자 수는 %d명입니다.",person,currentPerson);
            System.out.println();
            System.out.println();
        }
    }
    public void startStop(String str) {
        if (str.equals("운행종료")) {
            System.out.println("운행을 종료합니다.");
            System.out.println();
            operStatus = "운행종료";
            currentPerson = 0;
            speed = 0;
            totalfare += fare;
            fare = 0;
        } else if (str.equals("운행")) {
            System.out.println("운행을 시작합니다.");
            System.out.println();
            operStatus = "일반";
        } else {
            System.out.println("\"운행\" or \"운행종료\"를 입력해 주세요.");
        }
    }

    public void arrival(){
        System.out.printf("목적지에 도착했습니다. 이동거리는 %dkm이고, 요금은 %d원 입니다.\n",distance,fare);
        System.out.println();
        operStatus = "일반";
        totalfare += fare;
        fare = 0;
        speed = 0;
        currentPerson = 0;
        destination = "";
        distance = 0;
    }

}
