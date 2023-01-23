package com.example.interfaces3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Instanciar interfaz
        IBankAccountService accountService = new BankAccountServiceImpl();

        // 2. Operaciones con cuentas bancarias

        // 2.1. Consultar cuentas bancarias
        List<BankAccount> accounts = accountService.findAll();

        // 2.2. Consultar una cuenta bancaria
        BankAccount account5 = accountService.findById(5L);
        // BankAccount accountCustomer = accountService.findByCustomerNIF("11111A");

        // 2.3. Calcular recompensa por antiguedad
        Double reward = accountService.calculateReward(account5);

        // 2.4. Crear nueva cuenta bancaria

        // le pedimos los datos al cliente:
        Double amount = 100d;
        BankAccountType type = BankAccountType.SAVING;
        String nif = "123456789J";
        // crear cuenta
        BankAccount bankAccount = accountService.create(nif, type, amount);


        // 2.5. Actualizar cuenta bancaria existente
        bankAccount = accountService.update(bankAccount);
        System.out.println(bankAccount);


        // 2.6. Incrementar saldo en la cuenta bancaria
        Double newAmount = 100d;
        Long accountId = 1L;
        accountService.incrementAmount(accountId, newAmount);
































    }
}
