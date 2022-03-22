package Lecture_ITVDN.Cloning.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cow originalCow = new Cow("Бурёнка", 100, 1);
        System.out.println("OriginalCow: " + originalCow);

        Cow copiedCow = reflectionCloning(originalCow);
        System.out.println("CopiedCow: " + copiedCow);
    }

    private static Cow reflectionCloning(Cow originalCow) {
        Cow copiedCow = originalCow;
        // для рефлексии нужно обратиться к классу Field
        try {
            Field name =Cow.class.getDeclaredField("name");
            Field head =Cow.class.getDeclaredField("head");

            // Устанавливаем флажки, а именно изменить (спустить) все модификаторы доступа к public
            name.setAccessible(true);
            head.setAccessible(true);

            // обращаемся к set и установим новое значение
            name.set(copiedCow,"Мила");
            head.set(copiedCow,2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return copiedCow; // возращаем новую ссылку originalCow
    }
}
