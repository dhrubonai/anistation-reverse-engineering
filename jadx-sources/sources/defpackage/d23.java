package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d23 extends t36 implements ic2 {
    public byte A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d23(ContentResolver contentResolver, Uri uri, o67 o67Var, za0 za0Var, Context context, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.B = contentResolver;
        this.E = uri;
        this.F = o67Var;
        this.C = za0Var;
        this.D = context;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.F;
        switch (b) {
            case 0:
                d23 d23Var = new d23((c54) obj3, (e23) obj4, (ub2) obj2, vz0Var, (byte) 0);
                d23Var.B = obj;
                return d23Var;
            case 1:
                d23 d23Var2 = new d23((c54) obj3, (i54) obj4, (ub2) obj2, vz0Var, (byte) 1);
                d23Var2.B = obj;
                return d23Var2;
            default:
                d23 d23Var3 = new d23((ContentResolver) this.B, (Uri) this.E, (o67) obj4, (za0) obj3, (Context) obj2, vz0Var);
                d23Var3.z = obj;
                return d23Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((d23) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((d23) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((d23) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #6 {all -> 0x002e, blocks: (B:9:0x0028, B:11:0x0058, B:17:0x0069, B:19:0x0071, B:28:0x003e, B:30:0x0051), top: B:4:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k54] */
    /* JADX WARN: Type inference failed for: r1v17, types: [k54] */
    /* JADX WARN: Type inference failed for: r1v7, types: [k54] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0094 -> B:10:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d23.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d23(c54 c54Var, Object obj, ub2 ub2Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.C = c54Var;
        this.F = obj;
        this.D = ub2Var;
    }
}
