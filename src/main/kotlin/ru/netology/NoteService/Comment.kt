package ru.netology.NoteService

class Comment(
    cid: Int = 0,
    isDeleting: Boolean,
    userId: Int,
    val nid: Int,
    val message: String
) : Base(cid, isDeleting, userId) {
    override fun toString(): String {
        return "\nid=$id isDeleting=$isDeleting userID=$userId nid=$nid message=$message \n"
    }
}