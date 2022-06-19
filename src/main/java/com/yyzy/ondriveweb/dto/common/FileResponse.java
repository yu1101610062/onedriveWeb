package com.yyzy.ondriveweb.dto.common;

import lombok.Data;

@Data
public class FileResponse {
    private String id;
    private String name;
    private String parentId;
    private Integer childCount;
    private Boolean isFolder;
    private String lastModifiedName;
    private String lastModifiedTime;
}
