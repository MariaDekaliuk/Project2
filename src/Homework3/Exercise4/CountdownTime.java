package Homework3.Exercise4;

/*Есть устройство, на табло которого показывается количество секунд,
оставшихся до конца рабочего дня.
Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
 */
public class CountdownTime {
    static int secondsTranslator (int seconds){
        return seconds / 3600;
    }
}