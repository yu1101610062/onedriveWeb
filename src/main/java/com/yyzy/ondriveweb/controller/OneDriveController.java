package com.yyzy.ondriveweb.controller;

import com.microsoft.graph.models.DriveItem;
import com.yyzy.ondriveweb.dto.OneDriveUser;
import com.yyzy.ondriveweb.dto.common.Result;
import com.yyzy.ondriveweb.service.OneDriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/onedrive")
@RequiredArgsConstructor
public class OneDriveController {
    final private OneDriveService oneDriveService;

    @RequestMapping("/getOneDriveUserList")
    public Result<List<OneDriveUser>> getOneDriveUserList() {
        return oneDriveService.getOneDriveUserList();
    }

    @RequestMapping("/getFileList")
    public Result<List<DriveItem>> getFileList(@RequestParam Long driveId, @RequestParam String itemsId) {
        return oneDriveService.getFileList(driveId, itemsId);
    }

    @RequestMapping("/getFileDownloadUrl")
    public Result<String> getFileDownloadUrl(@RequestParam Long driveId, @RequestParam String itemsId) throws URISyntaxException {
        return oneDriveService.getFileDownloadUrl(driveId, itemsId);
    }

}
