package model;


public class forsikringer {
    
    public String forsikringPremie, opprettetForsikring, forsikringsBeloop, forsikringBetingelser;

    public forsikringer(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop) 
    {
        
        this.forsikringPremie = forsikringPremie;
        this.opprettetForsikring = opprettetForsikring;
        this.forsikringsBeloop = forsikringsBeloop;
        
    }

    public String getForsikringPremie() {
        
        return forsikringPremie;
    }

    public String getOpprettetForsikring() {
        
        return opprettetForsikring;
    }
    
    public String getForsikringsBeloop() {
        
        return forsikringsBeloop;
    }
    
    
    

    @Override
    public String toString() {
        
        return String.format(forsikringBetingelser, forsikringPremie, opprettetForsikring, forsikringsBeloop);
    }
    
}


