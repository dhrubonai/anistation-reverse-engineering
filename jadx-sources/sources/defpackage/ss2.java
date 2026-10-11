package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ss2 {
    public Long a;
    public Long b;
    public Long c;

    static {
        al6 al6Var;
        z05.a(ss2.class);
        try {
            al6Var = z05.c(ss2.class);
        } catch (Throwable unused) {
            al6Var = null;
        }
        if (al6Var != null && al6Var.a()) {
            ov3.m("TypeInfo for nullable kotlinType ", al6Var, " must have isNullable set to true");
        } else {
            if (!uz5.V("TimeoutConfiguration")) {
                return;
            }
            ze0.k("Name can't be blank");
        }
    }

    public ss2() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public static void a(Long l) {
        if (l != null && l.longValue() <= 0) {
            ze0.k("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ss2.class != obj.getClass()) {
            return false;
        }
        ss2 ss2Var = (ss2) obj;
        if (a34.i(this.a, ss2Var.a) && a34.i(this.b, ss2Var.b) && a34.i(this.c, ss2Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Long l = this.a;
        int i3 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l2 = this.b;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l3 = this.c;
        if (l3 != null) {
            i3 = l3.hashCode();
        }
        return i5 + i3;
    }
}
