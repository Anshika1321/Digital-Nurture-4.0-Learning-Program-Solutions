package com.cognizant.loans.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {
        return new Loan(number, "car", 400000, 3258, 18);
    }
}

class Loan {
    private String number;
    private String type;
    private double loan;
    private int emi;
    private int tenure;

    // Constructor, getters
    public Loan(String number, String type, double loan, int emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    // getters
    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getLoan() { return loan; }
    public int getEmi() { return emi; }
    public int getTenure() { return tenure; }
}
