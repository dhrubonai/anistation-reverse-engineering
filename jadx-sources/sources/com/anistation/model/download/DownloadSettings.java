package com.anistation.model.download;

import defpackage.a34;
import defpackage.h11;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DownloadSettings {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_EXTERNAL_LOCATION = "Downloads/AniStation";
    private final boolean downloadOverWifiOnly;
    private final String externalLocationName;
    private final String externalLocationUri;

    public /* synthetic */ DownloadSettings(boolean z, String str, String str2, int i, q71 q71Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? DEFAULT_EXTERNAL_LOCATION : str2);
    }

    public static /* synthetic */ DownloadSettings copy$default(DownloadSettings downloadSettings, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = downloadSettings.downloadOverWifiOnly;
        }
        if ((i & 2) != 0) {
            str = downloadSettings.externalLocationUri;
        }
        if ((i & 4) != 0) {
            str2 = downloadSettings.externalLocationName;
        }
        return downloadSettings.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.downloadOverWifiOnly;
    }

    public final String component2() {
        return this.externalLocationUri;
    }

    public final String component3() {
        return this.externalLocationName;
    }

    public final DownloadSettings copy(boolean z, String str, String str2) {
        str2.getClass();
        return new DownloadSettings(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadSettings)) {
            return false;
        }
        DownloadSettings downloadSettings = (DownloadSettings) obj;
        if (this.downloadOverWifiOnly == downloadSettings.downloadOverWifiOnly && a34.i(this.externalLocationUri, downloadSettings.externalLocationUri) && a34.i(this.externalLocationName, downloadSettings.externalLocationName)) {
            return true;
        }
        return false;
    }

    public final boolean getDownloadOverWifiOnly() {
        return this.downloadOverWifiOnly;
    }

    public final String getExternalLocationName() {
        return this.externalLocationName;
    }

    public final String getExternalLocationUri() {
        return this.externalLocationUri;
    }

    public final boolean getUsesDefaultExternalLocation() {
        if (this.externalLocationUri == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.downloadOverWifiOnly) * 31;
        String str = this.externalLocationUri;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.externalLocationName.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public String toString() {
        boolean z = this.downloadOverWifiOnly;
        String str = this.externalLocationUri;
        String str2 = this.externalLocationName;
        StringBuilder sb = new StringBuilder("DownloadSettings(downloadOverWifiOnly=");
        sb.append(z);
        sb.append(", externalLocationUri=");
        sb.append(str);
        sb.append(", externalLocationName=");
        return h11.k(sb, str2, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }

    public DownloadSettings(boolean z, String str, String str2) {
        str2.getClass();
        this.downloadOverWifiOnly = z;
        this.externalLocationUri = str;
        this.externalLocationName = str2;
    }

    public DownloadSettings() {
        this(false, null, null, 7, null);
    }
}
