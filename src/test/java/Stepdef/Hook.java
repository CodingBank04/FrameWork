package Stepdef;

import cucumber.api.java.Before;

public class Hook {
    @Before("@mobileTest")
    public void beforeValidation(){
        System.out.println("Run before mobile test");
    }
    @Before("@webTest")
    public void beforeanything(){
        System.out.println("Run before web test");


    }

}
