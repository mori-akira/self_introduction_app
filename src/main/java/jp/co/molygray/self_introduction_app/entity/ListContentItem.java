package jp.co.molygray.self_introduction_app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ListContentItem {

    private long itemChildrenId;
    private String itemValue;
}
