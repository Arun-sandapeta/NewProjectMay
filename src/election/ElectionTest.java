package election;

public class ElectionTest {
    public static void main(String[] args){

        ElectionService electionService = new ElectionService();
        State state = electionService.getState();


        System.out.println(state.constituency.constituencyName);
        System.out.println(state.constituency.voters);
        System.out.println(state.constituency.type);
        System.out.println(state.constituency.state);



    }
}
