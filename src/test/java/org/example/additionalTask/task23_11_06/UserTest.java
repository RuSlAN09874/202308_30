package org.example.additionalTask.task23_11_06;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserTest {
    @InjectMocks
    User user;
    @Mock
    EmailService emailService;

  /*  @Test
    void sendEmail() {
        user.setEmail("gd@sdfsd.com");
        when(emailService.sendEmail(user.getEmail(),)).thenReturn(true);
    }

    @Test
    void notifyUser() {

    }*/

}