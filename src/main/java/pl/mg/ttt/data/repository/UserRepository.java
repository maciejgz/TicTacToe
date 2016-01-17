package pl.mg.ttt.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/**
 * Created by m on 2016-01-17.
 */
public interface UserRepository extends CrudRepository<User,String> {

    @Override
    User findOne(String s);

    @Override
    boolean exists(String s);

    @Override
    Iterable<User> findAll();

    @Override
    long count();

    @Override
    void delete(String s);

    @Override
    void delete(User user);

    //own methods
    List<User> findByUsername(String username);
}
