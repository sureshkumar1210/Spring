package com.example.databaseh2.connectmysql.method;

import com.example.databaseh2.connectmysql.method.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService TopicService;

    @RequestMapping("/topics")
    public List<Topic> getallTopics(){
        return TopicService.getallTopics();
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return TopicService.getTopic(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        TopicService.addTopic(topic);
    }
    @RequestMapping(method=RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
    {
        TopicService.updateTopic(topic,id);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        TopicService.deleteTopic(id);
    }

}
