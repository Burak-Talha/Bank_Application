package api.controller;

import dataAccess.abstracts.AppealDao;

public class AppealController {
    
    private AppealDao appealDao;

    public AppealController(AppealDao appealDao){
        this.appealDao = appealDao;
    }
    public void appeal(){
        appealDao.appeal();
    }
}
