package com.kdh.rest.controller;

import com.kdh.rest.repo.UserRepository;
import com.kdh.rest.vo.Response;
import com.kdh.rest.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
@Api(tags = {"유저 컨트롤러"})
public class UserController {
    private UserRepository userRepo;

    @ApiOperation(value = "사용자 리스트", response = UserVO.class)
    @GetMapping("/getList")
    public Response getList(){
        return Response.builder().data(userRepo.findAll()).build();
    }

    @ApiOperation(value = "사용자 등록/수정", response = UserVO.class)
    @RequestMapping(value = "/save", method = {RequestMethod.POST,RequestMethod.PUT})
    public Response insert(
        @ApiParam(value="사용자 VO", required = true)
        @RequestBody UserVO vo){
        return Response.builder().data(userRepo.save(vo)).build();
    }

    @ApiOperation(value = "사용자 삭제")
    @DeleteMapping("/delete")
    public Response delete(
        @ApiParam(value="사용자 ID", required = true)
        @RequestBody String id){
        userRepo.deleteById(id);
        return Response.builder().build();
    }
}
