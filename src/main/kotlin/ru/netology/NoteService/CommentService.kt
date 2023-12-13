package ru.netology.NoteService

class CommentService : CrudService<Comment>() {

    fun restoreComment(cid: Int): Int {
        val comment = this.getById(cid)
        if (comment != null) {
            comment.isDeleting = false
            return 1
        } else return 180
    }

    fun getComments(nid: Int): MutableList<Comment>? {
        val comments = mutableListOf<Comment>()
        for (item in content) {
            if (item.nid == nid) comments.add(item)
        }
        return comments
    }

    fun deleteComments(nid: Int): Int {
        var out = 180
        for (item in content) {
            if (item.nid == nid) {
                item.isDeleting = true
                out = 1
            }
        }
        return out
    }
}