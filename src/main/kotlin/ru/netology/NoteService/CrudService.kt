package ru.netology.NoteService

open class CrudService<T : Base> {
    private var nextId = 1
    val content: MutableList<T> = mutableListOf()

    open fun add(item: T): Int {
        item.id = nextId++
        content.add(item)
        return content.last().id
    }

    open fun update(item: T): Int {
        for ((index, base) in content.withIndex()) {
            if (base.id == item.id) {
                content[index] = item
                return 1
            }
        }
        return 180
    }

    open fun delete(id: Int): Int {
        for ((index, base) in content.withIndex()) {
            if (base.id == id) {
                content[index].isDeleting = true
                return 1
            }
        }
        return 180
    }

    fun getById(id: Int): T? {
        for (item in content) {
            if (item.id == id) return item
        }
        return null
    }

    fun get(userId: Int): MutableList<T>? {
        val notes = mutableListOf<T>()
        for (item in content) {
            if (item.userId == userId) notes.add(item)
        }
        return notes
    }
}