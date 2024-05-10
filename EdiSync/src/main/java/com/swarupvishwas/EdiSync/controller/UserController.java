package com.swarupvishwas.EdiSync.controller;

import com.swarupvishwas.EdiSync.model.*;
import com.swarupvishwas.EdiSync.repository.*;
import com.swarupvishwas.EdiSync.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TeamRepository teamRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    public String trial(){
        return "Hello";
    }

    //    User APIs
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        logger.info("Adding user : {}" , user);
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User checkCreds(@RequestBody Map<String, String> json){
        User user = userRepository.findByEmailAndPass(json.get("email"), json.get("password"));
        return user;
    }

    @PostMapping("/updateProgress")
    public void updateProgress(@RequestBody Map<String, Integer> json){
        projectRepository.updateProgress(json.get("progress"), json.get("project"));
    }

    @GetMapping("/getUserByEmail")
    public User byEmail(@RequestParam(name="email") String email){
        User user = userRepository.findByEmail(email);
        return user;
    }

    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project){
        return projectRepository.save(project);
    }

    @PostMapping("/addTeam")
    public Team addTeam(@RequestBody Team team){
        return teamRepository.save(team);
    }

    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @PostMapping("/addDocuments")
    public Document addDocs(@RequestBody Document docs) {
        return documentRepository.save(docs);
    }

    @GetMapping("/getUser")
    public Optional<User> getUserById(@RequestParam(name = "id") int id){
        return userRepository.findById(id);
    }

    @GetMapping("/getAllProjects")
    public List<Project> getProjectsByUser(@RequestParam(name = "user_id") int id){
        return projectRepository.getProjectsByUser(id);
    }

    @GetMapping("/getTeam")
    public Optional<Team> getTeamById(@RequestParam(name = "id") int id){
        return teamRepository.findById(id);
    }

    @GetMapping("/getProjectDetails")
    public Optional<Project> getProjectById(@RequestParam(name = "id") int id){
        return projectRepository.findById(id);
    }

    @GetMapping("/getTeamByMember")
    public Team getTeamByMember(@RequestParam(name = "user_id") int id) { return teamRepository.getTeamByMember(id); }

    @GetMapping("/getTaskDetails")
    public Optional<Task> getTaskById(@RequestParam(name = "id") int id){
        return taskRepository.findById(id);
    }

    @GetMapping("/getDocDetails")
    public Optional<Document> getDocById(@RequestParam(name = "id") int id){
        return documentRepository.findById(id);
    }

    @GetMapping("/getAllDocs")
    public List<Document> getAllDocs(@RequestParam(name="id") int id){
        return documentRepository.getDocumentById(id);
    }

    @GetMapping("/getAllTasks")
    public List<Task> getAllTasks(@RequestParam(name="id") int id){
        return taskRepository.getTasksByUser(id);
    }

}
