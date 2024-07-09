package com.isaaclins.edelflies.controller;
import com.isaaclins.edelflies.entity.User;
import com.isaaclins.edelflies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userRepository.findById(Math.toIntExact(id));
    }

    @PostMapping("/")
    public User createUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser){
        return userRepository.findById(id)
                .map(user -> {
                    user.setFirst_name(updatedUser.getFirst_name());
                    user.setLast_name(updatedUser.getLast_name());
                    user.setIDFSFlights(updatedUser.getIDFSFlights());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    updatedUser.setId(id);
                    return userRepository.save(updatedUser);
                });
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepository.deleteById(Math.toIntExact(id));
    }
    
    @GetMapping("/search/name/{name}")
    public List<User> searchUsersByName(@PathVariable String name){
        return userRepository.findByName(name);
    }
    
    @GetMapping("/search/profession/{profession}")
    public List<User> searchUsersByProfession(@PathVariable String profession){
        return userRepository.findByProfession(profession);
    }
}