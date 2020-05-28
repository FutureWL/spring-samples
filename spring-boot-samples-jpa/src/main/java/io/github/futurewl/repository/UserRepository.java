package io.github.futurewl.repository;

import io.github.futurewl.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

/**
 * 关键字列表
 * <p>
 * And
 * Or
 * Is、Equals
 * Between
 * LessThan
 * LessThanEqual
 * GreaterThan
 * GreaterThanEqual
 * After
 * Before
 * IsNull
 * IsNotNull
 * NotNull
 * Like
 * NotLike
 * StartingWith
 * EndingWith
 * Containing
 * OrderBy
 * Not
 * In
 * NotIn
 * True
 * False
 * IgnoreCase
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Distinct 去重查询
     *
     * @param username
     * @return
     */
    List<User> findDistinctByUsername(String username);

    /**
     * IgnoreCase 忽略大小写
     *
     * @param username
     * @return
     */
    List<User> findByUsernameIgnoreCase(String username);

    Page<User> findByUsername(String username, Pageable pageable);

    User findFirstByOrderByUsernameAsc();

    User findTopByOrderByUsernameDesc();

    Page<User> queryFirst10ByUsername(String username, Pageable pageable);

    Slice<User> findTop3ByUsername(String username, Pageable pageable);

    List<User> findFirst10ByUsername(String username, Sort sort);

    List<User> findTop10ByUsername(String username, Pageable pageable);

    Stream<User> findAllByUsername();


}
