package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ia1 implements c46, jb1, xf0, ay0, j85 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ia1(l85 l85Var, Object obj, oy oyVar, byte b) {
        this.x = b;
        this.y = l85Var;
        this.A = obj;
        this.z = oyVar;
    }

    @Override // defpackage.jb1
    public o15 a(int i, yg6 yg6Var, int[] iArr) {
        hb1 hb1Var = (hb1) this.y;
        String str = (String) this.z;
        String str2 = (String) this.A;
        jw2 k = nw2.k();
        for (int i2 = 0; i2 < yg6Var.a; i2++) {
            k.c(new ib1(i, yg6Var, i2, hb1Var, iArr[i2], str, str2));
        }
        return k.g();
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        eb2 eb2Var = (eb2) this.y;
        ((qw3) obj).m(eb2Var.y, (jw3) this.z, (fr3) this.A);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // defpackage.j85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.xf0
    public Object d(wf0 wf0Var) {
        byte b = this.x;
        pg1 pg1Var = pg1.x;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 2:
                l11 l11Var = (l11) obj3;
                y11 y11Var = (y11) obj2;
                ic2 ic2Var = (ic2) obj;
                a92 a92Var = new a92((h43) l11Var.get(h95.F), (byte) 5);
                b45 b45Var = wf0Var.c;
                if (b45Var != null) {
                    b45Var.a(a92Var, pg1Var);
                }
                return tl7.z(db.b(l11Var), null, y11Var, new e0(ic2Var, wf0Var, null, (byte) 23), 1);
            default:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                sb2 sb2Var = (sb2) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ji3 ji3Var = new ji3(atomicBoolean, (byte) 0);
                b45 b45Var2 = wf0Var.c;
                if (b45Var2 != null) {
                    b45Var2.a(ji3Var, pg1Var);
                }
                executor.execute(new ki3(atomicBoolean, wf0Var, sb2Var, (byte) 0));
                return str;
        }
    }

    @Override // defpackage.c46
    public Object i() {
        ka1 ka1Var = (ka1) this.y;
        oy oyVar = (oy) this.z;
        xx xxVar = (xx) this.A;
        l85 l85Var = ka1Var.d;
        l85Var.getClass();
        Log.d("TransportRuntime.SQLiteEventStore", "Storing event with priority=" + oyVar.c + ", name=" + xxVar.a + " for destination " + oyVar.a);
        ((Long) l85Var.p(new ia1(l85Var, (Object) xxVar, oyVar, (byte) 5))).getClass();
        ka1Var.a.N(oyVar, 1, false);
        return null;
    }

    public /* synthetic */ ia1(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
