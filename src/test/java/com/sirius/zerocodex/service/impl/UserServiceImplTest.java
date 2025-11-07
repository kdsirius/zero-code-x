package com.sirius.zerocodex.service.impl;

import com.sirius.zerocodex.exception.BusinessException;
import com.sirius.zerocodex.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Resource
    private HttpServletRequest request;

    @BeforeEach
    void setUp() {
        //userService.userLogin("sirius","12345678", request);
    }

    @Test
    void getLoginUser() {
        Assertions.assertThrows(BusinessException.class, () -> userService.getLoginUser(request));
    }
}