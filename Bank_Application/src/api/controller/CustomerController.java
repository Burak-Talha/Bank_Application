package api.controller;

import business.abstracts.CustomerService;

public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    public void add(){
        customerService.add();
    }

    public void update(){
        customerService.update();
    }

    public void delete(){
        customerService.delete();
    }

    public void signIn(){
        customerService.signIn();
    }

    public void logIn(){
        customerService.logIn();
    }
}
