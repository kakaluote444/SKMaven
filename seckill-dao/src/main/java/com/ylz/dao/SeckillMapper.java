package com.ylz.dao;

import com.ylz.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeckillMapper {

    int deleteByPrimaryKey(Integer seckillId);

    int insertSelective(Seckill record);

    Seckill selectByPrimaryKey(Integer seckillId);

    //分页查询
    List<Seckill> selectByPage(
            @Param("begin") int begin,
            @Param("offset") int offset);

    //查询秒杀产品的总记录条数
    int selectTotalCount();

    int updateByPrimaryKeySelective(Seckill record);

    //更新库存
    int updateSeckillNumber(int seckilId);

}