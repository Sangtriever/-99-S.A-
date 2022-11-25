class Bus extends publicTransport {

    Bus(int Num){
        this.Num = Num;
        this.oil = oil;
        this.maxPerson = 30;
        this.fare = fare;

    }

    public void cheak(){
        System.out.println("버스 번호 : "+Num + "번");
        System.out.println("탑승 승객 수 : " + currentPerson + "명");
        System.out.println("잔여 승객 수  : " + (maxPerson-currentPerson) + "명");
        System.out.println("요금 확인 : " + fare +"원");
        System.out.println("누적 요금 : " + totalfare+"원");
        System.out.println("현재 주유량 : " + oil+ "L");
        if(oil < 10){
            operStatus = "운행종료";
        }
        System.out.println("운행 상태 : " + operStatus);
        System.out.println("현재 속도 : " + speed + "km/h");
        System.out.println();
    }

    public void boarding(int num){
        if(!ready()){return;}
        currentPerson +=num;
        if(currentPerson > maxPerson){

            System.out.println("최대 승객 수를 초과했습니다. 탑승 불가능합니다.");
            System.out.println();
            currentPerson = currentPerson-num;
        }else{
            fare += 1000*num;
            operStatus = "운행";
            System.out.printf("총 %d명이 탑승했습니다. 현재 총 탑승자 수는 %d명입니다.",num,currentPerson);
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
            operStatus = "운행";
        } else {
            System.out.println("\"운행\" or \"운행종료\"를 입력해 주세요.");
        }
    }






}