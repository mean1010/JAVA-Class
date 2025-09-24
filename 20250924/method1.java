public class method1 {    
    public static void main(String[] args){
        
        System.out.println("안녕하세요, Java의 세계에 오신 것을 환영합니다!");
        System.out.println("Hello, World!");
        System.out.println("first java program!");
        // 변수 사용 예제
        String name = "Java 학습자";
        int age = 20;

        System.out.println("\n=== 자기소개 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");

        // 간단한 계산
        int num3 = 10;
        int num4 = 5;
        int sum = num3 + num4;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num3 + " + " + num4 + " = " + sum);


        // 함수(메서드) 호출
        printCalculation(num3, num4, sum);
        // 함수(메서드) 호출
        printCalculation1(num3, num4, sum);

        sum_printresult(num3, num4);
    }

     // 계산 결과를 출력하는 메서드
    public static void printCalculation(int number1, int number2, int result) {
        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    // 계산 결과를 출력하는 private 메서드
    private static void printCalculation1(int number1, int number2, int result) {
        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

     private static void sum_printresult(int number1, int number2) {
        int result = number1 + number2;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }


} 
