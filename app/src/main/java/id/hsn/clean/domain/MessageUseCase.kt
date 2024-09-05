package id.hsn.clean.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}