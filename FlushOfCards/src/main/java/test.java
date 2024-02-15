public class test {
        public boolean checkIfFlush(String[] cards) {
            char firstSuit = cards[0].charAt(cards[0].length()-1);

            for (int i = 0; i < cards.length; i++) {
                if ((cards[i].charAt(cards[i].length()-1) != firstSuit)) {
                    return false;
                }
            }
            return true;
        }
        
}
