class Solution {
    // Logic: Encode like this - "len#strlen#str"
    // len represents what chars are the word which was to be encoded
    // Use if you are not allowed to use state variables
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs){
            res.append(s.length()).append("#").append(s);
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public List<String> decode(String str) {
    //    Decode Logic, check for the length till the '#' 
    //    and append the following substr into the list
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length())
        {
            // look for len char
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = len + i;
            list.add(str.substring(i, j));
            i = j;
        }
        return list;
    }
}
