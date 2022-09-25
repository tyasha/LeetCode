class Solution {
    public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0){
          return "";
      }  
      
       Arrays.sort(strs);
        
      StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length() && i < strs[strs.length - 1].length(); i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else {
                return sb.toString();
            }  
            
    }
        return sb.toString();
}
}