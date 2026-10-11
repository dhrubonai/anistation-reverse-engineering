package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vl7 {
    public final Context a;
    public final String b;
    public final jm7 c;
    public final di0 d;
    public final dn7 e;

    public vl7(Context context, di0 di0Var, dn7 dn7Var) {
        String a;
        boolean isEmpty = Collections.unmodifiableList(di0Var.y).isEmpty();
        String str = di0Var.x;
        if (isEmpty) {
            a = x97.p(str);
        } else {
            List unmodifiableList = Collections.unmodifiableList(di0Var.y);
            if (str != null) {
                if (unmodifiableList != null) {
                    a = new ht7((Object) unmodifiableList, str).a();
                } else {
                    ze0.k("namespaces cannot be null");
                    throw null;
                }
            } else {
                ze0.k("applicationId cannot be null");
                throw null;
            }
        }
        this.c = new jm7(this);
        this.a = context.getApplicationContext();
        a34.u(a);
        this.b = a;
        this.d = di0Var;
        this.e = dn7Var;
    }
}
