package io.github.futurewl.repository;

import io.github.futurewl.entity.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public void hello() {
        // User user = userRepository.findFirstByOrderByUsernameAsc();
//        User user = userRepository.findTopByOrderByUsernameDesc();
//        userRepository.findAll();
//        projectRepository.findAll();


        // 创建查询条件数据对象
        Project project = new Project();
        project.setName("刘");
        project.setAddress("上海");

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.startsWith())// 姓名采用开始匹配的方式查询
                .withIgnorePaths("focus"); // 忽略属性，是否关注关注。因为是基本类型，所以要忽略掉
        Example<Project> example = Example.of(project, matcher);
        List<Project> projectList = projectRepository.findAll(example);

        for (Project p : projectList) {
            System.out.println(p.getName());
        }
    }

}