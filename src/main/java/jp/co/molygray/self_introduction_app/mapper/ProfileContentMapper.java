package jp.co.molygray.self_introduction_app.mapper;

import java.util.List;

import jp.co.molygray.self_introduction_app.entity.ProfileContent;

public interface ProfileContentMapper {

    public List<ProfileContent> selectList(long profileId);

    public String selectType(long contentId);
}
