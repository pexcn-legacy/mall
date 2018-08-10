package me.pexcn.mall.test;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by pexcn on 2018-08-10.
 */
public class FastDFSTest {
    @Test
    public void testFastDFSUpload() throws IOException, MyException {
        ClientGlobal.init("D:\\Dev\\pexcn\\mall\\mall-manager-web\\src\\main\\resources\\fastdfs\\client.conf");
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        String[] results = storageClient.upload_file("C:\\Users\\Administrator\\Desktop\\test.png", "png", null);
        System.out.println(Arrays.toString(results));
    }
}
