package jp.co.molygray.self_introduction_app.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.co.molygray.self_introduction_app.config.DBConfig;
import jp.co.molygray.self_introduction_app.mapper.ProfileMapper;

public class AuthorizeService {

    public boolean authorize(Long profileId) {
	SqlSessionFactory factory = DBConfig.getInstance().getSqlSessionFactory();
	try (SqlSession session = factory.openSession()) {
	    ProfileMapper mapper = session.getMapper(ProfileMapper.class);
	    return mapper.selectExists(profileId);
	}
    }
}
