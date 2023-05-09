package week10.no7;

import java.util.Iterator;


//20190647 이용준
public class CardDeck implements Iterator {

    String[] card;
    int num;

    @Override
    public boolean hasNext() {
        if(card.length>num)
            return true;
        return false;
    }

    @Override
    public Object next() {
            if(card.length>num)
                return card[num++];
        return null;
    }

    @Override
    public void remove() {
        String[] newCards = new String[card.length - 1];
        System.arraycopy(card, 0, newCards, 0, num - 1);
        System.arraycopy(card, num, newCards, num - 1, card.length - num);
        card = newCards;
        num--;

    }


    public CardDeck(){
        this.card = new String[] {"2","3","4","5","6","7","8","9","10","J","K","Q","A"};
        this.num = 0;
    }



}
