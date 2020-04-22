import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloTests {
private String idList;
private String key;
private String token;
private String id;
    @Test(priority = 1)
    public void checkCreateCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = new Card();
        String name = "Super2 card";
        Card createdCard = retrofitBuilder.getTrelloApi().createCard(card, name).execute().body();
        idList = createdCard.getIdList();
        key = createdCard.getKey();
        token = createdCard.getToken();
        id = createdCard.getId();
        Assert.assertEquals(createdCard.getName(), name);
    }
    @Test(priority = 2)
    public void checkUpdateCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = new Card();
        String updatedName = "Very super2 card";
        card.setName(updatedName);
        Card updatedCard = retrofitBuilder.getTrelloApi().updateCard(card, id).execute().body();
        Assert.assertEquals(updatedCard.getName(), updatedName);
    }
    @Test(priority = 3)
    public void checkGetCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = retrofitBuilder.getTrelloApi().getCard(id,key,token).execute().body();
    }
    @Test(priority = 4)
    public void checkDeleteCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = new Card();
        int deletedCode = retrofitBuilder.getTrelloApi().deleteCard(id, card.getKey(), card.getToken()).execute().code();
        Assert.assertEquals(200,deletedCode);
    }
}


