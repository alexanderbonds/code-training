package ru.abondarenko.training.acmp.difficulty10_19.ex_0757;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

//  https://acmp.ru/index.asp?main=task&id_task=757
//
//  Каждому школьнику из курса органической химии известна формула молекулы этилового спирта – C2H5(OH). Откуда видно, что молекула спирта состоит из двух атомов углерода (C), шести атомов водорода (H) и одного атома кислорода (O).
//
//  По заданному количеству атомов каждого из описанных выше элементов требуется определить максимально возможное количество молекул спирта, которые могут образоваться в процессе их соединения.
//
//  Входные данные
//  Первая строка входного файла INPUT.TXT содержит 3 натуральных числа: C, Н и O – количество атомов углерода, водорода и кислорода соответственно. Все числа разделены пробелом и не превосходят 1018.
//
//  Выходные данные
//  В выходной файл OUTPUT.TXT выведите максимально возможное число молекул спирта, которые могут получиться из атомов, представленных во входных данных.
//
//  №	INPUT.TXT	OUTPUT.TXT
//  1	2 6 1	    1
//  2	10 5 12	    0
//  3	18 35 3	    3

public class MainApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int c = in.nextInt();
        int h = in.nextInt();
        int o = in.nextInt();

        final int CARBON = 2;
        final int HYDROGEN = 6;

        out.println(Stream.of(c / CARBON, h / HYDROGEN, o).min(Integer::compare).get());
        out.flush();
    }
}
