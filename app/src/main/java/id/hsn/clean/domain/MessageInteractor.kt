package id.hsn.clean.domain

class MessageInteractor(private val messageRepository: MessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}