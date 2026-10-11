package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sd2 implements ay3 {
    public static final sd2 b = new sd2(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ sd2(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.ay3
    public final ey4 a(Class cls) {
        switch (this.a) {
            case 0:
                if (vd2.class.isAssignableFrom(cls)) {
                    try {
                        return (ey4) vd2.d(cls.asSubclass(vd2.class)).c(3);
                    } catch (Exception e) {
                        ov3.k("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                ze0.k("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.ay3
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return vd2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
