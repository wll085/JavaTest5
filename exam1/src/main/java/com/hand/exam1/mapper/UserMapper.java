package com.hand.exam1.mapper;

import com.hand.exam1.entity.Customer;
import com.hand.exam1.entity.Film;
import com.hand.exam1.entity.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void login(String first_name,String last_name);
    void list(Page page);
    void insertFilm(Film film);
    void upadte(Customer customer);
    void dalate(Customer customer);
}
