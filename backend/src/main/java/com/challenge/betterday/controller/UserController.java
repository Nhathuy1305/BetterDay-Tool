package com.challenge.betterday.controller;

import org.apache.http.client.ResponseHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public class UserController {
    //region
    private final UserFacade facade;
    //endregion

    /**
     * Save user
     *
     * @param model as UserModel
     * @return User
     * @throws ArchitectureException
     */
    @PostMapping
    @ApiOperation(value = "Save User", response = User.class)
    public ResponseEntity<Object> saveUser(@RequestBody UserModel model) throws ArchitectureException {
        return ResponseHandler.response(HttpStatus.OK, facade.saveUser(model), true);
    }

    /**
     * Get user by id
     *
     * @param userId as String
     * @return User
     * @throws ArchitectureException
     */
    @GetMapping
    @ApiOperation(value = "Get User", response = User.class)
    public ResponseEntity<Object> getUser(@RequestHeader String userId) throws ArchitectureException {
        return ResponseHandler.response(HttpStatus.OK, facade.getUser(userId), true);
    }
}
