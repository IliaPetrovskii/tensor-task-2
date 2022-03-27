package n3

class File(name: String, extension: String) : AbstractFileSystemNode(name) {
    var extension: String = extension
        private set

    override var name: String
        get() = super.name + "." + extension
        set(name) {
            super.name = name
        }
}