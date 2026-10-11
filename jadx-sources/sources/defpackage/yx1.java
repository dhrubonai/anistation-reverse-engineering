package defpackage;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yx1 extends Exception {
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public final String A;
    public final int B;
    public final ea2 C;
    public final int D;
    public final jw3 E;
    public final boolean F;
    public final int x;
    public final long y;
    public final byte z;

    static {
        String str = eq6.a;
        G = Integer.toString(0, 36);
        H = Integer.toString(1, 36);
        I = Integer.toString(2, 36);
        J = Integer.toString(3, 36);
        K = Integer.toString(4, 36);
        L = Integer.toString(5, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yx1(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.ea2 r19, int r20, defpackage.jw3 r21, boolean r22) {
        /*
            r13 = this;
            if (r14 == 0) goto L43
            r0 = 1
            if (r14 == r0) goto L14
            r0 = 3
            if (r14 == r0) goto L11
            java.lang.String r0 = "Unexpected runtime error"
        La:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L4b
        L11:
            java.lang.String r0 = "Remote error"
            goto La
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = defpackage.eq6.D(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4b
        L43:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L4b:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L58
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L58:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r8 = r20
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx1.<init>(int, java.lang.Throwable, int, java.lang.String, int, ea2, int, jw3, boolean):void");
    }

    public final yx1 a(jw3 jw3Var) {
        String message = getMessage();
        String str = eq6.a;
        return new yx1(message, getCause(), this.x, this.z, this.A, this.B, this.C, this.D, jw3Var, this.y, this.F);
    }

    public final String b() {
        int i = this.x;
        if (i != -100) {
            if (i != -6) {
                if (i != -4) {
                    if (i != -3) {
                        if (i != -2) {
                            if (i != 7000) {
                                if (i != 7001) {
                                    switch (i) {
                                        case -110:
                                            return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                                        case -109:
                                            return "ERROR_CODE_END_OF_PLAYLIST";
                                        case -108:
                                            return "ERROR_CODE_SETUP_REQUIRED";
                                        case -107:
                                            return "ERROR_CODE_SKIP_LIMIT_REACHED";
                                        case -106:
                                            return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                                        case -105:
                                            return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                                        case -104:
                                            return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                                        case -103:
                                            return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                                        case -102:
                                            return "ERROR_CODE_AUTHENTICATION_EXPIRED";
                                        default:
                                            switch (i) {
                                                case UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT /* 1000 */:
                                                    return "ERROR_CODE_UNSPECIFIED";
                                                case 1001:
                                                    return "ERROR_CODE_REMOTE_ERROR";
                                                case 1002:
                                                    return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                                                case 1003:
                                                    return "ERROR_CODE_TIMEOUT";
                                                case 1004:
                                                    return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                                                default:
                                                    switch (i) {
                                                        case 2000:
                                                            return "ERROR_CODE_IO_UNSPECIFIED";
                                                        case 2001:
                                                            return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                                        case 2002:
                                                            return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                                        case 2003:
                                                            return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                                        case 2004:
                                                            return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                                        case 2005:
                                                            return "ERROR_CODE_IO_FILE_NOT_FOUND";
                                                        case 2006:
                                                            return "ERROR_CODE_IO_NO_PERMISSION";
                                                        case 2007:
                                                            return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                                        case 2008:
                                                            return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                                        default:
                                                            switch (i) {
                                                                case 3001:
                                                                    return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                                                case 3002:
                                                                    return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                                                case 3003:
                                                                    return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                                                case 3004:
                                                                    return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                                                default:
                                                                    switch (i) {
                                                                        case 4001:
                                                                            return "ERROR_CODE_DECODER_INIT_FAILED";
                                                                        case 4002:
                                                                            return "ERROR_CODE_DECODER_QUERY_FAILED";
                                                                        case 4003:
                                                                            return "ERROR_CODE_DECODING_FAILED";
                                                                        case 4004:
                                                                            return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                                        case 4005:
                                                                            return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                                        case 4006:
                                                                            return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                                        default:
                                                                            switch (i) {
                                                                                case 5001:
                                                                                    return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                                                case 5002:
                                                                                    return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                                                case 5003:
                                                                                    return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                                                case 5004:
                                                                                    return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 6000:
                                                                                            return "ERROR_CODE_DRM_UNSPECIFIED";
                                                                                        case 6001:
                                                                                            return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                                        case 6002:
                                                                                            return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                                        case 6003:
                                                                                            return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                                        case 6004:
                                                                                            return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                                        case 6005:
                                                                                            return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                                        case 6006:
                                                                                            return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                                        case 6007:
                                                                                            return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                                        case 6008:
                                                                                            return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                                        default:
                                                                                            if (i >= 1000000) {
                                                                                                return "custom error code";
                                                                                            }
                                                                                            return "invalid error code";
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                }
                                return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
                            }
                            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
                        }
                        return "ERROR_CODE_INVALID_STATE";
                    }
                    return "ERROR_CODE_BAD_VALUE";
                }
                return "ERROR_CODE_PERMISSION_DENIED";
            }
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        return "ERROR_CODE_DISCONNECTED";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yx1(String str, Throwable th, int i, int i2, String str2, int i3, ea2 ea2Var, int i4, jw3 jw3Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = Bundle.EMPTY;
        this.x = i;
        this.y = j;
        io3.n(!z || i2 == 1);
        io3.n(th != null || i2 == 3);
        this.z = i2;
        this.A = str2;
        this.B = i3;
        this.C = ea2Var;
        this.D = i4;
        this.E = jw3Var;
        this.F = z;
    }

    public yx1(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
