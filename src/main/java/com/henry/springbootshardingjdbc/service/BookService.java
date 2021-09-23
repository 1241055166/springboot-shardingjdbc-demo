package com.henry.springbootshardingjdbc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.springbootshardingjdbc.entity.Book;

import java.util.List;

/**
 * @author Henry
 * @Title interface BookService
 * @Description: TODO
 * @date 2020/8/18 20:53
 */
public interface BookService extends IService<Book> {

    /**
     * 保存书籍信息
     *
     * @param book
     * @return
     */
    @Override
    boolean save(Book book);

    /**
     * 查询全部书籍信息
     *
     * @return
     */
    List<Book> getBookList();
}
