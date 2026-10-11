package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kz4 {
    public static final /* synthetic */ int f = 0;
    public final hz4 a;
    public final ke0 b = db.b(tl7.L(iv5.a(), new c21(o11.x, 2)));
    public final af2 c;
    public final is0 d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(kz4.class, "e");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [gi5, fi5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kz] */
    public kz4(hz4 hz4Var) {
        final byte b;
        this.a = hz4Var;
        ?? obj = new Object();
        obj.y = new WeakReference(this);
        obj.z = new se(obj, this);
        obj.A = new te(obj);
        byte b2 = 6;
        af2 af2Var = new af2(this, b2);
        this.c = af2Var;
        is0 is0Var = hz4Var.f;
        ?? obj2 = new Object();
        obj2.x = yo0.K0(is0Var.a);
        obj2.y = yo0.K0(is0Var.b);
        obj2.z = yo0.K0(is0Var.c);
        List list = (List) is0Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new y7((ai4) it.next(), (byte) 29));
        }
        obj2.A = arrayList;
        List list2 = (List) is0Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            b = 0;
            if (!it2.hasNext()) {
                break;
            }
            final j61 j61Var = (j61) it2.next();
            arrayList2.add(new sb2() { // from class: hs0
                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b3 = b;
                    j61 j61Var2 = j61Var;
                    switch (b3) {
                        case 0:
                            return te4.H(j61Var2);
                        default:
                            return te4.H(j61Var2);
                    }
                }
            });
        }
        obj2.B = arrayList2;
        ArrayList arrayList3 = (ArrayList) obj2.x;
        ArrayList arrayList4 = (ArrayList) obj2.A;
        ArrayList arrayList5 = (ArrayList) obj2.z;
        ArrayList arrayList6 = (ArrayList) obj2.B;
        cv2 cv2Var = hz4Var.b;
        Object obj3 = cv2Var.n.a.get(vu2.a);
        if (((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue()) {
            arrayList4.add(new qa4((byte) 14));
            arrayList6.add(new qa4((byte) 15));
        }
        obj2.n(new xf(b), z05.a(Uri.class));
        byte b3 = 3;
        obj2.n(new xf(b3), z05.a(Integer.class));
        arrayList5.add(new ai4(new de((byte) 0), z05.a(lp6.class)));
        obj2.o(new ct(b), z05.a(lp6.class));
        obj2.o(new ct((byte) 4), z05.a(lp6.class));
        obj2.o(new ct((byte) 9), z05.a(lp6.class));
        obj2.o(new ct(b2), z05.a(Drawable.class));
        w4 w4Var = wu2.a;
        Object obj4 = cv2Var.n.a.get(wu2.a);
        int intValue = ((Number) (obj4 == null ? 4 : obj4)).intValue();
        int i = hi5.a;
        ?? fi5Var = new fi5(intValue);
        Object obj5 = cv2Var.n.a.get(wu2.c);
        boolean booleanValue = ((Boolean) (obj5 == null ? Boolean.TRUE : obj5)).booleanValue();
        final byte b4 = 1;
        Object obj6 = nx1.a;
        if (booleanValue) {
            Object obj7 = cv2Var.n.a.get(wu2.b);
            if (((nx1) (obj7 == null ? obj6 : obj7)).equals(obj6)) {
                final dy5 dy5Var = new dy5(fi5Var);
                arrayList6.add(new sb2() { // from class: hs0
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b32 = b4;
                        j61 j61Var2 = dy5Var;
                        switch (b32) {
                            case 0:
                                return te4.H(j61Var2);
                            default:
                                return te4.H(j61Var2);
                        }
                    }
                });
            }
        }
        Object obj8 = cv2Var.n.a.get(wu2.b);
        final i60 i60Var = new i60(fi5Var, (nx1) (obj8 != null ? obj8 : obj6));
        arrayList6.add(new sb2() { // from class: hs0
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b32 = b4;
                j61 j61Var2 = i60Var;
                switch (b32) {
                    case 0:
                        return te4.H(j61Var2);
                    default:
                        return te4.H(j61Var2);
                }
            }
        });
        obj2.n(new xf(b4), z05.a(File.class));
        obj2.o(new ct((byte) 8), z05.a(lp6.class));
        obj2.o(new ct(b3), z05.a(ByteBuffer.class));
        obj2.n(new xf((byte) 4), z05.a(String.class));
        byte b5 = 2;
        obj2.n(new xf(b5), z05.a(qj4.class));
        arrayList5.add(new ai4(new de((byte) 1), z05.a(lp6.class)));
        arrayList5.add(new ai4(new de((byte) 2), z05.a(lp6.class)));
        obj2.o(new ct((byte) 7), z05.a(lp6.class));
        obj2.o(new ct(b5), z05.a(byte[].class));
        obj2.o(new ct((byte) 5), z05.a(lp6.class));
        obj2.o(new ct(b4), z05.a(Bitmap.class));
        arrayList3.add(new qu1(this, obj, af2Var));
        this.d = new is0(oi4.I(arrayList3), oi4.I((ArrayList) obj2.y), oi4.I(arrayList5), oi4.I(arrayList4), oi4.I(arrayList6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x017a, code lost:
    
        if (r6.getView() == ((defpackage.sz4) r8).x) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a4, code lost:
    
        if (r1.a(r9) == r15) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x021b A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:15:0x0215, B:17:0x021b, B:21:0x0224, B:23:0x0228, B:24:0x0234, B:25:0x023a, B:62:0x006a, B:63:0x01ad, B:65:0x01b4, B:67:0x01be, B:68:0x01c8, B:69:0x01cb), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0224 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:15:0x0215, B:17:0x021b, B:21:0x0224, B:23:0x0228, B:24:0x0234, B:25:0x023a, B:62:0x006a, B:63:0x01ad, B:65:0x01b4, B:67:0x01be, B:68:0x01c8, B:69:0x01cb), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024f A[Catch: all -> 0x025c, TRY_LEAVE, TryCatch #4 {all -> 0x025c, blocks: (B:45:0x024b, B:47:0x024f, B:50:0x025e, B:51:0x0264), top: B:44:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025e A[Catch: all -> 0x025c, TRY_ENTER, TryCatch #4 {all -> 0x025c, blocks: (B:45:0x024b, B:47:0x024f, B:50:0x025e, B:51:0x0264), top: B:44:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:15:0x0215, B:17:0x021b, B:21:0x0224, B:23:0x0228, B:24:0x0234, B:25:0x023a, B:62:0x006a, B:63:0x01ad, B:65:0x01b4, B:67:0x01be, B:68:0x01c8, B:69:0x01cb), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006f  */
    /* JADX WARN: Type inference failed for: r17v0, types: [kz4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [h95] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [h95, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ev2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [q35] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ev2 r18, int r19, defpackage.xz0 r20) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz4.a(ev2, int, xz0):java.lang.Object");
    }

    public final Object b(ev2 ev2Var, xz0 xz0Var) {
        if (!(ev2Var.c instanceof zd2) && !(ev2Var.o instanceof sz4) && ((fg3) wk6.o(ev2Var, jv2.e)) == null) {
            return a(ev2Var, 1, xz0Var);
        }
        return db.K(new e0(this, ev2Var, null, (byte) 29), xz0Var);
    }

    public final nz4 c() {
        return (nz4) this.a.d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.jw1 r4, defpackage.k76 r5, defpackage.h95 r6) {
        /*
            r3 = this;
            ev2 r3 = r4.b
            mu2 r0 = r4.a
            boolean r1 = r5 instanceof defpackage.aj6
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L28
            goto L1e
        Lb:
            w4 r1 = defpackage.jv2.a
            java.lang.Object r1 = defpackage.wk6.o(r3, r1)
            ri6 r1 = (defpackage.ri6) r1
            r2 = r5
            aj6 r2 = (defpackage.aj6) r2
            vi6 r4 = r1.a(r2, r4)
            boolean r1 = r4 instanceof defpackage.ua4
            if (r1 == 0) goto L22
        L1e:
            r5.onError(r0)
            goto L28
        L22:
            r6.getClass()
            r4.a()
        L28:
            r6.getClass()
            r3.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz4.d(jw1, k76, h95):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.o26 r4, defpackage.k76 r5, defpackage.h95 r6) {
        /*
            r3 = this;
            ev2 r3 = r4.b
            mu2 r0 = r4.a
            boolean r1 = r5 instanceof defpackage.aj6
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L28
            goto L1e
        Lb:
            w4 r1 = defpackage.jv2.a
            java.lang.Object r1 = defpackage.wk6.o(r3, r1)
            ri6 r1 = (defpackage.ri6) r1
            r2 = r5
            aj6 r2 = (defpackage.aj6) r2
            vi6 r4 = r1.a(r2, r4)
            boolean r1 = r4 instanceof defpackage.ua4
            if (r1 == 0) goto L22
        L1e:
            r5.onSuccess(r0)
            goto L28
        L22:
            r6.getClass()
            r4.a()
        L28:
            r6.getClass()
            r3.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz4.e(o26, k76, h95):void");
    }
}
