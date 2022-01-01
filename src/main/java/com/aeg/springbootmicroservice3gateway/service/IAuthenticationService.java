package com.aeg.springbootmicroservice3gateway.service;

import com.aeg.springbootmicroservice3gateway.model.User;

public interface IAuthenticationService {
    String signInAndReturnJWT(User signInRequest);

}
