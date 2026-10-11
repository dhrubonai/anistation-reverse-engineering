package com.anistation.model;

import defpackage.a34;
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
public final class Studio {
    public static final Companion Companion = new Companion(null);
    private final int id;
    private final boolean main;
    private final String name;

    public /* synthetic */ Studio(int i, int i2, String str, boolean z, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, Studio$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i2;
        this.name = str;
        this.main = z;
    }

    public static /* synthetic */ Studio copy$default(Studio studio, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = studio.id;
        }
        if ((i2 & 2) != 0) {
            str = studio.name;
        }
        if ((i2 & 4) != 0) {
            z = studio.main;
        }
        return studio.copy(i, str, z);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Studio studio, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.t(0, studio.id, aj5Var);
        v0Var.w(aj5Var, 1, studio.name);
        v0Var.p(aj5Var, 2, studio.main);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.main;
    }

    public final Studio copy(int i, String str, boolean z) {
        str.getClass();
        return new Studio(i, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Studio)) {
            return false;
        }
        Studio studio = (Studio) obj;
        if (this.id == studio.id && a34.i(this.name, studio.name) && this.main == studio.main) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getMain() {
        return this.main;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.main) + zo5.i(this.name, Integer.hashCode(this.id) * 31, 31);
    }

    public String toString() {
        int i = this.id;
        String str = this.name;
        boolean z = this.main;
        StringBuilder sb = new StringBuilder("Studio(id=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", main=");
        return qx1.r(sb, z, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Studio$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Studio(int i, String str, boolean z) {
        str.getClass();
        this.id = i;
        this.name = str;
        this.main = z;
    }
}
