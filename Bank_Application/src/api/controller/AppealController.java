package api.controller;

import business.abstracts.AppealService;


public class AppealController {
    
    private AppealService appealService;

    public AppealController(AppealService appealService){
        this.appealService = appealService;
    }
    public void appeal(){
    	appealService.appeal();
    }
}
