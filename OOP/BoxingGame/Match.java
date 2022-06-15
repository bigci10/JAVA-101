public class Match {

    String title;
    int round ;
    Fighter fighter1;
    Fighter fighter2;
    private String winner ;

    Match(String tittle,int round,Fighter fighter1,Fighter fighter2){
        this.title = tittle;
        this.round = round;
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public void playMatch(){
        int i = 0;
        while (i < this.round){
            if (fighter2.getHealth() > 0){
                int upgrde = fighter2.getHealth()-fighter1.Punch();
                fighter2.setHealth(upgrde);

                if(fighter1.getHealth() > 0){
                    int upgrde2 = fighter1.getHealth()-fighter2.Punch();
                    fighter1.setHealth(upgrde2);
                }
                else{
                    this.winner = "The Winner is "+fighter2.getName();
                    break;
                }

                i++;
            }
            else{
                this.winner = "The Winner is " + fighter1.getName();
                break;
            }
            
        }
        
        System.out.println(winner);
    }

}
