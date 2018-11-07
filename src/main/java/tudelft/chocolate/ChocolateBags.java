package tudelft.chocolate;

class ChocolateBags {

    int calculateNeededOnes1(int ones, int fives, int total) {
        int maxFives = total / 5;
        int fivesWeCanUse = fives <= maxFives ? fives : maxFives;
        total -= fivesWeCanUse * 5;

        final int failMarker = -1;
        return (ones < total) ? failMarker : total;

    }


    public int calculateNeededOnes(int small, int big, int goal) {
         int maxBigBoxes = goal / 5;
         int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
       goal -= (bigBoxesWeCanUse * 5);
       if(small < goal)
            return -1;
        return goal;
    }

}
