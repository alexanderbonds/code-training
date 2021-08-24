package ru.abondarenko.training.acmp.difficulty10_19.ex_0043;

//  https://acmp.ru/index.asp?main=task&id_task=43
//
//  Требуется найти самую длинную непрерывную цепочку нулей в последовательности нулей и единиц.
//
//  Входные данные
//  В единственной строке входного файла INPUT.TXT записана последовательность нулей и единиц (без пробелов). Суммарное количество цифр от 1 до 100.
//
//  Выходные данные
//  В единственную строку выходного файла OUTPUT.TXT нужно вывести искомую длину цепочки нулей.
//
//  Пример
//  №	INPUT.TXT	    OUTPUT.TXT
//  1	00101110000110	4

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();
        String[] arr = str.split("1+");

        int max = 0;
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        System.out.println(max);

        out.flush();
    }
}
