public class variables {    
    public static void main(String[] args){
        final int MAX_SIZE = 100;

        System.out.println("상수 1 : " + MAX_SIZE);
        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
        System.out.println(3147483647L + 3147483648L);
        System.out.println(3.0004999D + 2.0004999D);
        System.out.println(3.0004999F + 2.0004999F);
        System.out.println("AB" + '\b' + 'C');//백스페이스
        System.out.println("AB" + '\t' + 'C');//탭
        System.out.println("AB" + '\n' + 'C');//줄바꿈
        System.out.println("AB" + '\r' + 'C');//

        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);

        double pi = 3.1415;
        int wholeNumber = (int)pi;
        System.out.println(wholeNumber);

        num1 = 7;
        num2 = 3;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        num1 = 7;
        num2 = 3;
        //integr division
        System.out.println("num1 / num2 = " + (num1 / num2));
        //integr-point division
        System.out.println("num1 / num2 = " +(((float)num1 / (float)num2)));
        //Floating-point division
        System.out.println("num1 / num2 = " +(float)(num1 / num2));
        System.out.println("num1 / num2 = " +(num1 / (float)num2));

        short num = 10;
        num = (short)(num + 77L);       // 형 변환 안하면 컴파일 오류 발생
        int rate = 3;
        rate = (int)(rate * 3.5);       // 형 변환 안하면 컴파일 오류 발생
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L;                     // 형 변환 필요하지 않다.
        rate = 3;
        rate *= 3.5;                    // 형 변환 필요하지 않다.
        System.out.println(num);
        System.out.println(rate);



    }
} 
