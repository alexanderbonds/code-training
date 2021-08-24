package ru.abondarenko.training.random.endless_loop;

//class ToInfinity {
//    public static void main(String[] args) {
//
////впишите код сюда
//
//        for (int i = start; i <= start + 1; i++) {
//            /* тут должен быть бесконечный цикл, менять ничего нельзя*/
//        }
//                }
//                }
//
//
//Решение
//За счёт переполнения. Integer.MAX_VALUE — максимальное значение,
//которое int может хранить в Java.
//Если вы достигаете Integer.MAX_VALUE и инкрементируете это значение,
//то скатываетесь к Integer.MIN_VALUE, то есть, к минимальному значению Integer.
//Таким образом, для решения этой Java-задачи нам достаточно присвоить переменной start значение на 1 меньшее,
//чем максимальное для типа данных int.
//
//Код задачи на Java:

class ToInfinity {
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE - 1;
        for (int i = start; i <= start + 1; i++) {
            //бесконечный цикл
            System.out.println(i); //убеждаемся в бесконечности цикла
        }
    }
}
