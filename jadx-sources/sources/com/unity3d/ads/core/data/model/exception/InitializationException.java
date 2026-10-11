package com.unity3d.ads.core.data.model.exception;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import defpackage.a34;
import defpackage.q71;
import defpackage.qf6;
import defpackage.zo5;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final ErrorOuterClass.PublicErrorCode errorCode;
    private final ByteString errorToken;
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, q71 q71Var) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : publicErrorCode, (i & 32) != 0 ? null : byteString);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.message;
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        if ((i & 16) != 0) {
            publicErrorCode = initializationException.errorCode;
        }
        if ((i & 32) != 0) {
            byteString = initializationException.errorToken;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        ByteString byteString2 = byteString;
        return initializationException.copy(str, th, str2, str3, publicErrorCode2, byteString2);
    }

    public final String component1() {
        return this.message;
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final ErrorOuterClass.PublicErrorCode component5() {
        return this.errorCode;
    }

    public final ByteString component6() {
        return this.errorToken;
    }

    public final InitializationException copy(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString) {
        str.getClass();
        str2.getClass();
        return new InitializationException(str, th, str2, str3, publicErrorCode, byteString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        if (a34.i(this.message, initializationException.message) && a34.i(this.throwable, initializationException.throwable) && a34.i(this.reason, initializationException.reason) && a34.i(this.reasonDebug, initializationException.reasonDebug) && this.errorCode == initializationException.errorCode && a34.i(this.errorToken, initializationException.errorToken)) {
            return true;
        }
        return false;
    }

    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.message.hashCode() * 31;
        Throwable th = this.throwable;
        int i = 0;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        int i2 = zo5.i(this.reason, (hashCode4 + hashCode) * 31, 31);
        String str = this.reasonDebug;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ErrorOuterClass.PublicErrorCode publicErrorCode = this.errorCode;
        if (publicErrorCode == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = publicErrorCode.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ByteString byteString = this.errorToken;
        if (byteString != null) {
            i = byteString.hashCode();
        }
        return i4 + i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ", errorToken=" + this.errorToken + ')';
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final InitializationException parseFrom(Exception exc) {
            String str;
            exc.getClass();
            if (!(exc instanceof qf6) && !(exc instanceof NetworkTimeoutException)) {
                if (exc instanceof GatewayException) {
                    GatewayException gatewayException = (GatewayException) exc;
                    return new InitializationException(gatewayException.getMessage(), gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug(), gatewayException.getErrorCode(), gatewayException.getErrorToken());
                }
                if (exc instanceof UnityAdsNetworkException) {
                    UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) exc;
                    if (unityAdsNetworkException.getCode() == null) {
                        str = "network";
                    } else {
                        str = "network." + unityAdsNetworkException.getCode();
                    }
                    return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_NETWORK_ERROR, exc, str, unityAdsNetworkException.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK, null, 32, null);
                }
                if (exc instanceof InitializationException) {
                    return (InitializationException) exc;
                }
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_UNKNOWN_ERROR, exc, "unknown", exc.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN, null, 32, null);
            }
            return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_TIMEOUT, exc, "timeout", exc.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, null, 32, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString) {
        super(str);
        str.getClass();
        str2.getClass();
        this.message = str;
        this.throwable = th;
        this.reason = str2;
        this.reasonDebug = str3;
        this.errorCode = publicErrorCode;
        this.errorToken = byteString;
    }
}
