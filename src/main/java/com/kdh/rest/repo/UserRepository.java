package com.kdh.rest.repo;

import com.kdh.rest.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVO, String> {
//    List<UserVO> findByUserId(String userId);
//    List<UserVO> findByName(String name);
}
