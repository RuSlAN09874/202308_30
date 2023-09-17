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
            String elem = strings.get(i);//получаю элемент из списка с помощью метода get(i)и сохраняю в переменную elem.
            if (elem.toUpperCase().startsWith("S")) {//условие проверяет начинаеться ли строка elem в верхнем рег.c буквы "S".
                System.out.println(elem);
            }
        }
        //Перебрать LinkedList<String> и найти первое вхождение определенной строки.
        LinkedList<String> stLink = new LinkedList<>();
        stLink.add("String1");
        stLink.add("String2");
        stLink.add("String3");
        stLink.add("String4");
        String stSearch = "String3";
        int index = -1;//переменная для хранения индекса элем.(-1 указывает что элемент еще не найден).
        for (int i = 0; i < stLink.size(); i++) {
            String currentSt = stLink.get(i);// получаю текующий элент из списка с помощью метода .get();
            if (currentSt.equals(stSearch));// проверка на то что равен ли currentSt строке stSearch.
            index = i;
            break;
        }
        if (index != -1) {// проверка значения переменной index. Если index != -1 то "Cтрока найдена".
            System.out.println("Cтрока найдена: " + stSearch);
        }
    }

    //Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
   //                  удовлетворяющие определенному условию.
    public void getDelet() {
        Book book1 = new Book("AAAA", "MayBook1", 1980, 90);
        Book book2 = new Book("VVVV", "MayBook2", 1995, 80);
        Book book3 = new Book("TTTT", "MayBook3", 2001, 100);
        LinkedList<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        int sumPage = 90;//передаю значение страниц в книге которые хочу оставить и выше этого указаного знач.
        books.removeIf(book -> book.getPage() < sumPage); //removeIf - это функция которая позволяет
        //удалять элементы из списка, удовлетворяющие определенное условие(количество страниц).
        for (Book book : books) {//использую цикла for-each для хранения каждого элемента в books.
            System.out.println(book);
        }
    }
    //Уровень сложности 7 из 10:
    //Перебрать ArrayList<Integer> и удалить все четные числа.
    public void getDeletEven(){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0){//проверяю является ли число четным.Метод get(i)для получения элем по индексу.
                number.remove(i);// удаление четного числа из списка.
                i--;//уменшаю индекс что бы не пропустить элемент.
            }
        }
        System.out.println(number);
    }
    //Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
    public void geEelementChange() {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 3 == 0) {//проверка если число кратно 3. Метод get для доступа к элементу.
                num.set(i, 0);//изменяю на 0 c помощью метода set. Метод set ипольз. для изменения элемента.
            }
        }
        System.out.println(num);
    }
    //Перебрать ArrayList<String> и объединить все элементы в одну строку.
        public void getStringMerge(){
            ArrayList<String> strings = new ArrayList<>();
            strings.add("Co");
            strings.add("lor: ");
            strings.add("Blue");
            String mergeSt = "";
            for (int i = 0; i < strings.size(); i++) {
                mergeSt = mergeSt + strings.get(i);//обьединение строк.
            }
            System.out.println(mergeSt);
        }
    //Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.

}

