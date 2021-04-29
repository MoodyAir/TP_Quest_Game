package com.questgame.service.impl;

import com.questgame.dao.TopicDao;
import com.questgame.dao.domain.Topic;
import com.questgame.dto.TopicDto;
import com.questgame.mapper.DifficultyMapper;
import com.questgame.mapper.TopicMapper;
import com.questgame.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicServiceImpl implements TopicService {

    private final TopicDao topicDAO;

    @Override
    public List<TopicDto> getTopics() {
        List<TopicDto> topics = new ArrayList<TopicDto>();
        for (var t: topicDAO.getTopics()) {
            topics.add(TopicMapper.topicToDto(t));
        }
        return topics;
    }

    @Override
    public List<TopicDto> getNTopics(int n) {
        List<TopicDto> topics = new ArrayList<TopicDto>();
        for (var t: topicDAO.getNTopics(n)) {
            topics.add(TopicMapper.topicToDto(t));
        }
        return topics;
    }

}
