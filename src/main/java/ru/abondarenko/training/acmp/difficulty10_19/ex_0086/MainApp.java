package ru.abondarenko.training.acmp.difficulty10_19.ex_0086;

//  https://acmp.ru/index.asp?main=task&id_task=86
//
//  Вероятно, что многие из вас играли в шахматы. Поэтому вы знаете, что ферзь может двигаться по горизонталям, вертикалям и диагоналям.
//  Вася недавно начал заниматься шахматами и где-то прочел головоломку, в которой нужно было расставить максимальное количество ферзей на доске 8х8 так,
//  тобы хотя бы одно поле оказалось небитым. Эта задача легко решается для доски 3х3, т.к. понятно, что более двух ферзей расставить таким образом на ней невозможно.
//  Помогите Васе решить эту задачу для доски N×N.
//
//  Входные данные
//  В единственной строке входного файла INPUT.TXT записано натуральное число N – размеры шахматной доски N×N (1 ≤ N ≤ 100).
//
//  Выходные данные
//  В единственную строку выходного файла OUTPUT.TXT нужно вывести максимальное количество ферзей, которых можно расставить на шахматной доске N×N так, чтобы одна клетка оставалась небитой.
//
//  Пример
//  №	INPUT.TXT	OUTPUT.TXT
//  1	3	        2

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int boardSize = in.nextInt();
        System.out.println(boardSize * boardSize - ((3 * boardSize) - 2));

        out.flush();
    }
}
