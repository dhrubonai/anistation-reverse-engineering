package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.qx1;
import defpackage.zo5;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final int priority;
    private final String protocol;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CachedFile(java.lang.String r10, java.lang.String r11, java.io.File r12, java.lang.String r13, long r14, java.lang.String r16, int r17, int r18, defpackage.q71 r19) {
        /*
            r9 = this;
            r0 = r18 & 4
            if (r0 == 0) goto L5
            r12 = 0
        L5:
            r3 = r12
            r12 = r18 & 8
            java.lang.String r0 = ""
            if (r12 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r13
        Lf:
            r12 = r18 & 16
            if (r12 == 0) goto L17
            r12 = -1
            r5 = r12
            goto L18
        L17:
            r5 = r14
        L18:
            r12 = r18 & 32
            if (r12 == 0) goto L1e
            r7 = r0
            goto L20
        L1e:
            r7 = r16
        L20:
            r12 = r18 & 64
            if (r12 == 0) goto L2c
            r12 = 2147483647(0x7fffffff, float:NaN)
            r8 = r12
        L28:
            r0 = r9
            r1 = r10
            r2 = r11
            goto L2f
        L2c:
            r8 = r17
            goto L28
        L2f:
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.CachedFile.<init>(java.lang.String, java.lang.String, java.io.File, java.lang.String, long, java.lang.String, int, int, q71):void");
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i2 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i2 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i2 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i2 & 16) != 0) {
            j = cachedFile.contentLength;
        }
        if ((i2 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i2 & 64) != 0) {
            i = cachedFile.priority;
        }
        long j2 = j;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j2, str4, i);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.name;
    }

    public final File component3() {
        return this.file;
    }

    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    public final CachedFile copy(String str, String str2, File file, String str3, long j, String str4, int i) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        return new CachedFile(str, str2, file, str3, j, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        if (a34.i(this.url, cachedFile.url) && a34.i(this.name, cachedFile.name) && a34.i(this.file, cachedFile.file) && a34.i(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && a34.i(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority) {
            return true;
        }
        return false;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int i = zo5.i(this.name, this.url.hashCode() * 31, 31);
        File file = this.file;
        int i2 = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str = this.extension;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Integer.hashCode(this.priority) + zo5.i(this.protocol, qx1.d((i3 + i2) * 31, this.contentLength, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedFile(url=");
        sb.append(this.url);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", extension=");
        sb.append(this.extension);
        sb.append(", contentLength=");
        sb.append(this.contentLength);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", priority=");
        return qx1.o(sb, this.priority, ')');
    }

    public CachedFile(String str, String str2, File file, String str3, long j, String str4, int i) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.url = str;
        this.name = str2;
        this.file = file;
        this.extension = str3;
        this.contentLength = j;
        this.protocol = str4;
        this.priority = i;
    }
}
