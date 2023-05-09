package week10.no7;



//20190647 이용준
public class Main{
    public static void main(String[] args) {
        CardDeck card = new CardDeck();

        for (int i = 0; i < card.card.length; i++) {
            System.out.println("next()가 반환하는 값:"+card.next());
        }
    }
}
