package com.anistation.model.watch;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class DownloadSource {
    public static final Companion Companion = new Companion(null);
    private final String server;
    private final String type;
    private final String url;

    public /* synthetic */ DownloadSource(int i, String str, String str2, String str3, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, DownloadSource$$serializer.INSTANCE.getDescriptor());
        }
        this.server = str;
        this.type = str2;
        this.url = str3;
    }

    public static /* synthetic */ DownloadSource copy$default(DownloadSource downloadSource, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadSource.server;
        }
        if ((i & 2) != 0) {
            str2 = downloadSource.type;
        }
        if ((i & 4) != 0) {
            str3 = downloadSource.url;
        }
        return downloadSource.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(DownloadSource downloadSource, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, downloadSource.server);
        v0Var.w(aj5Var, 1, downloadSource.type);
        v0Var.w(aj5Var, 2, downloadSource.url);
    }

    public final String component1() {
        return this.server;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.url;
    }

    public final DownloadSource copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new DownloadSource(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadSource)) {
            return false;
        }
        DownloadSource downloadSource = (DownloadSource) obj;
        if (a34.i(this.server, downloadSource.server) && a34.i(this.type, downloadSource.type) && a34.i(this.url, downloadSource.url)) {
            return true;
        }
        return false;
    }

    public final String getServer() {
        return this.server;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + zo5.i(this.type, this.server.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.server;
        String str2 = this.type;
        return h11.k(h11.o("DownloadSource(server=", str, ", type=", str2, ", url="), this.url, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return DownloadSource$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DownloadSource(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.server = str;
        this.type = str2;
        this.url = str3;
    }
}
