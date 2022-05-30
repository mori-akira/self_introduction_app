package jp.co.molygray.self_introduction_app.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConfig {

    private static final DBConfig INSTANCE;
    private static final String CONFIG_FILE_PATH = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;

    static {
	INSTANCE = new DBConfig();
    }

    private DBConfig() {
	try {
	    sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(CONFIG_FILE_PATH));
	} catch (Exception ex) {
	    throw new RuntimeException("failed to connect database.", ex);
	}
    }

    public static DBConfig getInstance() {
	return INSTANCE;
    }

    public SqlSessionFactory getSqlSessionFactory() {
	return sqlSessionFactory;
    }
}
