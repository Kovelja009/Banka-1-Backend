package rs.edu.raf.banka1.services;

import rs.edu.raf.banka1.model.BankAccount;
import rs.edu.raf.banka1.requests.CreateBankAccountRequest;


import java.util.List;

public interface BankAccountService {
    BankAccount createBankAccount(CreateBankAccountRequest createRequest);
    void saveBankAccount(BankAccount bankAccount);

    List<BankAccount> getBankAccountsByUser(Long userId);
    List<BankAccount> getBankAccountsByCompany(Long companyId);
    List<BankAccount> getBankAccountsByAgent(Long agentId);
}
