package com.example.interfaces3;

import java.util.List;

/**
 * Tipo ABSTRACTO
 * Interfaz con operaciones para trabajar con cuentas bancarias (BankAccount)
 */

public interface IBankAccountService {

    // CRUD: Create Retrieve/Read Update Delete

    /**
     * Recupera todas las cuentas bancarias de base de datos
     * @return cuentas bancarias o una lista vacía si no hay
     */
    List<BankAccount> findAll();

    /**
     * Recupera una cuenta bancaria por su id
     * @param id identificador de la cuenta bancaria
     * @return la cuenta bancaria
     */
    BankAccount findById(Long id);


    /**
     * Calcula recompensa anual en euros teniendo en cuenta los años de antiguedad
     * @param account La cuenta sobre la cuál calcular la recompensa
     * @return La recompensa calculada o 0 si no hay
     */
    Double calculateReward(BankAccount account);

    /**
     * Crea un nuevo objeto cuenta bancaria y lo almacena en base de datos
     * @param nif El dni del cliente titular
     * @param type El tipo de cuenta bancaria
     * @param amount El saldo inicial
     * @return La nueva cuenta bancaria 
     */
    BankAccount create(String nif, BankAccountType type, Double amount);

    /**
     * Actualiza los datos de una cuenta bancaria
     * @param bankAccount la cuenta bancaria a actualizar
     * @return la cuenta bancaria actualizada
     */
    BankAccount update(BankAccount bankAccount);

    /**
     * Incrementa el saldo de la cuenta bancaria
     * @param accountId El identificador de la cuenta bancaria
     * @param newAmount Cantidad de dinero a ingresar en la cuenta
     * @return true si se ingresó correctamente el dinero o false si hubo un problema y no se pudo ingresar
     */
    boolean incrementAmount(Long accountId, Double newAmount);

}
