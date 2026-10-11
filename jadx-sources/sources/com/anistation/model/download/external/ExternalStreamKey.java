package com.anistation.model.download.external;

import defpackage.aj5;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class ExternalStreamKey {
    public static final Companion Companion = new Companion(null);
    private final int groupIndex;
    private final int periodIndex;
    private final int streamIndex;

    public /* synthetic */ ExternalStreamKey(int i, int i2, int i3, int i4, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, ExternalStreamKey$$serializer.INSTANCE.getDescriptor());
        }
        this.periodIndex = i2;
        this.groupIndex = i3;
        this.streamIndex = i4;
    }

    public static /* synthetic */ ExternalStreamKey copy$default(ExternalStreamKey externalStreamKey, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = externalStreamKey.periodIndex;
        }
        if ((i4 & 2) != 0) {
            i2 = externalStreamKey.groupIndex;
        }
        if ((i4 & 4) != 0) {
            i3 = externalStreamKey.streamIndex;
        }
        return externalStreamKey.copy(i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ExternalStreamKey externalStreamKey, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.t(0, externalStreamKey.periodIndex, aj5Var);
        v0Var.t(1, externalStreamKey.groupIndex, aj5Var);
        v0Var.t(2, externalStreamKey.streamIndex, aj5Var);
    }

    public final int component1() {
        return this.periodIndex;
    }

    public final int component2() {
        return this.groupIndex;
    }

    public final int component3() {
        return this.streamIndex;
    }

    public final ExternalStreamKey copy(int i, int i2, int i3) {
        return new ExternalStreamKey(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalStreamKey)) {
            return false;
        }
        ExternalStreamKey externalStreamKey = (ExternalStreamKey) obj;
        if (this.periodIndex == externalStreamKey.periodIndex && this.groupIndex == externalStreamKey.groupIndex && this.streamIndex == externalStreamKey.streamIndex) {
            return true;
        }
        return false;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final int getPeriodIndex() {
        return this.periodIndex;
    }

    public final int getStreamIndex() {
        return this.streamIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.streamIndex) + qx1.c(this.groupIndex, Integer.hashCode(this.periodIndex) * 31, 31);
    }

    public String toString() {
        return zo5.k(this.streamIndex, ")", qx1.u("ExternalStreamKey(periodIndex=", this.periodIndex, ", groupIndex=", this.groupIndex, ", streamIndex="));
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ExternalStreamKey$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExternalStreamKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.groupIndex = i2;
        this.streamIndex = i3;
    }
}
