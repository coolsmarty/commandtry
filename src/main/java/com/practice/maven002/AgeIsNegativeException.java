package com.practice.maven002;

class AgeIsNegativeException
{
    String errorMessage;
 
    
    AgeIsNegativeException(){
    	
    	System.out.println("ddddddddddd");
    }
    
    public AgeIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
        
    }
 
    //Modifying toString() method to display customized error message
 
    
    
    @Override
    public String toString()
    {
    	return "aaaaaaaaaaaaa";
    }
}
