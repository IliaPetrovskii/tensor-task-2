package n3

abstract class AbstractFileSystemNode(name: String) : FileSystemNode {
    final override var parent: FileSystemNode? = null
    override lateinit var name: String

    override val path: String
        get() = (parent?.path ?: "") + "/" + name

    init {
        name.also { this.name = it }
    }
}