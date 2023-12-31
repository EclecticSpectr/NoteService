package ru.netology.NoteService

fun main() {
    val service = NoteService()
    val serviceComment = CommentService()
    println("До создания: " + service.content)
    println("Создание заметок")
    service.add(Note(0, false,111,"title1", "text1", 0,0))
    service.add(Note(0, false,333,"title2", "text2", 0,0))
    service.add(Note(0, false,111,"title3", "text3", 0,0))
    println("После создания: " + service.content)
    println("========================================================================================")
    println("Поиск заметки по идентификатору")
    println("Поиск существующей заметки: " + service.getById(1))
    println("Поиск отсутствующей заметки: " + service.getById(100))
    println("========================================================================================")
    println("Редактирование заметки текущего пользователя")
    println("До редактирования существующей заметки: " + service.getById(3))
    println(service.update(Note(3, false,111,"titleNew", "textNew", 0,0)))
    println("После редактирования существующей заметки: " + service.getById(3))
    println("До редактирования отсутствующей заметки: " + service.getById(3333))
    println(service.update(Note(3333, false,111,"titleNew", "textNew", 0,0)))
    println("После редактирования отсутствующей заметки: " + service.getById(3333))
    println("========================================================================================")
    println("Удаление существующей заметки")
    println("До удаления: " + service.getById(2))
    println(service.delete(2))
    println("После удаления: " + service.getById(2))
    println("Удаление отсутствующей заметки")
    println("До удаления: " + service.getById(100))
    println(service.delete(100))
    println("После удаления: " + service.getById(100))
    println("========================================================================================")
    println("Поиск всех заметок существующего пользователя userId=111")
    println(service.get(111))
    println("Поиск всех заметок отсутствующего пользователя userId=222")
    println(service.get(222))
    println("========================================================================================")
    println("Создание комментария к заметке")
    println("До создания: " + serviceComment.content)
    serviceComment.add(Comment(0, false,111,1, "message1"))
    serviceComment.add(Comment(0, false,124,1, "message2"))
    serviceComment.add(Comment(0, false,111,1, "message3"))
    println("После создания: " + serviceComment.content)
    println("========================================================================================")
    println("Редактирование существующего комментария")
    println("До редактирования существующего комментария " + serviceComment.getById(2))
    println(serviceComment.update(Comment(2,false, 111, 1, "message4")))
    println("После редактирования существующего комментария: " + serviceComment.getById(2))
    println("До редактирования отсутствующего комментария: " + serviceComment.getById(3333))
    println(serviceComment.update(Comment(222,false, 111, 1, "message4")))
    println("После редактирования отсутствующего комментария: " + serviceComment.getById(3333))
    println("========================================================================================")
    println("Удаление существующего комментария")
    println("До удаления:" + serviceComment.getById(3))
    serviceComment.delete(3)
    println("После удаления:" + serviceComment.getById(3))
    println("Удаление отсутствующего комментария")
    println("До удаления:" + serviceComment.getById(300))
    serviceComment.delete(300)
    println("После удаления:" + serviceComment.getById(300))
    println("========================================================================================")
    println("Восстановление существующего комментария")
    println("До восстановления:" + serviceComment.getById(3))
    serviceComment.restoreComment(3)
    println("После восстановления:" + serviceComment.getById(3))
    println("Восстановление отсутствующего комментария")
    println("До восстановления:" + serviceComment.getById(300))
    serviceComment.restoreComment(300)
    println("После восстановления:" + serviceComment.getById(300))
    println("========================================================================================")
    println("Получение всех комментариев заметки")
    println(serviceComment.getComments(1))
    println("========================================================================================")
    println("Удаление заметки с комментариями")
    println("Заметка до удаления: "+ service.getById(1))
    println("Комментарии к заметке "+ serviceComment.getComments(1))
    println(service.delete(1))
    println(serviceComment.deleteComments(1))
    println("Заметка после удаления: "+ service.getById(1))
    println("Комментарии к заметке "+ serviceComment.getComments(1))
    println("========================================================================================")
}