package ImageHoster.service;

import org.springframework.stereotype.Service;

import ImageHoster.model.User;

@Service
public class UserService {

    //We are not currently storing the details of the user anywhere
    //We will be storing the user details in the Database & ORMs part
    public void registerUser(User newUser) {
        return;
    }

}
