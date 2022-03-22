package Lecture_Netology.TreeMap;

import Lecture_Netology.HashSetиHashMap.DriverLicense;

import java.util.Comparator;

public class DriverLicenseComparatorByFio implements Comparator<DriverLicense> {
    @Override
    public int compare(DriverLicense dl1, DriverLicense dl2) {
        return dl1.getFio().compareTo(dl2.getFio());
    }
}
