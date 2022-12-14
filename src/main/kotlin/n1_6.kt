fun main(){
    val card = "4561 2612 1234 5467"
    print(card.isValidCCNumber())
}

//Для проверки корректности номера банковских карт используется алгоритм Луна. Реализуйте функцию расширения `isValidCCNumber(): Boolean`
//для класса `String` с использованием этого алгоритма. Все символы, не являющиеся цифрами (в т.ч. пробелы) игнорируются.
//* Цифры проверяемой последовательности нумеруются справа налево. * Цифры, оказавшиеся на нечётных местах, остаются без изменений.
//* Цифры, стоящие на чётных местах, умножаются на 2. * Если в результате такого умножения возникает число больше 9,
//оно заменяется суммой цифр получившегося произведения — однозначным числом, то есть цифрой. * Все полученные в результате
//преобразования цифры складываются. Если сумма кратна 10, то исходные данные верны. Пример корректного номера карты: "4561 2612 1234 5467"

fun String.isValidCCNumber(): Boolean {
    var sum = 0
    val card = this.replace(" ","").reversed().map{it.digitToInt()}
    for (i in card.indices) {
        sum += when {
            i % 2 == 0 -> card[i]
            i % 2 != 0 && card[i]*2 < 9 -> card[i] * 2
            else -> card[i] * 2 - 9
        }
    }
    return sum % 10 == 0
}