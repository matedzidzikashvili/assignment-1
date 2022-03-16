fun main(args: Array<String>) {
    val numbers: IntArray = intArrayOf(2, 4, 6, 8, 10)
    print(evenIndexMean(numbers))
    print(isPalindrome("Hello, World"))
}
fun evenIndexMean(numbers: IntArray): Int {
    var numberOfEvenNumbers: Int = 0
    var sumOfEvenNumbers: Int = 0
    var index: Int = 0
    for(number in numbers.withIndex()) {
        if(index % 2 == 0) {
            sumOfEvenNumbers += numbers[index]
            numberOfEvenNumbers++
        }
        index++
    }
    return sumOfEvenNumbers / numberOfEvenNumbers
}
fun isPalindrome(text: String): Boolean {
    return text.toLowerCase().reversed() == text.toLowerCase();
}


