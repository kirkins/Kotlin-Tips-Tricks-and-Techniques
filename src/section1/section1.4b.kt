package section1

fun main(args: Array<String>) {
    val tel = "819012345678"
    println("Number = $tel")
    println("Country code = ${tel.substring(0, 2)}")
}

