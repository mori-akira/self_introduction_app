package jp.co.molygray.self_introduction_app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.molygray.self_introduction_app.entity.BasicContent;

public interface BasicContentMapper {

    public List<BasicContent> select(@Param("contentId") long contentId);
}
