package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.StorageManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@Deprecated
/* loaded from: classes.dex */
public class MediationMetaData extends MetaData {
    public static final String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORDINAL = "ordinal";
    public static final String KEY_VERSION = "version";

    @Deprecated
    public MediationMetaData(Context context) {
        super(context);
        setCategory("mediation");
    }

    @Override // com.unity3d.ads.metadata.MetaData
    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.MEMORY;
    }

    public void setMissedImpressionOrdinal(int i) {
        set(KEY_MISSED_IMPRESSION_ORDINAL, Integer.valueOf(i));
    }

    @Deprecated
    public void setName(String str) {
        set(KEY_NAME, str);
    }

    public void setOrdinal(int i) {
        set(KEY_ORDINAL, Integer.valueOf(i));
    }

    @Deprecated
    public void setVersion(String str) {
        set("version", str);
    }
}
