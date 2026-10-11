package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ss7 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ bt7 e;

    public ss7(bt7 bt7Var, String str, boolean z) {
        this.e = bt7Var;
        a34.u(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.P().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.e.P().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
