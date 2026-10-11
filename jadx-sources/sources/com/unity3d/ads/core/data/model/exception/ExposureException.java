package com.unity3d.ads.core.data.model.exception;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(String str, Object[] objArr) {
        super(str);
        str.getClass();
        objArr.getClass();
        this.parameters = objArr;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
