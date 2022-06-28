package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.*;
import com.classproject.classprojectbackend.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentsService {


    @Autowired(required=true)
    private CommentsRepository commentsRepository;

    @Autowired(required=true)
    private CustomerlikedcommentsRepository customerlikedcommentsRepository;

    @Autowired(required=true)
    private CustomerDislikedcommentsRepository customerDislikedCommentsRepository;

    @Autowired(required=true)
    private RepliesRepositories repliesRepositories;

    public Comments saveComments(Comments comments){
        return  commentsRepository.save(comments);
    }

    public ArrayList<Comments> getComments(int id) {
        return (ArrayList<Comments>) commentsRepository.getComments(id);

    }


    public ArrayList<Customerlikedcomments> getLikedComments(int serviceConsumerId) {
        return (ArrayList< Customerlikedcomments>) customerlikedcommentsRepository.getLikedCommentsBy(serviceConsumerId);
    }

    public  void updateLikedComment(int likes,int commentId,int customerId,String reason,int likeId,int serviceConsumerId ){

        commentsRepository.UpdateLikedComments(likes,commentId);

        if(reason.equals("save")){
            Customerlikedcomments customerlikedcomments=new Customerlikedcomments(likeId,customerId,commentId,serviceConsumerId);
            customerlikedcommentsRepository.save(customerlikedcomments);
        }else{
            customerlikedcommentsRepository.deleteById(likeId);
        }


    }

    public ArrayList< CustomerDislikedComments> getDisLikedComments(int serviceConsumerId) {
        return (ArrayList< CustomerDislikedComments>) customerDislikedCommentsRepository.getDisLikedCommentsBy(serviceConsumerId);
    }

    public  void updateDisLikedComment(int dislikes,int commentId,int customerId,String reason,int dislikeid,int serviceConsumerId ){

        commentsRepository.UpdateDisLikedComments(dislikes,commentId);

        if(reason.equals("save")){
            CustomerDislikedComments customerDislikedcomments=new CustomerDislikedComments(dislikeid,customerId,commentId,serviceConsumerId);
            customerDislikedCommentsRepository.save(customerDislikedcomments);
        }else{
            customerDislikedCommentsRepository.deleteById(dislikeid);
        }


    }

    public ArrayList<Replies> getReplies(int commentId) {
        return (ArrayList< Replies>) repliesRepositories.getRepliesBy(commentId);
    }

    public  void addReplies(Replies replies,int repliesCount){

        commentsRepository.UpdateRepliesCount(repliesCount,replies.getCommentId());

        repliesRepositories.save(replies);


    }






}
