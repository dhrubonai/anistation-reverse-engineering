package com.unity3d.ads.metadata;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@Deprecated
/* loaded from: classes.dex */
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    @Deprecated
    public PlayerMetaData(Context context) {
        super(context);
        setCategory("player");
    }

    @Deprecated
    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }
}
