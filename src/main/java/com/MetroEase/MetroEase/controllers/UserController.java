package com.MetroEase.MetroEase.controllers;

import com.MetroEase.MetroEase.dao.UserDao;
import com.MetroEase.MetroEase.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        // Check if passwords match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("error", "Passwords do not match!");
            return "register";
        }

        // Check if username already exists
        if (userDao.findByUsername(user.getUsername()) != null) {
            model.addAttribute("error", "Username already exists!");
            return "register";
        }

        // Save the user
        userDao.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(User user, HttpSession session, Model model) {
        User existingUser = userDao.findByUsername(user.getUsername());
        if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
        session.setAttribute("loggedInUser", existingUser);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/")
    public String home(HttpSession session, Model model) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("loggedInUser", loggedInUser);
        return "index"; // Make sure this matches your home page template name
    }
}
