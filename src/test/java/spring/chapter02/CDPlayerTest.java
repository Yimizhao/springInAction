package spring.chapter02;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.config.CDPlayerConfig;

// 在测试开始时自动创建Spring应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
// 声明Spring应用上下文的位置
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShoundNotNull() {
		assertNotNull(cd);
	}

}
