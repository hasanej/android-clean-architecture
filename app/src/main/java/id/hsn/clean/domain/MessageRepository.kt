package id.hsn.clean.domain

interface MessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}