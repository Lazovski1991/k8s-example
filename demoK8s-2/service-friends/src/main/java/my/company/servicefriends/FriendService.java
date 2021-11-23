package my.company.servicefriends;

import my.company.servicefriends.model.Friend;
import my.company.servicefriends.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendRepository friendRepository;

    @Transactional
    public String save(String name) {
        Friend friend = new Friend(name);
        friendRepository.save(friend);
        return "успешно";
    }

    @Transactional(readOnly = true)
    public List<Friend> findAll() {
        return friendRepository.findAll();
    }
}
