package com.example.testpipeline.config;

import com.example.testpipeline.models.HealthMetric;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

//@Configuration
//@EnableKafka
public class DataProducerConfig {
/*
    @Bean
    public Map<String,Object> producerConf(){
        Map<String,Object>properties = new HashMap<>();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return properties;
    }

    @Bean
    public ProducerFactory<String, HealthMetric>producerFactoryConf(){
        return new DefaultKafkaProducerFactory<>(producerConf());
    }

    @Bean
    public KafkaTemplate<String,HealthMetric>producerListener(){
        return new KafkaTemplate<>(producerFactoryConf());
    }*/
}
