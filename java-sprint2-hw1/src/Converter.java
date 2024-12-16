public class Converter {
    int stepToCm = 75;
    int stepToCal = 50;

    int convertToKm(int steps){
        int aConvertToKm = (steps*stepToCm)/100000;
        return aConvertToKm;
    }

    int convertStepsToKilocalories(int steps) {
        int aConvertStepsToKilocalories = (steps*stepToCal)/1000;
        return aConvertStepsToKilocalories;
    }
}
