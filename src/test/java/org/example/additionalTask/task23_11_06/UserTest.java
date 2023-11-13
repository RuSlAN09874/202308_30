package org.example.additionalTask.task23_11_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class UserTest {
    @InjectMocks
    private NotificationService notificationService;
    @Mock
    private EmailService emailService;

    @Test
    public void notiFyUserTest() {
        User user = new User("1", "meail@.com");
        when(emailService.sendEmail(anyString(), anyString(), anyString()))
                .thenReturn(true);
        boolean result = notificationService.notifyUser(user, "Subject", "Message");
        verify(emailService).sendEmail("meail@.com", "Subject", "Message");
        assertTrue(result);
    }

}