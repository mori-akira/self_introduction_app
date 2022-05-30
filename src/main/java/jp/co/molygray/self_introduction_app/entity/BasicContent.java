package jp.co.molygray.self_introduction_app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BasicContent {

    private long contentId;
    private long itemId;
    private String itemName;
    private String itemValue;
}
