package jp.co.molygray.self_introduction_app.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.co.molygray.self_introduction_app.config.DBConfig;
import jp.co.molygray.self_introduction_app.entity.BasicContent;
import jp.co.molygray.self_introduction_app.entity.ListContent;
import jp.co.molygray.self_introduction_app.entity.ProfileContent;
import jp.co.molygray.self_introduction_app.entity.SimpleTextContent;
import jp.co.molygray.self_introduction_app.mapper.BasicContentMapper;
import jp.co.molygray.self_introduction_app.mapper.ListContentMapper;
import jp.co.molygray.self_introduction_app.mapper.ProfileContentMapper;
import jp.co.molygray.self_introduction_app.mapper.SimpleTextContentMapper;

public class ProfileContentService {

    public List<ProfileContent> getContentIdList(Long profileId) {
	SqlSessionFactory factory = DBConfig.getInstance().getSqlSessionFactory();
	try (SqlSession session = factory.openSession()) {
	    ProfileContentMapper mapper = session.getMapper(ProfileContentMapper.class);
	    return mapper.selectList(profileId);
	}
    }

    public String getConentType(long contentId) {
	SqlSessionFactory factory = DBConfig.getInstance().getSqlSessionFactory();
	try (SqlSession session = factory.openSession()) {
	    ProfileContentMapper mapper = session.getMapper(ProfileContentMapper.class);
	    return mapper.selectType(contentId);
	}
    }

    public List<BasicContent> getBasicContent(long contentId) {
	SqlSessionFactory factory = DBConfig.getInstance().getSqlSessionFactory();
	try (SqlSession session = factory.openSession()) {
	    BasicContentMapper mapper = session.getMapper(BasicContentMapper.class);
	    return mapper.select(contentId);
	}
    }

    public List<ListContent> getListContent(long contentId) {
	SqlSessionFactory factory = DBConfig.getInstance().getSqlSessionFactory();
	try (SqlSession session = factory.openSession()) {
	    ListContentMapper mapper = session.getMapper(ListContentMapper.class);
	    return mapper.select(contentId);
	}
    }

    public SimpleTextContent getSimpleTextContent(long contentId) {
	SqlSessionFactory factory = DBConfig.getInstance().getSqlSessionFactory();
	try (SqlSession session = factory.openSession()) {
	    SimpleTextContentMapper mapper = session.getMapper(SimpleTextContentMapper.class);
	    return mapper.select(contentId);
	}
    }
}
