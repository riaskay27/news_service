package ua.com.newsAPEPS.service;
import org.springframework.stereotype.Service;
import ua.com.newsAPEPS.entity.User;
import ua.com.newsAPEPS.repo.UserRepo;

@Service
public class UserService {
    private UserRepo repo;

    public UserService(UserRepo userRepo) {
        this.repo = userRepo;
    }

    public boolean checkAdmin(User user) {
        boolean isAdmin=false;
        User admin=repo.findByLogin(user.getLogin());
        if(admin!=null && user.getPassword().equals(admin.getPassword())){
            isAdmin=true;
        }
        return isAdmin;
    }
}
