class VictorianChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new VictorianChair();
    }
}
