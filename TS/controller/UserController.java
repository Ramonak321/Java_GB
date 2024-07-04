package TS.controller;

import model.User;

public interface UserController {
    <T extends User> User create(T user);


}