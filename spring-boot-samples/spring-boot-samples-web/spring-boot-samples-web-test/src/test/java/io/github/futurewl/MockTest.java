package io.github.futurewl;

import io.github.futurewl.web.test.AppWebTest;
import io.github.futurewl.web.test.service.MainService;
import io.github.futurewl.web.test.service.RemoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppWebTest.class)
public class MockTest {

    @Autowired
    private MainService mainService;

    @MockBean
    private RemoteService remoteService;

    @Test
    public void testMainService() {
        BDDMockito.given(this.remoteService.call()).willReturn("angus");
        mainService.mainService();
    }
    
}
