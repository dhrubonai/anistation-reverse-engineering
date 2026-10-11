package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hh0 implements z26 {
    public final /* synthetic */ Context x;

    public /* synthetic */ hh0(Context context) {
        this.x = context;
    }

    @Override // defpackage.z26
    public a36 r(y26 y26Var) {
        Context context = this.x;
        context.getClass();
        String str = (String) y26Var.d;
        fr0 fr0Var = (fr0) y26Var.e;
        fr0Var.getClass();
        if (str != null && str.length() != 0) {
            return new mb2(context, str, fr0Var, true, true);
        }
        ze0.k("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
