package com.challenge.betterday.exception.common;

import com.challenge.betterday.exception.core.ArchitectureException;
import org.springframework.http.HttpStatus;

import static com.challenge.betterday.util.Constants.Exception.Common.INVALID_PARAM;
import static com.challenge.betterday.util.Constants.Exception.Common.INVALID_PARAM_CODE;


public class InvalidParamException extends ArchitectureException {

    //region
    private static final long serialVersionUID = 1L;
    //endregion

    public InvalidParamException() {
        super();
        this.code = INVALID_PARAM_CODE;
        this.msg = INVALID_PARAM;
        this.status = HttpStatus.BAD_REQUEST;
    }
}