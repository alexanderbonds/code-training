package ru.abondarenko.training.acmp.difficulty00_09.ex_0108;

import java.io.*;
import java.util.*;

//  https://acmp.ru/index.asp?main=task&id_task=108
//
//  Входные данные
//  В единственной строке входного файла INPUT.TXT записано натуральное число от 1 до 100.
//
//  Выходные данные
//  В выходной файл OUTPUT.TXT нужно вывести в точности то же число, которое задано во входном файле.
//
//  №	INPUT.TXT	OUTPUT.TXT
//  1	5	        5

public class MainApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Integer s = in.nextInt();
        out.println(s);
        out.flush();
    }
}
