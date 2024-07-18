package dio.me.application.service;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}