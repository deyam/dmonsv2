package com.example.task;

import com.example.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by deya on 8/22/16.
 */
@Component
public class dbmonjobs {
    private static final SimpleDateFormat dateFormat =
            new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private UserRepository userRepository;

    @Autowired
    public dbmonjobs(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Scheduled(fixedRate = 10000)
    public void showTime() {
        System.out.println("Showing time now: " + dateFormat.format(new Date()));
        userRepository.getAll();
        System.out.println("Completed : " + dateFormat.format(new Date()));
    }


}

