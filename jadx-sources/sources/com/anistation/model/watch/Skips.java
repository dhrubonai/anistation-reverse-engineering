package com.anistation.model.watch;

import defpackage.a34;
import defpackage.aj5;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Skips {
    public static final Companion Companion = new Companion(null);
    private final SkipRange intro;
    private final SkipRange outro;

    public /* synthetic */ Skips(int i, SkipRange skipRange, SkipRange skipRange2, kj5 kj5Var) {
        if (3 != (i & 3)) {
            iq4.throwMissingFieldException(i, 3, Skips$$serializer.INSTANCE.getDescriptor());
        }
        this.intro = skipRange;
        this.outro = skipRange2;
    }

    public static /* synthetic */ Skips copy$default(Skips skips, SkipRange skipRange, SkipRange skipRange2, int i, Object obj) {
        if ((i & 1) != 0) {
            skipRange = skips.intro;
        }
        if ((i & 2) != 0) {
            skipRange2 = skips.outro;
        }
        return skips.copy(skipRange, skipRange2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Skips skips, hu0 hu0Var, aj5 aj5Var) {
        SkipRange$$serializer skipRange$$serializer = SkipRange$$serializer.INSTANCE;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, skipRange$$serializer, skips.intro);
        hu0Var.encodeNullableSerializableElement(aj5Var, 1, skipRange$$serializer, skips.outro);
    }

    public final SkipRange component1() {
        return this.intro;
    }

    public final SkipRange component2() {
        return this.outro;
    }

    public final Skips copy(SkipRange skipRange, SkipRange skipRange2) {
        return new Skips(skipRange, skipRange2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Skips)) {
            return false;
        }
        Skips skips = (Skips) obj;
        if (a34.i(this.intro, skips.intro) && a34.i(this.outro, skips.outro)) {
            return true;
        }
        return false;
    }

    public final SkipRange getIntro() {
        return this.intro;
    }

    public final SkipRange getOutro() {
        return this.outro;
    }

    public int hashCode() {
        int hashCode;
        SkipRange skipRange = this.intro;
        int i = 0;
        if (skipRange == null) {
            hashCode = 0;
        } else {
            hashCode = skipRange.hashCode();
        }
        int i2 = hashCode * 31;
        SkipRange skipRange2 = this.outro;
        if (skipRange2 != null) {
            i = skipRange2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Skips(intro=" + this.intro + ", outro=" + this.outro + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Skips$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Skips(SkipRange skipRange, SkipRange skipRange2) {
        this.intro = skipRange;
        this.outro = skipRange2;
    }
}
