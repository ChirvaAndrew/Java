class MagicChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new MagicChair();
    }
}
