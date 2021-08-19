interface TwoDimensionalShape {//interface segregation principle states that they should be client specific
    double calculateArea();
}
interface ThreeDimensionalShape {
    double calculateVolume();
}
class Cuboid implements ThreeDimensionalShape ,TwoDimensionalShape {
    @Override
    public double calculateArea(){
        return 0;
    }
    @Override
    public double calculateVolume(){
        return 0;
    }
}

class Square implements TwoDimensionalShape {
    @Override
    public double calculateArea(){
        return 0;
    }
}