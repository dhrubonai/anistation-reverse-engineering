package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l5 extends t36 implements ic2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public boolean y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, Object obj4, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.C;
        switch (b) {
            case 0:
                return new l5((p5) obj2, vz0Var);
            case 1:
                l5 l5Var = new l5((ub2) this.A, (tc) this.B, (nf3) obj2, vz0Var, (byte) 1);
                l5Var.z = obj;
                return l5Var;
            case 2:
                return new l5(this.z, (wj) this.A, (w44) this.B, (w44) obj2, vz0Var, (byte) 2);
            case 3:
                return new l5((nt0) this.z, (ScrollCaptureSession) this.A, (Rect) this.B, (Consumer) obj2, vz0Var, (byte) 3);
            case 4:
                return new l5((eo3) this.z, (z77) this.A, (AtomicInteger) this.B, (ii3) obj2, vz0Var, (byte) 4);
            case 5:
                return new l5((ConstraintTrackingWorker) this.z, (pi3) this.A, (eo3) this.B, (z77) obj2, vz0Var, (byte) 5);
            case 6:
                l5 l5Var2 = new l5((w05) this.B, (ho1) obj2, vz0Var, (byte) 6);
                l5Var2.A = obj;
                return l5Var2;
            case 7:
                l5 l5Var3 = new l5((l5) this.A, (to1) this.B, (rg4) obj2, vz0Var, (byte) 7);
                l5Var3.z = obj;
                return l5Var3;
            case 8:
                l5 l5Var4 = new l5((to1) this.A, (sn1) this.B, (rg4) obj2, vz0Var, (byte) 8);
                l5Var4.z = obj;
                return l5Var4;
            case 9:
                l5 l5Var5 = new l5((w05) this.B, (x42) obj2, vz0Var, (byte) 9);
                l5Var5.A = ((dk0) obj).a;
                return l5Var5;
            case 10:
                l5 l5Var6 = new l5((w42) this.B, (jc2) obj2, vz0Var, (byte) 10);
                l5Var6.A = obj;
                return l5Var6;
            case 11:
                l5 l5Var7 = new l5((w42) this.A, (t44) this.B, this.C, vz0Var, (byte) 11);
                l5Var7.z = obj;
                return l5Var7;
            case 12:
                return new l5((ko4) this.z, (View) this.A, (ic2) this.B, (ic2) obj2, vz0Var, (byte) 12);
            case 13:
                l5 l5Var8 = new l5((fg3) this.A, (eg3) this.B, (an) obj2, vz0Var, (byte) 13);
                l5Var8.z = obj;
                return l5Var8;
            case 14:
                l5 l5Var9 = new l5((v65) this.A, (qg0) this.B, (y31) obj2, vz0Var, (byte) 14);
                l5Var9.z = obj;
                return l5Var9;
            case 15:
                return new l5((hm5) this.z, (Context) this.A, (tg5) this.B, (tg5) obj2, vz0Var, (byte) 15);
            case 16:
                l5 l5Var10 = new l5((yq4) this.A, (jc2) this.B, (ub2) obj2, vz0Var, (byte) 16);
                l5Var10.z = obj;
                return l5Var10;
            case 17:
                return new l5((fa6) this.z, (cc6) this.A, (yq4) this.B, (lb5) obj2, vz0Var, (byte) 17);
            case 18:
                return new l5((wj) this.z, (w44) this.A, (w44) this.B, (pi4) obj2, vz0Var, (byte) 18);
            default:
                return new l5((w05) this.z, (h05) this.A, (og3) this.B, (n67) obj2, vz0Var, (byte) 19);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                ((l5) create((pd) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11.x;
            case 2:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((l5) create((ub2) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((l5) create((c9) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                Object obj3 = ((dk0) obj).a;
                l5 l5Var = new l5((w05) this.B, (x42) this.C, (vz0) obj2, (byte) 9);
                l5Var.A = obj3;
                return l5Var.invokeSuspend(pn6Var);
            case 10:
                return ((l5) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((l5) create((tn5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 16:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 17:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 18:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((l5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0710 A[Catch: all -> 0x06e9, LOOP:3: B:389:0x0702->B:391:0x0710, LOOP_END, TRY_ENTER, TryCatch #3 {all -> 0x06e9, blocks: (B:387:0x06da, B:388:0x06e2, B:389:0x0702, B:391:0x0710, B:399:0x06f9, B:402:0x071c, B:403:0x072a, B:398:0x06ee), top: B:381:0x069a, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x070c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v116, types: [vz0] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.nio.channels.spi.AbstractSelector] */
    /* JADX WARN: Type inference failed for: r8v15, types: [ic2, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x054f -> B:242:0x0551). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:259:0x0554 -> B:243:0x0557). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = obj;
        this.C = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(p5 p5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 0;
        this.C = p5Var;
    }
}
