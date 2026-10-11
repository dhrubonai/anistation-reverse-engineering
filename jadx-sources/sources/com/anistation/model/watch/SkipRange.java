package com.anistation.model.watch;

import defpackage.aj5;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.v0;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class SkipRange {
    public static final Companion Companion = new Companion(null);
    private final double end;
    private final double start;

    public /* synthetic */ SkipRange(int i, double d, double d2, kj5 kj5Var) {
        if (3 != (i & 3)) {
            iq4.throwMissingFieldException(i, 3, SkipRange$$serializer.INSTANCE.getDescriptor());
        }
        this.start = d;
        this.end = d2;
    }

    public static /* synthetic */ SkipRange copy$default(SkipRange skipRange, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = skipRange.start;
        }
        if ((i & 2) != 0) {
            d2 = skipRange.end;
        }
        return skipRange.copy(d, d2);
    }

    public static final void write$Self$AniStation_core_model(SkipRange skipRange, hu0 hu0Var, aj5 aj5Var) {
        double d = skipRange.start;
        v0 v0Var = (v0) hu0Var;
        v0Var.getClass();
        aj5Var.getClass();
        v0Var.q(aj5Var, 0);
        v0Var.d(d);
        double d2 = skipRange.end;
        v0Var.q(aj5Var, 1);
        v0Var.d(d2);
    }

    public final double component1() {
        return this.start;
    }

    public final double component2() {
        return this.end;
    }

    public final SkipRange copy(double d, double d2) {
        return new SkipRange(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipRange)) {
            return false;
        }
        SkipRange skipRange = (SkipRange) obj;
        if (Double.compare(this.start, skipRange.start) == 0 && Double.compare(this.end, skipRange.end) == 0) {
            return true;
        }
        return false;
    }

    public final double getEnd() {
        return this.end;
    }

    public final double getStart() {
        return this.start;
    }

    public int hashCode() {
        return Double.hashCode(this.end) + (Double.hashCode(this.start) * 31);
    }

    public String toString() {
        return "SkipRange(start=" + this.start + ", end=" + this.end + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return SkipRange$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SkipRange(double d, double d2) {
        this.start = d;
        this.end = d2;
    }
}
