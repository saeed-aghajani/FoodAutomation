package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feeding feeding = new Feeding();
        List<Feeding> list = new ArrayList<Feeding>();

        String name, family, date, food, price, idcart, weekday;
        while (true){
        System.out.println("1-add\n 2-change food\n 3-increase cerdit\n 4-remove \n 5-print");
        System.out.println("Enter  a number:");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter information " + (i + 1));
                    System.out.println("Enter your name:");
                    name = scanner.next();
                    feeding.setName(name);
                    System.out.println("Enter yor family:");
                    family = scanner.next();
                    feeding.setFamily(family);
                    System.out.println("Enter yor date:");
                    date = scanner.next();
                    int age = Integer.parseInt(date);
                    feeding.setDate(age);
                    System.out.println("Enter food:");
                    food = scanner.next();
                    feeding.setFood(food);
                    System.out.println("Enter your card code:");
                    idcart = scanner.next();
                    feeding.setIdcart(idcart);
                    System.out.println("Enter price of food:");
                    price = scanner.next();
                    feeding.setPrice(price);
                    System.out.println("Enter your week:");
                    weekday=scanner.next();
                    feeding.setWeekday(weekday);

                    list.add(feeding);
                }
                break;

            case 2:
                System.out.println("Enter ordered food:");
                String ordered = scanner.next();
                System.out.println("Enter changed food:");
                String change = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Feeding feed = list.get(i);
                    if (feed.food != null && feed.food.equals(ordered)) {
                        feed.changeFood(ordered, change);
                    }
                }
                break;

            case 3:
                System.out.println(" Enter card code:");
                String code = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Feeding feed = list.get(i);
                    if (feed.idcart != null && feed.idcart.equals(code)) {
                        System.out.println("Enter your inventory:");
                        String inventory = scanner.next();
                        float stock = Float.parseFloat(inventory);
                        System.out.println("Enter your increasing credit:");
                        String credit = scanner.next();
                        float cred = Float.parseFloat(credit);
                        float sum = stock + cred;
                        String idCredit = String.valueOf(sum);
                        feed.changeCredit(inventory, idCredit);

                    }
                }
                break;
            case 4:
                System.out.println("Enter your name:");
                String firstName = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Feeding feed = list.get(i);
                    if (feed.name != null && feed.name.equals(firstName)) {
                        list.remove(i);
                    }
                }
                break;
            case 5:
                Student[] student=new Student[5];
                String stName,stFamily,stID;
                int index ;
                for (int i=0;i<student.length;i++)
                {
                    student[i] =new Student();
                    System.out.println("Enter your name:");
                    stName=scanner.next();
                    student[i].setName(stName);
                    System.out.println("Enter your family:");
                    stFamily=scanner.next();
                    student[i].setFamily(stFamily);
                    System.out.println("Enter your ID:");
                    stID=scanner.next();
                    student[i].setId(stID);

                    for(int j=0;j<list.size();j++)
                    {
                        Feeding feeding1=list.get(j);
                        if(feeding1.name.equals(stName) && feeding1.family.equals(stFamily))
                        {
                            index= list.indexOf(feeding1);
                            Feeding fd=list.get(index);
                            student[i].setFeeding(fd);
                        }
                    }
                    System.out.println("Information:");
                    System.out.println(student[i].getFeeding());//null?
                }
                break;


            }
         }
    }
}
