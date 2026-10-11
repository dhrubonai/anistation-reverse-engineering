package com.unity3d.ads.core.data.model.exception;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i, String str) {
        super(str);
        str.getClass();
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
