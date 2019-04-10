package model;


public class forsikringer {
    
    private int forsikringPremie;
    private int opprettetForsikring;
    private int forsikringsBeloop;
    private String forsikringBetingelser;

    public forsikringer(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser) {
        
        this.forsikringPremie = forsikringPremie;
        this.opprettetForsikring = opprettetForsikring;
        this.forsikringsBeloop = forsikringsBeloop;
        this.forsikringBetingelser = forsikringBetingelser;
    }

    public int getForsikringPremie() {
        
        return forsikringPremie;
    }

    public int getOpprettetForsikring() {
        
        return opprettetForsikring;
    }
    
    public int getForsikringsBeloop() {
        
        return forsikringsBeloop;
    }
    
    public String getForsikringsBetingelser() {
        
        return forsikringBetingelser;
    }
    

    @Override
    public String toString() {
        
        return String.format(forsikringBetingelser, forsikringPremie, opprettetForsikring, forsikringsBeloop);
    }

}

    

