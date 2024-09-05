package id.hsn.clean.domain

interface MessageRepositoryInterface {
    fun getWelcomeMessage(name: String): MessageEntity
}