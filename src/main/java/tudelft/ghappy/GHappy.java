package tudelft.ghappy;

class GHappy {

    public boolean gHappy1(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }
        return true;
    }


    public boolean gHappy2(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if (i >= 0 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }
        return true;
    }


    public boolean gHappy3(String str){
        assert  str!=null;
        int i=0;
        for(; i < str.length(); i++){
               if(str.charAt(i) == 'g'){                                            // (1)
                   if(i >= 0 && str.charAt(i-1) == 'g'){continue;}               // (2)
                   if(i+1 < str.length() && str.charAt(i+1) == 'g'){continue;} // (3)
                   return false;                                                 //   (4)
            }
        }
        assert i == str.length();
        return true;
    }
}
