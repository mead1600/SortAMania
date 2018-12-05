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
    }
       /* Team_11_SortCompetition[] compareArray = Team_11_SortCompetition.randomTeamArr(10);
        System.out.println(Arrays.toString(Stringy));
        challengeOne(Stringy);
        int[][] table = Team_11_SortCompetition.random2DArray(1000,1000);
        System.out.println("Result of Challenge 3: "+Team_11_SortCompetition.Sort2DArray(table));
        System.out.println("Result of Challenge 5: ");
        /*System.out.println(Team_11_SortCompetition.StringSortandSearch(Stringy,"sdfsd"));
        System.out.println(Arrays.toString(Stringy));
    }

    public static void challengeOne(String[] val){
        System.out.println("Result of Challenge 1: "+Team_11_SortCompetition.StringSortandSearch(val,"sdfsd"));
        System.out.println(Arrays.toString(val));
    }

    public void challengeFive(Team_11_SortCompetition[] val){
        Team_11_SortCompetition.compareTo(val, "1500");
    }*/
}
