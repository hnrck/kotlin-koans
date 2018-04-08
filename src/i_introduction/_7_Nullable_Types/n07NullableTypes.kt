package i_introduction._7_Nullable_Types

fun todoTask7(client: Client?, message: String?, mailer: Mailer) {
    if ((client?.personalInfo?.email == null) || (message == null)) return
    val email: String = client.personalInfo.email
    mailer.sendMessage(email, message)
}

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    todoTask7(client, message, mailer)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
