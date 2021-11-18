import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KnockOut extends Tournament{


    public KnockOut(String tournamentName) {
        super(tournamentName);
    }

    @Override
    Integer[] createTournamentStructure(int numberOfTeams) {
        Integer[] intArray = new Integer[numberOfTeams];
        for (int i = 0; i < numberOfTeams; i++) {
            intArray[i] = i;
        }
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);
        return intArray;
    }
    @Override
    public String toString(){
        return super.tournamentName;
    }

}
