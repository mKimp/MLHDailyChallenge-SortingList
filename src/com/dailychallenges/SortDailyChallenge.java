package com.dailychallenges;

public class SortDailyChallenge {

    public static void main(String[] args) {
        String [] challenges = {"Design an Outfit for Ellite", "Light in your Kitchen",
                                "Use the Twillio API", "Build a Data Visualization",
                                "Write Code to sort a list", "Submit a Challenge with someone in your Guild",
                                "Make a logo for a project", "Explore HardWare", "Build a Battlesnake",
                                "Share a Meal with Someone in your Guild"};

        mergeSort(challenges);

        for (int i = 0; i < challenges.length; ++i){
            System.out.println(challenges[i]);
        }

    }

    private static void mergeSort(String[] challenges) {

        if (challenges.length < 2)
            return;

        int mid = challenges.length / 2;
        String [] left = new String[mid];
        String [] right = new String[challenges.length - mid];

        int t = 0; int j = 0; int k = mid;

        //left array

        while (t < mid){
            left[t] = challenges[t];
            ++t;
        }

        //right array
        while (k < challenges.length){
            right[j] = challenges[k];
            ++k;
            ++j;
        }

        mergeSort(left);
        mergeSort(right);
        merge(challenges,left,right);
    }

    private static void merge(String[] challenges, String[] left, String[] right) {
        int n = left.length;
        int m = right.length;
        int i = 0; int j = 0; int k = 0;

        while (i < n && j < m){
            if (left[i].charAt(0) <= right[j].charAt(0)){
                challenges[k] = left[i];
                ++i;
            }
            else{
                challenges[k] = right[j];
                ++j;
            }
            ++k;
        }

        while (i < n){
            challenges[k] = left[i];
            ++i;
            ++k;
        }

        while (j < m){
            challenges[k] = right[j];
            ++j;
            ++k;
        }



    }


}
