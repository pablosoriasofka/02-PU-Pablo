package co.com.sofka.banktransaction.service;


import co.com.sofka.banktransaction.controller.dto.request.*;
import co.com.sofka.banktransaction.model.entity.BankTransaction;

import java.util.List;

public interface IBankTransactionService {
    List<BankTransaction> getAll();
    BankTransaction withdrawFromATM(BankTransactionWithdrawFromATM bankTransaction);

    BankTransaction buys(BankTransactionBuys item);

    BankTransaction depositSucursal(BankTransactionDepositSucursal item);

    BankTransaction depositCajero(BankTransactionDepositCajero item);

    BankTransaction depositTrasferencia(BankTransactionDepositTransfer item);
}
