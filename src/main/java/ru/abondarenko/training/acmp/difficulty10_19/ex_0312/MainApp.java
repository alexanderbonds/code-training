package ru.abondarenko.training.acmp.difficulty10_19.ex_0312;

//  https://acmp.ru/index.asp?main=task&id_task=312
//
//  Заданы первый и второй элементы арифметической прогрессии. Требуется написать программу, которая вычислит элемент прогрессии по ее номеру.
//
//  Входные данные
//  Входной файл INPUT.TXT содержит три целых числа, разделенных пробелами – первый элемент прогрессии A1 (1 ≤ A1 ≤ 1000), второй элемент прогрессии A2 (1 ≤ A2 ≤ 1000), и номер требуемого элемента N (1 ≤ N ≤ 1000).
//
//  Выходные данные
//  Выходной файл OUTPUT.TXT должен содержать одно целое число - N-й элемент арифметической прогрессии.
//
//  Пример
//  №	INPUT.TXT	OUTPUT.TXT
//  1	1 5 3	    9
//  Пояснение к примеру
//  Здесь речь идет о следующей последовательности чисел:
//
//  1, 5, 9, 13, 17, 21, …
//  В данной последовательности D=4, поэтому A1=1, A2=A1+D=5, A3=A1+2*D=9, и т.д. Поскольку нам нужно было найти 3й элемент прогрессии, то ответом на задачу является число 9.

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int n = in.nextInt();
        int c = a2 - a1;
        int result = a1 + c * (n - 1);

        System.out.println(result);
        out.flush();
    }
}
