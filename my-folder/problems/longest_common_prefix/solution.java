import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs.length == 0) return "";

    Arrays.sort(strs);

    String first = strs[0];
    String last = strs[strs.length - 1];

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i< first.length(); i++)
    {
        if(first.charAt(i) != last.charAt(i))
        {
            break;
        }
        sb.append(first.charAt(i));
    }

    return sb.toString();  
    }
}