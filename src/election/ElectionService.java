package election;

public class ElectionService {

    public State getState(){
        Country country = new Country();
        country.primeMinister="modi";

        State tg = new State();
        tg.name="TG";
        Constituency[] constituencies = new Constituency[2];

        Constituency constituency = new Constituency();
        tg.constituency=constituency;
        constituency.constituencyName="hyd";
        constituency.voters=100000;
        constituency.type="MP";
        constituency.state=tg;

        Constituency constituency1 = new Constituency();
        constituency1.constituencyName="chevella";
        constituencies[0] = constituency;
        constituencies[1]= constituency1;



        return tg;
    }
}
