package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dw7 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final so7 d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public dw7(Context context, so7 so7Var, Long l, Long l2) {
        this.e = true;
        a34.x(context);
        Context applicationContext = context.getApplicationContext();
        a34.x(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (so7Var != null) {
            this.d = so7Var;
            this.e = so7Var.z;
            this.c = so7Var.y;
            this.h = so7Var.B;
            Bundle bundle = so7Var.A;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
