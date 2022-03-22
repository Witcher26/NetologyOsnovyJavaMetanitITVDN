package Home_Task_Netology.TwelveИсключения.StackTrace;

public class Main {
    private static void method1(){
        method2();
    }
    private static void method2(){
        method3();
    }
    private static void method3(){
        method4();
    }
    private static void method4(){
        throw new RuntimeException("Ошибка");
    }

    public static void main(String[] args) {
        try {
            method1();
        }catch (RuntimeException err) {//для чего переменная у Exception.
            System.out.println(err.getMessage()); // можно вызвать доп. методы=> печатать ошибки, stackTrace
            err.printStackTrace();
        }
    }
}

