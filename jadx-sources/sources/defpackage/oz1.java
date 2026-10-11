package defpackage;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oz1 extends Exception {
    public static final n15 y;
    public final int x;

    /* JADX WARN: Type inference failed for: r0v0, types: [eb2, bw2] */
    static {
        ?? eb2Var = new eb2(4);
        eb2Var.I("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        eb2Var.I("ERROR_CODE_IO_UNSPECIFIED", 2000);
        eb2Var.I("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        eb2Var.I("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        eb2Var.I("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        eb2Var.I("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        eb2Var.I("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        eb2Var.I("ERROR_CODE_IO_NO_PERMISSION", 2006);
        eb2Var.I("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        eb2Var.I("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        eb2Var.I("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        eb2Var.I("ERROR_CODE_DECODING_FAILED", 3002);
        eb2Var.I("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        eb2Var.I("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        eb2Var.I("ERROR_CODE_ENCODING_FAILED", 4002);
        eb2Var.I("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        eb2Var.I("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        eb2Var.I("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        eb2Var.I("ERROR_CODE_MUXING_FAILED", 7001);
        eb2Var.I("ERROR_CODE_MUXING_TIMEOUT", 7002);
        eb2Var.I("ERROR_CODE_MUXING_APPEND", 7003);
        y = eb2Var.g();
    }

    public oz1(String str, Throwable th, int i, int i2) {
        super(str, th);
        this.x = i;
        SystemClock.elapsedRealtime();
    }

    public static oz1 a(Throwable th, int i) {
        return new oz1("Asset loader error", th, i, 0);
    }

    public static oz1 b(yv yvVar, String str) {
        StringBuilder n = h11.n("Audio error: ", str, ", audioFormat=");
        n.append(yvVar.x);
        return new oz1(n.toString(), yvVar, 6001, 0);
    }

    public static oz1 c(Exception exc, int i, pn0 pn0Var) {
        return new oz1("Codec exception: " + pn0Var, exc, i, 0);
    }

    public static oz1 d(Exception exc) {
        if (exc instanceof RuntimeException) {
            return new oz1("Unexpected runtime error", exc, 1001, 0);
        }
        return new oz1("Unexpected error", exc, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 0);
    }

    public static oz1 e(ns6 ns6Var) {
        return new oz1("Video frame processing error", ns6Var, 5001, 0);
    }
}
