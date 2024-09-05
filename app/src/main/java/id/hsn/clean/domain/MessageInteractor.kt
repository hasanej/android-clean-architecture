package id.hsn.clean.domain

class MessageInteractor(private val messageRepositoryInterface: MessageRepositoryInterface) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepositoryInterface.getWelcomeMessage(name)
    }
}