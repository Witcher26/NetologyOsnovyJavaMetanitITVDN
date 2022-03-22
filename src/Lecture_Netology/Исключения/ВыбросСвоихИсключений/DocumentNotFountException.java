package Lecture_Netology.Исключения.ВыбросСвоихИсключений;

public class DocumentNotFountException extends RuntimeException { // наследоваться от Error не имеет смысла, это
                                                                    /*агрегация ошибок джава-машины
                                                                    если мы хотим, чтобы джава-машина следила за ошибкой,
                                                                    тогда Exception
                                                                     */

    public DocumentNotFountException(String document) {
        System.out.println("Документ " + document + " не найден");
    }
}
