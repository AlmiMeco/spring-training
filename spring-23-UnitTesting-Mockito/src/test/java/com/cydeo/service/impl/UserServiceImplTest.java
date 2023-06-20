package com.cydeo.service.impl;

import com.cydeo.mapper.UserMapper;
import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // <- Enables Mockito for (givenClass)
class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl userService; // For Testing you MUST use the class (UserServiceImpl) NOT the interface (UserService)

    @Mock
    UserRepository userRepository;

    @Mock
    UserMapper userMapper;

    @Test
    void findByUserNameTest(){

        userService.findByUserName("harold@manager.com"); // <- Calling the REAL method (Method WE want to MOCK)
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false); // <- VERIFYING if method RAN


//        verify(userRepository, times(2)).findByUserNameAndIsDeleted("harold@manager.com", false); <- times() specifies how many times you want the method to run

        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMost(10)).findByUserNameAndIsDeleted("harold@manager.com", false);

//----------------------------------------------------------------------------------------------------------------------

        InOrder inOrder = inOrder(userRepository, userMapper);
        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false); // <- checking if Method Execution Order is correct
        inOrder.verify(userMapper).convertToDto(null);
    }

}
