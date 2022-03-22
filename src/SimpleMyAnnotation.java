import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.management.MemoryType;
import java.lang.reflect.Method;

@Documented
@Retention(RetentionPolicy.RUNTIME)

@interface Annotation {
    String s() default "First_String";
    String s1() default "Second_String";
}

class Handler{
    @Annotation(s = "Первая строфа", s1 = "Вторая строфа")
    public void displayString(String s, String s1){
        System.out.println(s+" "+s1);
    }
}

public class SimpleMyAnnotation {
    public static void main(String[] args) {
        Handler handler = new Handler();

        Class<?> cl = Handler.class;
        Method method = null;
        try {
            method = cl.getDeclaredMethod("displayString", String.class, String.class);
            Annotation annotation = method.getAnnotation(Annotation.class);
            handler.displayString(annotation.s(), annotation.s1());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}