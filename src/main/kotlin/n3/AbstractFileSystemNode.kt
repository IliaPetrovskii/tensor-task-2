package n3

abstract class AbstractFileSystemNode(name: String) : FileSystemNode {
    final override var parent: FileSystemNode? = null
    override lateinit var name: String

    override val path: String
        get() = if (parent != null) parent!!.path + "/" + name else name

    init {
        name.also { this.name = it }
    }
}