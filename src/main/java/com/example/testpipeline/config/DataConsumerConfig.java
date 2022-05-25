package com.example.testpipeline.config;

import com.example.testpipeline.models.HealthMetric;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

//@Configuration
//@EnableKafka
public class DataConsumerConfig {

    /*@Bean
    public Map<String, Object> consumerConf(){
        Map<String,Object> properties = new HashMap<>();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"IotData");
        return properties;
    }

    @Bean
    public ConsumerFactory<String,HealthMetric> consumerFactoryConf(){
        return new DefaultKafkaConsumerFactory<>(consumerConf(),new StringDeserializer(),new JsonDeserializer<>(HealthMetric.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, HealthMetric> consumeListener(){
        ConcurrentKafkaListenerContainerFactory<String,HealthMetric> concurrentFactory = new ConcurrentKafkaListenerContainerFactory<>();
        concurrentFactory.setConsumerFactory(consumerFactoryConf());
        return concurrentFactory;
    }*/
}
