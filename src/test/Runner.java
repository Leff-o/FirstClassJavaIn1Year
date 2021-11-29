package test;

import logic.Phone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("1223","Nokia Lumia",12.f,90));
        phones.add(new Phone("333","Iphone 12",11.f,100));
        phones.add(new Phone("222","Iphone SE",13.f,120));
        phones.add(new Phone("1111","Iphone 13",10.f,149));
        phones.add(new Phone("4444","Motorola x12",9.f,200));

        Collections.sort(phones,Phone.comImei);
    for(Phone phone : phones){
        System.out.println(phone);
    }

    }

}
