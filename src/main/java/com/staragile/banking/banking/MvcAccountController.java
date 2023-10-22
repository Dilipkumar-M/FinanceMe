package com.staragile.banking.banking;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MvcAccountController {

	
	@Autowired
	AccountService accountSvc;
	
	@RequestMapping("mvchello")
	public String doSomething(){
		return "Hello World!!!";
	}
	
	@RequestMapping("/getallaccount")
	public String getAllAccounts(HttpServletRequest req, HttpServletResponse res) {
		List<Account> accountList = accountSvc.getAccounts();
		req.getSession().setAttribute("accountList", accountList);
		return "Account.jsp";
	}
	
	@RequestMapping("/createaccount")
	public String addAccount(HttpServletRequest req, HttpServletResponse res) {
		Account account = new Account();
		account.setAccountId(req.getParameter("id"));
		account.setCustomerName(req.getParameter("name"));
		account.setCustomerAddress(req.getParameter("address"));
		account.setContactNumber(req.getParameter("contact"));
		accountSvc.addAccount(account);
		return getAllAccounts(req,res);
	}
	
	@RequestMapping("/updateaccount")
	public String updateAccount(HttpServletRequest req, HttpServletResponse res) {
		Account account = new Account();
		account.setAccountId(req.getParameter("id"));
		account.setCustomerName(req.getParameter("name"));
		account.setCustomerAddress(req.getParameter("address"));
		account.setContactNumber(req.getParameter("contact"));
		accountSvc.updateAccount(req.getParameter("id"),account);
		return getAllAccounts(req,res);
	}
	
	@RequestMapping("/viewaccount")
	public String viewAccount(HttpServletRequest req, HttpServletResponse res) {
		Account account = new Account();
		account.setAccountId(req.getParameter("id"));
		account.setCustomerName(req.getParameter("name"));
		account.setCustomerAddress(req.getParameter("address"));
		account.setContactNumber(req.getParameter("contact"));
		accountSvc.viewAccount(req.getParameter("id"),account);
		return getAllAccounts(req,res);
	}
	
	@RequestMapping("/deleteaccount")
	public String deleteAccount(HttpServletRequest req, HttpServletResponse res) {
		accountSvc.deleteAccount(req.getParameter("id"));
		return getAllAccounts(req,res);
	}
}
