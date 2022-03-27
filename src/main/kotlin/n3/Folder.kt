package n3

class Folder(name: String, vararg abstractFileSystemNodes: AbstractFileSystemNode) : AbstractFileSystemNode(name) {
    private val childNodes = ArrayList<AbstractFileSystemNode>()

    init {
        for (f in abstractFileSystemNodes) {
            f.parent = this
            childNodes.add(f)
        }
    }

}