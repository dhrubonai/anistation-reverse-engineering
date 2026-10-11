package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jg0 implements s72 {
    public static final jg0 a = new Object();
    public static Boolean b;

    @Override // defpackage.s72
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw h11.e("canFocus is read before it is written");
    }

    @Override // defpackage.s72
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }
}
