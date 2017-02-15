package org.apache.mesos.hbase;

import org.apache.mesos.hbase.util.HdfsConfFileUrlJsonFinder;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.net.URL;

/**
 *
 * @author jzajic
 */
public class TestJsonState {

  @Test
  public void testIt() throws Exception
  {
    URL jsonURL = TestJsonState.class.getResource("/state.json");
    ObjectMapper mapper = new ObjectMapper();
    HdfsConfFileUrlJsonFinder finder = new HdfsConfFileUrlJsonFinder(mapper);
    String findedUrl = finder.findUrl(jsonURL);
    System.out.println(findedUrl);
    assert findedUrl.equals("http://192.168.1.170:31564/hdfs-site.xml");
  }

}
