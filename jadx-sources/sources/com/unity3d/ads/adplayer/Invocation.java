package com.unity3d.ads.adplayer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class Invocation {
    private final String location;
    private final Object[] parameters;

    public Invocation(String str, Object[] objArr) {
        str.getClass();
        objArr.getClass();
        this.location = str;
        this.parameters = objArr;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
