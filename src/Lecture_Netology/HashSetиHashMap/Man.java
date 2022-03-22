package Lecture_Netology.HashSetиHashMap;

public class Man {
    String fio;

    public Man(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Man{" +
                "fio='" + fio + '\'' +
                '}';
    }
}
