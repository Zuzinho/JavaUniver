package practice.solution;

public class Main {
    public static void main(String[] args) {
        Solution<Integer,Integer,String> solution = new Solution<>();
        System.out.println(solution.newArrayList(4,2,1,4,2));
        System.out.println(solution.newHashSet(6,5,-2,112));
        System.out.println(solution.newHashMap(new Integer[] {1,2,3},new String[] {"one","two","three"}));
    }
}
