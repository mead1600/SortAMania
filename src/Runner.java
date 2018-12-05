import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] Values = Team_11_SortCompetition.randomArray(10000);
        System.out.println("Result of Challenge 1: "+ Team_11_SortCompetition.findMedian(Values));

        String[] Stringy = Team_11_SortCompetition.randomStringArr(10000);
        System.out.println("Result of Challenge 2: "+Team_11_SortCompetition.StringSortandSearch(Stringy,"sdfsd"));

        int[] nums = Team_11_SortCompetition.randomArray(100000);
        System.out.println("Results of Challenge 3: "+Team_11_SortCompetition.findMedian(nums));

        int[][] table = Team_11_SortCompetition.random2DArray(1000,1000);
        System.out.println("Result of Challenge 4: "+Team_11_SortCompetition.Sort2DArray(table));

        Thingy[] compareArray = Thingy.randomThingArr(10000);

    }
}
