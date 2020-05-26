package com.temp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class redisConfig {

	@Bean
	 RedisConnectionFactory redisConnectionFactory() {
		 return new LettuceConnectionFactory("127.0.0.1", 6379);
	 }
	
	 @Bean
	 RedisTemplate<String, Object> redisTemplate(){
		 RedisTemplate<String, Object> redisTemplate =   new RedisTemplate<>();
		 redisTemplate.setKeySerializer(new StringRedisSerializer());
		 redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		 redisTemplate.setConnectionFactory(redisConnectionFactory());
	
		 return redisTemplate;
	 }
}
