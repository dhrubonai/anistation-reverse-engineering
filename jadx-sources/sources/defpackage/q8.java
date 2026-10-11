package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q8 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public byte y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                return new q8((r8) this.z, (sn1) obj2, vz0Var, (byte) 0);
            case 1:
                return new q8((tc) this.z, (pz2) obj2, vz0Var, (byte) 1);
            case 2:
                return new q8((t44) this.z, (rt3) obj2, vz0Var, (byte) 2);
            case 3:
                return new q8((h43) this.z, (j31) obj2, vz0Var, (byte) 3);
            case 4:
                return new q8((p51) this.z, (xx3) obj2, vz0Var, (byte) 4);
            case 5:
                q8 q8Var = new q8((fl1) obj2, vz0Var, (byte) 5);
                q8Var.z = obj;
                return q8Var;
            case 6:
                return new q8((ExternalDownloadService) this.z, (List) obj2, vz0Var, (byte) 6);
            case 7:
                return new q8((ExternalDownloadService) this.z, (String) obj2, vz0Var, (byte) 7);
            case 8:
                q8 q8Var2 = new q8((h14) obj2, vz0Var, (byte) 8);
                q8Var2.z = obj;
                return q8Var2;
            case 9:
                return new q8((h43) this.z, (o27) obj2, vz0Var, (byte) 9);
            case 10:
                return new q8((hm5) this.z, (vf) obj2, vz0Var, (byte) 10);
            case 11:
                return new q8((hm5) this.z, (zg) obj2, vz0Var, (byte) 11);
            case 12:
                return new q8((zp2) obj2, vz0Var, (byte) 12);
            case 13:
                return new q8((g56) this.z, (ae0) obj2, vz0Var, (byte) 13);
            case 14:
                return new q8((h43) this.z, (ot4) obj2, vz0Var, (byte) 14);
            case 15:
                q8 q8Var3 = new q8((ak6) obj2, vz0Var, (byte) 15);
                q8Var3.z = obj;
                return q8Var3;
            case 16:
                q8 q8Var4 = new q8((nc0) obj2, vz0Var, (byte) 16);
                q8Var4.z = obj;
                return q8Var4;
            default:
                return new q8((n80) this.z, (w44) obj2, vz0Var, (byte) 17);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 3:
                ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 4:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((q8) create((vh6) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 16:
                return ((q8) create((ry4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((q8) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v21, types: [cv5, java.lang.Object, oa0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x03dd -> B:177:0x03ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x04f8 -> B:242:0x049a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:305:0x05ee -> B:299:0x05f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01d3 -> B:93:0x01d7). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
    }
}
