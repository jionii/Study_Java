package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
        /*
         *  public void fly(){
         *     System.out.println("일반비행합니다")
         *  }
         * */

        sa.flyMode = SuperSonicAirplane.SUPERSONIC;
        sa.fly();

        sa.flyMode = SuperSonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
