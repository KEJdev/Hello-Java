package VarSwap;

public class Main {

    public static void main(String[] args) {

        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("변수 값 교환하기 전 => " + "x:"+ x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("변수 값 교환 후 => "+ "x:" + x + " y:" + y);
    }
}


