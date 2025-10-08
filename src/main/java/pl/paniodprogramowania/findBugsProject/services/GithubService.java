package pl.paniodprogramowania.findBugsProject.services;

import java.util.List;

public interface GithubService {
    //1getAllUser, 2getUser
    public List<String> getAllUsers();
    public String getOneUser(String username);
}
