package tudelft.chocolate;

class ChocolateBags {

    int calculateNeededOnes(int ones, int fives, int total) {
        int maxFives = total / 5;
        int fivesWeCanUse = fives <= maxFives ? fives : maxFives;
        total -= fivesWeCanUse * 5;

        final int failMarker = -1;
        return (ones < total) ? failMarker : total;

    }

}
