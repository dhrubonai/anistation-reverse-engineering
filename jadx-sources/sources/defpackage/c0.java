package defpackage;

import com.anistation.model.backup.BackupFrequency;
import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c0 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vz0 vz0Var, ub2 ub2Var, v65 v65Var) {
        super(2, vz0Var);
        this.x = (byte) 25;
        this.z = v65Var;
        this.A = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                return new c0((u34) this.z, (fo2) obj2, vz0Var, (byte) 0);
            case 1:
                return new c0((u34) this.z, (go2) obj2, vz0Var, (byte) 1);
            case 2:
                c0 c0Var = new c0(obj2, vz0Var, (byte) 2);
                c0Var.z = obj;
                return c0Var;
            case 3:
                c0 c0Var2 = new c0(obj2, vz0Var, (byte) 3);
                c0Var2.z = obj;
                return c0Var2;
            case 4:
                return new c0((gi6) this.z, (rt3) obj2, vz0Var, (byte) 4);
            case 5:
                return new c0((xi) this.z, (v11) obj2, vz0Var, (byte) 5);
            case 6:
                return new c0((xi) this.z, (String) obj2, vz0Var, (byte) 6);
            case 7:
                return new c0((w44) this.z, (ri4) obj2, vz0Var, (byte) 7);
            case 8:
                return new c0((do5) this.z, (kr) obj2, vz0Var, (byte) 8);
            case 9:
                return new c0((kr) this.z, (AppUpdateCheck) obj2, vz0Var, (byte) 9);
            case 10:
                return new c0((BackupFrequency) this.z, (m10) obj2, vz0Var, (byte) 10);
            case 11:
                c0 c0Var3 = new c0(obj2, vz0Var, (byte) 11);
                c0Var3.z = obj;
                return c0Var3;
            case 12:
                return new c0((d82) this.z, (ng6) obj2, vz0Var, (byte) 12);
            case 13:
                return new c0((u90) this.z, (n05) obj2, vz0Var, (byte) 13);
            case 14:
                return new c0((ca0) this.z, (mi) obj2, vz0Var, (byte) 14);
            case 15:
                return new c0((h43) this.z, (p5) obj2, vz0Var, (byte) 15);
            case 16:
                c0 c0Var4 = new c0(obj2, vz0Var, (byte) 16);
                c0Var4.z = obj;
                return c0Var4;
            case 17:
                c0 c0Var5 = new c0(obj2, vz0Var, (byte) 17);
                c0Var5.z = obj;
                return c0Var5;
            case 18:
                return new c0((w42) this.z, (mi5) obj2, vz0Var, (byte) 18);
            case 19:
                c0 c0Var6 = new c0(obj2, vz0Var, (byte) 19);
                c0Var6.z = obj;
                return c0Var6;
            case 20:
                return new c0((nt0) this.z, (Runnable) obj2, vz0Var, (byte) 20);
            case 21:
                return new c0((ic2) this.z, (rr4) obj2, vz0Var, (byte) 21);
            case 22:
                return new c0((ic2) this.z, (w05) obj2, vz0Var, (byte) 22);
            case 23:
                return new c0((jb6) this.z, (y90) obj2, vz0Var, (byte) 23);
            case 24:
                return new c0((yq4) this.z, (jb6) obj2, vz0Var, (byte) 24);
            case 25:
                return new c0(vz0Var, (ub2) obj2, (v65) this.z);
            case 26:
                c0 c0Var7 = new c0(obj2, vz0Var, (byte) 26);
                c0Var7.z = obj;
                return c0Var7;
            case 27:
                return new c0((ic2) this.z, (f41) obj2, vz0Var, (byte) 27);
            case 28:
                c0 c0Var8 = new c0(obj2, vz0Var, (byte) 28);
                c0Var8.z = obj;
                return c0Var8;
            default:
                return new c0((w42) this.z, (ru4) obj2, vz0Var, (byte) 29);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                ((c0) create((qz2) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 3:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 5:
                ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 6:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((c0) create((tu4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 16:
                return ((c0) create((tu4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 17:
                return ((c0) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 18:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 19:
                return ((c0) create((ry4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 20:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 21:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 22:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 23:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 24:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 25:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 26:
                return ((c0) create((a51) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 27:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 28:
                return ((c0) create((xx3) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((c0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:452:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x088a  */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.time.chrono.ChronoZonedDateTime, java.time.ZonedDateTime] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:395:0x085e -> B:383:0x0862). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
    }
}
