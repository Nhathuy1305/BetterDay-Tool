package com.challenge.betterday.exception.user;

import com.challenge.betterday.exception.core.ArchitectureException;
import org.springframework.http.HttpStatus;

import static com.challenge.betterday.util.Constants.Exception.User.USER_NOT_FOUND;
import static com.challenge.betterday.util.Constants.Exception.User.USER_NOT_FOUND_CODE;

public class UserNotFoundException extends ArchitectureException{
    //region
    private static final long serialVersionUID = 1L;
    //endregion

    public UserNotFoundException() {
        super();
        this.code = USER_NOT_FOUND_CODE;
        this.msg = USER_NOT_FOUND;
        this.status = HttpStatus.NOT_FOUND;
    }

}
