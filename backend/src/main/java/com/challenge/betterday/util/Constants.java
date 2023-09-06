package com.challenge.betterday.util;

public class Constants {
    public static final String API_VERSION = "/v1";
    public static final String BASE_URL = "/api" + API_VERSION;

    public static final class Exception {
        public static final class Common {
            public static final String INVALID_PARAM_CODE = "000001";
            public static final String INVALID_PARAM = "Invalid request params";
        }
    }
}