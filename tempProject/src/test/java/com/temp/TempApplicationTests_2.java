package com.temp; 

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import vo.DataData;

@SpringBootTest
class TempApplicationTests_2 {

	@Autowired
	RedisTemplate<String, Object> redisTemplate;
	
	
	@Test
    public void redisBasicFunction_guide() {
		
		ValueOperations<String, Object> vop = redisTemplate.opsForValue();		
		
		String key = "luffy";
        
		 DataData setData = new DataData();
	     setData.setItemId("jeong");
	     setData.setSourceId("pro");

	     vop.set(key, setData);
	     DataData getData = (DataData) vop.get(key);
	     System.out.println(getData.getItemId());//jeong
	     System.out.println(getData.getSourceId());//pro
        
	    /*
        // redis에서 data delete
        //redisTemplate_2.delete(key);
        
        // redis에 해당 key를 가지고 있는지 확인
        if (!redisTemplate.hasKey("999")) {
            System.out.println("key 미존재");
        }
        */
        System.out.println("작업 끝");
    }
}
