package n3

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val one = File("one", "txt")
        val two = File("two", "exe")
        val three = File("three", "jpg")
        val four = File("four", "doc")
        val five = File("five", "png")
        val folder1 = Folder("folder1", one, three, five)
        val folder2 = Folder("folder2", two, four)
        val root = Folder("root", folder1, folder2)
        println("Путь до файла " + two.name + " - " + two.path)
        println("Расширение файла " + five.name + " - " + five.extension)
    }
}