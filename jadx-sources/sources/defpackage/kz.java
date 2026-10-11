package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.anistation.model.settings.SubtitleArgbColor;
import java.math.BigInteger;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kz implements nw4, fi4, as0, k16 {
    public Object A;
    public Object B;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    public kz(ko koVar, ud1 ud1Var, p82 p82Var, xd6 xd6Var, List list, boolean z) {
        List list2;
        int i;
        String str;
        String str2;
        nt1 nt1Var;
        List list3;
        ko koVar2 = koVar;
        xd6 xd6Var2 = xd6Var;
        this.x = koVar2;
        this.y = list;
        final byte b = 0;
        sb2 sb2Var = new sb2(this) { // from class: p24
            public final /* synthetic */ kz y;

            {
                this.y = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                float f = 0.0f;
                ei4 ei4Var = null;
                int i2 = 1;
                kz kzVar = this.y;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) kzVar.B;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float i3 = ((ei4) r0).a.i();
                            int size = arrayList.size() - 1;
                            boolean z2 = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i2);
                                    float i4 = ((ei4) obj).a.i();
                                    r0 = z2;
                                    if (Float.compare(i3, i4) < 0) {
                                        r0 = obj;
                                        i3 = i4;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                        z2 = r0;
                                    }
                                }
                            }
                            ei4Var = r0;
                        }
                        ei4 ei4Var2 = ei4Var;
                        if (ei4Var2 != null) {
                            f = ei4Var2.a.i();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) kzVar.B;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((ei4) r02).a.F.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z3 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i2);
                                    float c2 = ((ei4) obj2).a.F.c();
                                    r02 = z3;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                        z3 = r02;
                                    }
                                }
                            }
                            ei4Var = r02;
                        }
                        ei4 ei4Var3 = ei4Var;
                        if (ei4Var3 != null) {
                            f = ei4Var3.a.F.c();
                        }
                        return Float.valueOf(f);
                }
            }
        };
        jf3 jf3Var = jf3.z;
        this.z = bx7.B(jf3Var, sb2Var);
        final byte b2 = 1;
        this.A = bx7.B(jf3Var, new sb2(this) { // from class: p24
            public final /* synthetic */ kz y;

            {
                this.y = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                float f = 0.0f;
                ei4 ei4Var = null;
                int i2 = 1;
                kz kzVar = this.y;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = (ArrayList) kzVar.B;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float i3 = ((ei4) r0).a.i();
                            int size = arrayList.size() - 1;
                            boolean z2 = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i2);
                                    float i4 = ((ei4) obj).a.i();
                                    r0 = z2;
                                    if (Float.compare(i3, i4) < 0) {
                                        r0 = obj;
                                        i3 = i4;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                        z2 = r0;
                                    }
                                }
                            }
                            ei4Var = r0;
                        }
                        ei4 ei4Var2 = ei4Var;
                        if (ei4Var2 != null) {
                            f = ei4Var2.a.i();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) kzVar.B;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((ei4) r02).a.F.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z3 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i2);
                                    float c2 = ((ei4) obj2).a.F.c();
                                    r02 = z3;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                        z3 = r02;
                                    }
                                }
                            }
                            ei4Var = r02;
                        }
                        ei4 ei4Var3 = ei4Var;
                        if (ei4Var3 != null) {
                            f = ei4Var3.a.F.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        hi4 hi4Var = xd6Var2.b;
        ko koVar3 = lo.a;
        ArrayList arrayList = koVar2.A;
        String str3 = koVar2.y;
        byte b3 = 6;
        nt1 nt1Var2 = nt1.x;
        if (arrayList != null) {
            list2 = yo0.C0(arrayList, new k82(b3));
        } else {
            list2 = nt1Var2;
        }
        ArrayList arrayList2 = new ArrayList();
        bs bsVar = new bs();
        int size = list2.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            jo joVar = (jo) list2.get(i2);
            jo a = jo.a(joVar, hi4Var.a((hi4) joVar.a), b, b, 14);
            Object obj = a.a;
            int i4 = a.c;
            int i5 = a.b;
            while (i3 < i5 && !bsVar.isEmpty()) {
                jo joVar2 = (jo) bsVar.last();
                List list4 = list2;
                int i6 = joVar2.c;
                nt1 nt1Var3 = nt1Var2;
                Object obj2 = joVar2.a;
                if (i5 < i6) {
                    arrayList2.add(new jo(i3, i5, obj2));
                    i3 = i5;
                    list2 = list4;
                    nt1Var2 = nt1Var3;
                } else {
                    int i7 = size;
                    arrayList2.add(new jo(i3, i6, obj2));
                    i3 = joVar2.c;
                    while (!bsVar.isEmpty() && i3 == ((jo) bsVar.last()).c) {
                        bsVar.removeLast();
                    }
                    list2 = list4;
                    nt1Var2 = nt1Var3;
                    size = i7;
                }
            }
            List list5 = list2;
            nt1 nt1Var4 = nt1Var2;
            int i8 = size;
            if (i3 < i5) {
                arrayList2.add(new jo(i3, i5, hi4Var));
                i3 = i5;
            }
            jo joVar3 = (jo) bsVar.i();
            if (joVar3 != null) {
                int i9 = joVar3.c;
                Object obj3 = joVar3.a;
                int i10 = joVar3.b;
                if (i10 == i5 && i9 == i4) {
                    bsVar.removeLast();
                    bsVar.addLast(new jo(i5, i4, ((hi4) obj3).a((hi4) obj)));
                } else if (i10 == i9) {
                    arrayList2.add(new jo(i10, i9, obj3));
                    bsVar.removeLast();
                    bsVar.addLast(new jo(i5, i4, obj));
                } else if (i9 >= i4) {
                    bsVar.addLast(new jo(i5, i4, ((hi4) obj3).a((hi4) obj)));
                } else {
                    p65.b();
                    throw null;
                }
            } else {
                bsVar.addLast(new jo(i5, i4, obj));
            }
            i2++;
            list2 = list5;
            nt1Var2 = nt1Var4;
            size = i8;
            b = 0;
        }
        nt1 nt1Var5 = nt1Var2;
        while (i3 <= str3.length() && !bsVar.isEmpty()) {
            jo joVar4 = (jo) bsVar.last();
            Object obj4 = joVar4.a;
            int i11 = joVar4.c;
            arrayList2.add(new jo(i3, i11, obj4));
            while (!bsVar.isEmpty() && i11 == ((jo) bsVar.last()).c) {
                bsVar.removeLast();
            }
            i3 = i11;
        }
        if (i3 < str3.length()) {
            arrayList2.add(new jo(i3, str3.length(), hi4Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new jo(0, 0, hi4Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i12 = i;
        while (i12 < size2) {
            jo joVar5 = (jo) arrayList2.get(i12);
            int i13 = joVar5.b;
            int i14 = joVar5.c;
            if (i13 != i14) {
                str = str3.substring(i13, i14);
            } else {
                str = "";
            }
            List a2 = lo.a(koVar2, i13, i14, new ui((byte) 6));
            ko koVar4 = new ko(str, a2 == null ? nt1Var5 : a2);
            hi4 hi4Var2 = (hi4) joVar5.a;
            if (hi4Var2.b == 0) {
                str2 = str3;
                hi4Var2 = new hi4(hi4Var2.a, hi4Var.b, hi4Var2.c, hi4Var2.d, hi4Var2.e, hi4Var2.f, hi4Var2.g, hi4Var2.h, hi4Var2.i);
            } else {
                str2 = str3;
            }
            xd6 xd6Var3 = new xd6(xd6Var2.a, hi4Var.a(hi4Var2));
            ?? r6 = koVar4.x;
            if (r6 == 0) {
                nt1Var = nt1Var5;
            } else {
                nt1Var = r6;
            }
            List list6 = (List) this.y;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i15 = 0;
            while (i15 < size3) {
                jo joVar6 = (jo) list6.get(i15);
                hi4 hi4Var3 = hi4Var;
                int i16 = joVar6.b;
                xd6 xd6Var4 = xd6Var3;
                int i17 = joVar6.c;
                if (lo.b(i13, i14, i16, i17)) {
                    if (i13 > i16 || i17 > i14) {
                        fz2.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList4.add(new jo(i16 - i13, i17 - i13, joVar6.a));
                } else {
                    list3 = list6;
                }
                i15++;
                list6 = list3;
                xd6Var3 = xd6Var4;
                hi4Var = hi4Var3;
            }
            arrayList3.add(new ei4(new gd(str, xd6Var3, nt1Var, arrayList4, p82Var, ud1Var, z), i13, i14));
            i12++;
            koVar2 = koVar;
            xd6Var2 = xd6Var;
            str3 = str2;
        }
        this.B = arrayList3;
    }

    public void A(List list) {
        Object obj;
        LinkedHashSet<e04> linkedHashSet = new LinkedHashSet();
        bs bsVar = new bs(new bo3(list));
        while (!bsVar.isEmpty()) {
            e04 e04Var = (e04) bsVar.removeLast();
            if (linkedHashSet.add(e04Var)) {
                Iterator it = new s55(e04Var.e).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((r55) it).y;
                    if (listIterator.hasPrevious()) {
                        e04 e04Var2 = (e04) listIterator.previous();
                        if (!linkedHashSet.contains(e04Var2)) {
                            bsVar.addLast(e04Var2);
                        }
                    }
                }
            }
        }
        st3 st3Var = (st3) this.A;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) st3Var.z;
        for (e04 e04Var3 : linkedHashSet) {
            for (Map.Entry entry : e04Var3.c.entrySet()) {
                String str = (String) entry.getKey();
                k03 k03Var = (k03) entry.getValue();
                r50 r50Var = k03Var.a;
                i18 i18Var = (i18) ((kz) st3Var.x).x;
                str.getClass();
                r50 r50Var2 = k03Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) st3Var.y;
                k03 k03Var2 = (k03) concurrentHashMap2.get(str);
                zf3 zf3Var = zf3.B;
                if (k03Var2 != null) {
                    r50Var2.toString();
                    i18Var.getClass();
                    zf3Var.compareTo(zf3.z);
                    Iterator it2 = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((vp5) obj).a.equals(r50Var2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (((vp5) obj) != null) {
                        concurrentHashMap.remove(Integer.valueOf(r50Var2.hashCode()));
                    }
                }
                r50Var2.toString();
                i18Var.getClass();
                zf3Var.compareTo(zf3.x);
                concurrentHashMap2.put(str, k03Var);
            }
            for (vp5 vp5Var : e04Var3.b) {
                concurrentHashMap.put(Integer.valueOf(vp5Var.a.hashCode()), vp5Var);
            }
        }
        zp2 zp2Var = (zp2) this.z;
        zp2Var.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ((Set) zp2Var.y).addAll(((e04) it3.next()).d);
        }
    }

    public void B(String str, o35 o35Var) {
        str.getClass();
        if (str.length() > 0) {
            if (o35Var == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    ze0.e(qx1.m("method ", str, " must have a request body."));
                    return;
                }
            } else if (!x97.I(str)) {
                ze0.e(qx1.m("method ", str, " must not have a request body."));
                return;
            }
            this.y = str;
            this.A = o35Var;
            return;
        }
        ze0.k("method.isEmpty() == true");
    }

    public synchronized void C(bi6 bi6Var) {
        boolean z;
        try {
            if (((AtomicInteger) this.A).getAndDecrement() > 0) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            wp a = ((bi6) this.B).a();
            if (!Objects.equals(bi6Var.b, ((bi6) this.z).b)) {
                a.w(bi6Var.b);
            }
            if (!Objects.equals(bi6Var.c, ((bi6) this.z).c)) {
                a.x(bi6Var.c);
            }
            int i = bi6Var.a;
            bi6 bi6Var2 = (bi6) this.z;
            if (i != bi6Var2.a) {
                a.b = i;
            }
            int i2 = bi6Var.d;
            if (i2 != bi6Var2.d) {
                a.c = i2;
            }
            bi6 b = a.b();
            this.B = b;
            if (((AtomicInteger) this.A).get() == 0 && !((bi6) this.z).equals((bi6) this.B)) {
                ((k46) this.y).f(new gb(this, b, (byte) 29));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void D(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.x).put(str, obj);
        x44 x44Var = (x44) ((LinkedHashMap) this.z).get(str);
        if (x44Var != null) {
            ((sx5) x44Var).k(obj);
        }
        x44 x44Var2 = (x44) ((LinkedHashMap) this.A).get(str);
        if (x44Var2 != null) {
            ((sx5) x44Var2).k(obj);
        }
    }

    public void E(String str) {
        str.getClass();
        if (b06.I(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (b06.I(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        ra2 ra2Var = new ra2((byte) 1);
        ra2Var.n(null, str);
        this.x = ra2Var.a();
    }

    public void F(co7 co7Var) {
        lc7 I;
        byte b = co7Var.e;
        if (b == 2 && ((lc7) this.A) != null) {
            J();
        }
        if (b == 2) {
            I = new lc7((kv7) this.x, (String) this.z);
            this.A = I;
        } else {
            I = I();
            this.A = I;
        }
        a34.x(I);
        co7Var.d = I.h;
        I.b.add(co7Var);
    }

    public void G(Uri uri) {
        lo7 lo7Var;
        int i;
        Context context = (Context) this.x;
        if (uri == null) {
            H();
            return;
        }
        if (!uri.equals((Uri) this.z)) {
            H();
            this.z = uri;
            tu2 tu2Var = (tu2) this.y;
            int i2 = tu2Var.y;
            if (i2 != 0 && (i = tu2Var.z) != 0) {
                lo7Var = new lo7(context, i2, i, this);
                this.A = lo7Var;
            } else {
                lo7Var = new lo7(context, 0, 0, this);
                this.A = lo7Var;
            }
            Uri uri2 = (Uri) this.z;
            a34.x(uri2);
            lo7Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void H() {
        lo7 lo7Var = (lo7) this.A;
        if (lo7Var != null) {
            lo7Var.cancel(true);
            this.A = null;
        }
        this.z = null;
    }

    public lc7 I() {
        if (((lc7) this.A) == null) {
            lc7 lc7Var = new lc7((kv7) this.x, (String) this.z);
            this.A = lc7Var;
            lc7Var.b(1);
        }
        return (lc7) this.A;
    }

    public void J() {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        lc7 lc7Var = (lc7) this.A;
        if (lc7Var != null) {
            gi0 gi0Var = lc7Var.j;
            if (gi0Var != null) {
                gi0Var.l = null;
                lc7Var.j = null;
            }
            long j2 = lc7Var.i;
            k38 m = l38.m();
            m.a();
            ((l38) m.y).o(j2);
            String str = lc7Var.l;
            if (str != null) {
                m.a();
                ((l38) m.y).t(str);
            }
            v68 l = w68.l();
            if (!TextUtils.isEmpty(lc7Var.n)) {
                String str2 = lc7Var.n;
                m.a();
                ((l38) m.y).p(str2);
                String str3 = lc7Var.n;
                l.a();
                ((w68) l.y).m(str3);
            }
            if (!TextUtils.isEmpty(lc7Var.o)) {
                String str4 = lc7Var.o;
                l.a();
                ((w68) l.y).n(str4);
            }
            if (!TextUtils.isEmpty(lc7Var.p)) {
                String str5 = lc7Var.p;
                l.a();
                ((w68) l.y).o(str5);
            }
            if (!TextUtils.isEmpty(lc7Var.q)) {
                String str6 = lc7Var.q;
                l.a();
                ((w68) l.y).p(str6);
            }
            if (!TextUtils.isEmpty(lc7Var.r)) {
                String str7 = lc7Var.r;
                l.a();
                ((w68) l.y).q(str7);
            }
            if (!TextUtils.isEmpty(lc7Var.s)) {
                String str8 = lc7Var.s;
                l.a();
                ((w68) l.y).r(str8);
            }
            int i5 = lc7Var.t;
            int i6 = 1;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                i = 1;
                            } else {
                                i = 6;
                            }
                        } else {
                            i = 5;
                        }
                    } else {
                        i = 4;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
            l.a();
            ((w68) l.y).s(i);
            w68 w68Var = (w68) l.b();
            m.a();
            ((l38) m.y).z(w68Var);
            v28 l2 = w28.l();
            String str9 = lc7.w;
            l2.a();
            ((w28) l2.y).n(str9);
            String str10 = lc7Var.g;
            l2.a();
            ((w28) l2.y).m(str10);
            w28 w28Var = (w28) l2.b();
            m.a();
            ((l38) m.y).x(w28Var);
            cf3 cf3Var = lc7Var.a;
            w38 l3 = x38.l();
            String str11 = (String) cf3Var.a();
            if (str11 != null) {
                m48 l4 = o48.l();
                l4.a();
                ((o48) l4.y).m(str11);
                o48 o48Var = (o48) l4.b();
                l3.a();
                ((x38) l3.y).m(o48Var);
            }
            String str12 = lc7Var.k;
            int i7 = 16;
            if (str12 != null) {
                try {
                    String replace = str12.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    zk3 zk3Var = lc7.v;
                    Log.w(zk3Var.a, zk3Var.c("receiverSessionId %s is not valid for hash", str12), e);
                    j = 0;
                }
                l3.a();
                ((x38) l3.y).n(j);
            }
            List<co7> list = lc7Var.b;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (co7 co7Var : list) {
                    co7Var.getClass();
                    t38 l5 = v38.l();
                    byte b = co7Var.e;
                    l5.a();
                    ((v38) l5.y).q(b);
                    int i8 = (int) (co7Var.b - co7Var.d);
                    l5.a();
                    ((v38) l5.y).p(i8);
                    l5.a();
                    ((v38) l5.y).m(i8);
                    Integer num = co7Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l5.a();
                        ((v38) l5.y).n(intValue);
                    }
                    Boolean bool = co7Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l5.a();
                        ((v38) l5.y).o(booleanValue);
                    }
                    arrayList.add((v38) l5.b());
                }
                l3.a();
                ((x38) l3.y).o(arrayList);
            }
            List list2 = lc7Var.c;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    l3.a();
                    ((x38) l3.y).q(arrayList2);
                } else {
                    throw qx1.f(it);
                }
            }
            List<zn7> list3 = lc7Var.d;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (zn7 zn7Var : list3) {
                    String str13 = zn7Var.a;
                    m38 l6 = n38.l();
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i4 = 13;
                                break;
                            }
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i4 = 22;
                                break;
                            }
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i4 = 15;
                                break;
                            }
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i4 = 19;
                                break;
                            }
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i4 = 23;
                                break;
                            }
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i4 = 9;
                                break;
                            }
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i4 = 21;
                                break;
                            }
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i4 = 10;
                                break;
                            }
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i4 = 14;
                                break;
                            }
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i4 = 7;
                                break;
                            }
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i4 = 20;
                                break;
                            }
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i4 = 2;
                                break;
                            }
                            break;
                        case 3363353:
                            if (str13.equals("mute")) {
                                i4 = 8;
                                break;
                            }
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i4 = 3;
                                break;
                            }
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i4 = 6;
                                break;
                            }
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i4 = 5;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str13.equals("pause")) {
                                i4 = 4;
                                break;
                            }
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i4 = 18;
                                break;
                            }
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i4 = i7;
                                break;
                            }
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i4 = 12;
                                break;
                            }
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i4 = 11;
                                break;
                            }
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i4 = 17;
                                break;
                            }
                            break;
                    }
                    i4 = i6;
                    l6.a();
                    ((n38) l6.y).q(i4);
                    int i9 = (int) zn7Var.b;
                    l6.a();
                    ((n38) l6.y).m(i9);
                    int i10 = zn7Var.c;
                    l6.a();
                    ((n38) l6.y).n(i10);
                    int i11 = (int) (zn7Var.d - zn7Var.f);
                    l6.a();
                    ((n38) l6.y).o(i11);
                    int i12 = (int) (zn7Var.e - zn7Var.f);
                    l6.a();
                    ((n38) l6.y).p(i12);
                    arrayList3.add((n38) l6.b());
                    i6 = 1;
                    i7 = 16;
                }
                l3.a();
                ((x38) l3.y).p(arrayList3);
            }
            if (lc7Var.m != null) {
                ArrayList arrayList4 = new ArrayList();
                e60 e60Var = lc7Var.m;
                int i13 = e60Var.a;
                p38 l7 = r38.l();
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                i3 = 1;
                            } else {
                                i3 = 5;
                            }
                        } else {
                            i3 = 4;
                        }
                        l7.a();
                        ((r38) l7.y).n(i3);
                        int i14 = (int) (e60Var.b - e60Var.c);
                        l7.a();
                        ((r38) l7.y).m(i14);
                        arrayList4.add((r38) l7.b());
                        l3.a();
                        ((x38) l3.y).s(arrayList4);
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2;
                l7.a();
                ((r38) l7.y).n(i3);
                int i142 = (int) (e60Var.b - e60Var.c);
                l7.a();
                ((r38) l7.y).m(i142);
                arrayList4.add((r38) l7.b());
                l3.a();
                ((x38) l3.y).s(arrayList4);
            }
            Map map = lc7Var.e;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (pf7 pf7Var : map.values()) {
                    pf7Var.getClass();
                    c48 l8 = e48.l();
                    byte b2 = pf7Var.e;
                    l8.a();
                    ((e48) l8.y).p(b2);
                    int i15 = pf7Var.d.get();
                    l8.a();
                    ((e48) l8.y).m(i15);
                    int i16 = (int) (pf7Var.a - pf7Var.c);
                    l8.a();
                    ((e48) l8.y).n(i16);
                    int i17 = (int) (pf7Var.b - pf7Var.c);
                    l8.a();
                    ((e48) l8.y).o(i17);
                    arrayList5.add((e48) l8.b());
                }
                l3.a();
                ((x38) l3.y).r(arrayList5);
            }
            int i18 = lc7Var.u;
            l3.a();
            ((x38) l3.y).t(i18);
            x38 x38Var = (x38) l3.b();
            m.a();
            ((l38) m.y).w(x38Var);
            lc7Var.f.a((l38) m.b(), 233);
            this.A = null;
        }
    }

    @Override // defpackage.k16
    public int a(long j) {
        long[] jArr = (long[]) this.y;
        int b = eq6.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.as0
    public Object b(Class cls) {
        if (((Set) this.x).contains(px4.a(cls))) {
            Object b = ((as0) this.B).b(cls);
            if (!cls.equals(vw4.class)) {
                return b;
            }
            return new Object();
        }
        ov3.h("Attempting to request an undeclared dependency ", cls, ".");
        return null;
    }

    @Override // defpackage.fi4
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ei4) arrayList.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.as0
    public Set d(px4 px4Var) {
        if (((Set) this.z).contains(px4Var)) {
            return ((as0) this.B).d(px4Var);
        }
        ov3.h("Attempting to request an undeclared dependency Set<", px4Var, ">.");
        return null;
    }

    @Override // defpackage.k16
    public long e(int i) {
        return ((long[]) this.y)[i];
    }

    @Override // defpackage.as0
    public ow4 f(Class cls) {
        return k(px4.a(cls));
    }

    @Override // defpackage.k16
    public List g(long j) {
        nk6 nk6Var = (nk6) this.x;
        Map map = (Map) this.z;
        HashMap hashMap = (HashMap) this.A;
        HashMap hashMap2 = (HashMap) this.B;
        ArrayList arrayList = new ArrayList();
        nk6Var.g(j, nk6Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        nk6Var.i(j, false, nk6Var.h, treeMap);
        nk6Var.h(j, map, hashMap, nk6Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                qk6 qk6Var = (qk6) hashMap.get(pair.first);
                qk6Var.getClass();
                arrayList2.add(new b31(null, null, null, decodeByteArray, qk6Var.c, 0, qk6Var.e, qk6Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, qk6Var.f, qk6Var.g, false, SubtitleArgbColor.BLACK, qk6Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            qk6 qk6Var2 = (qk6) hashMap.get(entry.getKey());
            qk6Var2.getClass();
            a31 a31Var = (a31) entry.getValue();
            CharSequence charSequence = a31Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (pd1 pd1Var : (pd1[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pd1.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(pd1Var), spannableStringBuilder.getSpanEnd(pd1Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = qk6Var2.c;
            int i10 = qk6Var2.d;
            a31Var.e = f;
            a31Var.f = i10;
            a31Var.g = qk6Var2.e;
            a31Var.h = qk6Var2.b;
            a31Var.l = qk6Var2.f;
            float f2 = qk6Var2.i;
            int i11 = qk6Var2.h;
            a31Var.k = f2;
            a31Var.j = i11;
            a31Var.p = qk6Var2.j;
            arrayList2.add(a31Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.nw4
    public Object get() {
        return new ka1((Executor) ((nw4) this.x).get(), (gy3) ((nw4) this.y).get(), (dn0) ((dn0) this.z).get(), (l85) ((nw4) this.A).get(), (l85) ((nw4) this.B).get());
    }

    @Override // defpackage.k16
    public int h() {
        return ((long[]) this.y).length;
    }

    @Override // defpackage.fi4
    public float i() {
        return ((Number) ((rb3) this.z).getValue()).floatValue();
    }

    @Override // defpackage.as0
    public ow4 j(px4 px4Var) {
        if (((Set) this.A).contains(px4Var)) {
            return ((as0) this.B).j(px4Var);
        }
        ov3.h("Attempting to request an undeclared dependency Provider<Set<", px4Var, ">>.");
        return null;
    }

    @Override // defpackage.as0
    public ow4 k(px4 px4Var) {
        if (((Set) this.y).contains(px4Var)) {
            return ((as0) this.B).k(px4Var);
        }
        ov3.h("Attempting to request an undeclared dependency Provider<", px4Var, ">.");
        return null;
    }

    @Override // defpackage.as0
    public Object l(px4 px4Var) {
        if (((Set) this.x).contains(px4Var)) {
            return ((as0) this.B).l(px4Var);
        }
        ov3.h("Attempting to request an undeclared dependency ", px4Var, ".");
        return null;
    }

    @Override // defpackage.fi4
    public float m() {
        return ((Number) ((rb3) this.A).getValue()).floatValue();
    }

    public void n(xf xfVar, im0 im0Var) {
        ((ArrayList) this.y).add(new ai4(xfVar, im0Var));
    }

    public void o(s12 s12Var, im0 im0Var) {
        ((ArrayList) this.A).add(new n(s12Var, im0Var, (byte) 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u05] */
    public sg0 p(jz jzVar, sb2 sb2Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? obj = new Object();
        obj.x = -1;
        synchronized (this.x) {
            Throwable th = (Throwable) this.y;
            if (th != null) {
                jzVar.b(th);
                return l68.A;
            }
            nu nuVar = (nu) this.z;
            do {
                i = nuVar.get();
                i2 = i + 1;
            } while (!nuVar.compareAndSet(i, i2));
            if ((134217727 & i2) == 1) {
                z = true;
            } else {
                z = false;
            }
            obj.x = (i2 >>> 27) & 15;
            ((f44) this.A).a(jzVar);
            if (z) {
                try {
                    sb2Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.x) {
                        try {
                            if (((Throwable) this.y) == null) {
                                this.y = th2;
                                f44 f44Var = (f44) this.A;
                                Object[] objArr = f44Var.a;
                                int i4 = f44Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((jz) objArr[i5]).b(th2);
                                }
                                ((f44) this.A).d();
                                nu nuVar2 = (nu) this.z;
                                do {
                                    i3 = nuVar2.get();
                                } while (!nuVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new l33(new mi((Object) jzVar, (Object) this, (Object) obj, (byte) 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi q(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.x
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.y
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.A
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.B
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.x(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.B
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.B = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz.q(int):java.text.Bidi");
    }

    public l35 r() {
        Map unmodifiableMap;
        ws2 ws2Var = (ws2) this.x;
        if (ws2Var != null) {
            String str = (String) this.y;
            ik2 i = ((gk2) this.z).i();
            o35 o35Var = (o35) this.A;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.B;
            byte[] bArr = dq6.a;
            linkedHashMap.getClass();
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = ot1.x;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                unmodifiableMap.getClass();
            }
            return new l35(ws2Var, str, i, o35Var, unmodifiableMap);
        }
        ze0.m("url == null");
        return null;
    }

    public void s() {
        ((i18) this.x).getClass();
        zf3 zf3Var = zf3.B;
        zf3 zf3Var2 = zf3.x;
        zf3Var.compareTo(zf3Var2);
        long b = j04.b();
        st3 st3Var = (st3) this.A;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) st3Var.z;
        int i = 0;
        vp5[] vp5VarArr = (vp5[]) concurrentHashMap.values().toArray(new vp5[0]);
        ArrayList n = te4.n(Arrays.copyOf(vp5VarArr, vp5VarArr.length));
        concurrentHashMap.clear();
        kz kzVar = (kz) st3Var.x;
        tp tpVar = new tp((i18) kzVar.x, (dc5) ((zp2) kzVar.z).A, z05.a(v94.class), null, null);
        int size = n.size();
        while (i < size) {
            Object obj = n.get(i);
            i++;
            ((vp5) obj).b(tpVar);
        }
        long b2 = bf6.b(b);
        m18 m18Var = fq1.y;
        fq1.i(b2, jq1.MICROSECONDS);
        zf3Var.compareTo(zf3Var2);
    }

    public void t(ub2 ub2Var) {
        int i;
        synchronized (this.x) {
            try {
                f44 f44Var = (f44) this.A;
                this.A = (f44) this.B;
                this.B = f44Var;
                nu nuVar = (nu) this.z;
                do {
                    i = nuVar.get();
                } while (!nuVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = f44Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ub2Var.invoke(f44Var.g(i3));
                }
                f44Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float u(int i, boolean z) {
        Layout layout = (Layout) this.x;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z) {
            return layout.getPrimaryHorizontal(i);
        }
        return layout.getSecondaryHorizontal(i);
    }

    public float v(int i, boolean z, boolean z2) {
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        Layout layout = (Layout) this.x;
        if (!z2) {
            return u(i, z);
        }
        int F = bb4.F(layout, i, z2);
        int lineStart = layout.getLineStart(F);
        int lineEnd = layout.getLineEnd(F);
        if (i != lineStart && i != lineEnd) {
            return u(i, z);
        }
        if (i != 0 && i != layout.getText().length()) {
            int w = w(i, z2);
            if (layout.getParagraphDirection(layout.getLineForOffset(x(w))) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int z8 = z(lineEnd, lineStart);
            int x = x(w);
            int i5 = lineStart - x;
            int i6 = z8 - x;
            Bidi q = q(w);
            if (q != null) {
                bidi = q.createLineBidi(i5, i6);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                ka3[] ka3VarArr = new ka3[runCount];
                for (int i7 = 0; i7 < runCount; i7++) {
                    int runStart = bidi.getRunStart(i7) + lineStart;
                    int runLimit = bidi.getRunLimit(i7) + lineStart;
                    if (bidi.getRunLevel(i7) % 2 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    ka3VarArr[i7] = new ka3(runStart, runLimit, z7);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i8 = 0; i8 < runCount2; i8++) {
                    bArr[i8] = (byte) bidi.getRunLevel(i8);
                }
                Bidi.reorderVisually(bArr, 0, ka3VarArr, 0, runCount);
                if (i == lineStart) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < runCount) {
                            if (ka3VarArr[i9].a == i) {
                                i4 = i9;
                                break;
                            }
                            i9++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    ka3 ka3Var = ka3VarArr[i4];
                    if (!z && z3 != ka3Var.c) {
                        z6 = z3;
                    } else if (!z3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i4 == 0 && z6) {
                        return layout.getLineLeft(F);
                    }
                    if (i4 == runCount - 1 && !z6) {
                        return layout.getLineRight(F);
                    }
                    if (z6) {
                        return layout.getPrimaryHorizontal(ka3VarArr[i4 - 1].a);
                    }
                    return layout.getPrimaryHorizontal(ka3VarArr[i4 + 1].a);
                }
                if (i > z8) {
                    i2 = z(i, lineStart);
                } else {
                    i2 = i;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < runCount) {
                        if (ka3VarArr[i10].b == i2) {
                            i3 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                ka3 ka3Var2 = ka3VarArr[i3];
                if (!z && z3 != ka3Var2.c) {
                    if (!z3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = z3;
                }
                if (i3 == 0 && z5) {
                    return layout.getLineLeft(F);
                }
                if (i3 == runCount - 1 && !z5) {
                    return layout.getLineRight(F);
                }
                if (z5) {
                    return layout.getPrimaryHorizontal(ka3VarArr[i3 - 1].b);
                }
                return layout.getPrimaryHorizontal(ka3VarArr[i3 + 1].b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                if (!z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (i == lineStart) {
                z4 = z3;
            } else if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return layout.getLineLeft(F);
            }
            return layout.getLineRight(F);
        }
        return u(i, z);
    }

    public int w(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.y;
        int o = te4.o(arrayList, Integer.valueOf(i));
        if (o < 0) {
            i2 = -(o + 1);
        } else {
            i2 = o + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int x(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.y).get(i - 1)).intValue();
    }

    public void y(String str, String str2) {
        str.getClass();
        str2.getClass();
        gk2 gk2Var = (gk2) this.z;
        gk2Var.getClass();
        z51.f(str);
        z51.g(str2, str);
        gk2Var.l(str);
        gk2Var.h(str, str2);
    }

    public int z(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.x).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((a34.D(charAt, 8192) < 0 || a34.D(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public kz(Context context, tu2 tu2Var) {
        this.x = context;
        this.y = tu2Var;
        H();
    }

    public kz(Map map) {
        map.getClass();
        this.x = new LinkedHashMap(map);
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
        this.A = new LinkedHashMap();
        this.B = new or0(this, (byte) 2);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [st3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, zp2] */
    public kz(byte b) {
        switch (b) {
            case 5:
                this.x = new i18((byte) 17);
                this.y = new pz2(this);
                ?? obj = new Object();
                obj.x = this;
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                obj.y = newSetFromMap;
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                obj.z = concurrentHashMap;
                kz5 kz5Var = zp2.C;
                dc5 dc5Var = new dc5(kz5Var, "_root_", null, this, 8);
                obj.A = dc5Var;
                newSetFromMap.add(kz5Var);
                concurrentHashMap.put("_root_", dc5Var);
                this.z = obj;
                ?? obj2 = new Object();
                obj2.x = this;
                obj2.y = new ConcurrentHashMap();
                obj2.z = new ConcurrentHashMap();
                this.A = obj2;
                new ConcurrentHashMap();
                new HashMap();
                this.B = new sn3((byte) 8);
                return;
            case 8:
                this.B = new LinkedHashMap();
                this.y = "GET";
                this.z = new gk2((byte) 0);
                return;
            default:
                this.x = new Object();
                this.z = new AtomicInteger(0);
                this.A = new f44();
                this.B = new f44();
                return;
        }
    }

    public kz(nk6 nk6Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.x = nk6Var;
        this.A = hashMap2;
        this.B = hashMap3;
        this.z = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        nk6Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.y = jArr;
    }

    public kz(Context context) {
        this(context, new tu2(-1, 0, 0));
    }

    public kz(final ko4 ko4Var) {
        Objects.requireNonNull(ko4Var);
        final byte b = 0;
        this.x = new ok2(new hp5() { // from class: ja2
            @Override // defpackage.hp5
            public final long get() {
                byte b2 = b;
                ko4 ko4Var2 = ko4Var;
                switch (b2) {
                    case 0:
                        return ko4Var2.Z0();
                    case 1:
                        return ko4Var2.e0();
                    case 2:
                        return ko4Var2.b0();
                    case 3:
                        return ko4Var2.Q0();
                    default:
                        return ko4Var2.j();
                }
            }
        });
        final byte b2 = 1;
        this.y = new ok2(new hp5() { // from class: ja2
            @Override // defpackage.hp5
            public final long get() {
                byte b22 = b2;
                ko4 ko4Var2 = ko4Var;
                switch (b22) {
                    case 0:
                        return ko4Var2.Z0();
                    case 1:
                        return ko4Var2.e0();
                    case 2:
                        return ko4Var2.b0();
                    case 3:
                        return ko4Var2.Q0();
                    default:
                        return ko4Var2.j();
                }
            }
        });
        final byte b3 = 2;
        this.z = new ok2(new hp5() { // from class: ja2
            @Override // defpackage.hp5
            public final long get() {
                byte b22 = b3;
                ko4 ko4Var2 = ko4Var;
                switch (b22) {
                    case 0:
                        return ko4Var2.Z0();
                    case 1:
                        return ko4Var2.e0();
                    case 2:
                        return ko4Var2.b0();
                    case 3:
                        return ko4Var2.Q0();
                    default:
                        return ko4Var2.j();
                }
            }
        });
        final byte b4 = 3;
        this.A = new ok2(new hp5() { // from class: ja2
            @Override // defpackage.hp5
            public final long get() {
                byte b22 = b4;
                ko4 ko4Var2 = ko4Var;
                switch (b22) {
                    case 0:
                        return ko4Var2.Z0();
                    case 1:
                        return ko4Var2.e0();
                    case 2:
                        return ko4Var2.b0();
                    case 3:
                        return ko4Var2.Q0();
                    default:
                        return ko4Var2.j();
                }
            }
        });
        final byte b5 = 4;
        this.B = new ok2(new hp5() { // from class: ja2
            @Override // defpackage.hp5
            public final long get() {
                byte b22 = b5;
                ko4 ko4Var2 = ko4Var;
                switch (b22) {
                    case 0:
                        return ko4Var2.Z0();
                    case 1:
                        return ko4Var2.e0();
                    case 2:
                        return ko4Var2.b0();
                    case 3:
                        return ko4Var2.Q0();
                    default:
                        return ko4Var2.j();
                }
            }
        });
    }
}
