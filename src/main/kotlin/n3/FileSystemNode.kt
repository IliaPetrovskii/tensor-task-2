package n3

interface FileSystemNode {
    val parent: FileSystemNode?
    val name: String
    val path: String
}