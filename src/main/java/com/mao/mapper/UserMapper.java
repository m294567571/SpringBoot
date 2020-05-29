package com.mao.mapper;

import com.mao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository//持久层一般都用这个,虽然@Component是通用的
public interface UserMapper {

    List<User> listUser();

    User selectUser(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
