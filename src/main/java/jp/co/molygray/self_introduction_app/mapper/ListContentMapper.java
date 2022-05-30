package jp.co.molygray.self_introduction_app.mapper;

import java.util.List;

import jp.co.molygray.self_introduction_app.entity.ListContent;

public interface ListContentMapper {

    public List<ListContent> select(long contenetId);
}
