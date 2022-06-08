import java.util.ArrayList;

public class test {


    public static void main (String [] args){

        String teststring1 = "En vänlig grönskas rika dräkt har smyckat dal och ängar." +
                "Nu smeker vindens ljumma fläkt de fagra örtes-ängar;" +
                "Och solens ljus och lundens sus och vågens sorl bland viden" +
                "förkunna sommartiden." +
                "Sin lycka och sin sommar-ro de yra fåglar prisa;" +
                "Ur skogens snår, ur stilla bo framklingar deras visa." +
                "En hymn går opp med fröjd och hopp från deras glada kväden" +
                "från blommorna och träden" +
                "" +
                "Men Du, o Gud, som gör vår jord så skön i sommarns stunder," +
                "Giv, att jag aktar främst ditt ord och dina nådesunder," +
                "Allt kött är hö, och blomstren dö och tiden allt fördriver" +
                "blott Herrens ord förbliver." +
                "test fler ord dal är är jord är är som som som som" ;

        String teststring2 = "One Two Three Four Five Six Two Six Seven One Five One Three Two Two Five";

        String teststring3 = "One One One Two Two Three";

        WordCount wordCounter = new WordCount();

        System.out.println(wordCounter.getTopWords(teststring1).size());



    }


}
