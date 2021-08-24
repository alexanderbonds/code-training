package ru.abondarenko.training.acmp.difficulty00_09.ex_0001;

import java.util.*;
import java.io.*;

//  https://acmp.ru/index.asp?main=task&id_task=1
//
//  Входные данные
//  В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.
//
//  Выходные данные
//  В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.
//
//  №	INPUT.TXT	OUTPUT.TXT
//  1	2 3	        5

public class MainApp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter("output.txt")) {
            int a = sc.nextInt(), b = sc.nextInt();
            pw.print(a + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}