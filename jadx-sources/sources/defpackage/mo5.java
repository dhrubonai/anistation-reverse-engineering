package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mo5 extends nh2 {
    public final boolean B;
    public final tp C;
    public final Bundle D;
    public final Integer E;

    public mo5(Context context, Looper looper, tp tpVar, Bundle bundle, sh2 sh2Var, th2 th2Var) {
        super(context, looper, 44, tpVar, sh2Var, th2Var);
        this.B = true;
        this.C = tpVar;
        this.D = bundle;
        this.E = (Integer) tpVar.D;
    }

    @Override // defpackage.r30
    public final Bundle i() {
        tp tpVar = this.C;
        boolean equals = this.c.getPackageName().equals((String) tpVar.A);
        Bundle bundle = this.D;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) tpVar.A);
        }
        return bundle;
    }

    @Override // defpackage.r30
    public final boolean u() {
        return this.B;
    }
}
