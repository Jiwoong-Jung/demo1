package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    private List<Item> cartItems = new ArrayList<>();

    @GetMapping
    public String viewCart(Model model) {
        model.addAttribute("cartItems", cartItems);
        return "cart";
    }

    @PostMapping("/order")
    public String addToCart(@ModelAttribute Item item) {
        cartItems.add(item);
        return "redirect:/cart";
    }
}