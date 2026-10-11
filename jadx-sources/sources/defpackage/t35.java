package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t35 implements Runnable {
    public Object A;
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public t35(zz7 zz7Var, AtomicReference atomicReference, b48 b48Var) {
        this.x = (byte) 8;
        this.y = atomicReference;
        this.z = b48Var;
        Objects.requireNonNull(zz7Var);
        this.A = zz7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0438  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t35.run():void");
    }

    public String toString() {
        switch (this.x) {
            case 13:
                w47 w47Var = (w47) this.A;
                StringBuilder sb = new StringBuilder(w47Var.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(w47Var);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t35(Object obj, y2 y2Var, Object obj2, byte b) {
        this.x = b;
        this.y = y2Var;
        this.z = obj2;
        this.A = obj;
    }

    public /* synthetic */ t35(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ t35() {
        this.x = (byte) 0;
    }

    public t35(t78 t78Var, y88 y88Var, String str, String str2) {
        this.x = (byte) 12;
        this.y = y88Var;
        this.z = str;
        this.A = str2;
    }
}
