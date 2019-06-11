package com.github.ideahut.sbms.redis.cache;

import java.util.Iterator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import com.github.ideahut.sbms.common.cache.Cache;
import com.github.ideahut.sbms.common.cache.CacheValueColletor;

public class RedisCache<KEY, VALUE> implements Cache<KEY, VALUE>, InitializingBean {
	
	private final String ID;
	
	private int limit; // 0 = unlimited
	
	private long ageInMillis; // 0 = never expired
	
	private boolean nullable;
	
	private CacheValueColletor<KEY, VALUE> valueColletor;
	
	private RedisConnectionFactory redisConnectionFactory;
	
	private RedisCacheManager manager;
	
	private TaskExecutor taskExecutor;
	
	public RedisCache(int limit, long ageInMillis, boolean nullable, CacheValueColletor<KEY, VALUE> valueColletor) {
		ID = String.valueOf(System.nanoTime());
		setLimit(limit);
		setAgeInMillis(ageInMillis);
		setNullable(nullable);
		setValueColletor(valueColletor);
	}
	
	public RedisCache(int limit, long ageInMillis, CacheValueColletor<KEY, VALUE> valueColletor) {
		this(limit, ageInMillis, false, valueColletor);
	}
	
	public RedisCache(long ageInMillis, boolean nullable, CacheValueColletor<KEY, VALUE> valueColletor) {
		this(0, ageInMillis, nullable, valueColletor);
	}
	
	public RedisCache(int limit, long ageInMillis) {
		this(limit, ageInMillis, false, null);
	}
	
	public RedisCache(long ageInMillis, boolean nullable) {
		this(0, ageInMillis, nullable, null);
	}
	
	public RedisCache(CacheValueColletor<KEY, VALUE> valueColletor) {
		this(0, 0, false, valueColletor);
	}
	
	public RedisCache() {
		this(0, 0, false, null);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		prepare();		
	}
	
	public RedisCache<KEY, VALUE> prepare() throws Exception {
		if (redisConnectionFactory == null) {
			throw new Exception("RedisConnectionFactory is required");
		}
		if (limit < 0) {
			limit = 0;
		}
		if (ageInMillis < 0) {
			ageInMillis = 0;
		}
		return this;
	}
	
	public RedisCache<KEY, VALUE> setLimit(int limit) {
		this.limit = limit > 0 ? limit : 0;
		return this;
	}

	public RedisCache<KEY, VALUE> setAgeInMillis(long ageInMillis) {
		this.ageInMillis = ageInMillis > 0 ? ageInMillis : 0;
		return this;
	}
	
	public boolean isNullable() {
		return nullable;
	}

	public RedisCache<KEY, VALUE> setNullable(boolean nullable) {
		this.nullable = nullable;
		return this;
	}

	public CacheValueColletor<KEY, VALUE> getValueColletor() {
		return valueColletor;
	}

	public RedisCache<KEY, VALUE> setValueColletor(CacheValueColletor<KEY, VALUE> valueColletor) {
		this.valueColletor = valueColletor;
		return this;
	}
	
	public RedisConnectionFactory getRedisConnectionFactory() {
		return redisConnectionFactory;
	}

	public RedisCache<KEY, VALUE> setRedisConnectionFactory(RedisConnectionFactory redisConnectionFactory) {
		this.redisConnectionFactory = redisConnectionFactory;
		return this;
	}

	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}

	public RedisCache<KEY, VALUE> setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
		return this;
	}

	@Override
	public VALUE get(KEY key, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VALUE put(KEY key, VALUE value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VALUE remove(KEY key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(KEY key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<KEY> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 0;
	}	

}
