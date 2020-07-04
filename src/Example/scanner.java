package Example;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요... > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : "+ input); // 엔터가 포함된 출력 
        System.out.print("num=%d%n" + num); // 엔터를 치지 않는 출력
        System.out.printf("num=%d%n" , num);  // C언어 방식의 함수

    }
    /**
     * void를 왜쓰는지?
     * */
    private void printStudent(boolean isStudent){
        if(!isStudent){
            System.out.println("난 학생이 아닙니다.");
            return;
        }

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        System.out.println("난 학생입니다.");
        System.out.println("난" + age + "살 입니다.");
    }
}
