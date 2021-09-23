package com.henry.springbootshardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import groovy.transform.EqualsAndHashCode;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Henry
 * @Title class Book
 * @Description: 书籍是实体类
 * @date 2020/8/18 20:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("book")
public class Book extends Model<Book> {
    private int id;
    private String name;
    private int count;
}
