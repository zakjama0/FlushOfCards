public class checkIfFlush {
    public boolean checkIfFlash(String[] cards) {
        char firstSuit = cards[0].charAt(1);

        for (int i = 0; i < cards.length; i++) {
            if ((cards[i].charAt(1) != firstSuit)) {
                return false;
            }
        }
        return true;
    }
}
