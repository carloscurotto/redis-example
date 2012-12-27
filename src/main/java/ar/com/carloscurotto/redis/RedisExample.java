package ar.com.carloscurotto.redis;

import redis.clients.jedis.Jedis;

/**
 * This is the main class of the redis example.  This example is 
 * extremely simple, it just shows how to store and read data back 
 * using a java redis api.
 * 
 * @author carloscurotto
 *
 */
public class RedisExample {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("localhost");
		
		String key = "charly-key";
		String value = "charly-value";
		
		// store a key-value pair
		jedis.set(key, value);
		System.out.println("Storing [key=" + key + ", value=" + value + "]");
		
		// get the key-value pair stored
		String retrived = jedis.get(key);
		System.out.println("Retrieved value [" + retrived + "] for key [" + key + "]");
		
		// remove the key-value pair stored
		Long quantityDeleted = jedis.del(key);
		System.out.println("Deleted key [" + key + "]");
		System.out.println("Quantity of successfuly deleted keys [" + quantityDeleted + "]");
	}

}
