package ru.abondarenko.training.acmp.difficulty10_19.ex_0940;

//  https://acmp.ru/index.asp?main=task&id_task=940
//
//  Входные данные
//  Входной файл INPUT.TXT содержит целое число K - номер лишней буквы, а затем через один или несколько пробелов записано слово S, состоящее из английских букв верхнего регистра.
//  Гарантируется, что номер буквы не превышает длину слова. Длина слова не более 80 символов.
//
//  Выходные данные
//  В выходной файл OUTPUT.TXT выведите исправленное слово.
//
//  №	INPUT.TXT	OUTPUT.TXT
//  1	4 MISTSPELL	MISSPELL
//  2	2 ABC   	AC

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();
        String[] arr = str.split("\\s+");
        String str1 = arr[1].substring(0, Integer.parseInt(arr[0]) - 1);
        String str2 = arr[1].substring(Integer.parseInt(arr[0]));
        System.out.println(str1 + str2);

        out.flush();
    }
}
