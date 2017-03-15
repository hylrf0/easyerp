package org.easyerp.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.easyerp.common.annotation.MyBatisRepository;
import org.easyerp.dao.entity.UserInfo;

@MyBatisRepository
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo userInfo);

    int insertSelective(UserInfo userInfo);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo userInfo);

    int updateByPrimaryKey(UserInfo userInfo);

    UserInfo getUserInfoByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}