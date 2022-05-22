package com.user.service;

import com.user.beans.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    List<User> list= List.of(
            new User(1001L,"Rahul","1234567890"),
            new User(1002L,"Rohit","9923456789"),
            new User(1003L,"Akshay","8888888888")
    );

    @Override
    public User getUser(Long id) {
//        list madhle 3 record stram kadhun deil, mg one by one record filter la deil
//        mg user ni jyacha id pathvla id madhe suppose 1003, tar 1003 match with 1001 no
//        then if not match filter ignores, 1003 match with 1002 no, so ignore
//        1003 match with 1003 then match, so filter will findAny()
//        But if 1004 is id given by user, then no match will be found so findAny() won't be called
//        instead orElse is used and then null value is returned.
        return list.stream().filter(user -> user.getUserID().equals(id)).findAny().orElse(null);
    }
}
