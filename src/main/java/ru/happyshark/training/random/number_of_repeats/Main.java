package ru.happyshark.training.random.number_of_repeats;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Реализовать метод, по условиям нам на вход приходит List<Integer> и на выходе
//я хочу получить Map<>, которая объяснит мне сколько раз повторяется каждое из чисел
//Например: на вход // 1,2,3,4,2,3,4,100
//Выход: [{1,1}, {2,2}, {3,3}, {4,2} и тд...]
//public Map<Integer, Integer> calculateRepeats(List<Integer> input) {
//    Map<Integer, Integer>
//}

/*
 *  Решение:
 */

public class Main {
    public static void main(String[] args) {

    }

    public Map<Integer, Integer> calculateRepeats(List<Integer> input) {
        Map<Integer, Integer> map = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return map;
        }

        for (Integer e1 : input) {
            if(map.containsValue(e1)) {
                map.put(e1, map.get(e1) + 1);
            } else {
                map.put(e1,1);
            }
        }
        return map;
    }
}
// Дополнительные вопросы
// Как сделать этот метод потокобезопасным ?
// Как написать решение через Stream API ?