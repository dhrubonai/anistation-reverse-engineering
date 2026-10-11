package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ar3 {
    public static final ar3 g = new nq3().a();
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public final String a;
    public final vq3 b;
    public final uq3 c;
    public final jr3 d;
    public final qq3 e;
    public final wq3 f;

    public ar3(String str, qq3 qq3Var, vq3 vq3Var, uq3 uq3Var, jr3 jr3Var, wq3 wq3Var) {
        this.a = str;
        this.b = vq3Var;
        this.c = uq3Var;
        this.d = jr3Var;
        this.e = qq3Var;
        this.f = wq3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [st3, java.lang.Object] */
    public static ar3 b(int i2, Bundle bundle) {
        uq3 uq3Var;
        jr3 b;
        boolean z;
        pq3 pq3Var;
        wq3 wq3Var;
        Map b2;
        Cloneable cloneable;
        sq3 sq3Var;
        mq3 mq3Var;
        o15 g2;
        o15 w;
        vq3 vq3Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            uq3Var = uq3.f;
        } else {
            tq3 tq3Var = new tq3();
            String str = uq3.g;
            uq3 uq3Var2 = uq3.f;
            tq3Var.a = bundle2.getLong(str, uq3Var2.a);
            tq3Var.b = bundle2.getLong(uq3.h, uq3Var2.b);
            tq3Var.c = bundle2.getLong(uq3.i, uq3Var2.c);
            tq3Var.d = bundle2.getFloat(uq3.j, uq3Var2.d);
            tq3Var.e = bundle2.getFloat(uq3.k, uq3Var2.e);
            uq3Var = new uq3(tq3Var);
        }
        uq3 uq3Var3 = uq3Var;
        Bundle bundle3 = bundle.getBundle(j);
        if (bundle3 == null) {
            b = jr3.M;
        } else {
            b = jr3.b(i2, bundle3);
        }
        jr3 jr3Var = b;
        Bundle bundle4 = bundle.getBundle(k);
        boolean z2 = false;
        if (bundle4 == null) {
            pq3Var = qq3.r;
        } else {
            oq3 oq3Var = new oq3();
            String str2 = pq3.j;
            pq3 pq3Var2 = pq3.i;
            long j2 = pq3Var2.a;
            long j3 = pq3Var2.d;
            long j4 = pq3Var2.b;
            long U = eq6.U(bundle4.getLong(str2, j2));
            boolean z3 = true;
            if (U >= 0) {
                z = true;
            } else {
                z = false;
            }
            io3.n(z);
            oq3Var.a = U;
            oq3Var.a(eq6.U(bundle4.getLong(pq3.k, pq3Var2.c)));
            oq3Var.c = bundle4.getBoolean(pq3.l, pq3Var2.e);
            oq3Var.d = bundle4.getBoolean(pq3.m, pq3Var2.f);
            oq3Var.e = bundle4.getBoolean(pq3.n, pq3Var2.g);
            oq3Var.f = bundle4.getBoolean(pq3.q, pq3Var2.h);
            long j5 = bundle4.getLong(pq3.o, j4);
            if (j5 != j4) {
                if (j5 < 0) {
                    z3 = false;
                }
                io3.n(z3);
                oq3Var.a = j5;
            }
            long j6 = bundle4.getLong(pq3.p, j3);
            if (j6 != j3) {
                oq3Var.a(j6);
            }
            pq3Var = new pq3(oq3Var);
        }
        qq3 qq3Var = pq3Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            wq3Var = wq3.d;
        } else {
            ?? obj = new Object();
            obj.x = (Uri) bundle5.getParcelable(wq3.e);
            obj.y = bundle5.getString(wq3.f);
            obj.z = eq6.n(bundle5.getBundle(wq3.g));
            wq3Var = new wq3(obj);
        }
        wq3 wq3Var2 = wq3Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            vq3Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(vq3.k);
            if (bundle7 == null) {
                sq3Var = null;
            } else {
                String string2 = bundle7.getString(sq3.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(sq3.j);
                String str3 = sq3.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b2 = t15.D;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str4 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str4);
                            if (string3 != null) {
                                hashMap.put(str4, string3);
                            }
                        }
                    }
                    b2 = rw2.b(hashMap);
                }
                boolean z4 = bundle7.getBoolean(sq3.l, false);
                boolean z5 = bundle7.getBoolean(sq3.m, false);
                boolean z6 = bundle7.getBoolean(sq3.n, false);
                String str5 = sq3.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                nw2 o = nw2.o(arrayList);
                byte[] byteArray = bundle7.getByteArray(sq3.p);
                rq3 rq3Var = new rq3(fromString);
                rq3Var.e = uri;
                rq3Var.f = rw2.b(b2);
                rq3Var.a = z4;
                rq3Var.c = z6;
                rq3Var.b = z5;
                rq3Var.g = nw2.o(o);
                if (byteArray != null) {
                    cloneable = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    cloneable = null;
                }
                rq3Var.h = cloneable;
                sq3Var = new sq3(rq3Var);
            }
            Bundle bundle10 = bundle6.getBundle(vq3.l);
            if (bundle10 == null) {
                mq3Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(mq3.b);
                uri2.getClass();
                eo3 eo3Var = new eo3((byte) 2, z2);
                eo3Var.y = uri2;
                mq3Var = new mq3(eo3Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(vq3.m);
            if (parcelableArrayList == null) {
                z62 z62Var = nw2.y;
                g2 = o15.B;
            } else {
                jw2 k2 = nw2.k();
                int i3 = 0;
                while (i3 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i3);
                    bundle11.getClass();
                    k2.c(new vy5(bundle11.getInt(vy5.A, 0), bundle11.getInt(vy5.B, 0), bundle11.getInt(vy5.C, 0)));
                    i3++;
                    parcelableArrayList = parcelableArrayList;
                }
                g2 = k2.g();
            }
            o15 o15Var = g2;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(vq3.o);
            if (parcelableArrayList2 == null) {
                z62 z62Var2 = nw2.y;
                w = o15.B;
            } else {
                w = kb0.w(new pb0((byte) 8), parcelableArrayList2);
            }
            o15 o15Var2 = w;
            long j7 = bundle6.getLong(vq3.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(vq3.i);
            uri3.getClass();
            vq3Var = new vq3(uri3, bundle6.getString(vq3.j), sq3Var, mq3Var, o15Var, bundle6.getString(vq3.n), o15Var2, j7);
        }
        return new ar3(string, qq3Var, vq3Var, uq3Var3, jr3Var, wq3Var2);
    }

    public final nq3 a() {
        rq3 rq3Var;
        nq3 nq3Var = new nq3();
        nq3Var.f = this.e.a();
        nq3Var.b = this.a;
        nq3Var.k = this.d;
        nq3Var.l = this.c.a();
        nq3Var.m = this.f;
        vq3 vq3Var = this.b;
        if (vq3Var != null) {
            nq3Var.d = vq3Var.f;
            nq3Var.c = vq3Var.b;
            nq3Var.e = vq3Var.a;
            nq3Var.h = vq3Var.e;
            nq3Var.i = vq3Var.g;
            sq3 sq3Var = vq3Var.c;
            if (sq3Var != null) {
                rq3Var = sq3Var.a();
            } else {
                rq3Var = new rq3();
            }
            nq3Var.g = rq3Var;
            nq3Var.j = vq3Var.d;
            nq3Var.a = vq3Var.h;
        }
        return nq3Var;
    }

    public final Bundle c(int i2, boolean z) {
        vq3 vq3Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        uq3 uq3Var = uq3.f;
        uq3 uq3Var2 = this.c;
        if (!uq3Var2.equals(uq3Var)) {
            bundle.putBundle(i, uq3Var2.b());
        }
        jr3 jr3Var = jr3.M;
        jr3 jr3Var2 = this.d;
        if (!jr3Var2.equals(jr3Var)) {
            bundle.putBundle(j, jr3Var2.c(i2));
        }
        pq3 pq3Var = pq3.i;
        qq3 qq3Var = this.e;
        if (!qq3Var.equals(pq3Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = qq3Var.a;
            if (j2 != pq3Var.a) {
                bundle2.putLong(pq3.j, j2);
            }
            long j3 = qq3Var.c;
            if (j3 != pq3Var.c) {
                bundle2.putLong(pq3.k, j3);
            }
            long j4 = qq3Var.b;
            if (j4 != pq3Var.b) {
                bundle2.putLong(pq3.o, j4);
            }
            long j5 = qq3Var.d;
            if (j5 != pq3Var.d) {
                bundle2.putLong(pq3.p, j5);
            }
            boolean z2 = qq3Var.e;
            if (z2 != pq3Var.e) {
                bundle2.putBoolean(pq3.l, z2);
            }
            boolean z3 = qq3Var.f;
            if (z3 != pq3Var.f) {
                bundle2.putBoolean(pq3.m, z3);
            }
            boolean z4 = qq3Var.g;
            if (z4 != pq3Var.g) {
                bundle2.putBoolean(pq3.n, z4);
            }
            boolean z5 = qq3Var.h;
            if (z5 != pq3Var.h) {
                bundle2.putBoolean(pq3.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        wq3 wq3Var = wq3.d;
        wq3 wq3Var2 = this.f;
        if (!wq3Var2.equals(wq3Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = wq3Var2.a;
            if (uri != null) {
                bundle3.putParcelable(wq3.e, uri);
            }
            String str2 = wq3Var2.b;
            if (str2 != null) {
                bundle3.putString(wq3.f, str2);
            }
            Bundle bundle4 = wq3Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(wq3.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (vq3Var = this.b) != null) {
            nw2 nw2Var = vq3Var.g;
            List list = vq3Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(vq3.i, vq3Var.a);
            String str3 = vq3Var.b;
            if (str3 != null) {
                bundle5.putString(vq3.j, str3);
            }
            sq3 sq3Var = vq3Var.c;
            if (sq3Var != null) {
                String str4 = vq3.k;
                nw2 nw2Var2 = sq3Var.g;
                rw2 rw2Var = sq3Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(sq3.i, sq3Var.a.toString());
                Uri uri2 = sq3Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(sq3.j, uri2);
                }
                if (!rw2Var.isEmpty()) {
                    String str5 = sq3.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : rw2Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = sq3Var.d;
                if (z6) {
                    bundle6.putBoolean(sq3.l, z6);
                }
                boolean z7 = sq3Var.e;
                if (z7) {
                    bundle6.putBoolean(sq3.m, z7);
                }
                boolean z8 = sq3Var.f;
                if (z8) {
                    bundle6.putBoolean(sq3.n, z8);
                }
                if (!nw2Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(sq3.o, new ArrayList<>(nw2Var2));
                }
                byte[] bArr = sq3Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(sq3.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            mq3 mq3Var = vq3Var.d;
            if (mq3Var != null) {
                String str6 = vq3.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(mq3.b, mq3Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(vq3.m, kb0.L(list, new pb0((byte) 9)));
            }
            String str7 = vq3Var.f;
            if (str7 != null) {
                bundle5.putString(vq3.n, str7);
            }
            if (!nw2Var.isEmpty()) {
                bundle5.putParcelableArrayList(vq3.o, kb0.L(nw2Var, new pb0((byte) 10)));
            }
            long j6 = vq3Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(vq3.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar3) {
                ar3 ar3Var = (ar3) obj;
                if (Objects.equals(this.a, ar3Var.a) && this.e.equals(ar3Var.e) && Objects.equals(this.b, ar3Var.b) && this.c.equals(ar3Var.c) && Objects.equals(this.d, ar3Var.d) && Objects.equals(this.f, ar3Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.a.hashCode() * 31;
        vq3 vq3Var = this.b;
        if (vq3Var != null) {
            i2 = vq3Var.hashCode();
        } else {
            i2 = 0;
        }
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + i2) * 31)) * 31)) * 31)) * 31);
    }
}
