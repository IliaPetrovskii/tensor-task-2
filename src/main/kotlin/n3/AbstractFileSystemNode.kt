package n3

abstract class AbstractFileSystemNode(override val name: String) : FileSystemNode {
    final override var parent: FileSystemNode? = null
    final override val path: String
        get() = (parent?.path ?: "") + "/" + name
}