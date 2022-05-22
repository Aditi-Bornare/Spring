package io.rspc.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
				new Topic("java","Java 8","PhP"),
				new Topic("spring","srping framework","MPB"),
				new Topic("hibernate","hibernate framework","PhP")));

//	methods
//	All records
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
//	Single record
	public Topic getTopic(String id) 
	{
//		stream() in records ek ek karun kadhle
//		nntr tyala filter kela
//		filter function madhe lambda expression pass kela
//		jo id user pathvel to match kar
//		findFirst() mhnje pahila record
//		ani get() ni get hoto record
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) 
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) 
	{
		topics.removeIf(t->t.getId().equals(id));
	}

	
}
