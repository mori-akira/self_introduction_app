package jp.co.molygray.self_introduction_app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ProfileContent {

    private long contentId;
    private long profileId;
    private String contentType;
    private String contentName;
    private String contentImagePath;
}
