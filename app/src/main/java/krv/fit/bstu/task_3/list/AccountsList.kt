package krv.fit.bstu.task_3.list

enum class AccountsList(
    val title: String,
    val text_1: String,
    val text_2: String,
){
    item_1(
        "My first account",
        "2747545843559",
        "**** 72438",
       ),
    item_2(
        "for travelling",
        "2747545843559",
        "**** 72438",
    ),
    item_3(
        "Savving Account",
        "2747545843559",
        "**** 72438",
    ),
}

fun getList(): List<AccountsList>{
    return AccountsList.values().toList()
}