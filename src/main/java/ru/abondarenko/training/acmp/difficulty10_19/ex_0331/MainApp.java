package ru.abondarenko.training.acmp.difficulty10_19.ex_0331;

//  https://acmp.ru/index.asp?main=task&id_task=331
//
//  Задано время отправления поезда и время в пути до конечной станции. Требуется написать программу, которая найдет время прибытия этого поезда (возможно, в другие сутки).
//
//  Входные данные
//  Входной файл INPUT.TXT содержит две строки. В первой строке задано время отправления, а во второй строке – время в пути. Время отправления задается в формате «HH:MM», где HH время в часах, которое принимает значение от 00 до 23, ММ – время в минутах, которое принимает значение от 00 до 59. Время в пути задается двумя неотрицательными целыми числами – количество часов и количество минут. Числа разделяются одним пробелом. Количество часов не превышает 120, минут – 59.
//
//  Выходные данные
//  Выходной файл OUTPUT.TXT должен содержать одну строку – время прибытия поезда на конечную станцию. Формат вывода этого времени совпадает с форматом ввода времени отправления.
//
//  Примеры
//  №	INPUT.TXT	OUTPUT.TXT
//  1	00:00
//      10 10	    10:10
//  2	01:02
//      4 6	        05:08
//  3	11:00
//      22 0	    09:00

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String time1 = in.nextLine();
        int hour = in.nextInt();
        int minutes = in.nextInt();

        String[] arr = time1.split(":");
        int arrivalTimeHour = hour + Integer.parseInt(arr[0]);
        int arrivalTimeMinutes = minutes + Integer.parseInt(arr[1]);
        if (arrivalTimeMinutes >= 60) {
            arrivalTimeHour++;
        }
        arrivalTimeMinutes = arrivalTimeMinutes % 60;
        arrivalTimeHour = arrivalTimeHour % 24;

        System.out.printf("%02d:%02d", arrivalTimeHour, arrivalTimeMinutes);

        out.flush();
    }
}
