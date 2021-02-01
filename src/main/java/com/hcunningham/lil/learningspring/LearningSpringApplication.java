package com.hcunningham.lil.learningspring;

import com.hcunningham.lil.learningspring.data.entity.Room;
import com.hcunningham.lil.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication annotation desigs this file as a config file and start of al component scanning
//also inits auto-configs part of Spring Boot itself
@SpringBootApplication
public class LearningSpringApplication {

    //main can be used to run/start the app in the jvm
    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }//end main

    @RestController
    @RequestMapping("/rooms")
    public class RoomController {
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms() {
            return this.roomRepository.findAll();
        }

    }//end RoomController


}//end class LearningSpringApplication
