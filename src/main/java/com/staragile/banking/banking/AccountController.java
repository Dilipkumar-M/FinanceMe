package com.staragile.banking.banking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AccountService accountSvc;

    @RequestMapping("hello")
    public String doSomething() {
        return "DilipKumar FinanceMe Banking website";
    }

    @RequestMapping("/account/{id}")
    public Optional<Account> getPolicy(@PathVariable String id) {
        System.out.println("Inside getAccount");
        return accountSvc.getAccount(id);
    }

    @RequestMapping("/account")
    public List<Account> getPolicies() {
        return accountSvc.getAccounts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account")
    public String addPolicy(@RequestBody Account account) {
    	accountSvc.addAccount(account);
        return "Successfully added!!";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/account/{id}")
    public String updatePolicy(@RequestBody Account account, @PathVariable String id) {
    	accountSvc.updateAccount(id, account);
        return "Updated successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/account/{id}")
    public String deletePolicy(@PathVariable String id) {
    	accountSvc.deleteAccount(id);
        return "Updated successfully";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/account/{id}")
    public Optional<Account> getPolicyById(@PathVariable String id) {
        System.out.println("Inside getPolicyById");
        return accountSvc.getAccount(id);
    }
}
