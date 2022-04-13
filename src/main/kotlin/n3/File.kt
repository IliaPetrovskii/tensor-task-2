package n3

class File(name: String, extension: String) : AbstractFileSystemNode(name) {
    var extension: String = extension
        private set

    override val name: String
        get() = super.name + "." + extension
}