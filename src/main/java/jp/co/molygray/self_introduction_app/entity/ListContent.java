package jp.co.molygray.self_introduction_app.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ListContent {

    private long contentId;
    private long itemId;
    private String itemName;
    private List<ListContentItem> itemList;
}
