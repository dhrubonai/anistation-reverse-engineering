package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class UnityAdsNetworkException extends Exception {
    private final String client;
    private final Integer code;
    private final Integer cronetCode;
    private final String message;
    private final String protocol;
    private final OperationType type;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UnityAdsNetworkException(java.lang.String r8, com.unity3d.ads.core.data.model.OperationType r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.String r14, int r15, defpackage.q71 r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            if (r0 == 0) goto L7
            com.unity3d.ads.core.data.model.OperationType r0 = com.unity3d.ads.core.data.model.OperationType.UNKNOWN
            goto L8
        L7:
            r0 = r9
        L8:
            r1 = r15 & 4
            r2 = 0
            if (r1 == 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r10
        L10:
            r3 = r15 & 8
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r11
        L17:
            r4 = r15 & 16
            if (r4 == 0) goto L1d
            r4 = r2
            goto L1e
        L1d:
            r4 = r12
        L1e:
            r5 = r15 & 32
            if (r5 == 0) goto L24
            r5 = r2
            goto L25
        L24:
            r5 = r13
        L25:
            r6 = r15 & 64
            if (r6 == 0) goto L33
            r16 = r2
        L2b:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            goto L36
        L33:
            r16 = r14
            goto L2b
        L36:
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, q71):void");
    }

    public final String getClient() {
        return this.client;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final OperationType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        super(str);
        str.getClass();
        operationType.getClass();
        this.message = str;
        this.type = operationType;
        this.code = num;
        this.url = str2;
        this.protocol = str3;
        this.cronetCode = num2;
        this.client = str4;
    }
}
