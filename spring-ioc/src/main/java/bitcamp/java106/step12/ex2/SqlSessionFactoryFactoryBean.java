package bitcamp.java106.step12.ex2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

public class SqlSessionFactoryFactoryBean implements FactoryBean<SqlSessionFactory> {
    
    String configLacation;
    public void setConfigLocation(String configLacation) {
      this.configLacation = configLacation;  
    }

    @Override
    public SqlSessionFactory getObject() throws Exception {
        InputStream in = Resources.getResourceAsStream("bitcamp/java106/step12/ex2/mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(in);
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }


}
