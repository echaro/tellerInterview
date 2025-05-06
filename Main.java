package org.example;

public class Main {


    /**
     *
     *
     *
     Matias Ballesteros <matias.ballesteros@tallertechnologies.net>
     10:14 AM (0 minutes ago)
     to me

     License Key Formatting
     Given a string S that consists of only alphanumeric characters and dashes.
     The string is separated into N + 1 groups by N dashes. Also given an integer K.
     We want to reformat the string S, such that each group contains exactly K characters,
     except for the first group, which could be shorter than K
     but still must contain at least one character.
     Furthermore, a dash must be inserted between two groups, and you should convert all lowercase letters to uppercase.
     Return the reformatted string.
     *
     *
     *
     *
     *
     *
     *
     * Examples:
     * Input: S = “5F3Z-2e-9-w”, K = 4
     * Output: “5F3Z-2E9W”
     * Explanation: The string S has been split into two parts,
     * each part has 4 characters.
     * Note that two extra dashes are not needed and can be removed.
     * Input: S = “2-5g-3-J”, K = 2
     * Output: “2-5G-3J”
     * Explanation: The string s has been split into three parts,
     * each part has 2 characters except the first part
     * as it could be shorter as mentioned above
     *
     *
     * 25-g3-J   / 2   2.5
     * */

    private  String getGroups(String chain, int k){
        String nonDashChain =  chain.replace("-", "").toUpperCase();
        int charactersLength = nonDashChain.length();
        int diff = charactersLength % k;
        int divi = charactersLength / k;
        StringBuilder builder = new StringBuilder();
        if(diff > 0){
            builder.append(nonDashChain, 0, diff);
            builder.append("-");
        }

        for(int i =0; i<divi; i++){
            int pointer = diff+k;
            builder.append(nonDashChain, diff, pointer);
            diff = pointer;
            if(i+1<divi){
                builder.append("-");
            }

        }

        return builder.toString();
    }

    public static void main(String[] args) {

        System.out.println(new Main().getGroups("5F3Z-2e-9-w", 4));

    }
}
