package com.oriole.motaclient;

import com.alibaba.fastjson.JSONObject;
import com.oriole.motaclient.controller.FileProcessingController;
import com.oriole.motaclient.log.LogHandler;
import com.oriole.motaclient.operation.clientUtil.JSONFileIO;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 固定变量
 *
 * @author NeoSunJz
 * @version V1.0.1 Beta
 */
public class Constant {

    public final static String DeviceID;
    public final static String Password;
    public final static String AuthCode;

    public final static String BusinessServer;
    public final static String FileServer;

    /*生成二维码用*/
    /*用户上传打印文件Url*/
    public final static String UserUploadPrintFilePageUrl = "platform/uploadFile";
    /*用户下载扫描文件Url*/
    public final static String UserDownloadScanFilePageUrl = "platform/downloadScanFile";
    /*用户兑换错误补偿券Url*/
    public final static String UserErrorRefundPageUrl = "platform/refund";

    /*同步信息地址*/
    /*总体同步检查地址（心跳5min）*/
    public final static String SyncUrl = "sync/checkSync";
    public final static String SyncReportUrl = "sync/syncRecord";
    /*广告信息更新Url*/
    public final static String UpdateADUrl = "sync/getAdvertisement";
    /*智慧屏通知信息更新Url*/
    public final static String UpdateSmartScreenNoticeUrl = "sync/getSmartScreenNotice";
    /*智慧屏失物招领信息更新Url*/
    public final static String UpdateSmartScreenLostInfoUrl = "sync/getSmartScreenLostInfo";

    public final static String GetUniversityInfo = "/device/getUniversityInfo";

    public final static String ADRunRecordUrl = "record/adRunRecord";

    public final static String PrinterRunRecordUrl = "record/printerRunRecord";

    /*OSS*/
    /*OSS Endpoint*/
    public final static String Endpoint = "https://oss-cn-shanghai.aliyuncs.com";
    /*获取文件OSS上传授权*/
    public final static String AuthUrl = "aliRAM/getOssIOAuth";

    /*广告文件OSS位置*/
    public final static String adFilePath = "motaServer/ad/";
    /*视频监控文件OSS位置*/
    public final static String monitorFilePath = "motaServer/monitor/";
    /*打印文件OSS位置*/
    public final static String printFilePath = "motaServer/printer/printfile/";
    /*扫描文件OSS位置*/
    public final static String scanFilePath = "motaServer/printer/scanfile/";

    public final static String DownloadADFileSavePath = "D:/motaClientTemp/sync/adFile/";
    public final static String DownloadSmartScreenFileSavePath = "D:/motaClientTemp/sync/smartScreenFile/";
    public final static String PrintOrSacnTempFilePath = "D:/motaClientTemp/jobTemp/";
    public final static String MonitorFileCachePath = "D:/motaClientTemp/monitorCache/";

    public final static String PrinterName;

    public final static String WiresharkUSBPcapConfig;
    public final static String ChromeConfig;
    public final static String WiresharkPathConfig;

    public final static Integer defaultMarginImgCount;
    public final static Integer defaultWholePageImgCount;
    public final static Integer defaultControlScreenImgCount;
    public final static Integer defaultADScreenImgCount;
    public final static Integer defaultADScreenVideoCount;

    public final static Integer WholePageImgPerPaperNum;

    public final static Boolean InitState;


    static {
        JSONObject config = null;
        try {
            config = JSONObject.parseObject(JSONFileIO.ReadFile("D:/motaClientTemp/config.json"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        InitState = config.getBoolean("InitState");
        DeviceID = InitState ? config.getString("DeviceID") : null;
        Password = InitState ? config.getString("Password") : null;
        AuthCode = InitState ? config.getString("AuthCode") : null;

        BusinessServer = config.getString("BusinessServer");

        FileServer = config.getString("FileServer");

        PrinterName = config.getString("PrinterName");

        WiresharkUSBPcapConfig = config.getString("WiresharkUSBPcapConfig");
        ChromeConfig = config.getString("ChromeConfig");
        WiresharkPathConfig = config.getString("WiresharkPathConfig");

        defaultMarginImgCount = config.getInteger("defaultMarginImgCount");
        defaultWholePageImgCount = config.getInteger("defaultWholePageImgCount");
        defaultControlScreenImgCount = config.getInteger("defaultControlScreenImgCount");
        defaultADScreenImgCount = config.getInteger("defaultADScreenImgCount");
        defaultADScreenVideoCount = config.getInteger("defaultADScreenVideoCount");

        WholePageImgPerPaperNum = config.getInteger("WholePageImgPerPaperNum");
    }
}
