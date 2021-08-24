package ru.abondarenko.training.acmp.difficulty00_09.ex_0903;

import java.io.*;
import java.util.*;

//  https://acmp.ru/index.asp?main=task&id_task=903
//
//  В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес. Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.
//
//  Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так, чтобы среди них гарантированно были две бусины одного цвета.
//
//  Входные данные
//  Входной файл INPUT.TXT содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).
//
//  Выходные данные
//  В выходной файл OUTPUT.TXT выведите ответ на поставленную задачу.
//
//  №	INPUT.TXT	OUTPUT.TXT
//  1	3	        4

public class MainApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        out.println(a + 1);

        out.flush();
    }
}
