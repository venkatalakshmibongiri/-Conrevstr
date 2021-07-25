class Solution {
    static String conRevstr(String S1, String S2) {
        String concat = new String();
        concat = S1 + S2;
        String str = new String();
        for (int i = concat.length() - 1; i >= 0; i--) 
        {
            str=str+concat.charAt(i);
        }
        return str;
    }
}

Output___________________________________________

For Input:
Geeks
forGeeks

Your Output is: 
skeeGrofskeeG