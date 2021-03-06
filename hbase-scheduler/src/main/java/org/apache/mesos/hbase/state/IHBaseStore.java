package org.apache.mesos.hbase.state;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Interface for storing and retrieving Hbase tracker resources.
 */
public interface IHBaseStore {

  byte[] getRawValueForId(String id) throws ExecutionException, InterruptedException;

  void setRawValueForId(String id,
      byte[] frameworkId) throws ExecutionException, InterruptedException;

  <T extends Object> T get(String key) throws InterruptedException, ExecutionException,
      IOException, ClassNotFoundException;

  <T extends Object> void set(String key, T object) throws InterruptedException,
      ExecutionException, IOException;

}
