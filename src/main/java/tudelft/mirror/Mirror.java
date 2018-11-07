package tudelft.mirror;

class Mirror {

    String mirrorEnds1(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }

        return begin == end ? string : mirror;
    }


    String mirrorEnds(String string){
        String mirror = "";
        int begin = 0;
            int end =  string.length() -1; // (1)
            for (; begin  < end; end--){ // (2)
                 if(string.charAt(begin) == string.charAt(end)){ // (3)
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }
        return begin == end ? string : mirror; // (4)
    }
}
