package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.IBookDao;
import com.example.demo.domain.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 */
@Service
public class BookServiceImpl implements IBookService {

    private static final Logger logger = LogManager.getLogger(BookServiceImpl.class);

    @Resource
    private IBookDao iBookDao;


    @Override
    public List<Book> findByReader(String reader) {
        List<Book> result = new ArrayList<>();
        try {
            logger.info("根据读者信息查询书本信息：reader={}", reader);
            result = iBookDao.findByReader(reader);
            logger.info("查询结果：{}", JSON.toJSONString(result));
        } catch (Exception e) {
            logger.error("查询书详细信息出错:{}", JSON.toJSONString(result), e);
        }
        return result;
    }


    @Override
    public int addBook(Book book) {
        int result = 0;
        try {
            result = iBookDao.addBook(book);
        } catch (Exception e) {
            logger.error("插入数据报错{}", e);
        }
        return result;
    }
}
