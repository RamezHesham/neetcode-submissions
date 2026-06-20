class Solution {

    // Machine 1
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Machine 2
    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < encoded.length()) {
            int j = encoded.indexOf('#', i);          // find the delimiter
            int len = Integer.parseInt(encoded.substring(i, j)); // read the length
            result.add(encoded.substring(j + 1, j + 1 + len));  // extract the string
            i = j + 1 + len;                          // advance past it
        }

        return result;
    }
}