package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lw0 {
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final gw3 a;
    public final PendingIntent b;
    public final mk5 c;
    public final go4 d;
    public final go4 e;
    public final Bundle f;
    public final Bundle g;
    public final ep4 h;
    public final nw2 i;
    public final nw2 j;
    public final MediaSession.Token k;
    public final nw2 l;

    static {
        String str = eq6.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(9, 36);
        q = Integer.toString(14, 36);
        r = Integer.toString(13, 36);
        s = Integer.toString(3, 36);
        t = Integer.toString(4, 36);
        u = Integer.toString(5, 36);
        v = Integer.toString(6, 36);
        w = Integer.toString(11, 36);
        x = Integer.toString(7, 36);
        y = Integer.toString(8, 36);
        Integer.toString(10, 36);
        z = Integer.toString(12, 36);
        Integer.toString(15, 36);
    }

    public lw0(gw3 gw3Var, PendingIntent pendingIntent, nw2 nw2Var, nw2 nw2Var2, nw2 nw2Var3, mk5 mk5Var, go4 go4Var, go4 go4Var2, Bundle bundle, Bundle bundle2, ep4 ep4Var, MediaSession.Token token) {
        this.a = gw3Var;
        this.b = pendingIntent;
        this.i = nw2Var;
        this.j = nw2Var2;
        this.l = nw2Var3;
        this.c = mk5Var;
        this.d = go4Var;
        this.e = go4Var2;
        this.f = bundle;
        this.g = bundle2;
        this.h = ep4Var;
        this.k = token;
    }

    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(m, 1011001300);
        bundle.putBinder(n, this.a);
        bundle.putParcelable(o, this.b);
        nw2 nw2Var = this.i;
        boolean isEmpty = nw2Var.isEmpty();
        String str = p;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(nw2Var.size());
            int size = nw2Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = nw2Var.get(i2);
                i2++;
                arrayList.add(((kq0) obj).j(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        nw2 nw2Var2 = this.j;
        if (!nw2Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(nw2Var2.size());
                int size2 = nw2Var2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = nw2Var2.get(i3);
                    i3++;
                    arrayList2.add(((kq0) obj2).j(i));
                }
                bundle.putParcelableArrayList(q, arrayList2);
            } else {
                o15 f = kq0.f(nw2Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(f.A);
                z62 listIterator = f.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((kq0) listIterator.next()).j(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        nw2 nw2Var3 = this.l;
        if (!nw2Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(nw2Var3.size());
            int size3 = nw2Var3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = nw2Var3.get(i4);
                i4++;
                arrayList4.add(((kq0) obj3).j(i));
            }
            bundle.putParcelableArrayList(r, arrayList4);
        }
        mk5 mk5Var = this.c;
        mk5Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        ho6 it = mk5Var.a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((lk5) it.next()).a());
        }
        bundle2.putParcelableArrayList(mk5.c, arrayList5);
        bundle.putBundle(s, bundle2);
        String str2 = t;
        go4 go4Var = this.d;
        bundle.putBundle(str2, go4Var.b());
        String str3 = u;
        go4 go4Var2 = this.e;
        bundle.putBundle(str3, go4Var2.b());
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g);
        bundle.putBundle(x, this.h.e(x97.F(go4Var, go4Var2), false, false).f(i));
        bundle.putInt(y, 10);
        MediaSession.Token token = this.k;
        if (token != null) {
            bundle.putParcelable(z, token);
        }
        return bundle;
    }
}
