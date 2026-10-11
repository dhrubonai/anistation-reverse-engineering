package com.unity3d.ads.adplayer.model;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OnDownloadProgressEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnDownloadProgressEvent(String str, Integer num, long j, Long l, boolean z, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.category = "ADVIEWER";
        this.name = "ON_DOWNLOAD_PROGRESS";
        this.parameters = new Object[]{str, num, Long.valueOf(j), l, Boolean.valueOf(z), str2, str3};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
