public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public InsuranceStrategyVeryHigh() {
    }

    @java.lang.Override
    public int getConstant() {
        return 105600;
    }

    @java.lang.Override
    public double getWeight() {
        return 0.02;
    }

    @java.lang.Override
    public int getAdjustment() {
        return 60000;
    }
}