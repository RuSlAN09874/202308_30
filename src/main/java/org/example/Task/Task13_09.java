package org.example.Task;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task13_09 {
    //Уровень сложности 5 из 10:
    //Найти сумму всех элементов ArrayList<Integer>.
    public void getSum() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(14);
        array.add(2);
        array.add(5);
        int sum = 0;
        for (Integer number : array) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    //Найти среднее значение элементов LinkedList<Integer>.
    public void getMediumElem() {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(123);
        number.add(19);
        int mdNum = 0;
        int sum = 0;
        for (Integer medium : number) {
            sum = sum + medium;
        }
        mdNum = sum / number.size();
        System.out.print("sum: 154 " + "\n" + "Среднее значение: " + mdNum);
    }

    //Перебрать ArrayList<String> и вывести все элементы на экран.
    public void getString() {
        ArrayList<String> st = new ArrayList<>();
        st.add("String1");
        st.add("String2");
        st.add("String3");
        for (String elem : st)
            System.out.println(elem);
    }

    //Перебрать LinkedList<String> и найти самую длинную строку.
    public void getLongString() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("ASDS");
        strings.add("ASDSDA");
        strings.add("AS");
        int index = 0;
        int longSt = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > longSt) {
                longSt = strings.get(i).length();
                index = i;
            }
            System.out.println(strings.get(index));
        }
    }

    //Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    public void myBookClass() {
        Book book1 = new Book("AAAA", "MayBook1", 1980, 90);
        Book book2 = new Book("VVVV", "MayBook2", 1995, 80);
        Book book3 = new Book("TTTT", "MayBook3", 2001, 100);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println(books);
    }

    //Уровень сложности 6 из 10:
    //Перебрать ArrayList<Integer> и найти наименьший элемент.
    public void getMinElem() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(24);
        num.add(14);
        num.add(1);
        int min = Integer.MAX_VALUE;
        for (int elem : num) {
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) < elem) ;
                min = num.get(i);
            }
            System.out.println(min);
        }
    }

    //Перебрать LinkedList<Integer> и найти наибольший элемент.
    public void getMaxElem() {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(14);
        num.add(555);
        int max = Integer.MIN_VALUE;
        for (int value : num) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }

    //Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
    public void getElem() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Simens");
        strings.add("Nokia");
        strings.add("Samsung");
        for (int i = 0; i < strings.size(); i++) {
            String elem = strings.get(i);
            if (elem.toUpperCase().startsWith("S")) {
                System.out.println(elem);
            }
        }
        //  Перебрать LinkedList<String> и найти первое вхождение определенной строки.
        LinkedList<String> stLink = new LinkedList<>();
        stLink.add("String1");
        stLink.add("String2");
        stLink.add("String3");
        stLink.add("String4");
        String stSearch = "String3";
        int index = -1;
        for (int i = 0; i < stLink.size(); i++) {
            String currentSt = stLink.get(i);
            if (currentSt.equals(stSearch)) ;
            index = i;
            break;
        }
        if (index != -1) {
            System.out.println("Cтрока найдена: " + stSearch);
        }
    }

    //Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
//                   удовлетворяющие определенному условию.
    public void getDelet() {
        Book book1 = new Book("AAAA", "MayBook1", 1980, 90);
        Book book2 = new Book("VVVV", "MayBook2", 1995, 80);
        Book book3 = new Book("TTTT", "MayBook3", 2001, 100);
        LinkedList<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        int sumPage = 90;
        books.removeIf(book -> book.getPage() < sumPage); //removeIf - это функция которая позволяет
        //удалять элементы из списка, удовлетворяющие определенное условие(количество страниц).
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

