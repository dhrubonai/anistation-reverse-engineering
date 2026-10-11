package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ps1 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ps1 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new tv5(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
