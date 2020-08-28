package aaa.com.Dao;

import aaa.com.Entity.Statistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatisDao {
    public List<Statistics> queryStatis();
}
