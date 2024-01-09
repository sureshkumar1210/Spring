package com.example.databaseh2.connectmysql.method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;
    public List<Topic> topics =new ArrayList<Topic>(
            Arrays.asList(new Topic("spring","spring framework","spring frame work description"),
                    new Topic("js","javascript","javascript description"),
                    new Topic("java","core java","core java description")));
    public List<Topic> getallTopics(){
        List<Topic> t = new ArrayList<Topic>();
        topicRepository.findAll().forEach(t::add);
        return t;

    }
    public Topic getTopic(String id){

        return topicRepository.findById(id).orElse(null);

    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);

    }
    public void updateTopic(Topic topic,String id){

        topicRepository.save(topic);
    }

    public void deleteTopic(String id){

        topicRepository.deleteById(id);

    }
}
