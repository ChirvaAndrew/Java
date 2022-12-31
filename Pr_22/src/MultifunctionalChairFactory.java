class MultifunctionalChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new MultifunctionalChair();
    }
}
