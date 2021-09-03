package api.controller;

import business.abstracts.VeritificationService;

public class VeritificationController {
    
    private VeritificationService verificationService;

    public VeritificationController(VeritificationService verificationService){
        this.verificationService = verificationService;
    }

    public void regexVerification(){
        verificationService.regexVeritification();
    }

    public void mernisVeritification(){
        verificationService.mernisVeritification();
    }

}
