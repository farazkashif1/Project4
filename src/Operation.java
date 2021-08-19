public interface Operation {//open-close principle
    public double calculate (double a1, double a2);
}
class AddOperations implements Operation{
    @Override
    public double calculate(double a1, double a2){
        return a1+a2;
    }
}
class SubOperation implements Operation{
    @Override
    public double calculate(double a1, double a2){
        return a1 - a2;
    }
}