package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.Model.User;
import web.Service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers() {

        return service.getAll();
    }

    @RequestMapping(value = "/user/{id} ", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") long id) {
        return service.getById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }

    @RequestMapping(value = "/user/{id} ", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}


