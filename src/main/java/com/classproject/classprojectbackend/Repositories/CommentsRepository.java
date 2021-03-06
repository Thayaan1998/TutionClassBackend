package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.Comments;
import com.classproject.classprojectbackend.entity.Customer;
import com.classproject.classprojectbackend.entity.CustomerDislikedComments;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface CommentsRepository  extends CrudRepository<Comments,Integer> {
    @Modifying
    @Query("update Comments c set c.likes = ?1 where c.commentsId = ?2")
    void UpdateLikedComments(int likes, int commentsId);

    @Modifying
    @Query("update Comments c set c.dislikes = ?1 where c.commentsId = ?2")
    void UpdateDisLikedComments(int dislikes, int commentsId);

    @Modifying
    @Query("update Comments c set c.replies" +
            "" +
            " = ?1 where c.commentsId = ?2")
    void UpdateRepliesCount(int replies, int commentsId);

    @Query(value = "SELECT * from comments where serviceProviderId =?1", nativeQuery = true)
    public ArrayList<Comments> getComments(int serviceProviderId);

}
