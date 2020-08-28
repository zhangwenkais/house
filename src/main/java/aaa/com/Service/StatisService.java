package aaa.com.Service;


import aaa.com.Dao.StatisDao;
import aaa.com.Entity.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StatisService {
    @Resource
    StatisDao statisDao;
    public List<Statistics> query()
    {
        return statisDao.queryStatis();
    }
}
