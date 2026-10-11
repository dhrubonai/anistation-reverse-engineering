package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gb4 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public qt0 k;
    public byte l;
    public int m;
    public boolean n;
    public String p;
    public Bundle q;
    public String s;
    public final boolean t;
    public final Notification u;
    public final ArrayList v;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean j = true;
    public boolean o = false;
    public boolean r = false;

    public gb4(Context context, String str) {
        Notification notification = new Notification();
        this.u = notification;
        this.a = context;
        this.s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.v = new ArrayList();
        this.t = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        IconCompat a;
        if (i == 0) {
            a = null;
        } else {
            a = IconCompat.a(i);
        }
        this.b.add(new cb4(a, str, pendingIntent, new Bundle(), null, true, true));
    }

    public final Notification b() {
        Bundle bundle;
        String u;
        dn0 dn0Var = new dn0(this);
        gb4 gb4Var = (gb4) dn0Var.z;
        qt0 qt0Var = gb4Var.k;
        if (qt0Var != null) {
            qt0Var.m(dn0Var);
        }
        Notification build = ((Notification.Builder) dn0Var.y).build();
        if (qt0Var != null) {
            gb4Var.k.getClass();
        }
        if (qt0Var != null && (bundle = build.extras) != null && (u = qt0Var.u()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", u);
        }
        return build;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.u;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(qt0 qt0Var) {
        if (this.k != qt0Var) {
            this.k = qt0Var;
            if (((gb4) qt0Var.x) != this) {
                qt0Var.x = this;
                e(qt0Var);
            }
        }
    }
}
