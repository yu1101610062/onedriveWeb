package com.yyzy.ondriveweb.service;

import com.microsoft.graph.models.DriveItem;
import com.yyzy.ondriveweb.dto.OneDriveUser;
import com.yyzy.ondriveweb.dto.common.FileResponse;
import com.yyzy.ondriveweb.dto.common.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OneDriveService {

    Result<List<OneDriveUser>> getOneDriveUserListForAdmin();

    Result<OneDriveUser> getOneDriveUserForAdmin(Long driveId);

    Result<List<OneDriveUser>> getOneDriveUserList();

    Result addOrUpdateOneDriveUser(OneDriveUser oneDriveUser);

    Result<List<FileResponse>> getFileList(Long driveId, String itemsId);

    Result<String> getFileDownloadUrl(Long driveId, String itemsId);
}
