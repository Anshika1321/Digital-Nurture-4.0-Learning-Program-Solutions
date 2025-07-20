package com.cognizant.accounts.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {
        return new Account(number, "savings", 234343);
    }
}

class Account {
    private String number;
    private String type;
    private double balance;

    // Constructor, getters, setters
    public Account(String number, String type, double balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    // getters
    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getBalance() { return balance; }
}
