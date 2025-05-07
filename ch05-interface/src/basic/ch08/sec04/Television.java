package basic.ch08.sec04;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void setVolume(int volume) {
        this.volume = volume; // 매개변수로 받은 값을 필드(volume)에 저장

        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
