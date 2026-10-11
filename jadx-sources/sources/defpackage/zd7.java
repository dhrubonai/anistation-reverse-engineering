package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zd7 extends po0 {
    public final xd7 z;

    public zd7(za8 za8Var, int i, xd7 xd7Var) {
        super(za8Var, i);
        char c;
        this.z = xd7Var;
        StringBuilder sb = new StringBuilder("%");
        za8Var.d(sb);
        if (true != za8Var.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(xd7Var.x);
    }

    @Override // defpackage.po0
    public final void E(df2 df2Var, Object obj) {
        char c;
        char c2 = this.z.x;
        za8 za8Var = (za8) this.y;
        StringBuilder sb = (StringBuilder) df2Var.g;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 2);
            sb2.append("%t");
            sb2.append(c2);
            df2.g(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        za8Var.d(sb3);
        if (true != za8Var.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb3.append(c);
        sb3.append(c2);
        sb.append(String.format(db8.a, sb3.toString(), obj));
    }
}
