package Dao;

import java.util.List;

/**
 * Created by ASUS on 2019/1/15.
 */
public interface bookmanage {
    List<bookmanage> selectAll();
    int add(bookmanage bookmanage);
    int delect(int id);
}
