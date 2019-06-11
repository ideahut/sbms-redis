package com.github.ideahut.sbms.redis.cache;

import java.util.Iterator;

import com.github.ideahut.sbms.common.cache.CacheGroup;
import com.github.ideahut.sbms.common.cache.CacheValueColletor;

public class RedisCacheGroup implements CacheGroup {

	@Override
	public <KEY, VALUE> CacheGroup register(
		String group, int limit, long ageInMillis, boolean nullable, CacheValueColletor<KEY, VALUE> valueColletor
	) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> CacheGroup unregister(String group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> VALUE get(String group, KEY key, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> VALUE put(String group, KEY key, VALUE value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> VALUE remove(String group, KEY key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> void clear(String group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String group) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <KEY, VALUE> boolean exists(String group, KEY key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> groups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> Iterator<KEY> keys(String group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <KEY, VALUE> int size(String group) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <KEY, VALUE> long age(String group) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <KEY, VALUE> int limit(String group) {
		// TODO Auto-generated method stub
		return 0;
	}

}
