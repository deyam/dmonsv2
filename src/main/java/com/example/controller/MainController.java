package com.example.controller;

import com.example.model.User;
import com.example.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by deya on 8/22/16.
 */
@EnableScheduling
@RestController
@RequestMapping(value = "/users", method = RequestMethod.GET)
public class MainController {

    private UserRepository userRepository;

    @Autowired
    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }
    //@Autowired
    //private JdbcTemplate jdbcTemplate;

    //private User user;
    //private List<User> Users;
    //private UserRepository ur = new UserRepository();
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    @ResponseBody
//    public List<User> getAllUsers() {
//        System.out.println("returning ...");
//        private UserRepository ur ;
//        //String q = "select user_id, username, account_status from dba_users";
//        //return jdbcTemplate.queryForObject(q,(resultSet,i)->{return new User(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3))});
//
//        List<User> myusers = ur.findAll();
//        return  myusers;
//    }
//    @RequestMapping(value = "/user/", method = RequestMethod.GET)
//    public ResponseEntity<List<User>> listAllUsers() {
//        List<User> users = ur.findAll();
//        if(users.isEmpty()){
//            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
//        }
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }
}
