package defpackage;

import android.util.Log;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ra2 {
    public final /* synthetic */ byte a;
    public int b;
    public final ArrayList c;
    public ArrayList d;
    public Serializable e;
    public Object f;
    public Object g;
    public Serializable h;
    public Object i;

    public ra2(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.f = "";
                this.g = "";
                this.b = -1;
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                arrayList.add("");
                return;
            default:
                this.c = new ArrayList();
                this.f = new rt3((byte) 25);
                new ArrayList();
                this.g = null;
                new nz(this, (byte) 1);
                this.h = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                this.e = new ArrayList();
                new q18(this);
                new CopyOnWriteArrayList();
                final byte b2 = 0;
                new by0(this) { // from class: oa2
                    public final /* synthetic */ ra2 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.by0
                    public final void accept(Object obj) {
                        byte b3 = b2;
                        ra2 ra2Var = this.b;
                        switch (b3) {
                            case 0:
                                ra2Var.b(false);
                                return;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    ra2Var.d(false);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z = ((w24) obj).a;
                                ra2Var.e(false);
                                return;
                            default:
                                boolean z2 = ((tl4) obj).a;
                                ra2Var.h(false);
                                return;
                        }
                    }
                };
                final byte b3 = 1;
                new by0(this) { // from class: oa2
                    public final /* synthetic */ ra2 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.by0
                    public final void accept(Object obj) {
                        byte b32 = b3;
                        ra2 ra2Var = this.b;
                        switch (b32) {
                            case 0:
                                ra2Var.b(false);
                                return;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    ra2Var.d(false);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z = ((w24) obj).a;
                                ra2Var.e(false);
                                return;
                            default:
                                boolean z2 = ((tl4) obj).a;
                                ra2Var.h(false);
                                return;
                        }
                    }
                };
                final byte b4 = 2;
                new by0(this) { // from class: oa2
                    public final /* synthetic */ ra2 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.by0
                    public final void accept(Object obj) {
                        byte b32 = b4;
                        ra2 ra2Var = this.b;
                        switch (b32) {
                            case 0:
                                ra2Var.b(false);
                                return;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    ra2Var.d(false);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z = ((w24) obj).a;
                                ra2Var.e(false);
                                return;
                            default:
                                boolean z2 = ((tl4) obj).a;
                                ra2Var.h(false);
                                return;
                        }
                    }
                };
                final byte b5 = 3;
                new by0(this) { // from class: oa2
                    public final /* synthetic */ ra2 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.by0
                    public final void accept(Object obj) {
                        byte b32 = b5;
                        ra2 ra2Var = this.b;
                        switch (b32) {
                            case 0:
                                ra2Var.b(false);
                                return;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    ra2Var.d(false);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z = ((w24) obj).a;
                                ra2Var.e(false);
                                return;
                            default:
                                boolean z2 = ((tl4) obj).a;
                                ra2Var.h(false);
                                return;
                        }
                    }
                };
                new pa2(this);
                this.b = -1;
                this.i = new r18((byte) 19);
                new ArrayDeque();
                new la((Object) this, (byte) 2);
                return;
        }
    }

    public static boolean l(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean m(cg1 cg1Var) {
        if (cg1Var == null || cg1Var.A) {
            return true;
        }
        return false;
    }

    public ws2 a() {
        ArrayList arrayList;
        String str;
        String str2 = (String) this.e;
        String str3 = null;
        if (str2 != null) {
            String l = q18.l((String) this.f, 0, 0, 7);
            String l2 = q18.l((String) this.g, 0, 0, 7);
            String str4 = (String) this.h;
            if (str4 != null) {
                int j = j();
                ArrayList arrayList2 = this.c;
                ArrayList arrayList3 = new ArrayList(zo0.V(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList3.add(q18.l((String) obj, 0, 0, 7));
                }
                ArrayList arrayList4 = this.d;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(zo0.V(arrayList4, 10));
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            str = q18.l(str5, 0, 0, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str6 = (String) this.i;
                if (str6 != null) {
                    str3 = q18.l(str6, 0, 0, 7);
                }
                return new ws2(str2, l, l2, str4, j, arrayList3, arrayList, str3, toString());
            }
            ze0.m("host == null");
            return null;
        }
        ze0.m("scheme == null");
        return null;
    }

    public void b(boolean z) {
        for (cg1 cg1Var : ((rt3) this.f).p()) {
            if (cg1Var != null && z) {
                cg1Var.z.b(true);
            }
        }
    }

    public boolean c() {
        if (this.b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (cg1 cg1Var : ((rt3) this.f).p()) {
            if (cg1Var != null && m(cg1Var) && cg1Var.z.c()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cg1Var);
                z = true;
            }
        }
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                cg1 cg1Var2 = (cg1) this.d.get(i);
                if (arrayList == null || !arrayList.contains(cg1Var2)) {
                    cg1Var2.getClass();
                }
            }
        }
        this.d = arrayList;
        return z;
    }

    public void d(boolean z) {
        for (cg1 cg1Var : ((rt3) this.f).p()) {
            if (cg1Var != null && z) {
                cg1Var.z.d(true);
            }
        }
    }

    public void e(boolean z) {
        for (cg1 cg1Var : ((rt3) this.f).p()) {
            if (cg1Var != null && z) {
                cg1Var.z.e(true);
            }
        }
    }

    public boolean f() {
        if (this.b >= 1) {
            for (cg1 cg1Var : ((rt3) this.f).p()) {
                if (cg1Var != null && cg1Var.z.f()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void g() {
        if (this.b >= 1) {
            for (cg1 cg1Var : ((rt3) this.f).p()) {
                if (cg1Var != null) {
                    cg1Var.z.g();
                }
            }
        }
    }

    public void h(boolean z) {
        for (cg1 cg1Var : ((rt3) this.f).p()) {
            if (cg1Var != null && z) {
                cg1Var.z.h(true);
            }
        }
    }

    public boolean i() {
        boolean z = false;
        if (this.b < 1) {
            return false;
        }
        for (cg1 cg1Var : ((rt3) this.f).p()) {
            if (cg1Var != null && m(cg1Var) && cg1Var.z.i()) {
                z = true;
            }
        }
        return z;
    }

    public int j() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.e;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals(HttpRequest.DEFAULT_SCHEME)) {
            return -1;
        }
        return 443;
    }

    public void k() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x01f2, code lost:
    
        if (r9 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0076, code lost:
    
        if (r12 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(defpackage.ws2 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra2.n(ws2, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (r1 != r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra2.toString():java.lang.String");
    }
}
