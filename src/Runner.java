import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String[] Stringy = Team_11_SortCompetition.randomStringArr(10000);
        System.out.println(Arrays.toString(Stringy));
        challengeOne(Stringy);
        int[][] table = Team_11_SortCompetition.random2DArray(1000,1000);
        System.out.println(Team_11_SortCompetition.Sort2DArray(table));
        /*System.out.println(Team_11_SortCompetition.StringSortandSearch(Stringy,"sdfsd"));
        System.out.println(Arrays.toString(Stringy));*/
    }

    public static void challengeOne(String[] val){
        System.out.println(Team_11_SortCompetition.StringSortandSearch(val,"sdfsd"));
        System.out.println(Arrays.toString(val));
    }
}
