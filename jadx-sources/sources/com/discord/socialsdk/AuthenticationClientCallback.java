package com.discord.socialsdk;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AuthenticationClientCallback {
    private long nativeContext;

    public AuthenticationClientCallback(long j) {
        this.nativeContext = j;
    }

    private native void onAuthorizationComplete(long j, String str, String str2, String str3);

    public void finalize() {
        nativeFinalize(this.nativeContext);
    }

    public native void nativeFinalize(long j);

    public void onAuthorizationComplete(String str, String str2, String str3) {
        onAuthorizationComplete(this.nativeContext, str, str2, str3);
    }
}
