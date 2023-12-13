package ru.netology.NoteService

class Note(
    nid: Int = 0,
    isDeleting: Boolean,
    userId: Int,
    val title: String,
    val text: String,
    val date: Int,
    val comments: Int
) : Base(nid, isDeleting, userId) {
    override fun toString(): String {
        return "\nid=$id isDeleting=$isDeleting userId=$userId title=$title text=$text \n"
    }
}