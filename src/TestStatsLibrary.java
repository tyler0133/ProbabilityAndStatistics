import java.util.ArrayList;
import java.util.Collections;

public class TestStatsLibrary {


    public static void main(String[] args) {
        StatsLibrary test = new StatsLibrary();
        ArrayList <Integer> someNumbers = new ArrayList<>();
        someNumbers.add(1);
        someNumbers.add(2);
        someNumbers.add(2);
        someNumbers.add(2);
        someNumbers.add(3);
        someNumbers.add(4);
        someNumbers.add(5);
        someNumbers.add(6);
        double mean = test.findMean(someNumbers);
        double median = test.findMedian(someNumbers);
        double StandardDeviation = test.findStandardDeviation(someNumbers);
        System.out.println("The average is: " + mean);
        System.out.println("The median is: " + median);
        System.out.println("The standard deviation is: " + StandardDeviation);

        int[] a = new int[] {1, 2, 2,  3, 4, 5, 6};
        double mode = test.findMode(a);
        System.out.println("The mode is: " + mode);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Monday");
        list1.add("Tuesday");
        list1.add("Wednesday");
        list1.add("FRIDAY!!");
        list1.add("Sunday");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Monday");
        list2.add("Tuesday");
        list2.add("Wednesday");
        list2.add("Thursday");
        list2.add("FRIDAY!!");
        list2.add("Saturday");
        list2.add("Sunday");

        ArrayList<String> sample = new ArrayList<>();
        sample.add("Wednesday");
        sample.add("Thursday");
        sample.add("FRIDAY!!");
        sample.add("Saturday");
        sample.add("Sunday");

        ArrayList<String> union = test.findUnion(list1, list2);
        ArrayList<String> intersection = test.findIntersection(list1, list2);
        ArrayList<String> complement = test.findComplement(sample, list1);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Complement: " + complement);


        int n = 8;
        int r = 5;
        double combination = test.findCombination(n, r);
        double permutation = test.findPermutation(n, r);
        System.out.println("Combination of " + n + " and " + r + " is: " + combination);
        System.out.println("Permutation of " + n + " and " + r + " is: " + permutation);

        int m = 5;
        double p = 0.40;
        double q = 0.60;
        int x = 3;
        double binomial = test.binomialProbability(m, p, q, x);
        System.out.println("The binomial distribution probability of " + x + " and " + m + " given the probability " + p + " is = " + binomial );
        double geometric = test.geometricProbability(x, p);
        System.out.println("P(X = " + x + ")" + " with a probability of " + p + " is = " + geometric);

    }



}