package org.example.static2;

//import static org.example.static2.DecoData.staticCall;  // (클래스.)staticCall() 가능하게.
import static org.example.static2.DecoData.*;       // 모든 static 메서드 사용.

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData data3 = new DecoData();
        data3.staticCall();     // 인스턴스를 통해서 클래스 메서드 접근.
                                // 추천하지 않는 방식 -> why? 클래스 소속인데 인스턴스 소속으로 착각할 수 있음.

        DecoData.staticCall();  // 클래스를 통해서 바로 클래스 메서드 접근.
        System.out.println();

        DecoData.staticCall();
    }
}
