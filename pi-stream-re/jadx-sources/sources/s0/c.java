package s0;

import android.text.Editable;
import q0.z;

/* loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9730a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f9731b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f9732c;

    public c() {
        try {
            f9732c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f9732c;
        if (cls != null) {
            return new z(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
