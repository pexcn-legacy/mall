package me.pexcn.mall.utils;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;

public class FastDFSClient {
    private StorageClient storageClient;

    public FastDFSClient(String conf) throws Exception {
        if (conf.contains("classpath:")) {
            conf = conf.replace("classpath:", this.getClass().getResource("/").getPath());
        }
        ClientGlobal.init(conf);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        storageClient = new StorageClient1(trackerServer, storageServer);
    }

    public String[] uploadFile(String fileName, String extName, NameValuePair[] metas) throws Exception {
        return storageClient.upload_file(fileName, extName, metas);
    }

    public String[] uploadFile(String fileName) throws Exception {
        return uploadFile(fileName, null, null);
    }

    public String[] uploadFile(String fileName, String extName) throws Exception {
        return uploadFile(fileName, extName, null);
    }

    public String[] uploadFile(byte[] fileContent, String extName, NameValuePair[] metas) throws Exception {
        return storageClient.upload_file(fileContent, extName, metas);
    }

    public String[] uploadFile(byte[] fileContent) throws Exception {
        return uploadFile(fileContent, null, null);
    }

    public String[] uploadFile(byte[] fileContent, String extName) throws Exception {
        return uploadFile(fileContent, extName, null);
    }
}
