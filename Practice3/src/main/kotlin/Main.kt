import java.util.*


fun main(args: Array<String>)
{
    //Zd 1
    val myAge = 19
    val isTeenager = myAge in 13..19
    //проверяю находится ли мой возраст в данном диапазоне
    println("Являюсь ли я подростком? $isTeenager")
    //in используем чтобы проверить находится мой возраст в диапазоне 13..19

    //Zd 2
    val theirAge = 30
    val bothTeenagers = (myAge in 13..19) && (theirAge in 13..19)
    //проверяю, являются ли оба человека подростками ?
    println( "Оба человека подростки? $bothTeenagers")

    //Zd 3
    val reader = "Кемран"
    val author = "Richard Lucas"
    val authorIsReader = reader == author //== проверка равны ли константы
    println("Автор и читатель одно и то же лицо? $authorIsReader")

    //Zd 4
val readerBeforeAuthor = reader < author // Проверка идет ли reader перед autor по алфавиту
    println("reader перед author по алфавиту? $readerBeforeAuthor") //вывожу
        //оператор < для сравнения строк

    //Zd 5
    val myAge2 = 19 //мой возраст
    if (myAge2 in 13..19) {
        println("Подросток") //от 13 до 19
    } else {
        println("Не подросток") //после 19
    }
    //Zd 6
    val myAge3 = 19
    val answer = if (myAge2 in 13..19) "Подросток" else  "Не подросток"
    //здесь однострочое выражение if else, чтобы установить значения
        println(answer)

    //Zd 7
    var counter = 0 //значение счетчика
    while (counter < 10 ) // запись значит что код внутри цикла будет выполняться пока значение counter < 10
        {
    println("counter = $counter")
        counter++ // увеличение счетчика на 1 с помощью операции инкремента
    }
    //Zd 8
    var counter1 = 0 //счетчик
    var roll = 0 //бросок
    do {
        roll = Random().nextInt(6) //рандомное значение между 0 и 6
        counter1++ //увеличение на 1
        println("После $counter1 Бросков roll = $roll")
    }
        while (roll !=0) //будет выполняться пока ролл не станет = 0

    //Zd 9
     val range = 1..10
    for (number in range) { //в цикле фор переменная намбер будет принимать значения интервала рейнж
        val square = number * number //вычисление квадрата
        println("Квадрат числа $number: $square")
        //в итоге выводится 10 строк, в каждой число и квадрат
    }
}