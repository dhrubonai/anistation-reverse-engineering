package com.discord.org.webrtc;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class RtcError {
    private final RtcException error;

    private RtcError(RtcException rtcException) {
        this.error = rtcException;
    }

    public static RtcError error(String str) {
        return new RtcError(new RtcException(str));
    }

    public static RtcError success() {
        return new RtcError(null);
    }

    public boolean isError() {
        if (this.error != null) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        if (this.error == null) {
            return true;
        }
        return false;
    }

    public void throwError() {
        RtcException rtcException = this.error;
        if (rtcException == null) {
        } else {
            throw rtcException;
        }
    }

    public RtcException error() {
        return this.error;
    }
}
