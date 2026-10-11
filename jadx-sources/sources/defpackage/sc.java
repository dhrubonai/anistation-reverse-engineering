package defpackage;

import android.content.Context;
import android.net.Uri;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sc extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x;
    public boolean y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(yq4 yq4Var, jc2 jc2Var, ub2 ub2Var, ot4 ot4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 9;
        this.A = yq4Var;
        this.C = jc2Var;
        this.B = ub2Var;
        this.D = ot4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (b) {
            case 0:
                sc scVar = new sc((pd) this.A, (ub2) obj2, (tc) obj4, (nf3) obj3, vz0Var, (byte) 0);
                scVar.z = obj;
                return scVar;
            case 1:
                return new sc((oq) this.z, (String) this.A, (Context) obj2, (String) obj4, (b0) obj3, vz0Var, (byte) 1);
            case 2:
                return new sc((uf3) this.z, (w44) this.A, (sc6) obj2, (jb6) obj4, (yv2) obj3, vz0Var, (byte) 2);
            case 3:
                return new sc((y90) this.z, (mc6) this.A, (uf3) obj2, (cd6) obj4, (h12) obj3, vz0Var, (byte) 3);
            case 4:
                sc scVar2 = new sc((fg3) this.A, (eg3) obj2, (l11) obj4, (w42) obj3, vz0Var, (byte) 4);
                scVar2.z = obj;
                return scVar2;
            case 5:
                sc scVar3 = new sc((q93) this.A, this.B, (x73) obj4, (Charset) obj3, vz0Var, (byte) 5);
                scVar3.z = obj;
                return scVar3;
            case 6:
                return new sc((ev2) this.z, (kz4) this.A, (tq5) obj2, (h95) obj4, (mu2) obj3, vz0Var, (byte) 6);
            case 7:
                sc scVar4 = new sc(obj2, obj4, obj3, vz0Var, (byte) 7);
                scVar4.z = obj;
                return scVar4;
            case 8:
                return new sc((hm5) this.A, (ll5) obj2, (Uri) obj4, (nl5) obj3, vz0Var, (byte) 8);
            case 9:
                sc scVar5 = new sc((yq4) this.A, (jc2) obj4, (ub2) obj2, (ot4) obj3, vz0Var);
                scVar5.z = obj;
                return scVar5;
            case 10:
                sc scVar6 = new sc(obj2, obj4, obj3, vz0Var, (byte) 10);
                scVar6.z = obj;
                return scVar6;
            default:
                return new sc((wc0) this.z, (ls0) this.A, (ae0) obj2, (l11) obj4, (dd2) obj3, vz0Var, (byte) 11);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11.x;
            case 1:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((sc) create((ru4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((sc) create((ae0) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((sc) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((sc) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #7 {all -> 0x0071, blocks: (B:11:0x004a, B:13:0x005f, B:15:0x0065, B:17:0x006b, B:19:0x0078, B:21:0x0080, B:22:0x0087, B:24:0x00aa, B:26:0x00b6, B:28:0x00c8, B:32:0x00d2, B:34:0x00fc, B:36:0x0108, B:40:0x0116, B:41:0x011b, B:43:0x00f4, B:44:0x011c, B:45:0x012a), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116 A[Catch: all -> 0x0071, TRY_ENTER, TryCatch #7 {all -> 0x0071, blocks: (B:11:0x004a, B:13:0x005f, B:15:0x0065, B:17:0x006b, B:19:0x0078, B:21:0x0080, B:22:0x0087, B:24:0x00aa, B:26:0x00b6, B:28:0x00c8, B:32:0x00d2, B:34:0x00fc, B:36:0x0108, B:40:0x0116, B:41:0x011b, B:43:0x00f4, B:44:0x011c, B:45:0x012a), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0243  */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49, types: [xv3, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b4 -> B:66:0x01b6). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 2124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, Object obj2, Object obj3, Object obj4, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
    }
}
