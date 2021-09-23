package com.henry.springbootshardingjdbc.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.springbootshardingjdbc.entity.Book;
import com.henry.springbootshardingjdbc.mapper.BookMapper;
import com.henry.springbootshardingjdbc.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Henry
 * @Title class BookServiceImpl
 * @Description: TODO
 * @date 2020/8/18 20:53
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public List<Book> getBookList() {
        return baseMapper.selectList(Wrappers.<Book>lambdaQuery());
    }

    @Override
    public boolean save(Book book) {
        return super.save(book);
    }
}
