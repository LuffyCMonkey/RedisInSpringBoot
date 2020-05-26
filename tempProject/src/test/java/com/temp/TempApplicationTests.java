package com.temp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootTest
class TempApplicationTests {

	@Autowired
	RedisTemplate<String, Object> redisTemplate;

	@Test
	void contextLoads() {
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		//get/set을 위한 객체
        ValueOperations<String, Object> vop = redisTemplate.opsForValue();
        vop.set("jdkSerial", "jdk");
        String result = (String) vop.get("jdkSerial");
        System.out.println(result);//jdk
	}
}
