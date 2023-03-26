package com.oriole.motaclient;

import com.oriole.motaclient.operation.clientUtil.SecurityCheck;
import com.oriole.motaclient.operation.smartScreenHandle.ADScreenView;
import com.oriole.motaclient.operation.syncHandle.SyncManagement;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;

import static com.oriole.motaclient.Constant.ChromeConfig;
import static com.oriole.motaclient.Constant.InitState;
import static com.oriole.motaclient.debug.DebugMode.*;

@Component
public class AfterServiceStarted implements ApplicationRunner {

    /**
     * 会在服务启动完成后立即执行
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(InitState) {
            Process process = Runtime.getRuntime().exec(ChromeConfig + "chrome.exe -kiosk http://localhost:8999/controllerView/");
            if(!(DEBUG_MODE&&NO_SMARTSCREEN)) {
//                new ADScreenView().open();
            }
            if(!(DEBUG_MODE&&NO_SECURITY)) {
                SecurityCheck.getInstance().checkSystemSecurity();
            }
            if(!(DEBUG_MODE&&NO_INTERNET)) {
                SyncManagement.getInstance().UpdateADScheduleTask();
            }
        }else {
            Process process = Runtime.getRuntime().exec(ChromeConfig + "chrome.exe -kiosk http://localhost:8999/controllerView/init");
            JOptionPane.showMessageDialog(null, "<WARNING>设备初始化尚未完成，请运维人员对设备进行初始化！", "设备首次初始化", JOptionPane.WARNING_MESSAGE);
        }
    }
}
