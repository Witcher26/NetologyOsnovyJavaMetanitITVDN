package Home_Task_Netology.SixteenTreeSet_И_TreeMap.SystemOfCandidates;

import Home_Task_Netology.SixteenTreeSet_И_TreeMap.SystemOfCandidates.candidates.Candidate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Candidate candidates = new Candidate();

        candidates.fillCandidate(new Candidate("Иванов Иван Иванович", "male", 2, 4));
        candidates.fillCandidate(new Candidate("Петров Пётр Петрович", "male", 3, 2));
        candidates.fillCandidate(new Candidate("Сидоров Иван Иванович", "male", 4, 3));
        candidates.fillCandidate(new Candidate("Иванова Иванка Ивановна", "female", 5, 1));
        candidates.fillCandidate(new Candidate("Серёгина Лариса Эдуардовна", "female", 3, 4));
        candidates.fillCandidate(new Candidate("Любивина Любовь Любовна", "female", 5, 1));

        candidates.printAll();

        Object obj = new Object();

    }
}

