package Example;

/**
 * 현재 클래스는 변수 초기화에 대한 클래스입니다.
 * */

public class initialization {
    /**
     * 간단하게 변수 초기화 하기
     * */
    public static void main(String[] args){
        int year = 2045;
        int age = 25;

        year = year - age;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }

}
