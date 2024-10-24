package org.example.oop1;

public class MusicPlayer {
    int value = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp() {
        value++;
        System.out.println("음악 플레이어 볼륨 : " + value);
    }
    void volumeDown() {
        value--;
        System.out.println("음악 플레이어 볼륨 : " + value);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + value);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
