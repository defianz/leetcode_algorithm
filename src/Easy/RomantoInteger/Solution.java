package Easy.RomantoInteger;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        boolean[] check = new boolean[s.length()];

        HashMap<String, Integer> SM = new HashMap<>();
        SM.put("I",1);
        SM.put("V",5);
        SM.put("X",10);
        SM.put("L",50);
        SM.put("C",100);
        SM.put("D",500);
        SM.put("M",1000);

        HashMap<String,Integer> DM = new HashMap<>();
        DM.put("IV",4);
        DM.put("IX",9);
        DM.put("XL",40);
        DM.put("XC",90);
        DM.put("CD",400);
        DM.put("CM",900);

        int answer = 0;

        for (String key : DM.keySet()){
            while(s.contains(key) && !check[s.indexOf(key)]){
                answer += DM.get(key);
                check[s.indexOf(key)] = true;
                check[s.indexOf(key)+1] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(!check[i]){
                answer += SM.get(s.charAt(i)+"");
                check[i] = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("s.romanToInt(\"MCMXCIV\") = " + s.romanToInt("MCMXCIV"));
    }
}