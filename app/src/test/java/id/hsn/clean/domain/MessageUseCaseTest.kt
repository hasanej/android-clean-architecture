package id.hsn.clean.domain

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {
    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: MessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        val message = messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
        Assert.assertEquals("Hello $NAME Welcome to Clean Architecture", message.welcomeMessage)
    }

    companion object {
        const val NAME = "Clean Architecture"
    }
}