package com.example.controllers;

import com.example.entities.BankAccount;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class BackAccount {

    private final BankAccount bankAccount;


}
